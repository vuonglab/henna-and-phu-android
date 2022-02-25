package com.vuonglab.hennaandphu

import kotlin.jvm.JvmStatic
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZonedDateTime
import java.util.HashMap

// suppress missing package statement warning from Android Studio
object TimeZoneUnitTestGenerator {
    @JvmStatic
    fun main(args: Array<String>) {
        println("*** Daylight saving time unit tests ***")
        generateTimeZoneDaylightSavingTimeUnitTests()
        println("*** Standard time unit tests ***")
        generateTimeZoneStandardTimeUnitTests()
    }

    private fun generateTimeZoneDaylightSavingTimeUnitTests() {
        val testDateTimeInPhoenix = LocalDateTime.of(2046, 7, 29, 18, 53, 46)
        val years = 31
        val months = 4
        val days = 15
        val hours = 9
        val minutes = 26
        val seconds = 53
        generateTimeZoneUnitTests(
            testDateTimeInPhoenix,
            years, months, days,
            hours, minutes, seconds
        )
    }

    private fun generateTimeZoneStandardTimeUnitTests() {
        val testDateTimeInPhoenix = LocalDateTime.of(2017, 11, 1, 11, 35, 11)
        val years = 2
        val months = 7
        val days = 18
        val hours = 2
        val minutes = 8
        val seconds = 18
        generateTimeZoneUnitTests(
            testDateTimeInPhoenix,
            years, months, days,
            hours, minutes, seconds
        )
    }

    private fun generateTimeZoneUnitTests(
        testDateTimeInPhoenix: LocalDateTime,
        years: Int, months: Int, days: Int,
        hours: Int, minutes: Int, seconds: Int
    ) {
        val allTimeZoneNamesAndOffsets = getAllTimeZoneNamesAndOffsets(testDateTimeInPhoenix)
        for ((timeZoneName, zoneOffsetInSeconds) in allTimeZoneNamesAndOffsets) {
            val unitTestName = generateUnitTestName(timeZoneName)
            val offsetHours = zoneOffsetInSeconds / (60 * 60)
            val offsetMinutes = zoneOffsetInSeconds % (60 * 60) / 60

            // The time in Phoenix (GMT-7) is in testDateTimeInPhoenix
            // Calculate the time in the time zone being tested.
            val testDateTime = testDateTimeInPhoenix.minusMinutes(-offsetMinutes.toLong())
                .minusHours(-(offsetHours + 7).toLong())
            val timeZoneOffset = String.format("%+03d:%02d", offsetHours, offsetMinutes)
            printUnitTest(
                unitTestName, testDateTime, timeZoneName, timeZoneOffset,
                years, months, days,
                hours, minutes, seconds
            )
        }
    }

    private fun getAllTimeZoneNamesAndOffsets(testDateTimeInPhoenix: LocalDateTime): Map<String, Int> {
        val timeZoneNamesAndOffsets: MutableMap<String, Int> = HashMap()
        for (zoneId in ZoneId.getAvailableZoneIds()) {
            val id = ZoneId.of(zoneId)
            val zonedDateTime = ZonedDateTime.of(testDateTimeInPhoenix, id)
            val zoneOffset = zonedDateTime.offset
            val zoneOffsetInSeconds = zoneOffset.totalSeconds
            timeZoneNamesAndOffsets[zoneId] = zoneOffsetInSeconds
        }
        return timeZoneNamesAndOffsets
    }

    private fun generateUnitTestName(timeZoneName: String): String {
        var unitTestName = timeZoneName.replace('/', '_')
        unitTestName = unitTestName.replace("+", "plus")
        val unitTestNameParts = unitTestName.split("-".toRegex()).toTypedArray()
        val nameContainsNegativeNumber =
            unitTestNameParts.size == 2 && unitTestNameParts[1].matches(Regex("^\\d+$"))
        unitTestName = unitTestName.replace("-", if (nameContainsNegativeNumber) "minus" else "_")
        return unitTestName
    }

    private fun printUnitTest(
        unitTestName: String, testDateTime: LocalDateTime,
        timeZoneName: String, timeZoneOffset: String,
        years: Int, months: Int, days: Int,
        hours: Int, minutes: Int, seconds: Int
    ) {
        println("@Test")
        println("public void ${unitTestName}() {")
        println("\tZonedDateTime now = getDateTimeInATimeZone("
                + "${testDateTime.year}, ${testDateTime.monthValue}, ${testDateTime.dayOfMonth}, "
                + "${testDateTime.hour}, ${testDateTime.minute}, ${testDateTime.second}, "
                + "\"${timeZoneName}\"); // GMT${timeZoneOffset}"
        )
        println("\tDuration marriedDuration = DurationCalculator.getMarriedDuration(now);")
        println("\tassertDuration(marriedDuration, new Duration("
                + "$years, $months, $days, $hours, $minutes, $seconds));"
        )
        println("}\n")
    }
}