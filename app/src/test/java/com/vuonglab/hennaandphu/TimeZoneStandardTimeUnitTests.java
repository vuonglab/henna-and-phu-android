package com.vuonglab.hennaandphu;

import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static com.google.common.truth.Truth.assertThat;

// Tests generated against timezone data version tzdata2018g
// (https://mm.icann.org/pipermail/tz-announce/2018-October/000052.html)
// in the JRE software.
//
// If the tests fail, find out which timezone version the system is using.
// Then check https://www.oracle.com/technetwork/java/javase/tzdata-versions-138805.html
// to see if the changes in the timezone data could explain why the tests failed.
// Do this before checking DurationCalculator.getMarriedDuration() for bugs.
public class TimeZoneStandardTimeUnitTests {
    @Test
    public void Asia_Aden() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Asia/Aden"); // GMT+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Cuiaba() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Cuiaba"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_GMTplus9() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 9, 35, 11, "Etc/GMT+9"); // GMT-09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_GMTplus8() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 10, 35, 11, "Etc/GMT+8"); // GMT-08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Nairobi() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Africa/Nairobi"); // GMT+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Marigot() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Marigot"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Aqtau() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 23, 35, 11, "Asia/Aqtau"); // GMT+05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Kwajalein() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 6, 35, 11, "Pacific/Kwajalein"); // GMT+12:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_El_Salvador() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/El_Salvador"); // GMT-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Pontianak() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 1, 35, 11, "Asia/Pontianak"); // GMT+07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Cairo() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Africa/Cairo"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Pago_Pago() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 7, 35, 11, "Pacific/Pago_Pago"); // GMT-11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Mbabane() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Africa/Mbabane"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Kuching() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Kuching"); // GMT+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Honolulu() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 8, 35, 11, "Pacific/Honolulu"); // GMT-10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Rarotonga() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 8, 35, 11, "Pacific/Rarotonga"); // GMT-10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Guatemala() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Guatemala"); // GMT-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Australia_Hobart() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Australia/Hobart"); // GMT+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_London() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Europe/London"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Belize() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Belize"); // GMT-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Panama() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Panama"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Chungking() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Chungking"); // GMT+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Managua() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Managua"); // GMT-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Indiana_Petersburg() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Indiana/Petersburg"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Yerevan() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 22, 35, 11, "Asia/Yerevan"); // GMT+04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Brussels() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Brussels"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void GMT() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "GMT"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Warsaw() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Warsaw"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Chicago() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Chicago"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Kashgar() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 0, 35, 11, "Asia/Kashgar"); // GMT+06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Chile_Continental() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "Chile/Continental"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Yap() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 4, 35, 11, "Pacific/Yap"); // GMT+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void CET() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "CET"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_GMTminus1() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Etc/GMT-1"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_GMTminus0() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Etc/GMT-0"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Jersey() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Europe/Jersey"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Tegucigalpa() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Tegucigalpa"); // GMT-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_GMTminus5() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 23, 35, 11, "Etc/GMT-5"); // GMT+05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Istanbul() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Europe/Istanbul"); // GMT+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Eirunepe() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Eirunepe"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_GMTminus4() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 22, 35, 11, "Etc/GMT-4"); // GMT+04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Miquelon() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 16, 35, 11, "America/Miquelon"); // GMT-02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_GMTminus3() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Etc/GMT-3"); // GMT+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Luxembourg() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Luxembourg"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_GMTminus2() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Etc/GMT-2"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_GMTminus9() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 3, 35, 11, "Etc/GMT-9"); // GMT+09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Argentina_Catamarca() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Argentina/Catamarca"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_GMTminus8() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Etc/GMT-8"); // GMT+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_GMTminus7() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 1, 35, 11, "Etc/GMT-7"); // GMT+07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_GMTminus6() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 0, 35, 11, "Etc/GMT-6"); // GMT+06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Zaporozhye() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Europe/Zaporozhye"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Canada_Yukon() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "Canada/Yukon"); // GMT-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Canada_Atlantic() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "Canada/Atlantic"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Atlantic_St_Helena() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Atlantic/St_Helena"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Australia_Tasmania() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Australia/Tasmania"); // GMT+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Libya() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Libya"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Guernsey() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Europe/Guernsey"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Grand_Turk() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Grand_Turk"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void US_Pacific_New() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "US/Pacific-New"); // GMT-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Samarkand() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 23, 35, 11, "Asia/Samarkand"); // GMT+05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Argentina_Cordoba() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Argentina/Cordoba"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Phnom_Penh() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 1, 35, 11, "Asia/Phnom_Penh"); // GMT+07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Kigali() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Africa/Kigali"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Almaty() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 0, 35, 11, "Asia/Almaty"); // GMT+06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void US_Alaska() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 10, 35, 11, "US/Alaska"); // GMT-08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Dubai() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 22, 35, 11, "Asia/Dubai"); // GMT+04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Isle_of_Man() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Europe/Isle_of_Man"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Araguaina() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Araguaina"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Cuba() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "Cuba"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Novosibirsk() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 1, 35, 11, "Asia/Novosibirsk"); // GMT+07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Argentina_Salta() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Argentina/Salta"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_GMTplus3() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "Etc/GMT+3"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Tunis() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Africa/Tunis"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_GMTplus2() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 16, 35, 11, "Etc/GMT+2"); // GMT-02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_GMTplus1() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 17, 35, 11, "Etc/GMT+1"); // GMT-01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Fakaofo() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 7, 35, 11, "Pacific/Fakaofo"); // GMT+13:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Tripoli() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Africa/Tripoli"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_GMTplus0() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Etc/GMT+0"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Israel() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Israel"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Banjul() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Africa/Banjul"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_GMTplus7() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "Etc/GMT+7"); // GMT-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Indian_Comoro() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Indian/Comoro"); // GMT+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_GMTplus6() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "Etc/GMT+6"); // GMT-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_GMTplus5() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "Etc/GMT+5"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_GMTplus4() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "Etc/GMT+4"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Port_Moresby() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 4, 35, 11, "Pacific/Port_Moresby"); // GMT+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void US_Arizona() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "US/Arizona"); // GMT-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Antarctica_Syowa() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Antarctica/Syowa"); // GMT+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Indian_Reunion() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 22, 35, 11, "Indian/Reunion"); // GMT+04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Palau() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 3, 35, 11, "Pacific/Palau"); // GMT+09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Kaliningrad() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Europe/Kaliningrad"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Montevideo() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Montevideo"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Windhoek() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Africa/Windhoek"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Karachi() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 23, 35, 11, "Asia/Karachi"); // GMT+05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Mogadishu() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Africa/Mogadishu"); // GMT+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Australia_Perth() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Australia/Perth"); // GMT+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Brazil_East() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 16, 35, 11, "Brazil/East"); // GMT-02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_GMT() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Etc/GMT"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Chita() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 3, 35, 11, "Asia/Chita"); // GMT+09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Easter() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "Pacific/Easter"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Antarctica_Davis() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 1, 35, 11, "Antarctica/Davis"); // GMT+07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Antarctica_McMurdo() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 7, 35, 11, "Antarctica/McMurdo"); // GMT+13:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Macao() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Macao"); // GMT+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Manaus() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Manaus"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Freetown() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Africa/Freetown"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Bucharest() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Europe/Bucharest"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Tomsk() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 1, 35, 11, "Asia/Tomsk"); // GMT+07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Argentina_Mendoza() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Argentina/Mendoza"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Macau() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Macau"); // GMT+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Malta() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Malta"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Mexico_BajaSur() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "Mexico/BajaSur"); // GMT-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Tahiti() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 8, 35, 11, "Pacific/Tahiti"); // GMT-10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Asmera() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Africa/Asmera"); // GMT+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Busingen() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Busingen"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Argentina_Rio_Gallegos() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Argentina/Rio_Gallegos"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Malabo() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Africa/Malabo"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Skopje() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Skopje"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Catamarca() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Catamarca"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Godthab() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Godthab"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Sarajevo() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Sarajevo"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Australia_ACT() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Australia/ACT"); // GMT+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void GB_Eire() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "GB-Eire"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Lagos() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Africa/Lagos"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Cordoba() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Cordoba"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Rome() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Rome"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Dacca() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 0, 35, 11, "Asia/Dacca"); // GMT+06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Indian_Mauritius() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 22, 35, 11, "Indian/Mauritius"); // GMT+04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Samoa() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 7, 35, 11, "Pacific/Samoa"); // GMT-11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Regina() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Regina"); // GMT-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Fort_Wayne() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Fort_Wayne"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Dawson_Creek() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "America/Dawson_Creek"); // GMT-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Algiers() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Africa/Algiers"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Mariehamn() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Europe/Mariehamn"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_St_Johns() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 16, 5, 11, "America/St_Johns"); // GMT-02:-30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_St_Thomas() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/St_Thomas"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Zurich() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Zurich"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Anguilla() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Anguilla"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Dili() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 3, 35, 11, "Asia/Dili"); // GMT+09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Denver() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Denver"); // GMT-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Bamako() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Africa/Bamako"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Saratov() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 22, 35, 11, "Europe/Saratov"); // GMT+04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void GB() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "GB"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Mexico_General() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "Mexico/General"); // GMT-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Wallis() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 6, 35, 11, "Pacific/Wallis"); // GMT+12:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Gibraltar() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Gibraltar"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Conakry() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Africa/Conakry"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Lubumbashi() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Africa/Lubumbashi"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Istanbul() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Asia/Istanbul"); // GMT+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Havana() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Havana"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void NZ_CHAT() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 8, 20, 11, "NZ-CHAT"); // GMT+13:45
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Choibalsan() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Choibalsan"); // GMT+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Porto_Acre() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Porto_Acre"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Omsk() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 0, 35, 11, "Asia/Omsk"); // GMT+06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Vaduz() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Vaduz"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void US_Michigan() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "US/Michigan"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Dhaka() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 0, 35, 11, "Asia/Dhaka"); // GMT+06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Barbados() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Barbados"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Tiraspol() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Europe/Tiraspol"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Atlantic_Cape_Verde() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 17, 35, 11, "Atlantic/Cape_Verde"); // GMT-01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Yekaterinburg() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 23, 35, 11, "Asia/Yekaterinburg"); // GMT+05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Louisville() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Louisville"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Johnston() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 8, 35, 11, "Pacific/Johnston"); // GMT-10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Chatham() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 8, 20, 11, "Pacific/Chatham"); // GMT+13:45
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Ljubljana() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Ljubljana"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Sao_Paulo() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 16, 35, 11, "America/Sao_Paulo"); // GMT-02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Jayapura() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 3, 35, 11, "Asia/Jayapura"); // GMT+09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Curacao() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Curacao"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Dushanbe() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 23, 35, 11, "Asia/Dushanbe"); // GMT+05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Guyana() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Guyana"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Guayaquil() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Guayaquil"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Martinique() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Martinique"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Portugal() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Portugal"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Berlin() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Berlin"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Moscow() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Europe/Moscow"); // GMT+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Chisinau() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Europe/Chisinau"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Puerto_Rico() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Puerto_Rico"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Rankin_Inlet() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Rankin_Inlet"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Ponape() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Pacific/Ponape"); // GMT+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Stockholm() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Stockholm"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Budapest() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Budapest"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Argentina_Jujuy() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Argentina/Jujuy"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Australia_Eucla() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 3, 20, 11, "Australia/Eucla"); // GMT+08:45
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Shanghai() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Shanghai"); // GMT+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Universal() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Universal"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Zagreb() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Zagreb"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Port_of_Spain() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Port_of_Spain"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Helsinki() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Europe/Helsinki"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Beirut() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Asia/Beirut"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Tel_Aviv() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Asia/Tel_Aviv"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Bougainville() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Pacific/Bougainville"); // GMT+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void US_Central() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "US/Central"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Sao_Tome() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Africa/Sao_Tome"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Indian_Chagos() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 0, 35, 11, "Indian/Chagos"); // GMT+06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Cayenne() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Cayenne"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Yakutsk() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 3, 35, 11, "Asia/Yakutsk"); // GMT+09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Galapagos() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "Pacific/Galapagos"); // GMT-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Australia_North() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 4, 5, 11, "Australia/North"); // GMT+09:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Paris() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Paris"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Ndjamena() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Africa/Ndjamena"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Fiji() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 6, 35, 11, "Pacific/Fiji"); // GMT+12:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Rainy_River() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Rainy_River"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Indian_Maldives() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 23, 35, 11, "Indian/Maldives"); // GMT+05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Australia_Yancowinna() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 5, 5, 11, "Australia/Yancowinna"); // GMT+10:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void SystemV_AST4() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "SystemV/AST4"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Oral() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 23, 35, 11, "Asia/Oral"); // GMT+05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Yellowknife() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Yellowknife"); // GMT-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Enderbury() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 7, 35, 11, "Pacific/Enderbury"); // GMT+13:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Juneau() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 10, 35, 11, "America/Juneau"); // GMT-08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Australia_Victoria() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Australia/Victoria"); // GMT+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Indiana_Vevay() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Indiana/Vevay"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Tashkent() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 23, 35, 11, "Asia/Tashkent"); // GMT+05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Jakarta() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 1, 35, 11, "Asia/Jakarta"); // GMT+07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Ceuta() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Africa/Ceuta"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Barnaul() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 1, 35, 11, "Asia/Barnaul"); // GMT+07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Recife() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Recife"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Buenos_Aires() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Buenos_Aires"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Noronha() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 16, 35, 11, "America/Noronha"); // GMT-02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Swift_Current() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Swift_Current"); // GMT-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Australia_Adelaide() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 5, 5, 11, "Australia/Adelaide"); // GMT+10:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Metlakatla() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 10, 35, 11, "America/Metlakatla"); // GMT-08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Djibouti() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Africa/Djibouti"); // GMT+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Paramaribo() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Paramaribo"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Simferopol() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Europe/Simferopol"); // GMT+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Sofia() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Europe/Sofia"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Nouakchott() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Africa/Nouakchott"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Prague() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Prague"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Indiana_Vincennes() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Indiana/Vincennes"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Antarctica_Mawson() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 23, 35, 11, "Antarctica/Mawson"); // GMT+05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Kralendijk() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Kralendijk"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Antarctica_Troll() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Antarctica/Troll"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Samara() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 22, 35, 11, "Europe/Samara"); // GMT+04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Indian_Christmas() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 1, 35, 11, "Indian/Christmas"); // GMT+07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Antigua() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Antigua"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Gambier() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 9, 35, 11, "Pacific/Gambier"); // GMT-09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Indianapolis() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Indianapolis"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Inuvik() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Inuvik"); // GMT-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Iqaluit() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Iqaluit"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Funafuti() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 6, 35, 11, "Pacific/Funafuti"); // GMT+12:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void UTC() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "UTC"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Antarctica_Macquarie() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Antarctica/Macquarie"); // GMT+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Canada_Pacific() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "Canada/Pacific"); // GMT-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Moncton() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Moncton"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Gaborone() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Africa/Gaborone"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Chuuk() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 4, 35, 11, "Pacific/Chuuk"); // GMT+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Pyongyang() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 3, 5, 11, "Asia/Pyongyang"); // GMT+08:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_St_Vincent() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/St_Vincent"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Gaza() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Asia/Gaza"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_Universal() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Etc/Universal"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void PST8PDT() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "PST8PDT"); // GMT-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Atlantic_Faeroe() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Atlantic/Faeroe"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Qyzylorda() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 0, 35, 11, "Asia/Qyzylorda"); // GMT+06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Canada_Newfoundland() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 16, 5, 11, "Canada/Newfoundland"); // GMT-02:-30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Kentucky_Louisville() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Kentucky/Louisville"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Yakutat() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 10, 35, 11, "America/Yakutat"); // GMT-08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Ho_Chi_Minh() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 1, 35, 11, "Asia/Ho_Chi_Minh"); // GMT+07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Antarctica_Casey() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Antarctica/Casey"); // GMT+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Copenhagen() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Copenhagen"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Asmara() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Africa/Asmara"); // GMT+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Atlantic_Azores() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 17, 35, 11, "Atlantic/Azores"); // GMT-01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Vienna() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Vienna"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void ROK() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 3, 35, 11, "ROK"); // GMT+09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Pitcairn() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 10, 35, 11, "Pacific/Pitcairn"); // GMT-08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Mazatlan() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "America/Mazatlan"); // GMT-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Australia_Queensland() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 4, 35, 11, "Australia/Queensland"); // GMT+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Nauru() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 6, 35, 11, "Pacific/Nauru"); // GMT+12:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Tirane() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Tirane"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Kolkata() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 0, 5, 11, "Asia/Kolkata"); // GMT+05:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void SystemV_MST7() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "SystemV/MST7"); // GMT-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Australia_Canberra() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Australia/Canberra"); // GMT+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void MET() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "MET"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Australia_Broken_Hill() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 5, 5, 11, "Australia/Broken_Hill"); // GMT+10:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Riga() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Europe/Riga"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Dominica() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Dominica"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Abidjan() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Africa/Abidjan"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Mendoza() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Mendoza"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Santarem() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Santarem"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Kwajalein() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 6, 35, 11, "Kwajalein"); // GMT+12:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Asuncion() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Asuncion"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Ulan_Bator() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Ulan_Bator"); // GMT+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void NZ() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 7, 35, 11, "NZ"); // GMT+13:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Boise() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Boise"); // GMT-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Australia_Currie() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Australia/Currie"); // GMT+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void EST5EDT() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "EST5EDT"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Guam() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 4, 35, 11, "Pacific/Guam"); // GMT+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Wake() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 6, 35, 11, "Pacific/Wake"); // GMT+12:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Atlantic_Bermuda() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "Atlantic/Bermuda"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Costa_Rica() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Costa_Rica"); // GMT-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Dawson() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "America/Dawson"); // GMT-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Chongqing() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Chongqing"); // GMT+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Eire() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Eire"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Amsterdam() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Amsterdam"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Indiana_Knox() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Indiana/Knox"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_North_Dakota_Beulah() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/North_Dakota/Beulah"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Accra() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Africa/Accra"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Atlantic_Faroe() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Atlantic/Faroe"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Mexico_BajaNorte() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "Mexico/BajaNorte"); // GMT-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Maceio() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Maceio"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_UCT() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Etc/UCT"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Apia() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 8, 35, 11, "Pacific/Apia"); // GMT+14:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void GMT0() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "GMT0"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Atka() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 9, 35, 11, "America/Atka"); // GMT-09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Niue() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 7, 35, 11, "Pacific/Niue"); // GMT-11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Australia_Lord_Howe() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Australia/Lord_Howe"); // GMT+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Dublin() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Europe/Dublin"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Truk() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 4, 35, 11, "Pacific/Truk"); // GMT+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void MST7MDT() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "MST7MDT"); // GMT-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Monterrey() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Monterrey"); // GMT-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Nassau() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Nassau"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Jamaica() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Jamaica"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Bishkek() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 0, 35, 11, "Asia/Bishkek"); // GMT+06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Atikokan() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Atikokan"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Atlantic_Stanley() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "Atlantic/Stanley"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Australia_NSW() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Australia/NSW"); // GMT+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void US_Hawaii() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 8, 35, 11, "US/Hawaii"); // GMT-10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void SystemV_CST6() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "SystemV/CST6"); // GMT-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Indian_Mahe() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 22, 35, 11, "Indian/Mahe"); // GMT+04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Aqtobe() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 23, 35, 11, "Asia/Aqtobe"); // GMT+05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Sitka() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 10, 35, 11, "America/Sitka"); // GMT-08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Vladivostok() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 4, 35, 11, "Asia/Vladivostok"); // GMT+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Libreville() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Africa/Libreville"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Maputo() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Africa/Maputo"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Zulu() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Zulu"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Kentucky_Monticello() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Kentucky/Monticello"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_El_Aaiun() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Africa/El_Aaiun"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Ouagadougou() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Africa/Ouagadougou"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Coral_Harbour() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Coral_Harbour"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Marquesas() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 9, 5, 11, "Pacific/Marquesas"); // GMT-09:-30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Brazil_West() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "Brazil/West"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Aruba() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Aruba"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_North_Dakota_Center() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/North_Dakota/Center"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Cayman() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Cayman"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Ulaanbaatar() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Ulaanbaatar"); // GMT+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Baghdad() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Asia/Baghdad"); // GMT+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_San_Marino() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/San_Marino"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Indiana_Tell_City() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Indiana/Tell_City"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Tijuana() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "America/Tijuana"); // GMT-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Saipan() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 4, 35, 11, "Pacific/Saipan"); // GMT+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void SystemV_YST9() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 9, 35, 11, "SystemV/YST9"); // GMT-09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Douala() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Africa/Douala"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Chihuahua() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "America/Chihuahua"); // GMT-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Ojinaga() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Ojinaga"); // GMT-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Hovd() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 1, 35, 11, "Asia/Hovd"); // GMT+07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Anchorage() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 10, 35, 11, "America/Anchorage"); // GMT-08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Chile_EasterIsland() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "Chile/EasterIsland"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Halifax() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Halifax"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Antarctica_Rothera() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "Antarctica/Rothera"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Indiana_Indianapolis() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Indiana/Indianapolis"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void US_Mountain() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "US/Mountain"); // GMT-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Damascus() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Asia/Damascus"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Argentina_San_Luis() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Argentina/San_Luis"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Santiago() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Santiago"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Baku() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 22, 35, 11, "Asia/Baku"); // GMT+04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Argentina_Ushuaia() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Argentina/Ushuaia"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Atlantic_Reykjavik() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Atlantic/Reykjavik"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Brazzaville() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Africa/Brazzaville"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Porto_Novo() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Africa/Porto-Novo"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_La_Paz() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/La_Paz"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Antarctica_DumontDUrville() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 4, 35, 11, "Antarctica/DumontDUrville"); // GMT+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Taipei() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Taipei"); // GMT+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Antarctica_South_Pole() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 7, 35, 11, "Antarctica/South_Pole"); // GMT+13:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Manila() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Manila"); // GMT+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Bangkok() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 1, 35, 11, "Asia/Bangkok"); // GMT+07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Dar_es_Salaam() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Africa/Dar_es_Salaam"); // GMT+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Poland() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Poland"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Atlantic_Madeira() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Atlantic/Madeira"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Antarctica_Palmer() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "Antarctica/Palmer"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Thunder_Bay() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Thunder_Bay"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Addis_Ababa() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Africa/Addis_Ababa"); // GMT+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Yangon() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 1, 5, 11, "Asia/Yangon"); // GMT+06:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Uzhgorod() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Europe/Uzhgorod"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Brazil_DeNoronha() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 16, 35, 11, "Brazil/DeNoronha"); // GMT-02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Ashkhabad() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 23, 35, 11, "Asia/Ashkhabad"); // GMT+05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_Zulu() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Etc/Zulu"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Indiana_Marengo() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Indiana/Marengo"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Creston() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "America/Creston"); // GMT-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Punta_Arenas() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Punta_Arenas"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Mexico_City() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Mexico_City"); // GMT-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Antarctica_Vostok() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 0, 35, 11, "Antarctica/Vostok"); // GMT+06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Jerusalem() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Asia/Jerusalem"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Andorra() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Andorra"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void US_Samoa() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 7, 35, 11, "US/Samoa"); // GMT-11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void PRC() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "PRC"); // GMT+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Vientiane() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 1, 35, 11, "Asia/Vientiane"); // GMT+07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Kiritimati() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 8, 35, 11, "Pacific/Kiritimati"); // GMT+14:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Matamoros() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Matamoros"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Blanc_Sablon() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Blanc-Sablon"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Riyadh() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Asia/Riyadh"); // GMT+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Iceland() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Iceland"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Pohnpei() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Pacific/Pohnpei"); // GMT+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Ujung_Pandang() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Ujung_Pandang"); // GMT+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Atlantic_South_Georgia() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 16, 35, 11, "Atlantic/South_Georgia"); // GMT-02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Lisbon() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Europe/Lisbon"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Harbin() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Harbin"); // GMT+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Oslo() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Oslo"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Novokuznetsk() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 1, 35, 11, "Asia/Novokuznetsk"); // GMT+07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void CST6CDT() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "CST6CDT"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Atlantic_Canary() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Atlantic/Canary"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Knox_IN() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Knox_IN"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Kuwait() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Asia/Kuwait"); // GMT+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void SystemV_HST10() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 8, 35, 11, "SystemV/HST10"); // GMT-10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Efate() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Pacific/Efate"); // GMT+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Lome() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Africa/Lome"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Bogota() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Bogota"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Menominee() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Menominee"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Adak() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 9, 35, 11, "America/Adak"); // GMT-09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Norfolk() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Pacific/Norfolk"); // GMT+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Kirov() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Europe/Kirov"); // GMT+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Resolute() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Resolute"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Tarawa() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 6, 35, 11, "Pacific/Tarawa"); // GMT+12:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Kampala() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Africa/Kampala"); // GMT+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Krasnoyarsk() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 1, 35, 11, "Asia/Krasnoyarsk"); // GMT+07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Greenwich() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Greenwich"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void SystemV_EST5() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "SystemV/EST5"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Edmonton() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Edmonton"); // GMT-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Podgorica() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Podgorica"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Australia_South() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 5, 5, 11, "Australia/South"); // GMT+10:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Canada_Central() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "Canada/Central"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Bujumbura() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Africa/Bujumbura"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Santo_Domingo() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Santo_Domingo"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void US_Eastern() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "US/Eastern"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Minsk() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Europe/Minsk"); // GMT+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Auckland() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 7, 35, 11, "Pacific/Auckland"); // GMT+13:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Casablanca() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Africa/Casablanca"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Glace_Bay() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Glace_Bay"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Canada_Eastern() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "Canada/Eastern"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Qatar() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Asia/Qatar"); // GMT+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Kiev() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Europe/Kiev"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Singapore() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Singapore"); // GMT+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Magadan() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Asia/Magadan"); // GMT+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void SystemV_PST8() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 10, 35, 11, "SystemV/PST8"); // GMT-08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Port_au_Prince() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Port-au-Prince"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Belfast() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Europe/Belfast"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_St_Barthelemy() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/St_Barthelemy"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Ashgabat() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 23, 35, 11, "Asia/Ashgabat"); // GMT+05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Luanda() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Africa/Luanda"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Nipigon() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Nipigon"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Atlantic_Jan_Mayen() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Atlantic/Jan_Mayen"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Brazil_Acre() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "Brazil/Acre"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Muscat() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 22, 35, 11, "Asia/Muscat"); // GMT+04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Bahrain() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Asia/Bahrain"); // GMT+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Vilnius() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Europe/Vilnius"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Fortaleza() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Fortaleza"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_GMT0() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Etc/GMT0"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void US_East_Indiana() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "US/East-Indiana"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Hermosillo() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "America/Hermosillo"); // GMT-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Cancun() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Cancun"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Maseru() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Africa/Maseru"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Kosrae() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Pacific/Kosrae"); // GMT+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Kinshasa() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Africa/Kinshasa"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Kathmandu() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 0, 20, 11, "Asia/Kathmandu"); // GMT+05:45
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Seoul() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 3, 35, 11, "Asia/Seoul"); // GMT+09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Australia_Sydney() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Australia/Sydney"); // GMT+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Lima() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Lima"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Australia_LHI() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Australia/LHI"); // GMT+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_St_Lucia() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/St_Lucia"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Madrid() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Madrid"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Bahia_Banderas() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Bahia_Banderas"); // GMT-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Montserrat() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Montserrat"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Brunei() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Brunei"); // GMT+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Santa_Isabel() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "America/Santa_Isabel"); // GMT-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Canada_Mountain() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "Canada/Mountain"); // GMT-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Cambridge_Bay() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Cambridge_Bay"); // GMT-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Colombo() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 0, 5, 11, "Asia/Colombo"); // GMT+05:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Australia_West() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Australia/West"); // GMT+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Indian_Antananarivo() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Indian/Antananarivo"); // GMT+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Australia_Brisbane() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 4, 35, 11, "Australia/Brisbane"); // GMT+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Indian_Mayotte() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Indian/Mayotte"); // GMT+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void US_Indiana_Starke() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "US/Indiana-Starke"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Urumqi() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 0, 35, 11, "Asia/Urumqi"); // GMT+06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void US_Aleutian() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 9, 35, 11, "US/Aleutian"); // GMT-09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Volgograd() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Europe/Volgograd"); // GMT+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Lower_Princes() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Lower_Princes"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Vancouver() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "America/Vancouver"); // GMT-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Blantyre() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Africa/Blantyre"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Rio_Branco() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Rio_Branco"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Danmarkshavn() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "America/Danmarkshavn"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Detroit() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Detroit"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Thule() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Thule"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Lusaka() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Africa/Lusaka"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Hong_Kong() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Hong_Kong"); // GMT+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Iran() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 22, 5, 11, "Iran"); // GMT+03:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Argentina_La_Rioja() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Argentina/La_Rioja"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Dakar() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Africa/Dakar"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void SystemV_CST6CDT() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "SystemV/CST6CDT"); // GMT-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Tortola() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Tortola"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Porto_Velho() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Porto_Velho"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Sakhalin() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Asia/Sakhalin"); // GMT+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_GMTplus10() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 8, 35, 11, "Etc/GMT+10"); // GMT-10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Scoresbysund() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 17, 35, 11, "America/Scoresbysund"); // GMT-01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Kamchatka() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 6, 35, 11, "Asia/Kamchatka"); // GMT+12:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Thimbu() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 0, 35, 11, "Asia/Thimbu"); // GMT+06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Harare() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Africa/Harare"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_GMTplus12() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 6, 35, 11, "Etc/GMT+12"); // GMT-12:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_GMTplus11() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 7, 35, 11, "Etc/GMT+11"); // GMT-11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Navajo() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "Navajo"); // GMT-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Nome() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 10, 35, 11, "America/Nome"); // GMT-08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Tallinn() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Europe/Tallinn"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Turkey() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Turkey"); // GMT+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Khartoum() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Africa/Khartoum"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Johannesburg() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Africa/Johannesburg"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Bangui() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Africa/Bangui"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Belgrade() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Belgrade"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Jamaica() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "Jamaica"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Bissau() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Africa/Bissau"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Tehran() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 22, 5, 11, "Asia/Tehran"); // GMT+03:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void WET() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "WET"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Astrakhan() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 22, 35, 11, "Europe/Astrakhan"); // GMT+04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Juba() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "Africa/Juba"); // GMT+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Campo_Grande() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Campo_Grande"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Belem() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Belem"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_Greenwich() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Etc/Greenwich"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Saigon() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 1, 35, 11, "Asia/Saigon"); // GMT+07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Ensenada() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "America/Ensenada"); // GMT-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Midway() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 7, 35, 11, "Pacific/Midway"); // GMT-11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Jujuy() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Jujuy"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Timbuktu() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Africa/Timbuktu"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Bahia() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Bahia"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Goose_Bay() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Goose_Bay"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Virgin() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Virgin"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Pangnirtung() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Pangnirtung"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Katmandu() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 0, 20, 11, "Asia/Katmandu"); // GMT+05:45
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Phoenix() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "America/Phoenix"); // GMT-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Niamey() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Africa/Niamey"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Whitehorse() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "America/Whitehorse"); // GMT-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Noumea() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Pacific/Noumea"); // GMT+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Tbilisi() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 22, 35, 11, "Asia/Tbilisi"); // GMT+04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Montreal() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Montreal"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Makassar() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Makassar"); // GMT+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Argentina_San_Juan() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Argentina/San_Juan"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Hongkong() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Hongkong"); // GMT+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void UCT() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "UCT"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Nicosia() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Asia/Nicosia"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Indiana_Winamac() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Indiana/Winamac"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void SystemV_MST7MDT() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "SystemV/MST7MDT"); // GMT-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Argentina_ComodRivadavia() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Argentina/ComodRivadavia"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Boa_Vista() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Boa_Vista"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Grenada() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Grenada"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Atyrau() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 23, 35, 11, "Asia/Atyrau"); // GMT+05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Australia_Darwin() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 4, 5, 11, "Australia/Darwin"); // GMT+09:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Khandyga() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 3, 35, 11, "Asia/Khandyga"); // GMT+09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Kuala_Lumpur() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Kuala_Lumpur"); // GMT+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Famagusta() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Asia/Famagusta"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Thimphu() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 0, 35, 11, "Asia/Thimphu"); // GMT+06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Rangoon() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 1, 5, 11, "Asia/Rangoon"); // GMT+06:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Bratislava() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Bratislava"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Calcutta() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 0, 5, 11, "Asia/Calcutta"); // GMT+05:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Argentina_Tucuman() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Argentina/Tucuman"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Kabul() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 23, 5, 11, "Asia/Kabul"); // GMT+04:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Indian_Cocos() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 1, 5, 11, "Indian/Cocos"); // GMT+06:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Japan() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 3, 35, 11, "Japan"); // GMT+09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Tongatapu() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 7, 35, 11, "Pacific/Tongatapu"); // GMT+13:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_New_York() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/New_York"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_GMTminus12() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 6, 35, 11, "Etc/GMT-12"); // GMT+12:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_GMTminus11() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Etc/GMT-11"); // GMT+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_GMTminus10() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 4, 35, 11, "Etc/GMT-10"); // GMT+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void SystemV_YST9YDT() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 9, 35, 11, "SystemV/YST9YDT"); // GMT-09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Ulyanovsk() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 22, 35, 11, "Europe/Ulyanovsk"); // GMT+04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_GMTminus14() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 8, 35, 11, "Etc/GMT-14"); // GMT+14:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_GMTminus13() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 7, 35, 11, "Etc/GMT-13"); // GMT+13:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void W_SU() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 21, 35, 11, "W-SU"); // GMT+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Merida() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Merida"); // GMT-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void EET() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "EET"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Rosario() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Rosario"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Canada_Saskatchewan() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "Canada/Saskatchewan"); // GMT-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_St_Kitts() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/St_Kitts"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Arctic_Longyearbyen() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Arctic/Longyearbyen"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Fort_Nelson() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "America/Fort_Nelson"); // GMT-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Caracas() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Caracas"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Guadeloupe() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Guadeloupe"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Hebron() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Asia/Hebron"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Indian_Kerguelen() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 23, 35, 11, "Indian/Kerguelen"); // GMT+05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void SystemV_PST8PDT() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 10, 35, 11, "SystemV/PST8PDT"); // GMT-08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Africa_Monrovia() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Africa/Monrovia"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Ust_Nera() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 4, 35, 11, "Asia/Ust-Nera"); // GMT+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Egypt() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Egypt"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Srednekolymsk() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Asia/Srednekolymsk"); // GMT+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_North_Dakota_New_Salem() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/North_Dakota/New_Salem"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Anadyr() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 6, 35, 11, "Asia/Anadyr"); // GMT+12:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Australia_Melbourne() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Australia/Melbourne"); // GMT+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Irkutsk() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Irkutsk"); // GMT+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Shiprock() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 12, 35, 11, "America/Shiprock"); // GMT-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Winnipeg() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "America/Winnipeg"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Vatican() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Vatican"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Amman() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Asia/Amman"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Etc_UTC() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 18, 35, 11, "Etc/UTC"); // GMT+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void SystemV_AST4ADT() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "SystemV/AST4ADT"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Tokyo() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 3, 35, 11, "Asia/Tokyo"); // GMT+09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Toronto() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 14, 35, 11, "America/Toronto"); // GMT-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Asia_Singapore() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 2, 35, 11, "Asia/Singapore"); // GMT+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Australia_Lindeman() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 4, 35, 11, "Australia/Lindeman"); // GMT+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Los_Angeles() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "America/Los_Angeles"); // GMT-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void SystemV_EST5EDT() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 13, 35, 11, "SystemV/EST5EDT"); // GMT-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Majuro() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 6, 35, 11, "Pacific/Majuro"); // GMT+12:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void America_Argentina_Buenos_Aires() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 15, 35, 11, "America/Argentina/Buenos_Aires"); // GMT-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Nicosia() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Europe/Nicosia"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Pacific_Guadalcanal() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 2, 5, 35, 11, "Pacific/Guadalcanal"); // GMT+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Athens() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 20, 35, 11, "Europe/Athens"); // GMT+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void US_Pacific() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "US/Pacific"); // GMT-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    @Test
    public void Europe_Monaco() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 19, 35, 11, "Europe/Monaco"); // GMT+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 18, 2, 8, 18));
    }

    private ZonedDateTime getDateTimeInATimeZone(int year, int month, int dayOfMonth, int hour, int minute, int second, String zoneId)
    {
        return ZonedDateTime.of(year, month, dayOfMonth, hour, minute, second, 0, ZoneId.of(zoneId));
    }

    private void assertDuration(Duration actualDuration, Duration expectedDuration)
    {
        assertThat(actualDuration.Years).isEqualTo(expectedDuration.Years);
        assertThat(actualDuration.Months).isEqualTo(expectedDuration.Months);
        assertThat(actualDuration.Days).isEqualTo(expectedDuration.Days);

        assertThat(actualDuration.Hours).isEqualTo(expectedDuration.Hours);
        assertThat(actualDuration.Minutes).isEqualTo(expectedDuration.Minutes);
        assertThat(actualDuration.Seconds).isEqualTo(expectedDuration.Seconds);
    }
}