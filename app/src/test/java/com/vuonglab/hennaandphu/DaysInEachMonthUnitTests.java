package com.vuonglab.hennaandphu;

import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static com.google.common.truth.Truth.assertThat;

public class DaysInEachMonthUnitTests {
    @Test
    public void _0_month() {
        ZonedDateTime now = getPhoenixDateTime(2015, 3, 14, 9, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 0, 0, 0, 0, 0));
    }

    @Test
    public void _0_month_30_days() {
        ZonedDateTime now = getPhoenixDateTime(2015, 4, 13, 9, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 0, 30, 0, 0, 0));
    }

    @Test
    public void _1_month() {
        ZonedDateTime now = getPhoenixDateTime(2015, 4, 14, 9, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 1, 0, 0, 0, 0));
    }

    @Test
    public void _1_month_29_days() {
        ZonedDateTime now = getPhoenixDateTime(2015, 5, 13, 9, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 1, 29, 0, 0, 0));
    }

    @Test
    public void _2_months() {
        ZonedDateTime now = getPhoenixDateTime(2015, 5, 14, 9, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 2, 0, 0, 0, 0));
    }

    @Test
    public void _2_months_30_days() {
        ZonedDateTime now = getPhoenixDateTime(2015, 6, 13, 9, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 2, 30, 0, 0, 0));
    }

    @Test
    public void _3_months() {
        ZonedDateTime now = getPhoenixDateTime(2015, 6, 14, 9, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 3, 0, 0, 0, 0));
    }

    @Test
    public void _3_months_29_days() {
        ZonedDateTime now = getPhoenixDateTime(2015, 7, 13, 9, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 3, 29, 0, 0, 0));
    }

    @Test
    public void _4_months() {
        ZonedDateTime now = getPhoenixDateTime(2015, 7, 14, 9, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 4, 0, 0, 0, 0));
    }

    @Test
    public void _4_months_30_days() {
        ZonedDateTime now = getPhoenixDateTime(2015, 8, 13, 9, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 4, 30, 0, 0, 0));
    }

    @Test
    public void _5_months() {
        ZonedDateTime now = getPhoenixDateTime(2015, 8, 14, 9, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 5, 0, 0, 0, 0));
    }

    @Test
    public void _5_months_30_days() {
        ZonedDateTime now = getPhoenixDateTime(2015, 9, 13, 9, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 5, 30, 0, 0, 0));
    }

    @Test
    public void _6_months() {
        ZonedDateTime now = getPhoenixDateTime(2015, 9, 14, 9, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 6, 0, 0, 0, 0));
    }

    @Test
    public void _6_months_29_days() {
        ZonedDateTime now = getPhoenixDateTime(2015, 10, 13, 9, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 6, 29, 0, 0, 0));
    }

    @Test
    public void _7_months() {
        ZonedDateTime now = getPhoenixDateTime(2015, 10, 14, 9, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 7, 0, 0, 0, 0));
    }

    @Test
    public void _7_months_30_days() {
        ZonedDateTime now = getPhoenixDateTime(2015, 11, 13, 9, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 7, 30, 0, 0, 0));
    }

    @Test
    public void _8_months() {
        ZonedDateTime now = getPhoenixDateTime(2015, 11, 14, 9, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 8, 0, 0, 0, 0));
    }

    @Test
    public void _8_months_29_days() {
        ZonedDateTime now = getPhoenixDateTime(2015, 12, 13, 9, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 8, 29, 0, 0, 0));
    }

    @Test
    public void _9_months() {
        ZonedDateTime now = getPhoenixDateTime(2015, 12, 14, 9, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 9, 0, 0, 0, 0));
    }

    @Test
    public void _9_months_30_days() {
        ZonedDateTime now = getPhoenixDateTime(2016, 1, 13, 9, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 9, 30, 0, 0, 0));
    }

    @Test
    public void _10_months() {
        ZonedDateTime now = getPhoenixDateTime(2016, 1, 14, 9, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 10, 0, 0, 0, 0));
    }

    @Test
    public void _10_months_30_days() {
        ZonedDateTime now = getPhoenixDateTime(2016, 2, 13, 9, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 10, 30, 0, 0, 0));
    }

    @Test
    public void _11_months() {
        ZonedDateTime now = getPhoenixDateTime(2016, 2, 14, 9, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 11, 0, 0, 0, 0));
    }

    @Test
    public void _11_months_28_days() {
        ZonedDateTime now = getPhoenixDateTime(2016, 3, 13, 9, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 11, 28, 0, 0, 0));
    }

    @Test
    public void _12_months() {
        ZonedDateTime now = getPhoenixDateTime(2016, 3, 14, 9, 26, 53);
        Duration marriedDuration = DurationCalculator.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(1, 0, 0, 0, 0, 0));
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