package com.vuonglab.hennaandphu;

import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static com.google.common.truth.Truth.assertThat;

public class TimeZoneDaylightSavingTimeUnitTests {
    @Test
    public void Etc_GMTplus12() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 13, 53, 46, "Etc/GMT+12"); // UTC-12:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Pago_Pago() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 14, 53, 46, "Pacific/Pago_Pago"); // UTC-11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Samoa() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 14, 53, 46, "Pacific/Samoa"); // UTC-11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Niue() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 14, 53, 46, "Pacific/Niue"); // UTC-11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void US_Samoa() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 14, 53, 46, "US/Samoa"); // UTC-11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_GMTplus11() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 14, 53, 46, "Etc/GMT+11"); // UTC-11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Midway() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 14, 53, 46, "Pacific/Midway"); // UTC-11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Honolulu() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 15, 53, 46, "Pacific/Honolulu"); // UTC-10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Rarotonga() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 15, 53, 46, "Pacific/Rarotonga"); // UTC-10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Tahiti() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 15, 53, 46, "Pacific/Tahiti"); // UTC-10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Johnston() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 15, 53, 46, "Pacific/Johnston"); // UTC-10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void US_Hawaii() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 15, 53, 46, "US/Hawaii"); // UTC-10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void SystemV_HST10() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 15, 53, 46, "SystemV/HST10"); // UTC-10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_GMTplus10() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 15, 53, 46, "Etc/GMT+10"); // UTC-10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Marquesas() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 16, 23, 46, "Pacific/Marquesas"); // UTC-09:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_GMTplus9() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 16, 53, 46, "Etc/GMT+9"); // UTC-09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Gambier() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 16, 53, 46, "Pacific/Gambier"); // UTC-09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Atka() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 16, 53, 46, "America/Atka"); // UTC-09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void SystemV_YST9() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 16, 53, 46, "SystemV/YST9"); // UTC-09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Adak() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 16, 53, 46, "America/Adak"); // UTC-09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void US_Aleutian() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 16, 53, 46, "US/Aleutian"); // UTC-09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_GMTplus8() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 17, 53, 46, "Etc/GMT+8"); // UTC-08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void US_Alaska() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 17, 53, 46, "US/Alaska"); // UTC-08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Juneau() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 17, 53, 46, "America/Juneau"); // UTC-08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Metlakatla() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 17, 53, 46, "America/Metlakatla"); // UTC-08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Yakutat() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 17, 53, 46, "America/Yakutat"); // UTC-08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Pitcairn() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 17, 53, 46, "Pacific/Pitcairn"); // UTC-08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Sitka() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 17, 53, 46, "America/Sitka"); // UTC-08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Anchorage() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 17, 53, 46, "America/Anchorage"); // UTC-08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void SystemV_PST8() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 17, 53, 46, "SystemV/PST8"); // UTC-08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Nome() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 17, 53, 46, "America/Nome"); // UTC-08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void SystemV_YST9YDT() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 17, 53, 46, "SystemV/YST9YDT"); // UTC-08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Canada_Yukon() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "Canada/Yukon"); // UTC-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void US_Pacific_New() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "US/Pacific-New"); // UTC-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_GMTplus7() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "Etc/GMT+7"); // UTC-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void US_Arizona() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "US/Arizona"); // UTC-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Dawson_Creek() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "America/Dawson_Creek"); // UTC-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Canada_Pacific() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "Canada/Pacific"); // UTC-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void PST8PDT() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "PST8PDT"); // UTC-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void SystemV_MST7() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "SystemV/MST7"); // UTC-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Dawson() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "America/Dawson"); // UTC-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Mexico_BajaNorte() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "Mexico/BajaNorte"); // UTC-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Tijuana() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "America/Tijuana"); // UTC-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Creston() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "America/Creston"); // UTC-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Hermosillo() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "America/Hermosillo"); // UTC-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Santa_Isabel() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "America/Santa_Isabel"); // UTC-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Vancouver() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "America/Vancouver"); // UTC-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Ensenada() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "America/Ensenada"); // UTC-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Phoenix() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "America/Phoenix"); // UTC-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Whitehorse() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "America/Whitehorse"); // UTC-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Fort_Nelson() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "America/Fort_Nelson"); // UTC-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void SystemV_PST8PDT() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "SystemV/PST8PDT"); // UTC-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Los_Angeles() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "America/Los_Angeles"); // UTC-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void US_Pacific() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "US/Pacific"); // UTC-07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_El_Salvador() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/El_Salvador"); // UTC-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Guatemala() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Guatemala"); // UTC-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Belize() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Belize"); // UTC-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Managua() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Managua"); // UTC-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Tegucigalpa() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Tegucigalpa"); // UTC-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_GMTplus6() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "Etc/GMT+6"); // UTC-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Easter() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "Pacific/Easter"); // UTC-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Mexico_BajaSur() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "Mexico/BajaSur"); // UTC-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Regina() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Regina"); // UTC-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Denver() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Denver"); // UTC-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Galapagos() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "Pacific/Galapagos"); // UTC-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Yellowknife() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Yellowknife"); // UTC-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Swift_Current() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Swift_Current"); // UTC-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Inuvik() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Inuvik"); // UTC-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Mazatlan() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Mazatlan"); // UTC-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Boise() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Boise"); // UTC-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Costa_Rica() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Costa_Rica"); // UTC-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void MST7MDT() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "MST7MDT"); // UTC-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void SystemV_CST6() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "SystemV/CST6"); // UTC-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Chihuahua() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Chihuahua"); // UTC-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Ojinaga() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Ojinaga"); // UTC-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Chile_EasterIsland() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "Chile/EasterIsland"); // UTC-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void US_Mountain() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "US/Mountain"); // UTC-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Edmonton() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Edmonton"); // UTC-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Canada_Mountain() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "Canada/Mountain"); // UTC-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Cambridge_Bay() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Cambridge_Bay"); // UTC-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Navajo() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "Navajo"); // UTC-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void SystemV_MST7MDT() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "SystemV/MST7MDT"); // UTC-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Canada_Saskatchewan() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "Canada/Saskatchewan"); // UTC-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Shiprock() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 19, 53, 46, "America/Shiprock"); // UTC-06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Panama() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Panama"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Chicago() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Chicago"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Eirunepe() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Eirunepe"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_GMTplus5() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "Etc/GMT+5"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Mexico_General() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "Mexico/General"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Porto_Acre() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Porto_Acre"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Guayaquil() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Guayaquil"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Rankin_Inlet() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Rankin_Inlet"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void US_Central() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "US/Central"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Rainy_River() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Rainy_River"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Indiana_Knox() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Indiana/Knox"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_North_Dakota_Beulah() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/North_Dakota/Beulah"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Monterrey() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Monterrey"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Jamaica() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Jamaica"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Atikokan() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Atikokan"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Coral_Harbour() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Coral_Harbour"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_North_Dakota_Center() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/North_Dakota/Center"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Cayman() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Cayman"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Indiana_Tell_City() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Indiana/Tell_City"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Mexico_City() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Mexico_City"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Matamoros() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Matamoros"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void CST6CDT() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "CST6CDT"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Knox_IN() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Knox_IN"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Bogota() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Bogota"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Menominee() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Menominee"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Resolute() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Resolute"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void SystemV_EST5() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "SystemV/EST5"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Canada_Central() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "Canada/Central"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Brazil_Acre() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "Brazil/Acre"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Cancun() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Cancun"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Lima() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Lima"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Bahia_Banderas() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Bahia_Banderas"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void US_Indiana_Starke() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "US/Indiana-Starke"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Rio_Branco() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Rio_Branco"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void SystemV_CST6CDT() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "SystemV/CST6CDT"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Jamaica() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "Jamaica"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Merida() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Merida"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_North_Dakota_New_Salem() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/North_Dakota/New_Salem"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Winnipeg() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 20, 53, 46, "America/Winnipeg"); // UTC-05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Cuiaba() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Cuiaba"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Marigot() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Marigot"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Indiana_Petersburg() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Indiana/Petersburg"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Chile_Continental() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "Chile/Continental"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Grand_Turk() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Grand_Turk"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Cuba() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "Cuba"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_GMTplus4() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "Etc/GMT+4"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Manaus() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Manaus"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Fort_Wayne() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Fort_Wayne"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_St_Thomas() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/St_Thomas"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Anguilla() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Anguilla"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Havana() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Havana"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void US_Michigan() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "US/Michigan"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Barbados() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Barbados"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Louisville() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Louisville"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Curacao() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Curacao"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Guyana() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Guyana"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Martinique() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Martinique"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Puerto_Rico() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Puerto_Rico"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Port_of_Spain() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Port_of_Spain"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void SystemV_AST4() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "SystemV/AST4"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Indiana_Vevay() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Indiana/Vevay"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Indiana_Vincennes() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Indiana/Vincennes"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Kralendijk() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Kralendijk"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Antigua() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Antigua"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Indianapolis() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Indianapolis"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Iqaluit() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Iqaluit"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_St_Vincent() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/St_Vincent"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Kentucky_Louisville() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Kentucky/Louisville"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Dominica() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Dominica"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Asuncion() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Asuncion"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void EST5EDT() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "EST5EDT"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Nassau() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Nassau"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Kentucky_Monticello() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Kentucky/Monticello"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Brazil_West() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "Brazil/West"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Aruba() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Aruba"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Indiana_Indianapolis() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Indiana/Indianapolis"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Santiago() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Santiago"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_La_Paz() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/La_Paz"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Thunder_Bay() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Thunder_Bay"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Indiana_Marengo() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Indiana/Marengo"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Blanc_Sablon() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Blanc-Sablon"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Santo_Domingo() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Santo_Domingo"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void US_Eastern() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "US/Eastern"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Canada_Eastern() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "Canada/Eastern"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Port_au_Prince() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Port-au-Prince"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_St_Barthelemy() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/St_Barthelemy"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Nipigon() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Nipigon"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void US_East_Indiana() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "US/East-Indiana"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_St_Lucia() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/St_Lucia"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Montserrat() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Montserrat"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Lower_Princes() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Lower_Princes"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Detroit() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Detroit"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Tortola() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Tortola"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Porto_Velho() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Porto_Velho"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Campo_Grande() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Campo_Grande"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Virgin() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Virgin"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Pangnirtung() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Pangnirtung"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Montreal() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Montreal"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Indiana_Winamac() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Indiana/Winamac"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Boa_Vista() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Boa_Vista"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Grenada() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Grenada"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_New_York() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/New_York"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_St_Kitts() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/St_Kitts"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Caracas() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Caracas"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Guadeloupe() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Guadeloupe"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Toronto() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "America/Toronto"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void SystemV_EST5EDT() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 21, 53, 46, "SystemV/EST5EDT"); // UTC-04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Argentina_Catamarca() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Argentina/Catamarca"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Canada_Atlantic() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "Canada/Atlantic"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Argentina_Cordoba() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Argentina/Cordoba"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Araguaina() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Araguaina"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Argentina_Salta() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Argentina/Salta"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_GMTplus3() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "Etc/GMT+3"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Montevideo() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Montevideo"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Brazil_East() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "Brazil/East"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Argentina_Mendoza() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Argentina/Mendoza"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Argentina_Rio_Gallegos() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Argentina/Rio_Gallegos"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Catamarca() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Catamarca"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Cordoba() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Cordoba"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Sao_Paulo() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Sao_Paulo"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Argentina_Jujuy() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Argentina/Jujuy"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Cayenne() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Cayenne"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Recife() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Recife"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Buenos_Aires() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Buenos_Aires"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Paramaribo() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Paramaribo"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Moncton() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Moncton"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Mendoza() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Mendoza"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Santarem() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Santarem"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Atlantic_Bermuda() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "Atlantic/Bermuda"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Maceio() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Maceio"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Atlantic_Stanley() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "Atlantic/Stanley"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Halifax() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Halifax"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Antarctica_Rothera() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "Antarctica/Rothera"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Argentina_San_Luis() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Argentina/San_Luis"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Argentina_Ushuaia() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Argentina/Ushuaia"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Antarctica_Palmer() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "Antarctica/Palmer"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Punta_Arenas() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Punta_Arenas"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Glace_Bay() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Glace_Bay"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Fortaleza() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Fortaleza"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Thule() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Thule"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Argentina_La_Rioja() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Argentina/La_Rioja"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Belem() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Belem"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Jujuy() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Jujuy"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Bahia() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Bahia"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Goose_Bay() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Goose_Bay"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Argentina_San_Juan() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Argentina/San_Juan"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Argentina_ComodRivadavia() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Argentina/ComodRivadavia"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Argentina_Tucuman() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Argentina/Tucuman"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Rosario() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Rosario"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void SystemV_AST4ADT() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "SystemV/AST4ADT"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Argentina_Buenos_Aires() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 22, 53, 46, "America/Argentina/Buenos_Aires"); // UTC-03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_St_Johns() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 23, 23, 46, "America/St_Johns"); // UTC-02:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Canada_Newfoundland() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 23, 23, 46, "Canada/Newfoundland"); // UTC-02:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Miquelon() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 23, 53, 46, "America/Miquelon"); // UTC-02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_GMTplus2() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 23, 53, 46, "Etc/GMT+2"); // UTC-02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Godthab() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 23, 53, 46, "America/Godthab"); // UTC-02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Noronha() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 23, 53, 46, "America/Noronha"); // UTC-02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Brazil_DeNoronha() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 23, 53, 46, "Brazil/DeNoronha"); // UTC-02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Atlantic_South_Georgia() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 23, 53, 46, "Atlantic/South_Georgia"); // UTC-02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_GMTplus1() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 0, 53, 46, "Etc/GMT+1"); // UTC-01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Atlantic_Cape_Verde() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 0, 53, 46, "Atlantic/Cape_Verde"); // UTC-01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Kiritimati() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 15, 53, 46, "Pacific/Kiritimati"); // UTC+14:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_GMTminus14() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 15, 53, 46, "Etc/GMT-14"); // UTC+14:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Fakaofo() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 14, 53, 46, "Pacific/Fakaofo"); // UTC+13:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Enderbury() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 14, 53, 46, "Pacific/Enderbury"); // UTC+13:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Apia() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 14, 53, 46, "Pacific/Apia"); // UTC+13:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Tongatapu() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 14, 53, 46, "Pacific/Tongatapu"); // UTC+13:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_GMTminus13() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 14, 53, 46, "Etc/GMT-13"); // UTC+13:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void NZ_CHAT() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 14, 38, 46, "NZ-CHAT"); // UTC+12:45
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Chatham() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 14, 38, 46, "Pacific/Chatham"); // UTC+12:45
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Kwajalein() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 13, 53, 46, "Pacific/Kwajalein"); // UTC+12:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Antarctica_McMurdo() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 13, 53, 46, "Antarctica/McMurdo"); // UTC+12:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Wallis() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 13, 53, 46, "Pacific/Wallis"); // UTC+12:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Fiji() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 13, 53, 46, "Pacific/Fiji"); // UTC+12:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Funafuti() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 13, 53, 46, "Pacific/Funafuti"); // UTC+12:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Nauru() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 13, 53, 46, "Pacific/Nauru"); // UTC+12:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Kwajalein() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 13, 53, 46, "Kwajalein"); // UTC+12:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void NZ() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 13, 53, 46, "NZ"); // UTC+12:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Wake() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 13, 53, 46, "Pacific/Wake"); // UTC+12:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Antarctica_South_Pole() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 13, 53, 46, "Antarctica/South_Pole"); // UTC+12:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Tarawa() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 13, 53, 46, "Pacific/Tarawa"); // UTC+12:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Auckland() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 13, 53, 46, "Pacific/Auckland"); // UTC+12:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Kamchatka() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 13, 53, 46, "Asia/Kamchatka"); // UTC+12:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_GMTminus12() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 13, 53, 46, "Etc/GMT-12"); // UTC+12:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Anadyr() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 13, 53, 46, "Asia/Anadyr"); // UTC+12:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Majuro() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 13, 53, 46, "Pacific/Majuro"); // UTC+12:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Ponape() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 12, 53, 46, "Pacific/Ponape"); // UTC+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Bougainville() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 12, 53, 46, "Pacific/Bougainville"); // UTC+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Antarctica_Macquarie() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 12, 53, 46, "Antarctica/Macquarie"); // UTC+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Pohnpei() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 12, 53, 46, "Pacific/Pohnpei"); // UTC+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Efate() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 12, 53, 46, "Pacific/Efate"); // UTC+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Norfolk() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 12, 53, 46, "Pacific/Norfolk"); // UTC+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Magadan() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 12, 53, 46, "Asia/Magadan"); // UTC+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Kosrae() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 12, 53, 46, "Pacific/Kosrae"); // UTC+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Sakhalin() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 12, 53, 46, "Asia/Sakhalin"); // UTC+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Noumea() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 12, 53, 46, "Pacific/Noumea"); // UTC+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_GMTminus11() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 12, 53, 46, "Etc/GMT-11"); // UTC+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Srednekolymsk() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 12, 53, 46, "Asia/Srednekolymsk"); // UTC+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Guadalcanal() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 12, 53, 46, "Pacific/Guadalcanal"); // UTC+11:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Australia_Lord_Howe() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 12, 23, 46, "Australia/Lord_Howe"); // UTC+10:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Australia_LHI() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 12, 23, 46, "Australia/LHI"); // UTC+10:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Australia_Hobart() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Australia/Hobart"); // UTC+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Yap() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Pacific/Yap"); // UTC+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Australia_Tasmania() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Australia/Tasmania"); // UTC+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Port_Moresby() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Pacific/Port_Moresby"); // UTC+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Australia_ACT() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Australia/ACT"); // UTC+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Australia_Victoria() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Australia/Victoria"); // UTC+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Chuuk() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Pacific/Chuuk"); // UTC+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Australia_Queensland() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Australia/Queensland"); // UTC+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Australia_Canberra() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Australia/Canberra"); // UTC+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Australia_Currie() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Australia/Currie"); // UTC+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Guam() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Pacific/Guam"); // UTC+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Truk() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Pacific/Truk"); // UTC+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Australia_NSW() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Australia/NSW"); // UTC+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Vladivostok() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Asia/Vladivostok"); // UTC+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Saipan() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Pacific/Saipan"); // UTC+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Antarctica_DumontDUrville() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Antarctica/DumontDUrville"); // UTC+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Australia_Sydney() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Australia/Sydney"); // UTC+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Australia_Brisbane() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Australia/Brisbane"); // UTC+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_GMTminus10() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Etc/GMT-10"); // UTC+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Ust_Nera() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Asia/Ust-Nera"); // UTC+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Australia_Melbourne() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Australia/Melbourne"); // UTC+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Australia_Lindeman() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 11, 53, 46, "Australia/Lindeman"); // UTC+10:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Australia_North() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 11, 23, 46, "Australia/North"); // UTC+09:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Australia_Yancowinna() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 11, 23, 46, "Australia/Yancowinna"); // UTC+09:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Australia_Adelaide() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 11, 23, 46, "Australia/Adelaide"); // UTC+09:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Australia_Broken_Hill() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 11, 23, 46, "Australia/Broken_Hill"); // UTC+09:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Australia_South() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 11, 23, 46, "Australia/South"); // UTC+09:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Australia_Darwin() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 11, 23, 46, "Australia/Darwin"); // UTC+09:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_GMTminus9() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 10, 53, 46, "Etc/GMT-9"); // UTC+09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Pacific_Palau() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 10, 53, 46, "Pacific/Palau"); // UTC+09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Chita() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 10, 53, 46, "Asia/Chita"); // UTC+09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Dili() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 10, 53, 46, "Asia/Dili"); // UTC+09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Jayapura() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 10, 53, 46, "Asia/Jayapura"); // UTC+09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Yakutsk() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 10, 53, 46, "Asia/Yakutsk"); // UTC+09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Pyongyang() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 10, 53, 46, "Asia/Pyongyang"); // UTC+09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void ROK() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 10, 53, 46, "ROK"); // UTC+09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Seoul() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 10, 53, 46, "Asia/Seoul"); // UTC+09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Khandyga() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 10, 53, 46, "Asia/Khandyga"); // UTC+09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Japan() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 10, 53, 46, "Japan"); // UTC+09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Tokyo() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 10, 53, 46, "Asia/Tokyo"); // UTC+09:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Australia_Eucla() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 10, 38, 46, "Australia/Eucla"); // UTC+08:45
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Kuching() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Kuching"); // UTC+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Chungking() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Chungking"); // UTC+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_GMTminus8() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Etc/GMT-8"); // UTC+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Australia_Perth() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Australia/Perth"); // UTC+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Macao() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Macao"); // UTC+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Macau() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Macau"); // UTC+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Choibalsan() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Choibalsan"); // UTC+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Shanghai() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Shanghai"); // UTC+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Antarctica_Casey() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Antarctica/Casey"); // UTC+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Ulan_Bator() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Ulan_Bator"); // UTC+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Chongqing() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Chongqing"); // UTC+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Ulaanbaatar() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Ulaanbaatar"); // UTC+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Taipei() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Taipei"); // UTC+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Manila() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Manila"); // UTC+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void PRC() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "PRC"); // UTC+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Ujung_Pandang() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Ujung_Pandang"); // UTC+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Harbin() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Harbin"); // UTC+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Singapore() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Singapore"); // UTC+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Brunei() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Brunei"); // UTC+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Australia_West() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Australia/West"); // UTC+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Hong_Kong() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Hong_Kong"); // UTC+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Makassar() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Makassar"); // UTC+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Hongkong() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Hongkong"); // UTC+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Kuala_Lumpur() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Kuala_Lumpur"); // UTC+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Irkutsk() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Irkutsk"); // UTC+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Singapore() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 9, 53, 46, "Asia/Singapore"); // UTC+08:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Pontianak() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 8, 53, 46, "Asia/Pontianak"); // UTC+07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_GMTminus7() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 8, 53, 46, "Etc/GMT-7"); // UTC+07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Phnom_Penh() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 8, 53, 46, "Asia/Phnom_Penh"); // UTC+07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Novosibirsk() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 8, 53, 46, "Asia/Novosibirsk"); // UTC+07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Antarctica_Davis() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 8, 53, 46, "Antarctica/Davis"); // UTC+07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Tomsk() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 8, 53, 46, "Asia/Tomsk"); // UTC+07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Jakarta() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 8, 53, 46, "Asia/Jakarta"); // UTC+07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Barnaul() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 8, 53, 46, "Asia/Barnaul"); // UTC+07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Indian_Christmas() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 8, 53, 46, "Indian/Christmas"); // UTC+07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Ho_Chi_Minh() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 8, 53, 46, "Asia/Ho_Chi_Minh"); // UTC+07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Hovd() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 8, 53, 46, "Asia/Hovd"); // UTC+07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Bangkok() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 8, 53, 46, "Asia/Bangkok"); // UTC+07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Vientiane() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 8, 53, 46, "Asia/Vientiane"); // UTC+07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Novokuznetsk() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 8, 53, 46, "Asia/Novokuznetsk"); // UTC+07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Krasnoyarsk() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 8, 53, 46, "Asia/Krasnoyarsk"); // UTC+07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Saigon() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 8, 53, 46, "Asia/Saigon"); // UTC+07:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Yangon() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 8, 23, 46, "Asia/Yangon"); // UTC+06:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Rangoon() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 8, 23, 46, "Asia/Rangoon"); // UTC+06:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Indian_Cocos() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 8, 23, 46, "Indian/Cocos"); // UTC+06:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Kashgar() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 7, 53, 46, "Asia/Kashgar"); // UTC+06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_GMTminus6() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 7, 53, 46, "Etc/GMT-6"); // UTC+06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Almaty() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 7, 53, 46, "Asia/Almaty"); // UTC+06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Dacca() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 7, 53, 46, "Asia/Dacca"); // UTC+06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Omsk() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 7, 53, 46, "Asia/Omsk"); // UTC+06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Dhaka() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 7, 53, 46, "Asia/Dhaka"); // UTC+06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Indian_Chagos() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 7, 53, 46, "Indian/Chagos"); // UTC+06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Qyzylorda() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 7, 53, 46, "Asia/Qyzylorda"); // UTC+06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Bishkek() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 7, 53, 46, "Asia/Bishkek"); // UTC+06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Antarctica_Vostok() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 7, 53, 46, "Antarctica/Vostok"); // UTC+06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Urumqi() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 7, 53, 46, "Asia/Urumqi"); // UTC+06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Thimbu() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 7, 53, 46, "Asia/Thimbu"); // UTC+06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Thimphu() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 7, 53, 46, "Asia/Thimphu"); // UTC+06:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Kathmandu() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 7, 38, 46, "Asia/Kathmandu"); // UTC+05:45
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Katmandu() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 7, 38, 46, "Asia/Katmandu"); // UTC+05:45
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Kolkata() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 7, 23, 46, "Asia/Kolkata"); // UTC+05:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Colombo() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 7, 23, 46, "Asia/Colombo"); // UTC+05:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Calcutta() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 7, 23, 46, "Asia/Calcutta"); // UTC+05:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Aqtau() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 6, 53, 46, "Asia/Aqtau"); // UTC+05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_GMTminus5() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 6, 53, 46, "Etc/GMT-5"); // UTC+05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Samarkand() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 6, 53, 46, "Asia/Samarkand"); // UTC+05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Karachi() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 6, 53, 46, "Asia/Karachi"); // UTC+05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Yekaterinburg() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 6, 53, 46, "Asia/Yekaterinburg"); // UTC+05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Dushanbe() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 6, 53, 46, "Asia/Dushanbe"); // UTC+05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Indian_Maldives() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 6, 53, 46, "Indian/Maldives"); // UTC+05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Oral() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 6, 53, 46, "Asia/Oral"); // UTC+05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Tashkent() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 6, 53, 46, "Asia/Tashkent"); // UTC+05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Antarctica_Mawson() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 6, 53, 46, "Antarctica/Mawson"); // UTC+05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Aqtobe() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 6, 53, 46, "Asia/Aqtobe"); // UTC+05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Ashkhabad() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 6, 53, 46, "Asia/Ashkhabad"); // UTC+05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Ashgabat() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 6, 53, 46, "Asia/Ashgabat"); // UTC+05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Atyrau() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 6, 53, 46, "Asia/Atyrau"); // UTC+05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Indian_Kerguelen() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 6, 53, 46, "Indian/Kerguelen"); // UTC+05:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Iran() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 6, 23, 46, "Iran"); // UTC+04:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Tehran() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 6, 23, 46, "Asia/Tehran"); // UTC+04:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Kabul() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 6, 23, 46, "Asia/Kabul"); // UTC+04:30
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Yerevan() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 5, 53, 46, "Asia/Yerevan"); // UTC+04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_GMTminus4() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 5, 53, 46, "Etc/GMT-4"); // UTC+04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Dubai() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 5, 53, 46, "Asia/Dubai"); // UTC+04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Indian_Reunion() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 5, 53, 46, "Indian/Reunion"); // UTC+04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Indian_Mauritius() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 5, 53, 46, "Indian/Mauritius"); // UTC+04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Saratov() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 5, 53, 46, "Europe/Saratov"); // UTC+04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Samara() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 5, 53, 46, "Europe/Samara"); // UTC+04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Indian_Mahe() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 5, 53, 46, "Indian/Mahe"); // UTC+04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Baku() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 5, 53, 46, "Asia/Baku"); // UTC+04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Muscat() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 5, 53, 46, "Asia/Muscat"); // UTC+04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Astrakhan() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 5, 53, 46, "Europe/Astrakhan"); // UTC+04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Tbilisi() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 5, 53, 46, "Asia/Tbilisi"); // UTC+04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Ulyanovsk() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 5, 53, 46, "Europe/Ulyanovsk"); // UTC+04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Aden() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Asia/Aden"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Nairobi() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Africa/Nairobi"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Istanbul() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Istanbul"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_GMTminus3() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Etc/GMT-3"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Zaporozhye() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Zaporozhye"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Israel() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Israel"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Indian_Comoro() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Indian/Comoro"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Antarctica_Syowa() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Antarctica/Syowa"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Mogadishu() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Africa/Mogadishu"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Bucharest() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Bucharest"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Asmera() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Africa/Asmera"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Mariehamn() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Mariehamn"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Istanbul() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Asia/Istanbul"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Tiraspol() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Tiraspol"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Moscow() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Moscow"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Chisinau() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Chisinau"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Helsinki() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Helsinki"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Beirut() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Asia/Beirut"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Tel_Aviv() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Asia/Tel_Aviv"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Djibouti() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Africa/Djibouti"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Simferopol() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Simferopol"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Sofia() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Sofia"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Gaza() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Asia/Gaza"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Asmara() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Africa/Asmara"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Riga() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Riga"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Baghdad() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Asia/Baghdad"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Damascus() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Asia/Damascus"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Dar_es_Salaam() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Africa/Dar_es_Salaam"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Addis_Ababa() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Africa/Addis_Ababa"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Uzhgorod() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Uzhgorod"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Jerusalem() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Asia/Jerusalem"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Riyadh() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Asia/Riyadh"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Kuwait() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Asia/Kuwait"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Kirov() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Kirov"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Kampala() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Africa/Kampala"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Minsk() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Minsk"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Qatar() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Asia/Qatar"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Kiev() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Kiev"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Bahrain() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Asia/Bahrain"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Vilnius() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Vilnius"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Indian_Antananarivo() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Indian/Antananarivo"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Indian_Mayotte() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Indian/Mayotte"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Volgograd() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 5, 53, 46, "Europe/Volgograd"); // UTC+04:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Tallinn() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Tallinn"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Turkey() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Turkey"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Juba() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Africa/Juba"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Nicosia() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Asia/Nicosia"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Famagusta() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Asia/Famagusta"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void W_SU() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "W-SU"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void EET() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "EET"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Hebron() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Asia/Hebron"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Asia_Amman() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Asia/Amman"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Nicosia() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Nicosia"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Athens() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 4, 53, 46, "Europe/Athens"); // UTC+03:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Cairo() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Africa/Cairo"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Mbabane() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Africa/Mbabane"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Brussels() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Brussels"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Warsaw() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Warsaw"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void CET() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "CET"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Luxembourg() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Luxembourg"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_GMTminus2() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Etc/GMT-2"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Libya() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Libya"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Kigali() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Africa/Kigali"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Tripoli() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Africa/Tripoli"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Kaliningrad() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Kaliningrad"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Windhoek() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Africa/Windhoek"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Malta() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Malta"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Busingen() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Busingen"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Skopje() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Skopje"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Sarajevo() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Sarajevo"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Rome() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Rome"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Zurich() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Zurich"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Gibraltar() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Gibraltar"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Lubumbashi() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Africa/Lubumbashi"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Vaduz() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Vaduz"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Ljubljana() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Ljubljana"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Berlin() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Berlin"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Stockholm() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Stockholm"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Budapest() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Budapest"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Zagreb() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Zagreb"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Paris() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Paris"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Ceuta() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Africa/Ceuta"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Prague() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Prague"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Antarctica_Troll() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Antarctica/Troll"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Gaborone() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Africa/Gaborone"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Copenhagen() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Copenhagen"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Vienna() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Vienna"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Tirane() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Tirane"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void MET() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "MET"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Amsterdam() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Amsterdam"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Maputo() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Africa/Maputo"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_San_Marino() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/San_Marino"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Poland() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Poland"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Andorra() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Andorra"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Oslo() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Oslo"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Podgorica() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Podgorica"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Bujumbura() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Africa/Bujumbura"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Atlantic_Jan_Mayen() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Atlantic/Jan_Mayen"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Maseru() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Africa/Maseru"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Madrid() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Madrid"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Blantyre() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Africa/Blantyre"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Lusaka() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Africa/Lusaka"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Harare() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Africa/Harare"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Khartoum() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Africa/Khartoum"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Johannesburg() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Africa/Johannesburg"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Belgrade() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Belgrade"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Bratislava() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Bratislava"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Arctic_Longyearbyen() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Arctic/Longyearbyen"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Egypt() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Egypt"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Vatican() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Vatican"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Monaco() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 3, 53, 46, "Europe/Monaco"); // UTC+02:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_London() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Europe/London"); // UTC+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_GMTminus1() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Etc/GMT-1"); // UTC+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Jersey() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Europe/Jersey"); // UTC+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Guernsey() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Europe/Guernsey"); // UTC+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Isle_of_Man() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Europe/Isle_of_Man"); // UTC+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Tunis() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Africa/Tunis"); // UTC+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Malabo() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Africa/Malabo"); // UTC+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void GB_Eire() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "GB-Eire"); // UTC+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Lagos() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Africa/Lagos"); // UTC+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Algiers() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Africa/Algiers"); // UTC+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void GB() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "GB"); // UTC+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Portugal() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Portugal"); // UTC+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Sao_Tome() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Africa/Sao_Tome"); // UTC+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Ndjamena() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Africa/Ndjamena"); // UTC+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Atlantic_Faeroe() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Atlantic/Faeroe"); // UTC+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Eire() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Eire"); // UTC+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Atlantic_Faroe() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Atlantic/Faroe"); // UTC+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Dublin() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Europe/Dublin"); // UTC+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Libreville() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Africa/Libreville"); // UTC+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_El_Aaiun() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Africa/El_Aaiun"); // UTC+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Douala() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Africa/Douala"); // UTC+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Brazzaville() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Africa/Brazzaville"); // UTC+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Porto_Novo() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Africa/Porto-Novo"); // UTC+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Atlantic_Madeira() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Atlantic/Madeira"); // UTC+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Lisbon() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Europe/Lisbon"); // UTC+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Atlantic_Canary() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Atlantic/Canary"); // UTC+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Casablanca() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Africa/Casablanca"); // UTC+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Europe_Belfast() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Europe/Belfast"); // UTC+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Luanda() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Africa/Luanda"); // UTC+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Kinshasa() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Africa/Kinshasa"); // UTC+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Bangui() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Africa/Bangui"); // UTC+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void WET() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "WET"); // UTC+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Niamey() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 2, 53, 46, "Africa/Niamey"); // UTC+01:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void GMT() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "GMT"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_GMTminus0() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Etc/GMT-0"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Atlantic_St_Helena() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Atlantic/St_Helena"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_GMTplus0() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Etc/GMT+0"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Banjul() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Africa/Banjul"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_GMT() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Etc/GMT"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Freetown() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Africa/Freetown"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Bamako() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Africa/Bamako"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Conakry() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Africa/Conakry"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Universal() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Universal"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Nouakchott() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Africa/Nouakchott"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void UTC() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "UTC"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_Universal() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Etc/Universal"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Atlantic_Azores() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Atlantic/Azores"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Abidjan() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Africa/Abidjan"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Accra() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Africa/Accra"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_UCT() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Etc/UCT"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void GMT0() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "GMT0"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Zulu() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Zulu"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Ouagadougou() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Africa/Ouagadougou"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Atlantic_Reykjavik() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Atlantic/Reykjavik"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_Zulu() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Etc/Zulu"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Iceland() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Iceland"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Lome() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Africa/Lome"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Greenwich() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Greenwich"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_GMT0() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Etc/GMT0"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Danmarkshavn() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "America/Danmarkshavn"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Dakar() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Africa/Dakar"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void America_Scoresbysund() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "America/Scoresbysund"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Bissau() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Africa/Bissau"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_Greenwich() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Etc/Greenwich"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Timbuktu() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Africa/Timbuktu"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void UCT() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "UCT"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Africa_Monrovia() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Africa/Monrovia"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
    }

    @Test
    public void Etc_UTC() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 30, 1, 53, 46, "Etc/UTC"); // UTC+00:00
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));
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