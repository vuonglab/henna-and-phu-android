package com.vuonglab.hennaandphu

import com.google.common.truth.Truth
import org.junit.Test
import java.time.ZoneId
import java.time.ZonedDateTime

class BasicDurationUnitTests {
    @Test
    fun zero_duration() {
        val now = getPhoenixDateTime(2015, 3, 14, 9, 26, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 0, 0, 0, 0, 0))
    }

    @Test
    fun one_second() {
        val now = getPhoenixDateTime(2015, 3, 14, 9, 26, 54)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 0, 0, 0, 0, 1))
    }

    @Test
    fun fifty_nine_seconds() {
        val now = getPhoenixDateTime(2015, 3, 14, 9, 27, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 0, 0, 0, 0, 59))
    }

    @Test
    fun one_minute() {
        val now = getPhoenixDateTime(2015, 3, 14, 9, 27, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 0, 0, 0, 1, 0))
    }

    @Test
    fun fifty_nine_minutes() {
        val now = getPhoenixDateTime(2015, 3, 14, 10, 25, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 0, 0, 0, 59, 0))
    }

    @Test
    fun one_hour() {
        val now = getPhoenixDateTime(2015, 3, 14, 10, 26, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 0, 0, 1, 0, 0))
    }

    @Test
    fun twenty_three_hours() {
        val now = getPhoenixDateTime(2015, 3, 15, 8, 26, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 0, 0, 23, 0, 0))
    }

    @Test
    fun one_day() {
        val now = getPhoenixDateTime(2015, 3, 15, 9, 26, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 0, 1, 0, 0, 0))
    }

    @Test
    fun thirty_days() {
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
    fun eleven_months() {
        val now = getPhoenixDateTime(2016, 2, 14, 9, 26, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 11, 0, 0, 0, 0))
    }

    @Test
    fun one_year() {
        val now = getPhoenixDateTime(2016, 3, 14, 9, 26, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(1, 0, 0, 0, 0, 0))
    }

    @Test
    fun five_years() {
        val now = getPhoenixDateTime(2020, 3, 14, 9, 26, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(5, 0, 0, 0, 0, 0))
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