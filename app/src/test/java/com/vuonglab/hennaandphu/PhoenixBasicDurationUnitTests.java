package com.vuonglab.hennaandphu;

import static com.google.common.truth.Truth.assertThat;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class PhoenixBasicDurationUnitTests {
    @Test
    public void zero_duration() {
        ZonedDateTime now = getPhoenixDateTime(2015, 3, 14, 9, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 0, 0, 0, 0, 0));
    }

    @Test
    public void one_second() {
        ZonedDateTime now = getPhoenixDateTime(2015, 3, 14, 9, 26, 54);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 0, 0, 0, 0, 1));
    }

    @Test
    public void _59_seconds() {
        ZonedDateTime now = getPhoenixDateTime(2015, 3, 14, 9, 27, 52);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 0, 0, 0, 0, 59));
    }

    @Test
    public void one_minute() {
        ZonedDateTime now = getPhoenixDateTime(2015, 3, 14, 9, 27, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 0, 0, 0, 1, 0));
    }

    @Test
    public void _59_minutes() {
        ZonedDateTime now = getPhoenixDateTime(2015, 3, 14, 10, 25, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 0, 0, 0, 59, 0));
    }

    @Test
    public void one_hour() {
        ZonedDateTime now = getPhoenixDateTime(2015, 3, 14, 10, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 0, 0, 1, 0, 0));
    }

    @Test
    public void _23_hours() {
        ZonedDateTime now = getPhoenixDateTime(2015, 3, 15, 8, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 0, 0, 23, 0, 0));
    }

    @Test
    public void one_day() {
        ZonedDateTime now = getPhoenixDateTime(2015, 3, 15, 9, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 0, 1, 0, 0, 0));
    }

    @Test
    public void _30_days() {
        ZonedDateTime now = getPhoenixDateTime(2015, 4, 13, 9, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 0, 30, 0, 0, 0));
    }

    @Test
    public void one_month() {
        ZonedDateTime now = getPhoenixDateTime(2015, 4, 14, 9, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 1, 0, 0, 0, 0));
    }

    @Test
    public void _11_months() {
        ZonedDateTime now = getPhoenixDateTime(2016, 2, 14, 9, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 11, 0, 0, 0, 0));
    }

    @Test
    public void one_year() {
        ZonedDateTime now = getPhoenixDateTime(2016, 3, 14, 9, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(1, 0, 0, 0, 0, 0));
    }

    @Test
    public void _5_years() {
        ZonedDateTime now = getPhoenixDateTime(2020, 3, 14, 9, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(5, 0, 0, 0, 0, 0));
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