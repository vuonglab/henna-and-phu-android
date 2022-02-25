package com.vuonglab.hennaandphu

import com.google.common.truth.Truth
import org.junit.Test
import java.time.ZoneId
import java.time.ZonedDateTime

// Tests generated against timezone data version 2021a (version number from /jre/lib/tzdb.dat).
//
// Java timezone database versions:
// https://www.oracle.com/technetwork/java/javase/tzdata-versions-138805.html
class TimeZoneDaylightSavingTimeUnitTests {
    @Test
    fun tz_Asia_Aden() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Asia/Aden") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Cuiaba() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Cuiaba") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_GMTplus9() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 16, 53, 46, "Etc/GMT+9") // GMT-09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_GMTplus8() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 17, 53, 46, "Etc/GMT+8") // GMT-08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Nairobi() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Africa/Nairobi") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Marigot() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Marigot") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Aqtau() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 6, 53, 46, "Asia/Aqtau") // GMT+05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Kwajalein() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 13, 53, 46, "Pacific/Kwajalein") // GMT+12:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_El_Salvador() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/El_Salvador") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Pontianak() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 8, 53, 46, "Asia/Pontianak") // GMT+07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Cairo() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Africa/Cairo") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Pago_Pago() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 14, 53, 46, "Pacific/Pago_Pago") // GMT-11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Mbabane() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Africa/Mbabane") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Kuching() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Kuching") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Honolulu() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 15, 53, 46, "Pacific/Honolulu") // GMT-10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Rarotonga() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 15, 53, 46, "Pacific/Rarotonga") // GMT-10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Guatemala() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Guatemala") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Australia_Hobart() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Australia/Hobart") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_London() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Europe/London") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Belize() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Belize") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Panama() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Panama") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Chungking() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Chungking") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Managua() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Managua") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Indiana_Petersburg() {
        val now = getDateTimeInATimeZone(
            2046,
            7,
            29,
            21,
            53,
            46,
            "America/Indiana/Petersburg"
        ) // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Yerevan() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 5, 53, 46, "Asia/Yerevan") // GMT+04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Brussels() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Brussels") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_GMT() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "GMT") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Warsaw() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Warsaw") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Chicago() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Chicago") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Kashgar() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 7, 53, 46, "Asia/Kashgar") // GMT+06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Chile_Continental() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "Chile/Continental") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Yap() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Pacific/Yap") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_CET() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "CET") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_GMTminus1() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Etc/GMT-1") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_GMTminus0() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Etc/GMT-0") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Jersey() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Europe/Jersey") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Tegucigalpa() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Tegucigalpa") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_GMTminus5() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 6, 53, 46, "Etc/GMT-5") // GMT+05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Istanbul() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Istanbul") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Eirunepe() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Eirunepe") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_GMTminus4() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 5, 53, 46, "Etc/GMT-4") // GMT+04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Miquelon() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 23, 53, 46, "America/Miquelon") // GMT-02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_GMTminus3() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Etc/GMT-3") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Luxembourg() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Luxembourg") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_GMTminus2() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Etc/GMT-2") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_GMTminus9() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 10, 53, 46, "Etc/GMT-9") // GMT+09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Argentina_Catamarca() {
        val now = getDateTimeInATimeZone(
            2046,
            7,
            29,
            22,
            53,
            46,
            "America/Argentina/Catamarca"
        ) // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_GMTminus8() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Etc/GMT-8") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_GMTminus7() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 8, 53, 46, "Etc/GMT-7") // GMT+07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_GMTminus6() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 7, 53, 46, "Etc/GMT-6") // GMT+06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Zaporozhye() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Zaporozhye") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Canada_Yukon() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "Canada/Yukon") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Canada_Atlantic() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "Canada/Atlantic") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Atlantic_St_Helena() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Atlantic/St_Helena") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Australia_Tasmania() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Australia/Tasmania") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Libya() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Libya") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Guernsey() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Europe/Guernsey") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Grand_Turk() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Grand_Turk") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Samarkand() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 6, 53, 46, "Asia/Samarkand") // GMT+05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Argentina_Cordoba() {
        val now = getDateTimeInATimeZone(
            2046,
            7,
            29,
            22,
            53,
            46,
            "America/Argentina/Cordoba"
        ) // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Phnom_Penh() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 8, 53, 46, "Asia/Phnom_Penh") // GMT+07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Kigali() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Africa/Kigali") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Almaty() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 7, 53, 46, "Asia/Almaty") // GMT+06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_US_Alaska() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 17, 53, 46, "US/Alaska") // GMT-08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Dubai() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 5, 53, 46, "Asia/Dubai") // GMT+04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Isle_of_Man() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Europe/Isle_of_Man") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Araguaina() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Araguaina") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Cuba() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "Cuba") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Novosibirsk() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 8, 53, 46, "Asia/Novosibirsk") // GMT+07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Argentina_Salta() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Argentina/Salta") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_GMTplus3() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "Etc/GMT+3") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Tunis() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Africa/Tunis") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_GMTplus2() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 23, 53, 46, "Etc/GMT+2") // GMT-02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_GMTplus1() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 0, 53, 46, "Etc/GMT+1") // GMT-01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Fakaofo() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 14, 53, 46, "Pacific/Fakaofo") // GMT+13:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Tripoli() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Africa/Tripoli") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_GMTplus0() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Etc/GMT+0") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Israel() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Israel") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Banjul() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Africa/Banjul") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_GMTplus7() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "Etc/GMT+7") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Indian_Comoro() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Indian/Comoro") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_GMTplus6() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "Etc/GMT+6") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_GMTplus5() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "Etc/GMT+5") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_GMTplus4() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "Etc/GMT+4") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Port_Moresby() {
        val now =
            getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Pacific/Port_Moresby") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_US_Arizona() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "US/Arizona") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Antarctica_Syowa() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Antarctica/Syowa") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Indian_Reunion() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 5, 53, 46, "Indian/Reunion") // GMT+04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Palau() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 10, 53, 46, "Pacific/Palau") // GMT+09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Kaliningrad() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Kaliningrad") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Montevideo() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Montevideo") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Windhoek() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Africa/Windhoek") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Karachi() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 6, 53, 46, "Asia/Karachi") // GMT+05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Mogadishu() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Africa/Mogadishu") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Australia_Perth() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Australia/Perth") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Brazil_East() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "Brazil/East") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_GMT() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Etc/GMT") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Chita() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 10, 53, 46, "Asia/Chita") // GMT+09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Easter() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "Pacific/Easter") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Antarctica_Davis() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 8, 53, 46, "Antarctica/Davis") // GMT+07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Antarctica_McMurdo() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 13, 53, 46, "Antarctica/McMurdo") // GMT+12:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Macao() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Macao") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Manaus() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Manaus") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Freetown() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Africa/Freetown") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Bucharest() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Bucharest") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Tomsk() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 8, 53, 46, "Asia/Tomsk") // GMT+07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Argentina_Mendoza() {
        val now = getDateTimeInATimeZone(
            2046,
            7,
            29,
            22,
            53,
            46,
            "America/Argentina/Mendoza"
        ) // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Macau() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Macau") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Malta() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Malta") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Mexico_BajaSur() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "Mexico/BajaSur") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Tahiti() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 15, 53, 46, "Pacific/Tahiti") // GMT-10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Asmera() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Africa/Asmera") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Busingen() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Busingen") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Argentina_Rio_Gallegos() {
        val now = getDateTimeInATimeZone(
            2046,
            7,
            29,
            22,
            53,
            46,
            "America/Argentina/Rio_Gallegos"
        ) // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Malabo() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Africa/Malabo") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Skopje() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Skopje") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Catamarca() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Catamarca") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Godthab() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 23, 53, 46, "America/Godthab") // GMT-02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Sarajevo() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Sarajevo") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Australia_ACT() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Australia/ACT") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_GB_Eire() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "GB-Eire") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Lagos() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Africa/Lagos") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Cordoba() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Cordoba") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Rome() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Rome") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Dacca() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 7, 53, 46, "Asia/Dacca") // GMT+06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Indian_Mauritius() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 5, 53, 46, "Indian/Mauritius") // GMT+04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Samoa() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 14, 53, 46, "Pacific/Samoa") // GMT-11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Regina() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Regina") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Fort_Wayne() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Fort_Wayne") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Dawson_Creek() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "America/Dawson_Creek") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Algiers() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Africa/Algiers") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Mariehamn() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Mariehamn") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_St_Johns() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 23, 23, 46, "America/St_Johns") // GMT-02:-30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_St_Thomas() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/St_Thomas") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Zurich() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Zurich") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Anguilla() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Anguilla") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Dili() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 10, 53, 46, "Asia/Dili") // GMT+09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Denver() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Denver") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Bamako() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Africa/Bamako") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Saratov() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 5, 53, 46, "Europe/Saratov") // GMT+04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_GB() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "GB") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Mexico_General() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "Mexico/General") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Wallis() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 13, 53, 46, "Pacific/Wallis") // GMT+12:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Gibraltar() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Gibraltar") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Conakry() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Africa/Conakry") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Lubumbashi() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Africa/Lubumbashi") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Istanbul() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Asia/Istanbul") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Havana() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Havana") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_NZ_CHAT() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 14, 38, 46, "NZ-CHAT") // GMT+12:45
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Choibalsan() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Choibalsan") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Porto_Acre() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Porto_Acre") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Omsk() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 7, 53, 46, "Asia/Omsk") // GMT+06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Vaduz() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Vaduz") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_US_Michigan() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "US/Michigan") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Dhaka() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 7, 53, 46, "Asia/Dhaka") // GMT+06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Barbados() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Barbados") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Tiraspol() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Tiraspol") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Atlantic_Cape_Verde() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 0, 53, 46, "Atlantic/Cape_Verde") // GMT-01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Yekaterinburg() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 6, 53, 46, "Asia/Yekaterinburg") // GMT+05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Louisville() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Louisville") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Johnston() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 15, 53, 46, "Pacific/Johnston") // GMT-10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Chatham() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 14, 38, 46, "Pacific/Chatham") // GMT+12:45
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Ljubljana() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Ljubljana") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Sao_Paulo() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Sao_Paulo") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Jayapura() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 10, 53, 46, "Asia/Jayapura") // GMT+09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Curacao() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Curacao") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Dushanbe() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 6, 53, 46, "Asia/Dushanbe") // GMT+05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Guyana() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Guyana") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Guayaquil() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Guayaquil") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Martinique() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Martinique") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Portugal() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Portugal") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Berlin() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Berlin") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Moscow() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Moscow") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Chisinau() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Chisinau") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Puerto_Rico() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Puerto_Rico") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Rankin_Inlet() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Rankin_Inlet") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Ponape() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 12, 53, 46, "Pacific/Ponape") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Stockholm() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Stockholm") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Budapest() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Budapest") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Argentina_Jujuy() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Argentina/Jujuy") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Australia_Eucla() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 10, 38, 46, "Australia/Eucla") // GMT+08:45
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Shanghai() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Shanghai") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Universal() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Universal") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Zagreb() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Zagreb") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Port_of_Spain() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Port_of_Spain") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Helsinki() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Helsinki") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Beirut() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Asia/Beirut") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Tel_Aviv() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Asia/Tel_Aviv") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Bougainville() {
        val now =
            getDateTimeInATimeZone(2046, 7, 30, 12, 53, 46, "Pacific/Bougainville") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_US_Central() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "US/Central") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Sao_Tome() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Africa/Sao_Tome") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Indian_Chagos() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 7, 53, 46, "Indian/Chagos") // GMT+06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Cayenne() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Cayenne") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Yakutsk() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 10, 53, 46, "Asia/Yakutsk") // GMT+09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Galapagos() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "Pacific/Galapagos") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Australia_North() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 11, 23, 46, "Australia/North") // GMT+09:30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Paris() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Paris") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Ndjamena() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Africa/Ndjamena") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Fiji() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 13, 53, 46, "Pacific/Fiji") // GMT+12:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Rainy_River() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Rainy_River") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Indian_Maldives() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 6, 53, 46, "Indian/Maldives") // GMT+05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Australia_Yancowinna() {
        val now =
            getDateTimeInATimeZone(2046, 7, 30, 11, 23, 46, "Australia/Yancowinna") // GMT+09:30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_SystemV_AST4() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "SystemV/AST4") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Oral() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 6, 53, 46, "Asia/Oral") // GMT+05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Yellowknife() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Yellowknife") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Enderbury() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 14, 53, 46, "Pacific/Enderbury") // GMT+13:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Juneau() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 17, 53, 46, "America/Juneau") // GMT-08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Australia_Victoria() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Australia/Victoria") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Indiana_Vevay() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Indiana/Vevay") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Tashkent() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 6, 53, 46, "Asia/Tashkent") // GMT+05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Jakarta() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 8, 53, 46, "Asia/Jakarta") // GMT+07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Ceuta() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Africa/Ceuta") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Barnaul() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 8, 53, 46, "Asia/Barnaul") // GMT+07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Recife() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Recife") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Buenos_Aires() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Buenos_Aires") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Noronha() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 23, 53, 46, "America/Noronha") // GMT-02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Swift_Current() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Swift_Current") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Australia_Adelaide() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 11, 23, 46, "Australia/Adelaide") // GMT+09:30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Metlakatla() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 17, 53, 46, "America/Metlakatla") // GMT-08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Djibouti() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Africa/Djibouti") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Paramaribo() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Paramaribo") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Qostanay() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 7, 53, 46, "Asia/Qostanay") // GMT+06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Simferopol() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Simferopol") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Sofia() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Sofia") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Nouakchott() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Africa/Nouakchott") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Prague() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Prague") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Indiana_Vincennes() {
        val now = getDateTimeInATimeZone(
            2046,
            7,
            29,
            21,
            53,
            46,
            "America/Indiana/Vincennes"
        ) // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Antarctica_Mawson() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 6, 53, 46, "Antarctica/Mawson") // GMT+05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Kralendijk() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Kralendijk") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Antarctica_Troll() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Antarctica/Troll") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Samara() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 5, 53, 46, "Europe/Samara") // GMT+04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Indian_Christmas() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 8, 53, 46, "Indian/Christmas") // GMT+07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Antigua() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Antigua") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Gambier() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 16, 53, 46, "Pacific/Gambier") // GMT-09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Indianapolis() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Indianapolis") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Inuvik() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Inuvik") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Iqaluit() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Iqaluit") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Funafuti() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 13, 53, 46, "Pacific/Funafuti") // GMT+12:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_UTC() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "UTC") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Antarctica_Macquarie() {
        val now =
            getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Antarctica/Macquarie") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Canada_Pacific() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "Canada/Pacific") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Moncton() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Moncton") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Gaborone() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Africa/Gaborone") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Chuuk() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Pacific/Chuuk") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Pyongyang() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 10, 53, 46, "Asia/Pyongyang") // GMT+09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_St_Vincent() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/St_Vincent") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Gaza() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Asia/Gaza") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_Universal() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Etc/Universal") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_PST8PDT() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "PST8PDT") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Atlantic_Faeroe() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Atlantic/Faeroe") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Qyzylorda() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 6, 53, 46, "Asia/Qyzylorda") // GMT+05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Canada_Newfoundland() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 23, 23, 46, "Canada/Newfoundland") // GMT-02:-30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Kentucky_Louisville() {
        val now = getDateTimeInATimeZone(
            2046,
            7,
            29,
            21,
            53,
            46,
            "America/Kentucky/Louisville"
        ) // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Yakutat() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 17, 53, 46, "America/Yakutat") // GMT-08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Ho_Chi_Minh() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 8, 53, 46, "Asia/Ho_Chi_Minh") // GMT+07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Antarctica_Casey() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 12, 53, 46, "Antarctica/Casey") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Copenhagen() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Copenhagen") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Asmara() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Africa/Asmara") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Atlantic_Azores() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Atlantic/Azores") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Vienna() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Vienna") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_ROK() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 10, 53, 46, "ROK") // GMT+09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Pitcairn() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 17, 53, 46, "Pacific/Pitcairn") // GMT-08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Mazatlan() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Mazatlan") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Australia_Queensland() {
        val now =
            getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Australia/Queensland") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Nauru() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 13, 53, 46, "Pacific/Nauru") // GMT+12:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Tirane() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Tirane") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Kolkata() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 7, 23, 46, "Asia/Kolkata") // GMT+05:30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_SystemV_MST7() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "SystemV/MST7") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Australia_Canberra() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Australia/Canberra") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_MET() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "MET") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Australia_Broken_Hill() {
        val now =
            getDateTimeInATimeZone(2046, 7, 30, 11, 23, 46, "Australia/Broken_Hill") // GMT+09:30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Riga() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Riga") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Dominica() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Dominica") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Abidjan() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Africa/Abidjan") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Mendoza() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Mendoza") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Santarem() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Santarem") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Kwajalein() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 13, 53, 46, "Kwajalein") // GMT+12:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Asuncion() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Asuncion") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Ulan_Bator() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Ulan_Bator") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_NZ() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 13, 53, 46, "NZ") // GMT+12:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Boise() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Boise") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Australia_Currie() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Australia/Currie") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_EST5EDT() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "EST5EDT") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Guam() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Pacific/Guam") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Wake() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 13, 53, 46, "Pacific/Wake") // GMT+12:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Atlantic_Bermuda() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "Atlantic/Bermuda") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Costa_Rica() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Costa_Rica") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Dawson() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "America/Dawson") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Chongqing() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Chongqing") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Eire() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Eire") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Amsterdam() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Amsterdam") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Indiana_Knox() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Indiana/Knox") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_North_Dakota_Beulah() {
        val now = getDateTimeInATimeZone(
            2046,
            7,
            29,
            20,
            53,
            46,
            "America/North_Dakota/Beulah"
        ) // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Accra() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Africa/Accra") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Atlantic_Faroe() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Atlantic/Faroe") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Mexico_BajaNorte() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "Mexico/BajaNorte") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Maceio() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Maceio") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_UCT() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Etc/UCT") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Apia() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 14, 53, 46, "Pacific/Apia") // GMT+13:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_GMT0() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "GMT0") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Atka() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 16, 53, 46, "America/Atka") // GMT-09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Niue() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 14, 53, 46, "Pacific/Niue") // GMT-11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Australia_Lord_Howe() {
        val now =
            getDateTimeInATimeZone(2046, 7, 30, 12, 23, 46, "Australia/Lord_Howe") // GMT+10:30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Dublin() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Europe/Dublin") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Truk() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Pacific/Truk") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_MST7MDT() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "MST7MDT") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Monterrey() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Monterrey") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Nassau() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Nassau") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Jamaica() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Jamaica") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Bishkek() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 7, 53, 46, "Asia/Bishkek") // GMT+06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Atikokan() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Atikokan") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Atlantic_Stanley() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "Atlantic/Stanley") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Australia_NSW() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Australia/NSW") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_US_Hawaii() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 15, 53, 46, "US/Hawaii") // GMT-10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_SystemV_CST6() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "SystemV/CST6") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Indian_Mahe() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 5, 53, 46, "Indian/Mahe") // GMT+04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Aqtobe() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 6, 53, 46, "Asia/Aqtobe") // GMT+05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Sitka() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 17, 53, 46, "America/Sitka") // GMT-08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Vladivostok() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Asia/Vladivostok") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Libreville() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Africa/Libreville") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Maputo() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Africa/Maputo") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Zulu() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Zulu") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Kentucky_Monticello() {
        val now = getDateTimeInATimeZone(
            2046,
            7,
            29,
            21,
            53,
            46,
            "America/Kentucky/Monticello"
        ) // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_El_Aaiun() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Africa/El_Aaiun") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Ouagadougou() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Africa/Ouagadougou") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Coral_Harbour() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Coral_Harbour") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Marquesas() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 16, 23, 46, "Pacific/Marquesas") // GMT-09:-30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Brazil_West() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "Brazil/West") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Aruba() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Aruba") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_North_Dakota_Center() {
        val now = getDateTimeInATimeZone(
            2046,
            7,
            29,
            20,
            53,
            46,
            "America/North_Dakota/Center"
        ) // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Cayman() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Cayman") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Ulaanbaatar() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Ulaanbaatar") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Baghdad() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Asia/Baghdad") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_San_Marino() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/San_Marino") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Indiana_Tell_City() {
        val now = getDateTimeInATimeZone(
            2046,
            7,
            29,
            20,
            53,
            46,
            "America/Indiana/Tell_City"
        ) // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Tijuana() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "America/Tijuana") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Saipan() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Pacific/Saipan") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_SystemV_YST9() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 16, 53, 46, "SystemV/YST9") // GMT-09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Douala() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Africa/Douala") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Chihuahua() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Chihuahua") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Ojinaga() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Ojinaga") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Hovd() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 8, 53, 46, "Asia/Hovd") // GMT+07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Anchorage() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 17, 53, 46, "America/Anchorage") // GMT-08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Chile_EasterIsland() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "Chile/EasterIsland") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Halifax() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Halifax") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Antarctica_Rothera() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "Antarctica/Rothera") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Indiana_Indianapolis() {
        val now = getDateTimeInATimeZone(
            2046,
            7,
            29,
            21,
            53,
            46,
            "America/Indiana/Indianapolis"
        ) // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_US_Mountain() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "US/Mountain") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Damascus() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Asia/Damascus") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Argentina_San_Luis() {
        val now = getDateTimeInATimeZone(
            2046,
            7,
            29,
            22,
            53,
            46,
            "America/Argentina/San_Luis"
        ) // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Santiago() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Santiago") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Baku() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 5, 53, 46, "Asia/Baku") // GMT+04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Argentina_Ushuaia() {
        val now = getDateTimeInATimeZone(
            2046,
            7,
            29,
            22,
            53,
            46,
            "America/Argentina/Ushuaia"
        ) // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Atlantic_Reykjavik() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Atlantic/Reykjavik") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Brazzaville() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Africa/Brazzaville") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Porto_Novo() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Africa/Porto-Novo") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_La_Paz() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/La_Paz") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Antarctica_DumontDUrville() {
        val now = getDateTimeInATimeZone(
            2046,
            7,
            30,
            11,
            53,
            46,
            "Antarctica/DumontDUrville"
        ) // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Taipei() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Taipei") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Antarctica_South_Pole() {
        val now =
            getDateTimeInATimeZone(2046, 7, 30, 13, 53, 46, "Antarctica/South_Pole") // GMT+12:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Manila() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Manila") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Bangkok() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 8, 53, 46, "Asia/Bangkok") // GMT+07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Dar_es_Salaam() {
        val now =
            getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Africa/Dar_es_Salaam") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Poland() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Poland") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Atlantic_Madeira() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Atlantic/Madeira") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Antarctica_Palmer() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "Antarctica/Palmer") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Thunder_Bay() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Thunder_Bay") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Addis_Ababa() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Africa/Addis_Ababa") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Yangon() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 8, 23, 46, "Asia/Yangon") // GMT+06:30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Uzhgorod() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Uzhgorod") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Brazil_DeNoronha() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 23, 53, 46, "Brazil/DeNoronha") // GMT-02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Ashkhabad() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 6, 53, 46, "Asia/Ashkhabad") // GMT+05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_Zulu() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Etc/Zulu") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Indiana_Marengo() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Indiana/Marengo") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Creston() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "America/Creston") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Punta_Arenas() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Punta_Arenas") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Mexico_City() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Mexico_City") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Antarctica_Vostok() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 7, 53, 46, "Antarctica/Vostok") // GMT+06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Jerusalem() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Asia/Jerusalem") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Andorra() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Andorra") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_US_Samoa() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 14, 53, 46, "US/Samoa") // GMT-11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_PRC() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "PRC") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Vientiane() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 8, 53, 46, "Asia/Vientiane") // GMT+07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Kiritimati() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 15, 53, 46, "Pacific/Kiritimati") // GMT+14:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Matamoros() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Matamoros") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Blanc_Sablon() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Blanc-Sablon") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Riyadh() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Asia/Riyadh") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Iceland() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Iceland") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Pohnpei() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 12, 53, 46, "Pacific/Pohnpei") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Ujung_Pandang() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Ujung_Pandang") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Atlantic_South_Georgia() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 23, 53, 46, "Atlantic/South_Georgia") // GMT-02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Lisbon() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Europe/Lisbon") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Harbin() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Harbin") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Oslo() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Oslo") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Novokuznetsk() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 8, 53, 46, "Asia/Novokuznetsk") // GMT+07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_CST6CDT() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "CST6CDT") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Atlantic_Canary() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Atlantic/Canary") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Knox_IN() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Knox_IN") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Kuwait() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Asia/Kuwait") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_SystemV_HST10() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 15, 53, 46, "SystemV/HST10") // GMT-10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Efate() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 12, 53, 46, "Pacific/Efate") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Lome() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Africa/Lome") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Bogota() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Bogota") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Menominee() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Menominee") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Adak() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 16, 53, 46, "America/Adak") // GMT-09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Norfolk() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 12, 53, 46, "Pacific/Norfolk") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Kirov() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Kirov") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Resolute() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Resolute") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Tarawa() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 13, 53, 46, "Pacific/Tarawa") // GMT+12:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Kampala() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Africa/Kampala") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Krasnoyarsk() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 8, 53, 46, "Asia/Krasnoyarsk") // GMT+07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Greenwich() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Greenwich") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_SystemV_EST5() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "SystemV/EST5") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Edmonton() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Edmonton") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Podgorica() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Podgorica") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Australia_South() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 11, 23, 46, "Australia/South") // GMT+09:30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Canada_Central() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "Canada/Central") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Bujumbura() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Africa/Bujumbura") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Santo_Domingo() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Santo_Domingo") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_US_Eastern() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "US/Eastern") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Minsk() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Minsk") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Auckland() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 13, 53, 46, "Pacific/Auckland") // GMT+12:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Casablanca() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Africa/Casablanca") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Glace_Bay() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Glace_Bay") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Canada_Eastern() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "Canada/Eastern") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Qatar() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Asia/Qatar") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Kiev() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Kiev") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Singapore() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Singapore") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Magadan() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 12, 53, 46, "Asia/Magadan") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_SystemV_PST8() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 17, 53, 46, "SystemV/PST8") // GMT-08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Port_au_Prince() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Port-au-Prince") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Belfast() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Europe/Belfast") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_St_Barthelemy() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/St_Barthelemy") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Ashgabat() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 6, 53, 46, "Asia/Ashgabat") // GMT+05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Luanda() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Africa/Luanda") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Nipigon() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Nipigon") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Atlantic_Jan_Mayen() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Atlantic/Jan_Mayen") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Brazil_Acre() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "Brazil/Acre") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Muscat() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 5, 53, 46, "Asia/Muscat") // GMT+04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Bahrain() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Asia/Bahrain") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Vilnius() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Vilnius") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Fortaleza() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Fortaleza") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_GMT0() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Etc/GMT0") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_US_East_Indiana() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "US/East-Indiana") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Hermosillo() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "America/Hermosillo") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Cancun() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Cancun") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Maseru() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Africa/Maseru") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Kosrae() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 12, 53, 46, "Pacific/Kosrae") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Kinshasa() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Africa/Kinshasa") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Kathmandu() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 7, 38, 46, "Asia/Kathmandu") // GMT+05:45
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Seoul() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 10, 53, 46, "Asia/Seoul") // GMT+09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Australia_Sydney() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Australia/Sydney") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Lima() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Lima") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Australia_LHI() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 12, 23, 46, "Australia/LHI") // GMT+10:30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_St_Lucia() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/St_Lucia") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Madrid() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Madrid") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Bahia_Banderas() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Bahia_Banderas") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Montserrat() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Montserrat") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Brunei() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Brunei") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Santa_Isabel() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "America/Santa_Isabel") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Canada_Mountain() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "Canada/Mountain") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Cambridge_Bay() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Cambridge_Bay") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Colombo() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 7, 23, 46, "Asia/Colombo") // GMT+05:30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Australia_West() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Australia/West") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Indian_Antananarivo() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Indian/Antananarivo") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Australia_Brisbane() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Australia/Brisbane") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Indian_Mayotte() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Indian/Mayotte") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_US_Indiana_Starke() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "US/Indiana-Starke") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Urumqi() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 7, 53, 46, "Asia/Urumqi") // GMT+06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_US_Aleutian() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 16, 53, 46, "US/Aleutian") // GMT-09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Volgograd() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Volgograd") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Lower_Princes() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Lower_Princes") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Vancouver() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "America/Vancouver") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Blantyre() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Africa/Blantyre") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Rio_Branco() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Rio_Branco") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Danmarkshavn() {
        val now =
            getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "America/Danmarkshavn") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Detroit() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Detroit") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Thule() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Thule") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Lusaka() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Africa/Lusaka") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Hong_Kong() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Hong_Kong") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Iran() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 6, 23, 46, "Iran") // GMT+04:30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Argentina_La_Rioja() {
        val now = getDateTimeInATimeZone(
            2046,
            7,
            29,
            22,
            53,
            46,
            "America/Argentina/La_Rioja"
        ) // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Dakar() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Africa/Dakar") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_SystemV_CST6CDT() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "SystemV/CST6CDT") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Tortola() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Tortola") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Porto_Velho() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Porto_Velho") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Sakhalin() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 12, 53, 46, "Asia/Sakhalin") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_GMTplus10() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 15, 53, 46, "Etc/GMT+10") // GMT-10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Scoresbysund() {
        val now =
            getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "America/Scoresbysund") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Kamchatka() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 13, 53, 46, "Asia/Kamchatka") // GMT+12:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Thimbu() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 7, 53, 46, "Asia/Thimbu") // GMT+06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Harare() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Africa/Harare") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_GMTplus12() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 13, 53, 46, "Etc/GMT+12") // GMT-12:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_GMTplus11() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 14, 53, 46, "Etc/GMT+11") // GMT-11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Navajo() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "Navajo") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Nome() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 17, 53, 46, "America/Nome") // GMT-08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Tallinn() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Tallinn") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Turkey() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Turkey") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Khartoum() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Africa/Khartoum") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Johannesburg() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Africa/Johannesburg") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Bangui() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Africa/Bangui") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Belgrade() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Belgrade") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Jamaica() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "Jamaica") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Bissau() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Africa/Bissau") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Tehran() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 6, 23, 46, "Asia/Tehran") // GMT+04:30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_WET() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "WET") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Astrakhan() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 5, 53, 46, "Europe/Astrakhan") // GMT+04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Juba() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Africa/Juba") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Campo_Grande() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Campo_Grande") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Belem() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Belem") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_Greenwich() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Etc/Greenwich") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Saigon() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 8, 53, 46, "Asia/Saigon") // GMT+07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Ensenada() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "America/Ensenada") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Midway() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 14, 53, 46, "Pacific/Midway") // GMT-11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Jujuy() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Jujuy") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Timbuktu() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Africa/Timbuktu") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Bahia() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Bahia") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Goose_Bay() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Goose_Bay") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Virgin() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Virgin") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Pangnirtung() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Pangnirtung") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Katmandu() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 7, 38, 46, "Asia/Katmandu") // GMT+05:45
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Phoenix() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "America/Phoenix") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Niamey() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Africa/Niamey") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Whitehorse() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "America/Whitehorse") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Noumea() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 12, 53, 46, "Pacific/Noumea") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Tbilisi() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 5, 53, 46, "Asia/Tbilisi") // GMT+04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Montreal() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Montreal") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Makassar() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Makassar") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Argentina_San_Juan() {
        val now = getDateTimeInATimeZone(
            2046,
            7,
            29,
            22,
            53,
            46,
            "America/Argentina/San_Juan"
        ) // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Hongkong() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Hongkong") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_UCT() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "UCT") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Nicosia() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Asia/Nicosia") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Indiana_Winamac() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Indiana/Winamac") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_SystemV_MST7MDT() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "SystemV/MST7MDT") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Argentina_ComodRivadavia() {
        val now = getDateTimeInATimeZone(
            2046,
            7,
            29,
            22,
            53,
            46,
            "America/Argentina/ComodRivadavia"
        ) // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Boa_Vista() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Boa_Vista") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Grenada() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Grenada") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Atyrau() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 6, 53, 46, "Asia/Atyrau") // GMT+05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Australia_Darwin() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 11, 23, 46, "Australia/Darwin") // GMT+09:30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Khandyga() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 10, 53, 46, "Asia/Khandyga") // GMT+09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Kuala_Lumpur() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Kuala_Lumpur") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Famagusta() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Asia/Famagusta") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Thimphu() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 7, 53, 46, "Asia/Thimphu") // GMT+06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Rangoon() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 8, 23, 46, "Asia/Rangoon") // GMT+06:30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Bratislava() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Bratislava") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Calcutta() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 7, 23, 46, "Asia/Calcutta") // GMT+05:30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Argentina_Tucuman() {
        val now = getDateTimeInATimeZone(
            2046,
            7,
            29,
            22,
            53,
            46,
            "America/Argentina/Tucuman"
        ) // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Kabul() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 6, 23, 46, "Asia/Kabul") // GMT+04:30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Indian_Cocos() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 8, 23, 46, "Indian/Cocos") // GMT+06:30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Japan() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 10, 53, 46, "Japan") // GMT+09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Tongatapu() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 14, 53, 46, "Pacific/Tongatapu") // GMT+13:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_New_York() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/New_York") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_GMTminus12() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 13, 53, 46, "Etc/GMT-12") // GMT+12:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_GMTminus11() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 12, 53, 46, "Etc/GMT-11") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Nuuk() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 23, 53, 46, "America/Nuuk") // GMT-02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_GMTminus10() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Etc/GMT-10") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_SystemV_YST9YDT() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 17, 53, 46, "SystemV/YST9YDT") // GMT-08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Ulyanovsk() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 5, 53, 46, "Europe/Ulyanovsk") // GMT+04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_GMTminus14() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 15, 53, 46, "Etc/GMT-14") // GMT+14:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_GMTminus13() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 14, 53, 46, "Etc/GMT-13") // GMT+13:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_W_SU() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "W-SU") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Merida() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Merida") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_EET() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "EET") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Rosario() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Rosario") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Canada_Saskatchewan() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "Canada/Saskatchewan") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_St_Kitts() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/St_Kitts") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Arctic_Longyearbyen() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Arctic/Longyearbyen") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Fort_Nelson() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "America/Fort_Nelson") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Caracas() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Caracas") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Guadeloupe() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Guadeloupe") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Hebron() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Asia/Hebron") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Indian_Kerguelen() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 6, 53, 46, "Indian/Kerguelen") // GMT+05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_SystemV_PST8PDT() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "SystemV/PST8PDT") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Africa_Monrovia() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Africa/Monrovia") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Ust_Nera() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Asia/Ust-Nera") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Egypt() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Egypt") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Srednekolymsk() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 12, 53, 46, "Asia/Srednekolymsk") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_North_Dakota_New_Salem() {
        val now = getDateTimeInATimeZone(
            2046,
            7,
            29,
            20,
            53,
            46,
            "America/North_Dakota/New_Salem"
        ) // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Anadyr() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 13, 53, 46, "Asia/Anadyr") // GMT+12:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Australia_Melbourne() {
        val now =
            getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Australia/Melbourne") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Irkutsk() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Irkutsk") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Shiprock() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Shiprock") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Winnipeg() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Winnipeg") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Vatican() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Vatican") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Amman() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Asia/Amman") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Etc_UTC() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Etc/UTC") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_SystemV_AST4ADT() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "SystemV/AST4ADT") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Tokyo() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 10, 53, 46, "Asia/Tokyo") // GMT+09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Toronto() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Toronto") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Asia_Singapore() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Singapore") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Australia_Lindeman() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Australia/Lindeman") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Los_Angeles() {
        val now =
            getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "America/Los_Angeles") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_SystemV_EST5EDT() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "SystemV/EST5EDT") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Majuro() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 13, 53, 46, "Pacific/Majuro") // GMT+12:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_America_Argentina_Buenos_Aires() {
        val now = getDateTimeInATimeZone(
            2046,
            7,
            29,
            22,
            53,
            46,
            "America/Argentina/Buenos_Aires"
        ) // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Nicosia() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Nicosia") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Pacific_Guadalcanal() {
        val now =
            getDateTimeInATimeZone(2046, 7, 30, 12, 53, 46, "Pacific/Guadalcanal") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Athens() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Athens") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_US_Pacific() {
        val now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "US/Pacific") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun tz_Europe_Monaco() {
        val now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Monaco") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 4, 15, 9, 26, 53))
    }

    @Test
    fun different_date_time() {
        val now = getDateTimeInATimeZone(2015, 3, 14, 9, 26, 53, "America/Phoenix") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 0, 0, 0, 0, 0))
    }

    private fun getDateTimeInATimeZone(
        year: Int,
        month: Int,
        dayOfMonth: Int,
        hour: Int,
        minute: Int,
        second: Int,
        zoneId: String
    ) = ZonedDateTime.of(year, month, dayOfMonth, hour, minute, second, 0, ZoneId.of(zoneId))

    private fun assertDuration(actualDuration: Duration, expectedDuration: Duration) {
        Truth.assertThat(actualDuration.Years).isEqualTo(expectedDuration.Years)
        Truth.assertThat(actualDuration.Months).isEqualTo(expectedDuration.Months)
        Truth.assertThat(actualDuration.Days).isEqualTo(expectedDuration.Days)
        Truth.assertThat(actualDuration.Hours).isEqualTo(expectedDuration.Hours)
        Truth.assertThat(actualDuration.Minutes).isEqualTo(expectedDuration.Minutes)
        Truth.assertThat(actualDuration.Seconds).isEqualTo(expectedDuration.Seconds)
    }
}