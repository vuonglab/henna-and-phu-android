package com.vuonglab.hennaandphu

import com.google.common.truth.Truth
import org.junit.Test
import java.time.ZoneId
import java.time.ZonedDateTime

// Tests generated against timezone data version tzdata2018g
// (https://mm.icann.org/pipermail/tz-announce/2018-October/000052.html)
// in the JRE software.
//
// If the tests fail, find out which timezone version the system is using.
// Then check https://www.oracle.com/technetwork/java/javase/tzdata-versions-138805.html
// to see if the changes in the timezone data could explain why the tests failed.
// Do this before checking DurationCalculatorKt.getMarriedDuration() for bugs.
class TimeZoneStandardTimeUnitTests {
    @Test
    fun tz_Asia_Aden() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Asia/Aden") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Cuiaba() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Cuiaba") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_GMTplus9() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 9, 35, 11, "Etc/GMT+9") // GMT-09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_GMTplus8() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 10, 35, 11, "Etc/GMT+8") // GMT-08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Nairobi() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Africa/Nairobi") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Marigot() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Marigot") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Aqtau() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 23, 35, 11, "Asia/Aqtau") // GMT+05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Kwajalein() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 6, 35, 11, "Pacific/Kwajalein") // GMT+12:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_El_Salvador() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/El_Salvador") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Pontianak() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 1, 35, 11, "Asia/Pontianak") // GMT+07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Cairo() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Africa/Cairo") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Pago_Pago() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 7, 35, 11, "Pacific/Pago_Pago") // GMT-11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Mbabane() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Africa/Mbabane") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Kuching() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Kuching") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Honolulu() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 8, 35, 11, "Pacific/Honolulu") // GMT-10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Rarotonga() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 8, 35, 11, "Pacific/Rarotonga") // GMT-10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Guatemala() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Guatemala") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Australia_Hobart() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Australia/Hobart") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_London() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Europe/London") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Belize() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Belize") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Panama() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Panama") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Chungking() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Chungking") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Managua() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Managua") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Indiana_Petersburg() {
        val now = getDateTimeInATimeZone(
            2017,
            11,
            1,
            14,
            35,
            11,
            "America/Indiana/Petersburg"
        ) // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Yerevan() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 22, 35, 11, "Asia/Yerevan") // GMT+04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Brussels() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Brussels") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_GMT() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "GMT") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Warsaw() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Warsaw") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Chicago() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Chicago") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Kashgar() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 0, 35, 11, "Asia/Kashgar") // GMT+06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Chile_Continental() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "Chile/Continental") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Yap() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 4, 35, 11, "Pacific/Yap") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_CET() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "CET") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_GMTminus1() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Etc/GMT-1") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_GMTminus0() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Etc/GMT-0") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Jersey() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Europe/Jersey") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Tegucigalpa() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Tegucigalpa") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_GMTminus5() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 23, 35, 11, "Etc/GMT-5") // GMT+05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Istanbul() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Europe/Istanbul") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Eirunepe() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Eirunepe") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_GMTminus4() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 22, 35, 11, "Etc/GMT-4") // GMT+04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Miquelon() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 16, 35, 11, "America/Miquelon") // GMT-02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_GMTminus3() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Etc/GMT-3") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Luxembourg() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Luxembourg") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_GMTminus2() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Etc/GMT-2") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_GMTminus9() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 3, 35, 11, "Etc/GMT-9") // GMT+09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Argentina_Catamarca() {
        val now = getDateTimeInATimeZone(
            2017,
            11,
            1,
            15,
            35,
            11,
            "America/Argentina/Catamarca"
        ) // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_GMTminus8() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Etc/GMT-8") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_GMTminus7() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 1, 35, 11, "Etc/GMT-7") // GMT+07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_GMTminus6() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 0, 35, 11, "Etc/GMT-6") // GMT+06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Zaporozhye() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Europe/Zaporozhye") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Canada_Yukon() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "Canada/Yukon") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Canada_Atlantic() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "Canada/Atlantic") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Atlantic_St_Helena() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Atlantic/St_Helena") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Australia_Tasmania() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Australia/Tasmania") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Libya() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Libya") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Guernsey() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Europe/Guernsey") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Grand_Turk() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Grand_Turk") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Samarkand() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 23, 35, 11, "Asia/Samarkand") // GMT+05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Argentina_Cordoba() {
        val now = getDateTimeInATimeZone(
            2017,
            11,
            1,
            15,
            35,
            11,
            "America/Argentina/Cordoba"
        ) // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Phnom_Penh() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 1, 35, 11, "Asia/Phnom_Penh") // GMT+07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Kigali() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Africa/Kigali") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Almaty() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 0, 35, 11, "Asia/Almaty") // GMT+06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_US_Alaska() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 10, 35, 11, "US/Alaska") // GMT-08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Dubai() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 22, 35, 11, "Asia/Dubai") // GMT+04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Isle_of_Man() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Europe/Isle_of_Man") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Araguaina() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Araguaina") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Cuba() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "Cuba") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Novosibirsk() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 1, 35, 11, "Asia/Novosibirsk") // GMT+07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Argentina_Salta() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Argentina/Salta") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_GMTplus3() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "Etc/GMT+3") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Tunis() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Africa/Tunis") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_GMTplus2() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 16, 35, 11, "Etc/GMT+2") // GMT-02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_GMTplus1() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 17, 35, 11, "Etc/GMT+1") // GMT-01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Fakaofo() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 7, 35, 11, "Pacific/Fakaofo") // GMT+13:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Tripoli() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Africa/Tripoli") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_GMTplus0() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Etc/GMT+0") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Israel() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Israel") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Banjul() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Africa/Banjul") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_GMTplus7() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "Etc/GMT+7") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Indian_Comoro() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Indian/Comoro") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_GMTplus6() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "Etc/GMT+6") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_GMTplus5() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "Etc/GMT+5") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_GMTplus4() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "Etc/GMT+4") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Port_Moresby() {
        val now =
            getDateTimeInATimeZone(2017, 11, 2, 4, 35, 11, "Pacific/Port_Moresby") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_US_Arizona() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "US/Arizona") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Antarctica_Syowa() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Antarctica/Syowa") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Indian_Reunion() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 22, 35, 11, "Indian/Reunion") // GMT+04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Palau() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 3, 35, 11, "Pacific/Palau") // GMT+09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Kaliningrad() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Europe/Kaliningrad") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Montevideo() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Montevideo") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Windhoek() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Africa/Windhoek") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Karachi() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 23, 35, 11, "Asia/Karachi") // GMT+05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Mogadishu() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Africa/Mogadishu") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Australia_Perth() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Australia/Perth") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Brazil_East() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 16, 35, 11, "Brazil/East") // GMT-02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_GMT() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Etc/GMT") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Chita() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 3, 35, 11, "Asia/Chita") // GMT+09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Easter() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "Pacific/Easter") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Antarctica_Davis() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 1, 35, 11, "Antarctica/Davis") // GMT+07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Antarctica_McMurdo() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 7, 35, 11, "Antarctica/McMurdo") // GMT+13:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Macao() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Macao") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Manaus() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Manaus") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Freetown() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Africa/Freetown") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Bucharest() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Europe/Bucharest") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Tomsk() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 1, 35, 11, "Asia/Tomsk") // GMT+07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Argentina_Mendoza() {
        val now = getDateTimeInATimeZone(
            2017,
            11,
            1,
            15,
            35,
            11,
            "America/Argentina/Mendoza"
        ) // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Macau() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Macau") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Malta() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Malta") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Mexico_BajaSur() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "Mexico/BajaSur") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Tahiti() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 8, 35, 11, "Pacific/Tahiti") // GMT-10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Asmera() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Africa/Asmera") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Busingen() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Busingen") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Argentina_Rio_Gallegos() {
        val now = getDateTimeInATimeZone(
            2017,
            11,
            1,
            15,
            35,
            11,
            "America/Argentina/Rio_Gallegos"
        ) // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Malabo() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Africa/Malabo") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Skopje() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Skopje") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Catamarca() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Catamarca") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Godthab() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Godthab") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Sarajevo() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Sarajevo") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Australia_ACT() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Australia/ACT") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_GB_Eire() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "GB-Eire") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Lagos() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Africa/Lagos") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Cordoba() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Cordoba") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Rome() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Rome") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Dacca() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 0, 35, 11, "Asia/Dacca") // GMT+06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Indian_Mauritius() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 22, 35, 11, "Indian/Mauritius") // GMT+04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Samoa() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 7, 35, 11, "Pacific/Samoa") // GMT-11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Regina() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Regina") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Fort_Wayne() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Fort_Wayne") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Dawson_Creek() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "America/Dawson_Creek") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Algiers() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Africa/Algiers") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Mariehamn() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Europe/Mariehamn") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_St_Johns() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 16, 5, 11, "America/St_Johns") // GMT-02:-30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_St_Thomas() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/St_Thomas") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Zurich() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Zurich") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Anguilla() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Anguilla") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Dili() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 3, 35, 11, "Asia/Dili") // GMT+09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Denver() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Denver") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Bamako() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Africa/Bamako") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Saratov() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 22, 35, 11, "Europe/Saratov") // GMT+04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_GB() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "GB") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Mexico_General() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "Mexico/General") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Wallis() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 6, 35, 11, "Pacific/Wallis") // GMT+12:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Gibraltar() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Gibraltar") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Conakry() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Africa/Conakry") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Lubumbashi() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Africa/Lubumbashi") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Istanbul() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Asia/Istanbul") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Havana() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Havana") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_NZ_CHAT() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 8, 20, 11, "NZ-CHAT") // GMT+13:45
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Choibalsan() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Choibalsan") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Porto_Acre() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Porto_Acre") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Omsk() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 0, 35, 11, "Asia/Omsk") // GMT+06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Vaduz() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Vaduz") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_US_Michigan() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "US/Michigan") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Dhaka() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 0, 35, 11, "Asia/Dhaka") // GMT+06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Barbados() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Barbados") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Tiraspol() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Europe/Tiraspol") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Atlantic_Cape_Verde() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 17, 35, 11, "Atlantic/Cape_Verde") // GMT-01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Yekaterinburg() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 23, 35, 11, "Asia/Yekaterinburg") // GMT+05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Louisville() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Louisville") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Johnston() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 8, 35, 11, "Pacific/Johnston") // GMT-10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Chatham() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 8, 20, 11, "Pacific/Chatham") // GMT+13:45
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Ljubljana() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Ljubljana") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Sao_Paulo() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 16, 35, 11, "America/Sao_Paulo") // GMT-02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Jayapura() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 3, 35, 11, "Asia/Jayapura") // GMT+09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Curacao() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Curacao") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Dushanbe() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 23, 35, 11, "Asia/Dushanbe") // GMT+05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Guyana() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Guyana") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Guayaquil() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Guayaquil") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Martinique() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Martinique") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Portugal() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Portugal") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Berlin() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Berlin") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Moscow() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Europe/Moscow") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Chisinau() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Europe/Chisinau") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Puerto_Rico() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Puerto_Rico") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Rankin_Inlet() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Rankin_Inlet") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Ponape() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Pacific/Ponape") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Stockholm() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Stockholm") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Budapest() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Budapest") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Argentina_Jujuy() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Argentina/Jujuy") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Australia_Eucla() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 3, 20, 11, "Australia/Eucla") // GMT+08:45
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Shanghai() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Shanghai") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Universal() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Universal") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Zagreb() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Zagreb") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Port_of_Spain() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Port_of_Spain") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Helsinki() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Europe/Helsinki") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Beirut() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Asia/Beirut") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Tel_Aviv() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Asia/Tel_Aviv") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Bougainville() {
        val now =
            getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Pacific/Bougainville") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_US_Central() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "US/Central") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Sao_Tome() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Africa/Sao_Tome") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Indian_Chagos() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 0, 35, 11, "Indian/Chagos") // GMT+06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Cayenne() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Cayenne") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Yakutsk() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 3, 35, 11, "Asia/Yakutsk") // GMT+09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Galapagos() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "Pacific/Galapagos") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Australia_North() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 4, 5, 11, "Australia/North") // GMT+09:30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Paris() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Paris") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Ndjamena() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Africa/Ndjamena") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Fiji() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 6, 35, 11, "Pacific/Fiji") // GMT+12:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Rainy_River() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Rainy_River") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Indian_Maldives() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 23, 35, 11, "Indian/Maldives") // GMT+05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Australia_Yancowinna() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 5, 5, 11, "Australia/Yancowinna") // GMT+10:30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_SystemV_AST4() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "SystemV/AST4") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Oral() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 23, 35, 11, "Asia/Oral") // GMT+05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Yellowknife() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Yellowknife") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Enderbury() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 7, 35, 11, "Pacific/Enderbury") // GMT+13:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Juneau() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 10, 35, 11, "America/Juneau") // GMT-08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Australia_Victoria() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Australia/Victoria") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Indiana_Vevay() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Indiana/Vevay") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Tashkent() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 23, 35, 11, "Asia/Tashkent") // GMT+05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Jakarta() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 1, 35, 11, "Asia/Jakarta") // GMT+07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Ceuta() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Africa/Ceuta") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Barnaul() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 1, 35, 11, "Asia/Barnaul") // GMT+07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Recife() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Recife") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Buenos_Aires() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Buenos_Aires") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Noronha() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 16, 35, 11, "America/Noronha") // GMT-02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Swift_Current() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Swift_Current") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Australia_Adelaide() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 5, 5, 11, "Australia/Adelaide") // GMT+10:30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Metlakatla() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 10, 35, 11, "America/Metlakatla") // GMT-08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Djibouti() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Africa/Djibouti") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Paramaribo() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Paramaribo") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Simferopol() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Europe/Simferopol") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Sofia() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Europe/Sofia") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Nouakchott() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Africa/Nouakchott") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Prague() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Prague") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Indiana_Vincennes() {
        val now = getDateTimeInATimeZone(
            2017,
            11,
            1,
            14,
            35,
            11,
            "America/Indiana/Vincennes"
        ) // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Antarctica_Mawson() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 23, 35, 11, "Antarctica/Mawson") // GMT+05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Kralendijk() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Kralendijk") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Antarctica_Troll() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Antarctica/Troll") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Samara() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 22, 35, 11, "Europe/Samara") // GMT+04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Indian_Christmas() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 1, 35, 11, "Indian/Christmas") // GMT+07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Antigua() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Antigua") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Gambier() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 9, 35, 11, "Pacific/Gambier") // GMT-09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Indianapolis() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Indianapolis") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Inuvik() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Inuvik") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Iqaluit() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Iqaluit") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Funafuti() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 6, 35, 11, "Pacific/Funafuti") // GMT+12:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_UTC() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "UTC") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Antarctica_Macquarie() {
        val now =
            getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Antarctica/Macquarie") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Canada_Pacific() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "Canada/Pacific") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Moncton() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Moncton") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Gaborone() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Africa/Gaborone") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Chuuk() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 4, 35, 11, "Pacific/Chuuk") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Pyongyang() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 3, 5, 11, "Asia/Pyongyang") // GMT+08:30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_St_Vincent() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/St_Vincent") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Gaza() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Asia/Gaza") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_Universal() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Etc/Universal") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_PST8PDT() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "PST8PDT") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Atlantic_Faeroe() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Atlantic/Faeroe") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Qyzylorda() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 0, 35, 11, "Asia/Qyzylorda") // GMT+06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Canada_Newfoundland() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 16, 5, 11, "Canada/Newfoundland") // GMT-02:-30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Kentucky_Louisville() {
        val now = getDateTimeInATimeZone(
            2017,
            11,
            1,
            14,
            35,
            11,
            "America/Kentucky/Louisville"
        ) // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Yakutat() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 10, 35, 11, "America/Yakutat") // GMT-08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Ho_Chi_Minh() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 1, 35, 11, "Asia/Ho_Chi_Minh") // GMT+07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Antarctica_Casey() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Antarctica/Casey") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Copenhagen() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Copenhagen") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Asmara() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Africa/Asmara") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Atlantic_Azores() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 17, 35, 11, "Atlantic/Azores") // GMT-01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Vienna() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Vienna") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_ROK() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 3, 35, 11, "ROK") // GMT+09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Pitcairn() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 10, 35, 11, "Pacific/Pitcairn") // GMT-08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Mazatlan() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "America/Mazatlan") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Australia_Queensland() {
        val now =
            getDateTimeInATimeZone(2017, 11, 2, 4, 35, 11, "Australia/Queensland") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Nauru() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 6, 35, 11, "Pacific/Nauru") // GMT+12:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Tirane() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Tirane") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Kolkata() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 0, 5, 11, "Asia/Kolkata") // GMT+05:30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_SystemV_MST7() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "SystemV/MST7") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Australia_Canberra() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Australia/Canberra") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_MET() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "MET") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Australia_Broken_Hill() {
        val now =
            getDateTimeInATimeZone(2017, 11, 2, 5, 5, 11, "Australia/Broken_Hill") // GMT+10:30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Riga() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Europe/Riga") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Dominica() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Dominica") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Abidjan() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Africa/Abidjan") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Mendoza() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Mendoza") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Santarem() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Santarem") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Kwajalein() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 6, 35, 11, "Kwajalein") // GMT+12:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Asuncion() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Asuncion") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Ulan_Bator() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Ulan_Bator") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_NZ() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 7, 35, 11, "NZ") // GMT+13:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Boise() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Boise") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Australia_Currie() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Australia/Currie") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_EST5EDT() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "EST5EDT") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Guam() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 4, 35, 11, "Pacific/Guam") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Wake() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 6, 35, 11, "Pacific/Wake") // GMT+12:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Atlantic_Bermuda() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "Atlantic/Bermuda") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Costa_Rica() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Costa_Rica") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Dawson() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "America/Dawson") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Chongqing() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Chongqing") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Eire() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Eire") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Amsterdam() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Amsterdam") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Indiana_Knox() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Indiana/Knox") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_North_Dakota_Beulah() {
        val now = getDateTimeInATimeZone(
            2017,
            11,
            1,
            13,
            35,
            11,
            "America/North_Dakota/Beulah"
        ) // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Accra() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Africa/Accra") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Atlantic_Faroe() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Atlantic/Faroe") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Mexico_BajaNorte() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "Mexico/BajaNorte") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Maceio() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Maceio") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_UCT() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Etc/UCT") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Apia() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 8, 35, 11, "Pacific/Apia") // GMT+14:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_GMT0() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "GMT0") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Atka() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 9, 35, 11, "America/Atka") // GMT-09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Niue() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 7, 35, 11, "Pacific/Niue") // GMT-11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Australia_Lord_Howe() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Australia/Lord_Howe") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Dublin() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Europe/Dublin") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Truk() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 4, 35, 11, "Pacific/Truk") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_MST7MDT() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "MST7MDT") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Monterrey() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Monterrey") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Nassau() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Nassau") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Jamaica() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Jamaica") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Bishkek() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 0, 35, 11, "Asia/Bishkek") // GMT+06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Atikokan() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Atikokan") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Atlantic_Stanley() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "Atlantic/Stanley") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Australia_NSW() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Australia/NSW") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_US_Hawaii() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 8, 35, 11, "US/Hawaii") // GMT-10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_SystemV_CST6() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "SystemV/CST6") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Indian_Mahe() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 22, 35, 11, "Indian/Mahe") // GMT+04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Aqtobe() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 23, 35, 11, "Asia/Aqtobe") // GMT+05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Sitka() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 10, 35, 11, "America/Sitka") // GMT-08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Vladivostok() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 4, 35, 11, "Asia/Vladivostok") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Libreville() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Africa/Libreville") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Maputo() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Africa/Maputo") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Zulu() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Zulu") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Kentucky_Monticello() {
        val now = getDateTimeInATimeZone(
            2017,
            11,
            1,
            14,
            35,
            11,
            "America/Kentucky/Monticello"
        ) // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_El_Aaiun() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Africa/El_Aaiun") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Ouagadougou() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Africa/Ouagadougou") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Coral_Harbour() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Coral_Harbour") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Marquesas() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 9, 5, 11, "Pacific/Marquesas") // GMT-09:-30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Brazil_West() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "Brazil/West") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Aruba() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Aruba") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_North_Dakota_Center() {
        val now = getDateTimeInATimeZone(
            2017,
            11,
            1,
            13,
            35,
            11,
            "America/North_Dakota/Center"
        ) // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Cayman() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Cayman") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Ulaanbaatar() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Ulaanbaatar") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Baghdad() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Asia/Baghdad") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_San_Marino() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/San_Marino") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Indiana_Tell_City() {
        val now = getDateTimeInATimeZone(
            2017,
            11,
            1,
            13,
            35,
            11,
            "America/Indiana/Tell_City"
        ) // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Tijuana() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "America/Tijuana") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Saipan() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 4, 35, 11, "Pacific/Saipan") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_SystemV_YST9() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 9, 35, 11, "SystemV/YST9") // GMT-09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Douala() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Africa/Douala") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Chihuahua() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "America/Chihuahua") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Ojinaga() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Ojinaga") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Hovd() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 1, 35, 11, "Asia/Hovd") // GMT+07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Anchorage() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 10, 35, 11, "America/Anchorage") // GMT-08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Chile_EasterIsland() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "Chile/EasterIsland") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Halifax() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Halifax") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Antarctica_Rothera() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "Antarctica/Rothera") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Indiana_Indianapolis() {
        val now = getDateTimeInATimeZone(
            2017,
            11,
            1,
            14,
            35,
            11,
            "America/Indiana/Indianapolis"
        ) // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_US_Mountain() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "US/Mountain") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Damascus() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Asia/Damascus") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Argentina_San_Luis() {
        val now = getDateTimeInATimeZone(
            2017,
            11,
            1,
            15,
            35,
            11,
            "America/Argentina/San_Luis"
        ) // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Santiago() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Santiago") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Baku() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 22, 35, 11, "Asia/Baku") // GMT+04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Argentina_Ushuaia() {
        val now = getDateTimeInATimeZone(
            2017,
            11,
            1,
            15,
            35,
            11,
            "America/Argentina/Ushuaia"
        ) // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Atlantic_Reykjavik() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Atlantic/Reykjavik") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Brazzaville() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Africa/Brazzaville") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Porto_Novo() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Africa/Porto-Novo") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_La_Paz() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/La_Paz") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Antarctica_DumontDUrville() {
        val now =
            getDateTimeInATimeZone(2017, 11, 2, 4, 35, 11, "Antarctica/DumontDUrville") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Taipei() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Taipei") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Antarctica_South_Pole() {
        val now =
            getDateTimeInATimeZone(2017, 11, 2, 7, 35, 11, "Antarctica/South_Pole") // GMT+13:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Manila() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Manila") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Bangkok() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 1, 35, 11, "Asia/Bangkok") // GMT+07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Dar_es_Salaam() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Africa/Dar_es_Salaam") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Poland() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Poland") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Atlantic_Madeira() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Atlantic/Madeira") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Antarctica_Palmer() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "Antarctica/Palmer") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Thunder_Bay() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Thunder_Bay") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Addis_Ababa() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Africa/Addis_Ababa") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Yangon() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 1, 5, 11, "Asia/Yangon") // GMT+06:30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Uzhgorod() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Europe/Uzhgorod") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Brazil_DeNoronha() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 16, 35, 11, "Brazil/DeNoronha") // GMT-02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Ashkhabad() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 23, 35, 11, "Asia/Ashkhabad") // GMT+05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_Zulu() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Etc/Zulu") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Indiana_Marengo() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Indiana/Marengo") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Creston() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "America/Creston") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Punta_Arenas() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Punta_Arenas") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Mexico_City() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Mexico_City") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Antarctica_Vostok() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 0, 35, 11, "Antarctica/Vostok") // GMT+06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Jerusalem() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Asia/Jerusalem") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Andorra() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Andorra") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_US_Samoa() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 7, 35, 11, "US/Samoa") // GMT-11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_PRC() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "PRC") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Vientiane() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 1, 35, 11, "Asia/Vientiane") // GMT+07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Kiritimati() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 8, 35, 11, "Pacific/Kiritimati") // GMT+14:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Matamoros() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Matamoros") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Blanc_Sablon() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Blanc-Sablon") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Riyadh() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Asia/Riyadh") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Iceland() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Iceland") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Pohnpei() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Pacific/Pohnpei") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Ujung_Pandang() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Ujung_Pandang") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Atlantic_South_Georgia() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 16, 35, 11, "Atlantic/South_Georgia") // GMT-02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Lisbon() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Europe/Lisbon") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Harbin() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Harbin") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Oslo() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Oslo") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Novokuznetsk() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 1, 35, 11, "Asia/Novokuznetsk") // GMT+07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_CST6CDT() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "CST6CDT") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Atlantic_Canary() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Atlantic/Canary") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Knox_IN() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Knox_IN") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Kuwait() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Asia/Kuwait") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_SystemV_HST10() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 8, 35, 11, "SystemV/HST10") // GMT-10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Efate() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Pacific/Efate") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Lome() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Africa/Lome") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Bogota() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Bogota") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Menominee() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Menominee") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Adak() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 9, 35, 11, "America/Adak") // GMT-09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Norfolk() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Pacific/Norfolk") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Kirov() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Europe/Kirov") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Resolute() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Resolute") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Tarawa() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 6, 35, 11, "Pacific/Tarawa") // GMT+12:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Kampala() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Africa/Kampala") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Krasnoyarsk() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 1, 35, 11, "Asia/Krasnoyarsk") // GMT+07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Greenwich() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Greenwich") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_SystemV_EST5() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "SystemV/EST5") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Edmonton() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Edmonton") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Podgorica() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Podgorica") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Australia_South() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 5, 5, 11, "Australia/South") // GMT+10:30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Canada_Central() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "Canada/Central") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Bujumbura() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Africa/Bujumbura") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Santo_Domingo() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Santo_Domingo") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_US_Eastern() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "US/Eastern") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Minsk() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Europe/Minsk") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Auckland() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 7, 35, 11, "Pacific/Auckland") // GMT+13:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Casablanca() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Africa/Casablanca") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Glace_Bay() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Glace_Bay") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Canada_Eastern() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "Canada/Eastern") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Qatar() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Asia/Qatar") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Kiev() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Europe/Kiev") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Singapore() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Singapore") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Magadan() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Asia/Magadan") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_SystemV_PST8() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 10, 35, 11, "SystemV/PST8") // GMT-08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Port_au_Prince() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Port-au-Prince") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Belfast() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Europe/Belfast") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_St_Barthelemy() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/St_Barthelemy") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Ashgabat() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 23, 35, 11, "Asia/Ashgabat") // GMT+05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Luanda() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Africa/Luanda") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Nipigon() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Nipigon") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Atlantic_Jan_Mayen() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Atlantic/Jan_Mayen") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Brazil_Acre() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "Brazil/Acre") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Muscat() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 22, 35, 11, "Asia/Muscat") // GMT+04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Bahrain() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Asia/Bahrain") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Vilnius() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Europe/Vilnius") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Fortaleza() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Fortaleza") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_GMT0() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Etc/GMT0") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_US_East_Indiana() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "US/East-Indiana") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Hermosillo() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "America/Hermosillo") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Cancun() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Cancun") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Maseru() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Africa/Maseru") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Kosrae() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Pacific/Kosrae") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Kinshasa() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Africa/Kinshasa") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Kathmandu() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 0, 20, 11, "Asia/Kathmandu") // GMT+05:45
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Seoul() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 3, 35, 11, "Asia/Seoul") // GMT+09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Australia_Sydney() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Australia/Sydney") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Lima() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Lima") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Australia_LHI() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Australia/LHI") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_St_Lucia() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/St_Lucia") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Madrid() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Madrid") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Bahia_Banderas() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Bahia_Banderas") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Montserrat() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Montserrat") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Brunei() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Brunei") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Santa_Isabel() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "America/Santa_Isabel") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Canada_Mountain() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "Canada/Mountain") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Cambridge_Bay() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Cambridge_Bay") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Colombo() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 0, 5, 11, "Asia/Colombo") // GMT+05:30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Australia_West() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Australia/West") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Indian_Antananarivo() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Indian/Antananarivo") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Australia_Brisbane() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 4, 35, 11, "Australia/Brisbane") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Indian_Mayotte() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Indian/Mayotte") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_US_Indiana_Starke() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "US/Indiana-Starke") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Urumqi() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 0, 35, 11, "Asia/Urumqi") // GMT+06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_US_Aleutian() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 9, 35, 11, "US/Aleutian") // GMT-09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Volgograd() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Europe/Volgograd") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Lower_Princes() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Lower_Princes") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Vancouver() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "America/Vancouver") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Blantyre() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Africa/Blantyre") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Rio_Branco() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Rio_Branco") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Danmarkshavn() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "America/Danmarkshavn") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Detroit() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Detroit") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Thule() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Thule") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Lusaka() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Africa/Lusaka") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Hong_Kong() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Hong_Kong") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Iran() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 22, 5, 11, "Iran") // GMT+03:30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Argentina_La_Rioja() {
        val now = getDateTimeInATimeZone(
            2017,
            11,
            1,
            15,
            35,
            11,
            "America/Argentina/La_Rioja"
        ) // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Dakar() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Africa/Dakar") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_SystemV_CST6CDT() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "SystemV/CST6CDT") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Tortola() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Tortola") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Porto_Velho() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Porto_Velho") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Sakhalin() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Asia/Sakhalin") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_GMTplus10() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 8, 35, 11, "Etc/GMT+10") // GMT-10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Scoresbysund() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 17, 35, 11, "America/Scoresbysund") // GMT-01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Kamchatka() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 6, 35, 11, "Asia/Kamchatka") // GMT+12:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Thimbu() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 0, 35, 11, "Asia/Thimbu") // GMT+06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Harare() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Africa/Harare") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_GMTplus12() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 6, 35, 11, "Etc/GMT+12") // GMT-12:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_GMTplus11() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 7, 35, 11, "Etc/GMT+11") // GMT-11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Navajo() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "Navajo") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Nome() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 10, 35, 11, "America/Nome") // GMT-08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Tallinn() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Europe/Tallinn") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Turkey() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Turkey") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Khartoum() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Africa/Khartoum") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Johannesburg() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Africa/Johannesburg") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Bangui() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Africa/Bangui") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Belgrade() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Belgrade") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Jamaica() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "Jamaica") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Bissau() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Africa/Bissau") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Tehran() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 22, 5, 11, "Asia/Tehran") // GMT+03:30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_WET() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "WET") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Astrakhan() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 22, 35, 11, "Europe/Astrakhan") // GMT+04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Juba() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Africa/Juba") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Campo_Grande() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Campo_Grande") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Belem() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Belem") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_Greenwich() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Etc/Greenwich") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Saigon() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 1, 35, 11, "Asia/Saigon") // GMT+07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Ensenada() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "America/Ensenada") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Midway() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 7, 35, 11, "Pacific/Midway") // GMT-11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Jujuy() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Jujuy") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Timbuktu() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Africa/Timbuktu") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Bahia() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Bahia") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Goose_Bay() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Goose_Bay") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Virgin() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Virgin") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Pangnirtung() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Pangnirtung") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Katmandu() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 0, 20, 11, "Asia/Katmandu") // GMT+05:45
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Phoenix() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "America/Phoenix") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Niamey() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Africa/Niamey") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Whitehorse() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "America/Whitehorse") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Noumea() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Pacific/Noumea") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Tbilisi() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 22, 35, 11, "Asia/Tbilisi") // GMT+04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Montreal() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Montreal") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Makassar() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Makassar") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Argentina_San_Juan() {
        val now = getDateTimeInATimeZone(
            2017,
            11,
            1,
            15,
            35,
            11,
            "America/Argentina/San_Juan"
        ) // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Hongkong() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Hongkong") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_UCT() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "UCT") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Nicosia() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Asia/Nicosia") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Indiana_Winamac() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Indiana/Winamac") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_SystemV_MST7MDT() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "SystemV/MST7MDT") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Argentina_ComodRivadavia() {
        val now = getDateTimeInATimeZone(
            2017,
            11,
            1,
            15,
            35,
            11,
            "America/Argentina/ComodRivadavia"
        ) // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Boa_Vista() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Boa_Vista") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Grenada() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Grenada") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Atyrau() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 23, 35, 11, "Asia/Atyrau") // GMT+05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Australia_Darwin() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 4, 5, 11, "Australia/Darwin") // GMT+09:30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Khandyga() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 3, 35, 11, "Asia/Khandyga") // GMT+09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Kuala_Lumpur() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Kuala_Lumpur") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Famagusta() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Asia/Famagusta") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Thimphu() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 0, 35, 11, "Asia/Thimphu") // GMT+06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Rangoon() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 1, 5, 11, "Asia/Rangoon") // GMT+06:30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Bratislava() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Bratislava") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Calcutta() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 0, 5, 11, "Asia/Calcutta") // GMT+05:30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Argentina_Tucuman() {
        val now = getDateTimeInATimeZone(
            2017,
            11,
            1,
            15,
            35,
            11,
            "America/Argentina/Tucuman"
        ) // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Kabul() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 23, 5, 11, "Asia/Kabul") // GMT+04:30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Indian_Cocos() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 1, 5, 11, "Indian/Cocos") // GMT+06:30
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Japan() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 3, 35, 11, "Japan") // GMT+09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Tongatapu() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 7, 35, 11, "Pacific/Tongatapu") // GMT+13:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_New_York() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/New_York") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_GMTminus12() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 6, 35, 11, "Etc/GMT-12") // GMT+12:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_GMTminus11() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Etc/GMT-11") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_GMTminus10() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 4, 35, 11, "Etc/GMT-10") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_SystemV_YST9YDT() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 9, 35, 11, "SystemV/YST9YDT") // GMT-09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Ulyanovsk() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 22, 35, 11, "Europe/Ulyanovsk") // GMT+04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_GMTminus14() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 8, 35, 11, "Etc/GMT-14") // GMT+14:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_GMTminus13() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 7, 35, 11, "Etc/GMT-13") // GMT+13:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_W_SU() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "W-SU") // GMT+03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Merida() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Merida") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_EET() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "EET") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Rosario() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Rosario") // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Canada_Saskatchewan() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "Canada/Saskatchewan") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_St_Kitts() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/St_Kitts") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Arctic_Longyearbyen() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Arctic/Longyearbyen") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Fort_Nelson() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "America/Fort_Nelson") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Caracas() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Caracas") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Guadeloupe() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Guadeloupe") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Hebron() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Asia/Hebron") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Indian_Kerguelen() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 23, 35, 11, "Indian/Kerguelen") // GMT+05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_SystemV_PST8PDT() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 10, 35, 11, "SystemV/PST8PDT") // GMT-08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Africa_Monrovia() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Africa/Monrovia") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Ust_Nera() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 4, 35, 11, "Asia/Ust-Nera") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Egypt() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Egypt") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Srednekolymsk() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Asia/Srednekolymsk") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_North_Dakota_New_Salem() {
        val now = getDateTimeInATimeZone(
            2017,
            11,
            1,
            13,
            35,
            11,
            "America/North_Dakota/New_Salem"
        ) // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Anadyr() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 6, 35, 11, "Asia/Anadyr") // GMT+12:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Australia_Melbourne() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Australia/Melbourne") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Irkutsk() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Irkutsk") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Shiprock() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Shiprock") // GMT-06:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Winnipeg() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Winnipeg") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Vatican() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Vatican") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Amman() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Asia/Amman") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Etc_UTC() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Etc/UTC") // GMT+00:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_SystemV_AST4ADT() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "SystemV/AST4ADT") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Tokyo() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 3, 35, 11, "Asia/Tokyo") // GMT+09:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Toronto() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Toronto") // GMT-04:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Asia_Singapore() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Singapore") // GMT+08:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Australia_Lindeman() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 4, 35, 11, "Australia/Lindeman") // GMT+10:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Los_Angeles() {
        val now =
            getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "America/Los_Angeles") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_SystemV_EST5EDT() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "SystemV/EST5EDT") // GMT-05:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Majuro() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 6, 35, 11, "Pacific/Majuro") // GMT+12:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_America_Argentina_Buenos_Aires() {
        val now = getDateTimeInATimeZone(
            2017,
            11,
            1,
            15,
            35,
            11,
            "America/Argentina/Buenos_Aires"
        ) // GMT-03:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Nicosia() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Europe/Nicosia") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Pacific_Guadalcanal() {
        val now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Pacific/Guadalcanal") // GMT+11:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Athens() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Europe/Athens") // GMT+02:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_US_Pacific() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "US/Pacific") // GMT-07:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
    }

    @Test
    fun tz_Europe_Monaco() {
        val now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Monaco") // GMT+01:00
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 18, 2, 8, 18))
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