package com.vuonglab.hennaandphu;

import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static com.google.common.truth.Truth.assertThat;

public class LeapYearUnitTests {
    @Test
    public void _2016_leap_year() {
        ZonedDateTime now = getPhoenixDateTime(2016, 3, 14, 9, 26, 52);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 11, 28, 23, 59, 59));
    }

    @Test
    public void _2017() {
        ZonedDateTime now = getPhoenixDateTime(2017, 3, 14, 9, 26, 52);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(1, 11, 27, 23, 59, 59));
    }

    @Test
    public void _2018() {
        ZonedDateTime now = getPhoenixDateTime(2018, 3, 14, 9, 26, 52);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 11, 27, 23, 59, 59));
    }

    @Test
    public void _2019() {
        ZonedDateTime now = getPhoenixDateTime(2019, 3, 14, 9, 26, 52);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(3, 11, 27, 23, 59, 59));
    }

    @Test
    public void _2020_leap_year() {
        ZonedDateTime now = getPhoenixDateTime(2020, 3, 14, 9, 26, 52);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(4, 11, 28, 23, 59, 59));
    }

    @Test
    public void _2021() {
        ZonedDateTime now = getPhoenixDateTime(2021, 3, 14, 9, 26, 52);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(5, 11, 27, 23, 59, 59));
    }

    @Test
    public void _2022() {
        ZonedDateTime now = getPhoenixDateTime(2022, 3, 14, 9, 26, 52);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(6, 11, 27, 23, 59, 59));
    }

    @Test
    public void _2023() {
        ZonedDateTime now = getPhoenixDateTime(2023, 3, 14, 9, 26, 52);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(7, 11, 27, 23, 59, 59));
    }

    @Test
    public void _2024_leap_year() {
        ZonedDateTime now = getPhoenixDateTime(2024, 3, 14, 9, 26, 52);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(8, 11, 28, 23, 59, 59));
    }

    @Test
    public void _2025() {
        ZonedDateTime now = getPhoenixDateTime(2025, 3, 14, 9, 26, 52);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(9, 11, 27, 23, 59, 59));
    }

    @Test
    public void _2026() {
        ZonedDateTime now = getPhoenixDateTime(2026, 3, 14, 9, 26, 52);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(10, 11, 27, 23, 59, 59));
    }

    @Test
    public void _2027() {
        ZonedDateTime now = getPhoenixDateTime(2027, 3, 14, 9, 26, 52);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(11, 11, 27, 23, 59, 59));
    }

    @Test
    public void _2028_leap_year() {
        ZonedDateTime now = getPhoenixDateTime(2028, 3, 14, 9, 26, 52);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(12, 11, 28, 23, 59, 59));
    }

    @Test
    public void _2029() {
        ZonedDateTime now = getPhoenixDateTime(2029, 3, 14, 9, 26, 52);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(13, 11, 27, 23, 59, 59));
    }

    @Test
    public void _2030() {
        ZonedDateTime now = getPhoenixDateTime(2030, 3, 14, 9, 26, 52);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(14, 11, 27, 23, 59, 59));
    }

    @Test
    public void _2031() {
        ZonedDateTime now = getPhoenixDateTime(2031, 3, 14, 9, 26, 52);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(15, 11, 27, 23, 59, 59));
    }

    @Test
    public void _2032_leap_year() {
        ZonedDateTime now = getPhoenixDateTime(2032, 3, 14, 9, 26, 52);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(16, 11, 28, 23, 59, 59));
    }

    @Test
    public void _2033() {
        ZonedDateTime now = getPhoenixDateTime(2033, 3, 14, 9, 26, 52);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(17, 11, 27, 23, 59, 59));
    }

    @Test
    public void _2034() {
        ZonedDateTime now = getPhoenixDateTime(2034, 3, 14, 9, 26, 52);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(18, 11, 27, 23, 59, 59));
    }

    @Test
    public void _2035() {
        ZonedDateTime now = getPhoenixDateTime(2035, 3, 14, 9, 26, 52);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(19, 11, 27, 23, 59, 59));
    }

    @Test
    public void _2036_leap_year() {
        ZonedDateTime now = getPhoenixDateTime(2036, 3, 14, 9, 26, 52);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(20, 11, 28, 23, 59, 59));
    }

    @Test
    public void _2037() {
        ZonedDateTime now = getPhoenixDateTime(2037, 3, 14, 9, 26, 52);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(21, 11, 27, 23, 59, 59));
    }

    @Test
    public void _2038() {
        ZonedDateTime now = getPhoenixDateTime(2038, 3, 14, 9, 26, 52);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(22, 11, 27, 23, 59, 59));
    }

    @Test
    public void _2039() {
        ZonedDateTime now = getPhoenixDateTime(2039, 3, 14, 9, 26, 52);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(23, 11, 27, 23, 59, 59));
    }

    @Test
    public void _2040_leap_year() {
        ZonedDateTime now = getPhoenixDateTime(2040, 3, 14, 9, 26, 52);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(24, 11, 28, 23, 59, 59));
    }

    private ZonedDateTime getPhoenixDateTime(int year, int month, int dayOfMonth, int hour, int minute, int second)
    {
        return ZonedDateTime.of(year, month, dayOfMonth, hour, minute, second, 0, ZoneId.of("US/Arizona"));
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