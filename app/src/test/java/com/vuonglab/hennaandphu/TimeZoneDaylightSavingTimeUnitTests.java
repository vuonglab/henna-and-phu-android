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
    public void America_Phoenix() {
        ZonedDateTime now = getDateTimeInATimeZone(2046, 7, 29, 18, 53, 46, "US/Arizona");  // UTC-07:00
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