package com.vuonglab.hennaandphu

import com.google.common.truth.Truth
import org.junit.Test
import java.time.ZoneId
import java.time.ZonedDateTime

class LeapYearUnitTests {
    @Test
    fun year_2016_is_leap_year() {
        val now = getPhoenixDateTime(2016, 3, 14, 9, 26, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 11, 28, 23, 59, 59))
    }

    @Test
    fun year_2017() {
        val now = getPhoenixDateTime(2017, 3, 14, 9, 26, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(1, 11, 27, 23, 59, 59))
    }

    @Test
    fun year_2018() {
        val now = getPhoenixDateTime(2018, 3, 14, 9, 26, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 11, 27, 23, 59, 59))
    }

    @Test
    fun year_2019() {
        val now = getPhoenixDateTime(2019, 3, 14, 9, 26, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(3, 11, 27, 23, 59, 59))
    }

    @Test
    fun year_2020_is_leap_year() {
        val now = getPhoenixDateTime(2020, 3, 14, 9, 26, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(4, 11, 28, 23, 59, 59))
    }

    @Test
    fun year_2021() {
        val now = getPhoenixDateTime(2021, 3, 14, 9, 26, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(5, 11, 27, 23, 59, 59))
    }

    @Test
    fun year_2022() {
        val now = getPhoenixDateTime(2022, 3, 14, 9, 26, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(6, 11, 27, 23, 59, 59))
    }

    @Test
    fun year_2023() {
        val now = getPhoenixDateTime(2023, 3, 14, 9, 26, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(7, 11, 27, 23, 59, 59))
    }

    @Test
    fun year_2024_is_leap_year() {
        val now = getPhoenixDateTime(2024, 3, 14, 9, 26, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(8, 11, 28, 23, 59, 59))
    }

    @Test
    fun year_2025() {
        val now = getPhoenixDateTime(2025, 3, 14, 9, 26, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(9, 11, 27, 23, 59, 59))
    }

    @Test
    fun year_2026() {
        val now = getPhoenixDateTime(2026, 3, 14, 9, 26, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(10, 11, 27, 23, 59, 59))
    }

    @Test
    fun year_2027() {
        val now = getPhoenixDateTime(2027, 3, 14, 9, 26, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(11, 11, 27, 23, 59, 59))
    }

    @Test
    fun year_2028_is_leap_year() {
        val now = getPhoenixDateTime(2028, 3, 14, 9, 26, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(12, 11, 28, 23, 59, 59))
    }

    @Test
    fun year_2029() {
        val now = getPhoenixDateTime(2029, 3, 14, 9, 26, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(13, 11, 27, 23, 59, 59))
    }

    @Test
    fun year_2030() {
        val now = getPhoenixDateTime(2030, 3, 14, 9, 26, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(14, 11, 27, 23, 59, 59))
    }

    @Test
    fun year_2031() {
        val now = getPhoenixDateTime(2031, 3, 14, 9, 26, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(15, 11, 27, 23, 59, 59))
    }

    @Test
    fun year_2032_is_leap_year() {
        val now = getPhoenixDateTime(2032, 3, 14, 9, 26, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(16, 11, 28, 23, 59, 59))
    }

    @Test
    fun year_2033() {
        val now = getPhoenixDateTime(2033, 3, 14, 9, 26, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(17, 11, 27, 23, 59, 59))
    }

    @Test
    fun year_2034() {
        val now = getPhoenixDateTime(2034, 3, 14, 9, 26, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(18, 11, 27, 23, 59, 59))
    }

    @Test
    fun year_2035() {
        val now = getPhoenixDateTime(2035, 3, 14, 9, 26, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(19, 11, 27, 23, 59, 59))
    }

    @Test
    fun year_2036_is_leap_year() {
        val now = getPhoenixDateTime(2036, 3, 14, 9, 26, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(20, 11, 28, 23, 59, 59))
    }

    @Test
    fun year_2037() {
        val now = getPhoenixDateTime(2037, 3, 14, 9, 26, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(21, 11, 27, 23, 59, 59))
    }

    @Test
    fun year_2038() {
        val now = getPhoenixDateTime(2038, 3, 14, 9, 26, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(22, 11, 27, 23, 59, 59))
    }

    @Test
    fun year_2039() {
        val now = getPhoenixDateTime(2039, 3, 14, 9, 26, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(23, 11, 27, 23, 59, 59))
    }

    @Test
    fun year_2040_is_leap_year() {
        val now = getPhoenixDateTime(2040, 3, 14, 9, 26, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(24, 11, 28, 23, 59, 59))
    }

    @Test
    fun different_date_time() {
        val now = getPhoenixDateTime(2016, 4, 15, 10, 27, 54)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(1, 1, 1, 1, 1, 1))
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