package com.vuonglab.hennaandphu

import com.google.common.truth.Truth
import org.junit.Test
import java.time.ZoneId
import java.time.ZonedDateTime

class DaysInEachMonthUnitTests {
    @Test
    fun zero_month() {
        val now = getPhoenixDateTime(2015, 3, 14, 9, 26, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 0, 0, 0, 0, 0))
    }

    @Test
    fun zero_month_30_days() {
        val now = getPhoenixDateTime(2015, 4, 13, 9, 26, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 0, 30, 0, 0, 0))
    }

    @Test
    fun one_month() {
        val now = getPhoenixDateTime(2015, 4, 14, 9, 26, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 1, 0, 0, 0, 0))
    }

    @Test
    fun one_month_29_days() {
        val now = getPhoenixDateTime(2015, 5, 13, 9, 26, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 1, 29, 0, 0, 0))
    }

    @Test
    fun two_months() {
        val now = getPhoenixDateTime(2015, 5, 14, 9, 26, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 2, 0, 0, 0, 0))
    }

    @Test
    fun two_months_30_days() {
        val now = getPhoenixDateTime(2015, 6, 13, 9, 26, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 2, 30, 0, 0, 0))
    }

    @Test
    fun three_months() {
        val now = getPhoenixDateTime(2015, 6, 14, 9, 26, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 3, 0, 0, 0, 0))
    }

    @Test
    fun three_months_29_days() {
        val now = getPhoenixDateTime(2015, 7, 13, 9, 26, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 3, 29, 0, 0, 0))
    }

    @Test
    fun four_months() {
        val now = getPhoenixDateTime(2015, 7, 14, 9, 26, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 4, 0, 0, 0, 0))
    }

    @Test
    fun four_months_30_days() {
        val now = getPhoenixDateTime(2015, 8, 13, 9, 26, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 4, 30, 0, 0, 0))
    }

    @Test
    fun five_months() {
        val now = getPhoenixDateTime(2015, 8, 14, 9, 26, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 5, 0, 0, 0, 0))
    }

    @Test
    fun five_months_30_days() {
        val now = getPhoenixDateTime(2015, 9, 13, 9, 26, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 5, 30, 0, 0, 0))
    }

    @Test
    fun six_months() {
        val now = getPhoenixDateTime(2015, 9, 14, 9, 26, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 6, 0, 0, 0, 0))
    }

    @Test
    fun six_months_29_days() {
        val now = getPhoenixDateTime(2015, 10, 13, 9, 26, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 6, 29, 0, 0, 0))
    }

    @Test
    fun seven_months() {
        val now = getPhoenixDateTime(2015, 10, 14, 9, 26, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 7, 0, 0, 0, 0))
    }

    @Test
    fun seven_months_30_days() {
        val now = getPhoenixDateTime(2015, 11, 13, 9, 26, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 7, 30, 0, 0, 0))
    }

    @Test
    fun eight_months() {
        val now = getPhoenixDateTime(2015, 11, 14, 9, 26, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 8, 0, 0, 0, 0))
    }

    @Test
    fun eight_months_29_days() {
        val now = getPhoenixDateTime(2015, 12, 13, 9, 26, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 8, 29, 0, 0, 0))
    }

    @Test
    fun nine_months() {
        val now = getPhoenixDateTime(2015, 12, 14, 9, 26, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 9, 0, 0, 0, 0))
    }

    @Test
    fun nine_months_30_days() {
        val now = getPhoenixDateTime(2016, 1, 13, 9, 26, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 9, 30, 0, 0, 0))
    }

    @Test
    fun ten_months() {
        val now = getPhoenixDateTime(2016, 1, 14, 9, 26, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 10, 0, 0, 0, 0))
    }

    @Test
    fun ten_months_30_days() {
        val now = getPhoenixDateTime(2016, 2, 13, 9, 26, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 10, 30, 0, 0, 0))
    }

    @Test
    fun eleven_months() {
        val now = getPhoenixDateTime(2016, 2, 14, 9, 26, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 11, 0, 0, 0, 0))
    }

    @Test
    fun eleven_months_28_days() {
        val now = getPhoenixDateTime(2016, 3, 13, 9, 26, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 11, 28, 0, 0, 0))
    }

    @Test
    fun twelve_months() {
        val now = getPhoenixDateTime(2016, 3, 14, 9, 26, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(1, 0, 0, 0, 0, 0))
    }

    private fun getPhoenixDateTime(
        year: Int,
        month: Int,
        dayOfMonth: Int,
        hour: Int,
        minute: Int,
        second: Int
    ) = ZonedDateTime.of(
        year,
        month,
        dayOfMonth,
        hour,
        minute,
        second,
        0,
        ZoneId.of("US/Arizona")
    )

    private fun assertDuration(actualDuration: Duration, expectedDuration: Duration) {
        Truth.assertThat(actualDuration.Years).isEqualTo(expectedDuration.Years)
        Truth.assertThat(actualDuration.Months).isEqualTo(expectedDuration.Months)
        Truth.assertThat(actualDuration.Days).isEqualTo(expectedDuration.Days)
        Truth.assertThat(actualDuration.Hours).isEqualTo(expectedDuration.Hours)
        Truth.assertThat(actualDuration.Minutes).isEqualTo(expectedDuration.Minutes)
        Truth.assertThat(actualDuration.Seconds).isEqualTo(expectedDuration.Seconds)
    }
}