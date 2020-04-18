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
    public void US_Arizona() {
        ZonedDateTime now = getDateTimeInATimeZone(2017, 11, 1, 11, 35, 11, "US/Arizona"); // GMT-07:00
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