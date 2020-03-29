package com.vuonglab.hennaandphu;

import static com.google.common.truth.Truth.assertThat;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class MarriedDurationUnitTest {
    @Test
    public void zero_duration() {
        ZonedDateTime now = getPhoenixDateTime(2015, 3, 14, 9, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 0, 0, 0, 0, 0));
    }

    private ZonedDateTime getPhoenixDateTime(int year, int month, int dayOfMonth, int hour, int minute, int second)
    {
        return ZonedDateTime.of(year, month, dayOfMonth, hour, minute, second, 0, ZoneId.of("America/Phoenix"));
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