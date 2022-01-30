package com.vuonglab.hennaandphu

import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.temporal.ChronoUnit

fun getMarriedDuration(nowWithTimeZone: ZonedDateTime): Duration {
    // Credit: https://stackoverflow.com/questions/25747499/java-8-calculate-difference-between-two-localdatetime
    val weddingDateTimeInPhoenixWithTimeZone =
        ZonedDateTime.of(2015, 3, 14, 9, 26, 53, 0, ZoneId.of("US/Arizona"))
    val weddingDateTimeInPhoenix = weddingDateTimeInPhoenixWithTimeZone.toLocalDateTime()
    val nowInPhoenixWithTimeZone = nowWithTimeZone.withZoneSameInstant(ZoneId.of("US/Arizona"))
    val nowInPhoenix = nowInPhoenixWithTimeZone.toLocalDateTime()

    /*
    val TAG = "DurationCalculator"
    Log.d(TAG, "   Wedding date-time in Phoenix (with timezone): " + weddingDateTimeInPhoenixWithTimeZone.toString());
    Log.d(TAG, "Wedding date-time in Phoenix (without timezone): " + weddingDateTimeInPhoenix.toString());

    Log.d(TAG, "       Current date-time, local (with timezone): " + nowWithTimeZone.toString());

    Log.d(TAG, "   Current date-time in Phoenix (with timezone): " + nowInPhoenixWithTimeZone.toString());
    Log.d(TAG, "Current date-time in Phoenix (without timezone): " + nowInPhoenix.toString());
    */

    var tempDateTime = LocalDateTime.from(weddingDateTimeInPhoenix)
    val years = tempDateTime.until(nowInPhoenix, ChronoUnit.YEARS)
    tempDateTime = tempDateTime.plusYears(years)
    val months = tempDateTime.until(nowInPhoenix, ChronoUnit.MONTHS)
    tempDateTime = tempDateTime.plusMonths(months)
    val days = tempDateTime.until(nowInPhoenix, ChronoUnit.DAYS)
    tempDateTime = tempDateTime.plusDays(days)
    val hours = tempDateTime.until(nowInPhoenix, ChronoUnit.HOURS)
    tempDateTime = tempDateTime.plusHours(hours)
    val minutes = tempDateTime.until(nowInPhoenix, ChronoUnit.MINUTES)
    tempDateTime = tempDateTime.plusMinutes(minutes)
    val seconds = tempDateTime.until(nowInPhoenix, ChronoUnit.SECONDS)
    return Duration(
        years, months, days,
        hours, minutes, seconds
    )
}