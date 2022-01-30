package com.vuonglab.hennaandphu

import com.google.common.truth.Truth
import org.junit.Test
import java.time.ZoneId
import java.time.ZonedDateTime

class GeneratedDurationUnitTests {
    @Test
    fun test_000() {
        val now = getPhoenixDateTime(2015, 3, 14, 10, 9, 57)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 0, 0, 0, 43, 4))
    }

    @Test
    fun test_001() {
        val now = getPhoenixDateTime(2015, 4, 17, 22, 38, 29)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 1, 3, 13, 11, 36))
    }

    @Test
    fun test_002() {
        val now = getPhoenixDateTime(2015, 4, 25, 14, 45, 31)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 1, 11, 5, 18, 38))
    }

    @Test
    fun test_003() {
        val now = getPhoenixDateTime(2015, 5, 3, 7, 31, 35)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 1, 18, 22, 4, 42))
    }

    @Test
    fun test_004() {
        val now = getPhoenixDateTime(2015, 5, 13, 20, 27, 13)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 1, 29, 11, 0, 20))
    }

    @Test
    fun test_005() {
        val now = getPhoenixDateTime(2015, 5, 16, 11, 0, 7)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 2, 2, 1, 33, 14))
    }

    @Test
    fun test_006() {
        val now = getPhoenixDateTime(2015, 5, 17, 2, 38, 12)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 2, 2, 17, 11, 19))
    }

    @Test
    fun test_007() {
        val now = getPhoenixDateTime(2015, 5, 19, 22, 40, 5)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 2, 5, 13, 13, 12))
    }

    @Test
    fun test_008() {
        val now = getPhoenixDateTime(2015, 6, 1, 21, 43, 29)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 2, 18, 12, 16, 36))
    }

    @Test
    fun test_009() {
        val now = getPhoenixDateTime(2015, 6, 12, 2, 37, 6)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 2, 28, 17, 10, 13))
    }

    @Test
    fun test_010() {
        val now = getPhoenixDateTime(2015, 6, 13, 18, 37, 1)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 2, 30, 9, 10, 8))
    }

    @Test
    fun test_011() {
        val now = getPhoenixDateTime(2015, 7, 2, 6, 57, 55)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 3, 17, 21, 31, 2))
    }

    @Test
    fun test_012() {
        val now = getPhoenixDateTime(2015, 7, 9, 18, 40, 3)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 3, 25, 9, 13, 10))
    }

    @Test
    fun test_013() {
        val now = getPhoenixDateTime(2015, 7, 28, 10, 33, 20)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 4, 14, 1, 6, 27))
    }

    @Test
    fun test_014() {
        val now = getPhoenixDateTime(2015, 8, 5, 4, 6, 33)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 4, 21, 18, 39, 40))
    }

    @Test
    fun test_015() {
        val now = getPhoenixDateTime(2015, 8, 7, 4, 45, 37)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 4, 23, 19, 18, 44))
    }

    @Test
    fun test_016() {
        val now = getPhoenixDateTime(2015, 8, 8, 11, 26, 37)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 4, 25, 1, 59, 44))
    }

    @Test
    fun test_017() {
        val now = getPhoenixDateTime(2015, 9, 10, 5, 8, 19)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 5, 26, 19, 41, 26))
    }

    @Test
    fun test_018() {
        val now = getPhoenixDateTime(2015, 9, 17, 14, 59, 2)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 6, 3, 5, 32, 9))
    }

    @Test
    fun test_019() {
        val now = getPhoenixDateTime(2015, 10, 19, 14, 10, 26)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 7, 5, 4, 43, 33))
    }

    @Test
    fun test_020() {
        val now = getPhoenixDateTime(2015, 11, 28, 6, 35, 33)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 8, 13, 21, 8, 40))
    }

    @Test
    fun test_021() {
        val now = getPhoenixDateTime(2015, 11, 30, 14, 38, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 8, 16, 5, 12, 0))
    }

    @Test
    fun test_022() {
        val now = getPhoenixDateTime(2016, 1, 5, 16, 55, 9)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 9, 22, 7, 28, 16))
    }

    @Test
    fun test_023() {
        val now = getPhoenixDateTime(2016, 1, 8, 5, 49, 4)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 9, 24, 20, 22, 11))
    }

    @Test
    fun test_024() {
        val now = getPhoenixDateTime(2016, 1, 28, 4, 28, 27)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 10, 13, 19, 1, 34))
    }

    @Test
    fun test_025() {
        val now = getPhoenixDateTime(2016, 3, 5, 8, 46, 1)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 11, 19, 23, 19, 8))
    }

    @Test
    fun test_026() {
        val now = getPhoenixDateTime(2016, 3, 7, 18, 40, 10)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 11, 22, 9, 13, 17))
    }

    @Test
    fun test_027() {
        val now = getPhoenixDateTime(2016, 3, 9, 11, 27, 36)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 11, 24, 2, 0, 43))
    }

    @Test
    fun test_028() {
        val now = getPhoenixDateTime(2016, 3, 12, 23, 33, 24)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(0, 11, 27, 14, 6, 31))
    }

    @Test
    fun test_029() {
        val now = getPhoenixDateTime(2016, 3, 14, 10, 26, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(1, 0, 0, 0, 59, 59))
    }

    @Test
    fun test_030() {
        val now = getPhoenixDateTime(2016, 3, 31, 13, 4, 7)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(1, 0, 17, 3, 37, 14))
    }

    @Test
    fun test_031() {
        val now = getPhoenixDateTime(2016, 4, 8, 8, 59, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(1, 0, 24, 23, 32, 59))
    }

    @Test
    fun test_032() {
        val now = getPhoenixDateTime(2016, 4, 12, 7, 38, 43)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(1, 0, 28, 22, 11, 50))
    }

    @Test
    fun test_033() {
        val now = getPhoenixDateTime(2016, 5, 2, 7, 50, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(1, 1, 17, 22, 23, 59))
    }

    @Test
    fun test_034() {
        val now = getPhoenixDateTime(2016, 5, 3, 7, 51, 15)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(1, 1, 18, 22, 24, 22))
    }

    @Test
    fun test_035() {
        val now = getPhoenixDateTime(2016, 6, 4, 22, 13, 13)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(1, 2, 21, 12, 46, 20))
    }

    @Test
    fun test_036() {
        val now = getPhoenixDateTime(2016, 6, 19, 10, 39, 22)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(1, 3, 5, 1, 12, 29))
    }

    @Test
    fun test_037() {
        val now = getPhoenixDateTime(2016, 6, 28, 21, 49, 11)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(1, 3, 14, 12, 22, 18))
    }

    @Test
    fun test_038() {
        val now = getPhoenixDateTime(2016, 7, 29, 10, 59, 42)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(1, 4, 15, 1, 32, 49))
    }

    @Test
    fun test_039() {
        val now = getPhoenixDateTime(2016, 8, 3, 18, 21, 45)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(1, 4, 20, 8, 54, 52))
    }

    @Test
    fun test_040() {
        val now = getPhoenixDateTime(2016, 8, 5, 5, 22, 24)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(1, 4, 21, 19, 55, 31))
    }

    @Test
    fun test_041() {
        val now = getPhoenixDateTime(2016, 9, 12, 7, 38, 51)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(1, 5, 28, 22, 11, 58))
    }

    @Test
    fun test_042() {
        val now = getPhoenixDateTime(2016, 10, 26, 3, 2, 34)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(1, 7, 11, 17, 35, 41))
    }

    @Test
    fun test_043() {
        val now = getPhoenixDateTime(2016, 10, 28, 5, 22, 33)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(1, 7, 13, 19, 55, 40))
    }

    @Test
    fun test_044() {
        val now = getPhoenixDateTime(2016, 10, 29, 21, 39, 3)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(1, 7, 15, 12, 12, 10))
    }

    @Test
    fun test_045() {
        val now = getPhoenixDateTime(2016, 11, 1, 11, 56, 27)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(1, 7, 18, 2, 29, 34))
    }

    @Test
    fun test_046() {
        val now = getPhoenixDateTime(2016, 11, 8, 18, 18, 24)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(1, 7, 25, 8, 51, 31))
    }

    @Test
    fun test_047() {
        val now = getPhoenixDateTime(2016, 11, 20, 8, 10, 25)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(1, 8, 5, 22, 43, 32))
    }

    @Test
    fun test_048() {
        val now = getPhoenixDateTime(2016, 11, 27, 8, 1, 7)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(1, 8, 12, 22, 34, 14))
    }

    @Test
    fun test_049() {
        val now = getPhoenixDateTime(2016, 12, 2, 16, 39, 9)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(1, 8, 18, 7, 12, 16))
    }

    @Test
    fun test_050() {
        val now = getPhoenixDateTime(2016, 12, 5, 3, 26, 12)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(1, 8, 20, 17, 59, 19))
    }

    @Test
    fun test_051() {
        val now = getPhoenixDateTime(2017, 1, 14, 10, 16, 42)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(1, 10, 0, 0, 49, 49))
    }

    @Test
    fun test_052() {
        val now = getPhoenixDateTime(2017, 2, 1, 6, 52, 25)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(1, 10, 17, 21, 25, 32))
    }

    @Test
    fun test_053() {
        val now = getPhoenixDateTime(2017, 2, 19, 16, 32, 40)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(1, 11, 5, 7, 5, 47))
    }

    @Test
    fun test_054() {
        val now = getPhoenixDateTime(2017, 3, 31, 13, 6, 8)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 0, 17, 3, 39, 15))
    }

    @Test
    fun test_055() {
        val now = getPhoenixDateTime(2017, 4, 16, 14, 20, 5)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 1, 2, 4, 53, 12))
    }

    @Test
    fun test_056() {
        val now = getPhoenixDateTime(2017, 6, 3, 22, 48, 46)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 2, 20, 13, 21, 53))
    }

    @Test
    fun test_057() {
        val now = getPhoenixDateTime(2017, 8, 4, 15, 38, 40)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 4, 21, 6, 11, 47))
    }

    @Test
    fun test_058() {
        val now = getPhoenixDateTime(2017, 9, 3, 20, 57, 54)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 5, 20, 11, 31, 1))
    }

    @Test
    fun test_059() {
        val now = getPhoenixDateTime(2017, 10, 3, 9, 34, 32)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 6, 19, 0, 7, 39))
    }

    @Test
    fun test_060() {
        val now = getPhoenixDateTime(2017, 10, 20, 2, 17, 44)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 5, 16, 50, 51))
    }

    @Test
    fun test_061() {
        val now = getPhoenixDateTime(2017, 11, 14, 8, 2, 49)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 7, 30, 22, 35, 56))
    }

    @Test
    fun test_062() {
        val now = getPhoenixDateTime(2017, 12, 29, 2, 2, 45)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 9, 14, 16, 35, 52))
    }

    @Test
    fun test_063() {
        val now = getPhoenixDateTime(2018, 1, 21, 8, 58, 8)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 10, 6, 23, 31, 15))
    }

    @Test
    fun test_064() {
        val now = getPhoenixDateTime(2018, 3, 13, 21, 12, 4)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(2, 11, 27, 11, 45, 11))
    }

    @Test
    fun test_065() {
        val now = getPhoenixDateTime(2018, 3, 15, 10, 35, 39)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(3, 0, 1, 1, 8, 46))
    }

    @Test
    fun test_066() {
        val now = getPhoenixDateTime(2018, 6, 10, 15, 24, 25)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(3, 2, 27, 5, 57, 32))
    }

    @Test
    fun test_067() {
        val now = getPhoenixDateTime(2018, 6, 18, 12, 38, 8)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(3, 3, 4, 3, 11, 15))
    }

    @Test
    fun test_068() {
        val now = getPhoenixDateTime(2018, 7, 13, 15, 38, 13)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(3, 3, 29, 6, 11, 20))
    }

    @Test
    fun test_069() {
        val now = getPhoenixDateTime(2018, 9, 17, 1, 12, 14)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(3, 6, 2, 15, 45, 21))
    }

    @Test
    fun test_070() {
        val now = getPhoenixDateTime(2018, 10, 7, 4, 27, 25)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(3, 6, 22, 19, 0, 32))
    }

    @Test
    fun test_071() {
        val now = getPhoenixDateTime(2018, 11, 14, 20, 28, 3)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(3, 8, 0, 11, 1, 10))
    }

    @Test
    fun test_072() {
        val now = getPhoenixDateTime(2018, 11, 30, 1, 50, 24)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(3, 8, 15, 16, 23, 31))
    }

    @Test
    fun test_073() {
        val now = getPhoenixDateTime(2019, 1, 6, 0, 42, 49)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(3, 9, 22, 15, 15, 56))
    }

    @Test
    fun test_074() {
        val now = getPhoenixDateTime(2019, 1, 6, 16, 48, 25)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(3, 9, 23, 7, 21, 32))
    }

    @Test
    fun test_075() {
        val now = getPhoenixDateTime(2019, 1, 7, 10, 24, 29)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(3, 9, 24, 0, 57, 36))
    }

    @Test
    fun test_076() {
        val now = getPhoenixDateTime(2019, 1, 18, 0, 32, 48)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(3, 10, 3, 15, 5, 55))
    }

    @Test
    fun test_077() {
        val now = getPhoenixDateTime(2019, 2, 9, 1, 37, 43)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(3, 10, 25, 16, 10, 50))
    }

    @Test
    fun test_078() {
        val now = getPhoenixDateTime(2019, 2, 11, 19, 49, 4)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(3, 10, 28, 10, 22, 11))
    }

    @Test
    fun test_079() {
        val now = getPhoenixDateTime(2019, 3, 8, 20, 58, 58)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(3, 11, 22, 11, 32, 5))
    }

    @Test
    fun test_080() {
        val now = getPhoenixDateTime(2019, 3, 23, 8, 35, 41)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(4, 0, 8, 23, 8, 48))
    }

    @Test
    fun test_081() {
        val now = getPhoenixDateTime(2019, 4, 3, 2, 58, 33)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(4, 0, 19, 17, 31, 40))
    }

    @Test
    fun test_082() {
        val now = getPhoenixDateTime(2019, 4, 25, 2, 27, 16)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(4, 1, 10, 17, 0, 23))
    }

    @Test
    fun test_083() {
        val now = getPhoenixDateTime(2019, 4, 29, 5, 18, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(4, 1, 14, 19, 52, 0))
    }

    @Test
    fun test_084() {
        val now = getPhoenixDateTime(2019, 5, 29, 12, 11, 50)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(4, 2, 15, 2, 44, 57))
    }

    @Test
    fun test_085() {
        val now = getPhoenixDateTime(2019, 6, 6, 15, 47, 28)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(4, 2, 23, 6, 20, 35))
    }

    @Test
    fun test_086() {
        val now = getPhoenixDateTime(2019, 7, 9, 14, 7, 1)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(4, 3, 25, 4, 40, 8))
    }

    @Test
    fun test_087() {
        val now = getPhoenixDateTime(2019, 9, 2, 9, 5, 27)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(4, 5, 18, 23, 38, 34))
    }

    @Test
    fun test_088() {
        val now = getPhoenixDateTime(2019, 9, 7, 12, 37, 5)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(4, 5, 24, 3, 10, 12))
    }

    @Test
    fun test_089() {
        val now = getPhoenixDateTime(2019, 11, 7, 9, 48, 41)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(4, 7, 24, 0, 21, 48))
    }

    @Test
    fun test_090() {
        val now = getPhoenixDateTime(2019, 12, 21, 11, 22, 55)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(4, 9, 7, 1, 56, 2))
    }

    @Test
    fun test_091() {
        val now = getPhoenixDateTime(2020, 1, 8, 14, 14, 0)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(4, 9, 25, 4, 47, 7))
    }

    @Test
    fun test_092() {
        val now = getPhoenixDateTime(2020, 2, 25, 10, 32, 45)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(4, 11, 11, 1, 5, 52))
    }

    @Test
    fun test_093() {
        val now = getPhoenixDateTime(2020, 2, 26, 14, 12, 35)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(4, 11, 12, 4, 45, 42))
    }

    @Test
    fun test_094() {
        val now = getPhoenixDateTime(2020, 5, 24, 21, 51, 17)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(5, 2, 10, 12, 24, 24))
    }

    @Test
    fun test_095() {
        val now = getPhoenixDateTime(2020, 6, 21, 9, 17, 57)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(5, 3, 6, 23, 51, 4))
    }

    @Test
    fun test_096() {
        val now = getPhoenixDateTime(2020, 6, 27, 21, 31, 45)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(5, 3, 13, 12, 4, 52))
    }

    @Test
    fun test_097() {
        val now = getPhoenixDateTime(2020, 6, 28, 18, 53, 48)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(5, 3, 14, 9, 26, 55))
    }

    @Test
    fun test_098() {
        val now = getPhoenixDateTime(2020, 7, 3, 13, 11, 17)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(5, 3, 19, 3, 44, 24))
    }

    @Test
    fun test_099() {
        val now = getPhoenixDateTime(2020, 8, 2, 4, 7, 49)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(5, 4, 18, 18, 40, 56))
    }

    @Test
    fun test_100() {
        val now = getPhoenixDateTime(2020, 8, 26, 23, 22, 59)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(5, 5, 12, 13, 56, 6))
    }

    @Test
    fun test_101() {
        val now = getPhoenixDateTime(2020, 9, 3, 8, 15, 21)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(5, 5, 19, 22, 48, 28))
    }

    @Test
    fun test_102() {
        val now = getPhoenixDateTime(2020, 9, 10, 7, 16, 2)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(5, 5, 26, 21, 49, 9))
    }

    @Test
    fun test_103() {
        val now = getPhoenixDateTime(2020, 9, 16, 0, 13, 26)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(5, 6, 1, 14, 46, 33))
    }

    @Test
    fun test_104() {
        val now = getPhoenixDateTime(2020, 9, 17, 4, 5, 29)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(5, 6, 2, 18, 38, 36))
    }

    @Test
    fun test_105() {
        val now = getPhoenixDateTime(2020, 9, 21, 9, 35, 4)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(5, 6, 7, 0, 8, 11))
    }

    @Test
    fun test_106() {
        val now = getPhoenixDateTime(2020, 10, 13, 21, 20, 25)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(5, 6, 29, 11, 53, 32))
    }

    @Test
    fun test_107() {
        val now = getPhoenixDateTime(2020, 11, 3, 4, 4, 59)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(5, 7, 19, 18, 38, 6))
    }

    @Test
    fun test_108() {
        val now = getPhoenixDateTime(2020, 11, 16, 13, 19, 39)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(5, 8, 2, 3, 52, 46))
    }

    @Test
    fun test_109() {
        val now = getPhoenixDateTime(2020, 11, 27, 0, 40, 38)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(5, 8, 12, 15, 13, 45))
    }

    @Test
    fun test_110() {
        val now = getPhoenixDateTime(2020, 12, 9, 0, 41, 41)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(5, 8, 24, 15, 14, 48))
    }

    @Test
    fun test_111() {
        val now = getPhoenixDateTime(2020, 12, 23, 4, 6, 28)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(5, 9, 8, 18, 39, 35))
    }

    @Test
    fun test_112() {
        val now = getPhoenixDateTime(2021, 2, 4, 14, 43, 44)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(5, 10, 21, 5, 16, 51))
    }

    @Test
    fun test_113() {
        val now = getPhoenixDateTime(2021, 3, 1, 9, 51, 27)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(5, 11, 15, 0, 24, 34))
    }

    @Test
    fun test_114() {
        val now = getPhoenixDateTime(2021, 4, 13, 19, 18, 41)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(6, 0, 30, 9, 51, 48))
    }

    @Test
    fun test_115() {
        val now = getPhoenixDateTime(2021, 5, 24, 6, 44, 1)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(6, 2, 9, 21, 17, 8))
    }

    @Test
    fun test_116() {
        val now = getPhoenixDateTime(2021, 5, 27, 23, 25, 46)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(6, 2, 13, 13, 58, 53))
    }

    @Test
    fun test_117() {
        val now = getPhoenixDateTime(2021, 5, 29, 12, 57, 25)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(6, 2, 15, 3, 30, 32))
    }

    @Test
    fun test_118() {
        val now = getPhoenixDateTime(2021, 6, 12, 12, 15, 22)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(6, 2, 29, 2, 48, 29))
    }

    @Test
    fun test_119() {
        val now = getPhoenixDateTime(2021, 6, 30, 5, 49, 34)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(6, 3, 15, 20, 22, 41))
    }

    @Test
    fun test_120() {
        val now = getPhoenixDateTime(2021, 7, 1, 18, 22, 1)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(6, 3, 17, 8, 55, 8))
    }

    @Test
    fun test_121() {
        val now = getPhoenixDateTime(2021, 7, 29, 7, 2, 47)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(6, 4, 14, 21, 35, 54))
    }

    @Test
    fun test_122() {
        val now = getPhoenixDateTime(2021, 8, 12, 8, 46, 55)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(6, 4, 28, 23, 20, 2))
    }

    @Test
    fun test_123() {
        val now = getPhoenixDateTime(2021, 8, 13, 19, 39, 16)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(6, 4, 30, 10, 12, 23))
    }

    @Test
    fun test_124() {
        val now = getPhoenixDateTime(2021, 9, 1, 3, 45, 50)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(6, 5, 17, 18, 18, 57))
    }

    @Test
    fun test_125() {
        val now = getPhoenixDateTime(2021, 9, 4, 16, 2, 48)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(6, 5, 21, 6, 35, 55))
    }

    @Test
    fun test_126() {
        val now = getPhoenixDateTime(2021, 9, 15, 10, 19, 32)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(6, 6, 1, 0, 52, 39))
    }

    @Test
    fun test_127() {
        val now = getPhoenixDateTime(2021, 10, 11, 14, 28, 9)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(6, 6, 27, 5, 1, 16))
    }

    @Test
    fun test_128() {
        val now = getPhoenixDateTime(2021, 10, 11, 20, 9, 36)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(6, 6, 27, 10, 42, 43))
    }

    @Test
    fun test_129() {
        val now = getPhoenixDateTime(2021, 11, 1, 3, 30, 59)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(6, 7, 17, 18, 4, 6))
    }

    @Test
    fun test_130() {
        val now = getPhoenixDateTime(2021, 11, 12, 12, 1, 0)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(6, 7, 29, 2, 34, 7))
    }

    @Test
    fun test_131() {
        val now = getPhoenixDateTime(2022, 1, 3, 21, 5, 8)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(6, 9, 20, 11, 38, 15))
    }

    @Test
    fun test_132() {
        val now = getPhoenixDateTime(2022, 2, 5, 8, 25, 37)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(6, 10, 21, 22, 58, 44))
    }

    @Test
    fun test_133() {
        val now = getPhoenixDateTime(2022, 2, 19, 10, 59, 22)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(6, 11, 5, 1, 32, 29))
    }

    @Test
    fun test_134() {
        val now = getPhoenixDateTime(2022, 2, 27, 14, 13, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(6, 11, 13, 4, 47, 0))
    }

    @Test
    fun test_135() {
        val now = getPhoenixDateTime(2022, 2, 28, 1, 39, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(6, 11, 13, 16, 13, 0))
    }

    @Test
    fun test_136() {
        val now = getPhoenixDateTime(2022, 4, 10, 5, 0, 58)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(7, 0, 26, 19, 34, 5))
    }

    @Test
    fun test_137() {
        val now = getPhoenixDateTime(2022, 4, 23, 8, 59, 59)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(7, 1, 8, 23, 33, 6))
    }

    @Test
    fun test_138() {
        val now = getPhoenixDateTime(2022, 5, 21, 6, 3, 2)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(7, 2, 6, 20, 36, 9))
    }

    @Test
    fun test_139() {
        val now = getPhoenixDateTime(2022, 7, 2, 3, 9, 30)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(7, 3, 17, 17, 42, 37))
    }

    @Test
    fun test_140() {
        val now = getPhoenixDateTime(2022, 7, 14, 5, 24, 48)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(7, 3, 29, 19, 57, 55))
    }

    @Test
    fun test_141() {
        val now = getPhoenixDateTime(2022, 7, 15, 9, 24, 24)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(7, 4, 0, 23, 57, 31))
    }

    @Test
    fun test_142() {
        val now = getPhoenixDateTime(2022, 8, 4, 10, 18, 9)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(7, 4, 21, 0, 51, 16))
    }

    @Test
    fun test_143() {
        val now = getPhoenixDateTime(2022, 8, 12, 19, 16, 21)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(7, 4, 29, 9, 49, 28))
    }

    @Test
    fun test_144() {
        val now = getPhoenixDateTime(2022, 9, 7, 20, 5, 2)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(7, 5, 24, 10, 38, 9))
    }

    @Test
    fun test_145() {
        val now = getPhoenixDateTime(2022, 9, 18, 5, 33, 9)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(7, 6, 3, 20, 6, 16))
    }

    @Test
    fun test_146() {
        val now = getPhoenixDateTime(2022, 9, 18, 23, 9, 41)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(7, 6, 4, 13, 42, 48))
    }

    @Test
    fun test_147() {
        val now = getPhoenixDateTime(2022, 10, 22, 16, 29, 5)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(7, 7, 8, 7, 2, 12))
    }

    @Test
    fun test_148() {
        val now = getPhoenixDateTime(2022, 12, 3, 15, 31, 50)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(7, 8, 19, 6, 4, 57))
    }

    @Test
    fun test_149() {
        val now = getPhoenixDateTime(2022, 12, 5, 18, 6, 0)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(7, 8, 21, 8, 39, 7))
    }

    @Test
    fun test_150() {
        val now = getPhoenixDateTime(2022, 12, 9, 17, 36, 19)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(7, 8, 25, 8, 9, 26))
    }

    @Test
    fun test_151() {
        val now = getPhoenixDateTime(2022, 12, 19, 23, 33, 46)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(7, 9, 5, 14, 6, 53))
    }

    @Test
    fun test_152() {
        val now = getPhoenixDateTime(2022, 12, 30, 3, 13, 48)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(7, 9, 15, 17, 46, 55))
    }

    @Test
    fun test_153() {
        val now = getPhoenixDateTime(2023, 1, 30, 20, 5, 16)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(7, 10, 16, 10, 38, 23))
    }

    @Test
    fun test_154() {
        val now = getPhoenixDateTime(2023, 2, 2, 5, 3, 58)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(7, 10, 18, 19, 37, 5))
    }

    @Test
    fun test_155() {
        val now = getPhoenixDateTime(2023, 2, 5, 16, 54, 27)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(7, 10, 22, 7, 27, 34))
    }

    @Test
    fun test_156() {
        val now = getPhoenixDateTime(2023, 3, 2, 7, 38, 33)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(7, 11, 15, 22, 11, 40))
    }

    @Test
    fun test_157() {
        val now = getPhoenixDateTime(2023, 3, 6, 5, 31, 32)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(7, 11, 19, 20, 4, 39))
    }

    @Test
    fun test_158() {
        val now = getPhoenixDateTime(2023, 3, 17, 11, 28, 36)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(8, 0, 3, 2, 1, 43))
    }

    @Test
    fun test_159() {
        val now = getPhoenixDateTime(2023, 5, 2, 9, 42, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(8, 1, 18, 0, 15, 59))
    }

    @Test
    fun test_160() {
        val now = getPhoenixDateTime(2023, 5, 19, 8, 27, 28)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(8, 2, 4, 23, 0, 35))
    }

    @Test
    fun test_161() {
        val now = getPhoenixDateTime(2023, 5, 29, 19, 16, 15)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(8, 2, 15, 9, 49, 22))
    }

    @Test
    fun test_162() {
        val now = getPhoenixDateTime(2023, 6, 7, 19, 0, 25)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(8, 2, 24, 9, 33, 32))
    }

    @Test
    fun test_163() {
        val now = getPhoenixDateTime(2023, 7, 7, 12, 25, 49)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(8, 3, 23, 2, 58, 56))
    }

    @Test
    fun test_164() {
        val now = getPhoenixDateTime(2023, 7, 14, 4, 54, 8)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(8, 3, 29, 19, 27, 15))
    }

    @Test
    fun test_165() {
        val now = getPhoenixDateTime(2023, 8, 7, 3, 26, 11)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(8, 4, 23, 17, 59, 18))
    }

    @Test
    fun test_166() {
        val now = getPhoenixDateTime(2023, 9, 8, 9, 21, 4)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(8, 5, 24, 23, 54, 11))
    }

    @Test
    fun test_167() {
        val now = getPhoenixDateTime(2023, 9, 20, 0, 57, 51)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(8, 6, 5, 15, 30, 58))
    }

    @Test
    fun test_168() {
        val now = getPhoenixDateTime(2023, 10, 31, 11, 58, 31)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(8, 7, 17, 2, 31, 38))
    }

    @Test
    fun test_169() {
        val now = getPhoenixDateTime(2023, 12, 20, 14, 45, 42)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(8, 9, 6, 5, 18, 49))
    }

    @Test
    fun test_170() {
        val now = getPhoenixDateTime(2024, 1, 24, 22, 46, 20)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(8, 10, 10, 13, 19, 27))
    }

    @Test
    fun test_171() {
        val now = getPhoenixDateTime(2024, 2, 13, 21, 34, 4)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(8, 10, 30, 12, 7, 11))
    }

    @Test
    fun test_172() {
        val now = getPhoenixDateTime(2024, 2, 29, 3, 47, 24)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(8, 11, 14, 18, 20, 31))
    }

    @Test
    fun test_173() {
        val now = getPhoenixDateTime(2024, 3, 3, 2, 48, 50)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(8, 11, 17, 17, 21, 57))
    }

    @Test
    fun test_174() {
        val now = getPhoenixDateTime(2024, 3, 17, 21, 41, 42)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(9, 0, 3, 12, 14, 49))
    }

    @Test
    fun test_175() {
        val now = getPhoenixDateTime(2024, 4, 9, 15, 55, 16)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(9, 0, 26, 6, 28, 23))
    }

    @Test
    fun test_176() {
        val now = getPhoenixDateTime(2024, 5, 4, 8, 24, 45)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(9, 1, 19, 22, 57, 52))
    }

    @Test
    fun test_177() {
        val now = getPhoenixDateTime(2024, 5, 10, 1, 10, 54)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(9, 1, 25, 15, 44, 1))
    }

    @Test
    fun test_178() {
        val now = getPhoenixDateTime(2024, 6, 12, 13, 11, 42)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(9, 2, 29, 3, 44, 49))
    }

    @Test
    fun test_179() {
        val now = getPhoenixDateTime(2024, 6, 12, 14, 55, 45)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(9, 2, 29, 5, 28, 52))
    }

    @Test
    fun test_180() {
        val now = getPhoenixDateTime(2024, 7, 18, 17, 1, 27)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(9, 4, 4, 7, 34, 34))
    }

    @Test
    fun test_181() {
        val now = getPhoenixDateTime(2024, 7, 20, 1, 48, 2)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(9, 4, 5, 16, 21, 9))
    }

    @Test
    fun test_182() {
        val now = getPhoenixDateTime(2024, 8, 3, 21, 58, 56)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(9, 4, 20, 12, 32, 3))
    }

    @Test
    fun test_183() {
        val now = getPhoenixDateTime(2024, 8, 12, 14, 51, 18)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(9, 4, 29, 5, 24, 25))
    }

    @Test
    fun test_184() {
        val now = getPhoenixDateTime(2024, 10, 29, 6, 10, 15)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(9, 7, 14, 20, 43, 22))
    }

    @Test
    fun test_185() {
        val now = getPhoenixDateTime(2024, 10, 30, 14, 0, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(9, 7, 16, 4, 33, 59))
    }

    @Test
    fun test_186() {
        val now = getPhoenixDateTime(2024, 12, 5, 6, 12, 11)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(9, 8, 20, 20, 45, 18))
    }

    @Test
    fun test_187() {
        val now = getPhoenixDateTime(2024, 12, 16, 3, 22, 39)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(9, 9, 1, 17, 55, 46))
    }

    @Test
    fun test_188() {
        val now = getPhoenixDateTime(2025, 1, 3, 11, 38, 14)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(9, 9, 20, 2, 11, 21))
    }

    @Test
    fun test_189() {
        val now = getPhoenixDateTime(2025, 1, 14, 13, 53, 38)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(9, 10, 0, 4, 26, 45))
    }

    @Test
    fun test_190() {
        val now = getPhoenixDateTime(2025, 2, 5, 22, 8, 16)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(9, 10, 22, 12, 41, 23))
    }

    @Test
    fun test_191() {
        val now = getPhoenixDateTime(2025, 3, 7, 8, 26, 56)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(9, 11, 20, 23, 0, 3))
    }

    @Test
    fun test_192() {
        val now = getPhoenixDateTime(2025, 3, 11, 18, 18, 3)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(9, 11, 25, 8, 51, 10))
    }

    @Test
    fun test_193() {
        val now = getPhoenixDateTime(2025, 4, 14, 13, 59, 4)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(10, 1, 0, 4, 32, 11))
    }

    @Test
    fun test_194() {
        val now = getPhoenixDateTime(2025, 5, 2, 4, 58, 17)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(10, 1, 17, 19, 31, 24))
    }

    @Test
    fun test_195() {
        val now = getPhoenixDateTime(2025, 5, 21, 12, 44, 5)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(10, 2, 7, 3, 17, 12))
    }

    @Test
    fun test_196() {
        val now = getPhoenixDateTime(2025, 6, 14, 0, 4, 31)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(10, 2, 30, 14, 37, 38))
    }

    @Test
    fun test_197() {
        val now = getPhoenixDateTime(2025, 6, 26, 11, 35, 51)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(10, 3, 12, 2, 8, 58))
    }

    @Test
    fun test_198() {
        val now = getPhoenixDateTime(2025, 7, 25, 8, 7, 13)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(10, 4, 10, 22, 40, 20))
    }

    @Test
    fun test_199() {
        val now = getPhoenixDateTime(2025, 7, 31, 20, 25, 22)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(10, 4, 17, 10, 58, 29))
    }

    @Test
    fun test_200() {
        val now = getPhoenixDateTime(2025, 8, 8, 23, 20, 21)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(10, 4, 25, 13, 53, 28))
    }

    @Test
    fun test_201() {
        val now = getPhoenixDateTime(2025, 8, 11, 13, 35, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(10, 4, 28, 4, 9, 0))
    }

    @Test
    fun test_202() {
        val now = getPhoenixDateTime(2025, 8, 16, 4, 8, 45)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(10, 5, 1, 18, 41, 52))
    }

    @Test
    fun test_203() {
        val now = getPhoenixDateTime(2025, 8, 26, 3, 44, 13)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(10, 5, 11, 18, 17, 20))
    }

    @Test
    fun test_204() {
        val now = getPhoenixDateTime(2025, 8, 31, 11, 59, 20)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(10, 5, 17, 2, 32, 27))
    }

    @Test
    fun test_205() {
        val now = getPhoenixDateTime(2025, 9, 5, 10, 1, 24)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(10, 5, 22, 0, 34, 31))
    }

    @Test
    fun test_206() {
        val now = getPhoenixDateTime(2025, 9, 22, 15, 44, 38)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(10, 6, 8, 6, 17, 45))
    }

    @Test
    fun test_207() {
        val now = getPhoenixDateTime(2025, 9, 26, 11, 16, 19)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(10, 6, 12, 1, 49, 26))
    }

    @Test
    fun test_208() {
        val now = getPhoenixDateTime(2025, 9, 27, 18, 24, 22)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(10, 6, 13, 8, 57, 29))
    }

    @Test
    fun test_209() {
        val now = getPhoenixDateTime(2025, 9, 28, 10, 3, 32)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(10, 6, 14, 0, 36, 39))
    }

    @Test
    fun test_210() {
        val now = getPhoenixDateTime(2025, 10, 9, 23, 12, 15)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(10, 6, 25, 13, 45, 22))
    }

    @Test
    fun test_211() {
        val now = getPhoenixDateTime(2025, 10, 10, 8, 41, 44)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(10, 6, 25, 23, 14, 51))
    }

    @Test
    fun test_212() {
        val now = getPhoenixDateTime(2025, 10, 26, 10, 37, 17)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(10, 7, 12, 1, 10, 24))
    }

    @Test
    fun test_213() {
        val now = getPhoenixDateTime(2025, 12, 10, 13, 52, 51)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(10, 8, 26, 4, 25, 58))
    }

    @Test
    fun test_214() {
        val now = getPhoenixDateTime(2026, 1, 3, 13, 13, 25)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(10, 9, 20, 3, 46, 32))
    }

    @Test
    fun test_215() {
        val now = getPhoenixDateTime(2026, 1, 28, 11, 19, 34)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(10, 10, 14, 1, 52, 41))
    }

    @Test
    fun test_216() {
        val now = getPhoenixDateTime(2026, 2, 11, 4, 52, 3)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(10, 10, 27, 19, 25, 10))
    }

    @Test
    fun test_217() {
        val now = getPhoenixDateTime(2026, 3, 10, 5, 20, 26)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(10, 11, 23, 19, 53, 33))
    }

    @Test
    fun test_218() {
        val now = getPhoenixDateTime(2026, 4, 8, 15, 16, 18)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(11, 0, 25, 5, 49, 25))
    }

    @Test
    fun test_219() {
        val now = getPhoenixDateTime(2026, 4, 11, 0, 39, 46)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(11, 0, 27, 15, 12, 53))
    }

    @Test
    fun test_220() {
        val now = getPhoenixDateTime(2026, 4, 18, 17, 46, 50)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(11, 1, 4, 8, 19, 57))
    }

    @Test
    fun test_221() {
        val now = getPhoenixDateTime(2026, 5, 13, 22, 9, 54)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(11, 1, 29, 12, 43, 1))
    }

    @Test
    fun test_222() {
        val now = getPhoenixDateTime(2026, 6, 4, 9, 54, 57)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(11, 2, 21, 0, 28, 4))
    }

    @Test
    fun test_223() {
        val now = getPhoenixDateTime(2026, 6, 10, 21, 53, 0)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(11, 2, 27, 12, 26, 7))
    }

    @Test
    fun test_224() {
        val now = getPhoenixDateTime(2026, 6, 21, 5, 36, 16)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(11, 3, 6, 20, 9, 23))
    }

    @Test
    fun test_225() {
        val now = getPhoenixDateTime(2026, 7, 8, 12, 26, 41)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(11, 3, 24, 2, 59, 48))
    }

    @Test
    fun test_226() {
        val now = getPhoenixDateTime(2026, 8, 8, 14, 16, 21)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(11, 4, 25, 4, 49, 28))
    }

    @Test
    fun test_227() {
        val now = getPhoenixDateTime(2026, 8, 28, 22, 22, 49)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(11, 5, 14, 12, 55, 56))
    }

    @Test
    fun test_228() {
        val now = getPhoenixDateTime(2026, 9, 9, 10, 48, 1)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(11, 5, 26, 1, 21, 8))
    }

    @Test
    fun test_229() {
        val now = getPhoenixDateTime(2026, 9, 16, 21, 2, 54)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(11, 6, 2, 11, 36, 1))
    }

    @Test
    fun test_230() {
        val now = getPhoenixDateTime(2026, 9, 20, 18, 34, 51)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(11, 6, 6, 9, 7, 58))
    }

    @Test
    fun test_231() {
        val now = getPhoenixDateTime(2026, 9, 22, 16, 47, 24)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(11, 6, 8, 7, 20, 31))
    }

    @Test
    fun test_232() {
        val now = getPhoenixDateTime(2026, 11, 19, 20, 20, 12)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(11, 8, 5, 10, 53, 19))
    }

    @Test
    fun test_233() {
        val now = getPhoenixDateTime(2026, 12, 19, 13, 25, 15)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(11, 9, 5, 3, 58, 22))
    }

    @Test
    fun test_234() {
        val now = getPhoenixDateTime(2027, 1, 12, 21, 43, 59)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(11, 9, 29, 12, 17, 6))
    }

    @Test
    fun test_235() {
        val now = getPhoenixDateTime(2027, 2, 3, 9, 57, 49)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(11, 10, 20, 0, 30, 56))
    }

    @Test
    fun test_236() {
        val now = getPhoenixDateTime(2027, 3, 11, 13, 9, 25)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(11, 11, 25, 3, 42, 32))
    }

    @Test
    fun test_237() {
        val now = getPhoenixDateTime(2027, 3, 15, 7, 58, 14)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(12, 0, 0, 22, 31, 21))
    }

    @Test
    fun test_238() {
        val now = getPhoenixDateTime(2027, 4, 11, 16, 18, 17)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(12, 0, 28, 6, 51, 24))
    }

    @Test
    fun test_239() {
        val now = getPhoenixDateTime(2027, 4, 23, 0, 28, 24)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(12, 1, 8, 15, 1, 31))
    }

    @Test
    fun test_240() {
        val now = getPhoenixDateTime(2027, 4, 25, 18, 0, 9)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(12, 1, 11, 8, 33, 16))
    }

    @Test
    fun test_241() {
        val now = getPhoenixDateTime(2027, 4, 26, 9, 10, 34)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(12, 1, 11, 23, 43, 41))
    }

    @Test
    fun test_242() {
        val now = getPhoenixDateTime(2027, 4, 27, 15, 28, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(12, 1, 13, 6, 1, 59))
    }

    @Test
    fun test_243() {
        val now = getPhoenixDateTime(2027, 5, 8, 11, 50, 39)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(12, 1, 24, 2, 23, 46))
    }

    @Test
    fun test_244() {
        val now = getPhoenixDateTime(2027, 5, 10, 8, 7, 39)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(12, 1, 25, 22, 40, 46))
    }

    @Test
    fun test_245() {
        val now = getPhoenixDateTime(2027, 5, 21, 18, 51, 15)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(12, 2, 7, 9, 24, 22))
    }

    @Test
    fun test_246() {
        val now = getPhoenixDateTime(2027, 7, 12, 6, 6, 20)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(12, 3, 27, 20, 39, 27))
    }

    @Test
    fun test_247() {
        val now = getPhoenixDateTime(2027, 7, 21, 0, 30, 56)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(12, 4, 6, 15, 4, 3))
    }

    @Test
    fun test_248() {
        val now = getPhoenixDateTime(2027, 7, 25, 8, 4, 33)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(12, 4, 10, 22, 37, 40))
    }

    @Test
    fun test_249() {
        val now = getPhoenixDateTime(2027, 8, 28, 8, 27, 3)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(12, 5, 13, 23, 0, 10))
    }

    @Test
    fun test_250() {
        val now = getPhoenixDateTime(2027, 9, 8, 18, 9, 48)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(12, 5, 25, 8, 42, 55))
    }

    @Test
    fun test_251() {
        val now = getPhoenixDateTime(2027, 9, 16, 2, 55, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(12, 6, 1, 17, 28, 59))
    }

    @Test
    fun test_252() {
        val now = getPhoenixDateTime(2027, 9, 17, 21, 30, 38)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(12, 6, 3, 12, 3, 45))
    }

    @Test
    fun test_253() {
        val now = getPhoenixDateTime(2027, 10, 1, 0, 49, 30)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(12, 6, 16, 15, 22, 37))
    }

    @Test
    fun test_254() {
        val now = getPhoenixDateTime(2027, 10, 21, 10, 58, 38)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(12, 7, 7, 1, 31, 45))
    }

    @Test
    fun test_255() {
        val now = getPhoenixDateTime(2027, 10, 25, 8, 15, 0)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(12, 7, 10, 22, 48, 7))
    }

    @Test
    fun test_256() {
        val now = getPhoenixDateTime(2027, 11, 10, 13, 32, 4)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(12, 7, 27, 4, 5, 11))
    }

    @Test
    fun test_257() {
        val now = getPhoenixDateTime(2027, 11, 13, 3, 1, 19)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(12, 7, 29, 17, 34, 26))
    }

    @Test
    fun test_258() {
        val now = getPhoenixDateTime(2027, 11, 14, 3, 37, 23)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(12, 7, 30, 18, 10, 30))
    }

    @Test
    fun test_259() {
        val now = getPhoenixDateTime(2027, 12, 18, 6, 36, 48)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(12, 9, 3, 21, 9, 55))
    }

    @Test
    fun test_260() {
        val now = getPhoenixDateTime(2027, 12, 19, 3, 50, 20)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(12, 9, 4, 18, 23, 27))
    }

    @Test
    fun test_261() {
        val now = getPhoenixDateTime(2028, 1, 23, 23, 56, 59)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(12, 10, 9, 14, 30, 6))
    }

    @Test
    fun test_262() {
        val now = getPhoenixDateTime(2028, 1, 27, 5, 46, 45)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(12, 10, 12, 20, 19, 52))
    }

    @Test
    fun test_263() {
        val now = getPhoenixDateTime(2028, 1, 28, 9, 53, 58)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(12, 10, 14, 0, 27, 5))
    }

    @Test
    fun test_264() {
        val now = getPhoenixDateTime(2028, 2, 7, 7, 46, 51)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(12, 10, 23, 22, 19, 58))
    }

    @Test
    fun test_265() {
        val now = getPhoenixDateTime(2028, 3, 7, 9, 8, 27)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(12, 11, 21, 23, 41, 34))
    }

    @Test
    fun test_266() {
        val now = getPhoenixDateTime(2028, 6, 6, 2, 17, 31)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(13, 2, 22, 16, 50, 38))
    }

    @Test
    fun test_267() {
        val now = getPhoenixDateTime(2028, 6, 11, 22, 23, 42)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(13, 2, 28, 12, 56, 49))
    }

    @Test
    fun test_268() {
        val now = getPhoenixDateTime(2028, 7, 21, 20, 44, 24)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(13, 4, 7, 11, 17, 31))
    }

    @Test
    fun test_269() {
        val now = getPhoenixDateTime(2028, 8, 19, 9, 33, 33)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(13, 5, 5, 0, 6, 40))
    }

    @Test
    fun test_270() {
        val now = getPhoenixDateTime(2028, 9, 5, 19, 5, 56)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(13, 5, 22, 9, 39, 3))
    }

    @Test
    fun test_271() {
        val now = getPhoenixDateTime(2028, 9, 21, 4, 50, 22)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(13, 6, 6, 19, 23, 29))
    }

    @Test
    fun test_272() {
        val now = getPhoenixDateTime(2028, 9, 27, 0, 45, 24)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(13, 6, 12, 15, 18, 31))
    }

    @Test
    fun test_273() {
        val now = getPhoenixDateTime(2028, 9, 28, 19, 23, 47)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(13, 6, 14, 9, 56, 54))
    }

    @Test
    fun test_274() {
        val now = getPhoenixDateTime(2028, 10, 10, 22, 21, 31)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(13, 6, 26, 12, 54, 38))
    }

    @Test
    fun test_275() {
        val now = getPhoenixDateTime(2028, 11, 8, 4, 45, 6)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(13, 7, 24, 19, 18, 13))
    }

    @Test
    fun test_276() {
        val now = getPhoenixDateTime(2028, 11, 22, 11, 52, 10)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(13, 8, 8, 2, 25, 17))
    }

    @Test
    fun test_277() {
        val now = getPhoenixDateTime(2028, 12, 18, 11, 47, 37)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(13, 9, 4, 2, 20, 44))
    }

    @Test
    fun test_278() {
        val now = getPhoenixDateTime(2028, 12, 19, 15, 21, 5)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(13, 9, 5, 5, 54, 12))
    }

    @Test
    fun test_279() {
        val now = getPhoenixDateTime(2029, 1, 9, 18, 38, 49)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(13, 9, 26, 9, 11, 56))
    }

    @Test
    fun test_280() {
        val now = getPhoenixDateTime(2029, 1, 19, 12, 1, 22)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(13, 10, 5, 2, 34, 29))
    }

    @Test
    fun test_281() {
        val now = getPhoenixDateTime(2029, 1, 24, 17, 14, 12)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(13, 10, 10, 7, 47, 19))
    }

    @Test
    fun test_282() {
        val now = getPhoenixDateTime(2029, 2, 3, 15, 40, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(13, 10, 20, 6, 14, 0))
    }

    @Test
    fun test_283() {
        val now = getPhoenixDateTime(2029, 2, 20, 21, 30, 55)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(13, 11, 6, 12, 4, 2))
    }

    @Test
    fun test_284() {
        val now = getPhoenixDateTime(2029, 4, 11, 21, 52, 26)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(14, 0, 28, 12, 25, 33))
    }

    @Test
    fun test_285() {
        val now = getPhoenixDateTime(2029, 4, 25, 8, 54, 50)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(14, 1, 10, 23, 27, 57))
    }

    @Test
    fun test_286() {
        val now = getPhoenixDateTime(2029, 5, 11, 11, 31, 9)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(14, 1, 27, 2, 4, 16))
    }

    @Test
    fun test_287() {
        val now = getPhoenixDateTime(2029, 6, 14, 16, 36, 56)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(14, 3, 0, 7, 10, 3))
    }

    @Test
    fun test_288() {
        val now = getPhoenixDateTime(2029, 6, 19, 23, 45, 22)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(14, 3, 5, 14, 18, 29))
    }

    @Test
    fun test_289() {
        val now = getPhoenixDateTime(2029, 6, 30, 23, 45, 37)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(14, 3, 16, 14, 18, 44))
    }

    @Test
    fun test_290() {
        val now = getPhoenixDateTime(2029, 7, 1, 8, 22, 48)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(14, 3, 16, 22, 55, 55))
    }

    @Test
    fun test_291() {
        val now = getPhoenixDateTime(2029, 7, 6, 8, 58, 25)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(14, 3, 21, 23, 31, 32))
    }

    @Test
    fun test_292() {
        val now = getPhoenixDateTime(2029, 7, 17, 23, 49, 0)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(14, 4, 3, 14, 22, 7))
    }

    @Test
    fun test_293() {
        val now = getPhoenixDateTime(2029, 9, 5, 14, 5, 42)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(14, 5, 22, 4, 38, 49))
    }

    @Test
    fun test_294() {
        val now = getPhoenixDateTime(2029, 10, 20, 20, 27, 8)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(14, 7, 6, 11, 0, 15))
    }

    @Test
    fun test_295() {
        val now = getPhoenixDateTime(2029, 11, 6, 12, 51, 9)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(14, 7, 23, 3, 24, 16))
    }

    @Test
    fun test_296() {
        val now = getPhoenixDateTime(2029, 11, 10, 10, 11, 29)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(14, 7, 27, 0, 44, 36))
    }

    @Test
    fun test_297() {
        val now = getPhoenixDateTime(2029, 11, 24, 17, 41, 25)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(14, 8, 10, 8, 14, 32))
    }

    @Test
    fun test_298() {
        val now = getPhoenixDateTime(2029, 12, 31, 13, 42, 14)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(14, 9, 17, 4, 15, 21))
    }

    @Test
    fun test_299() {
        val now = getPhoenixDateTime(2030, 1, 19, 12, 27, 49)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(14, 10, 5, 3, 0, 56))
    }

    @Test
    fun test_300() {
        val now = getPhoenixDateTime(2030, 2, 12, 15, 35, 27)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(14, 10, 29, 6, 8, 34))
    }

    @Test
    fun test_301() {
        val now = getPhoenixDateTime(2030, 2, 19, 21, 55, 32)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(14, 11, 5, 12, 28, 39))
    }

    @Test
    fun test_302() {
        val now = getPhoenixDateTime(2030, 3, 31, 14, 27, 31)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(15, 0, 17, 5, 0, 38))
    }

    @Test
    fun test_303() {
        val now = getPhoenixDateTime(2030, 4, 7, 2, 10, 4)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(15, 0, 23, 16, 43, 11))
    }

    @Test
    fun test_304() {
        val now = getPhoenixDateTime(2030, 4, 7, 15, 9, 58)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(15, 0, 24, 5, 43, 5))
    }

    @Test
    fun test_305() {
        val now = getPhoenixDateTime(2030, 6, 19, 1, 31, 38)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(15, 3, 4, 16, 4, 45))
    }

    @Test
    fun test_306() {
        val now = getPhoenixDateTime(2030, 6, 20, 17, 53, 36)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(15, 3, 6, 8, 26, 43))
    }

    @Test
    fun test_307() {
        val now = getPhoenixDateTime(2030, 7, 1, 12, 8, 1)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(15, 3, 17, 2, 41, 8))
    }

    @Test
    fun test_308() {
        val now = getPhoenixDateTime(2030, 7, 15, 4, 3, 42)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(15, 4, 0, 18, 36, 49))
    }

    @Test
    fun test_309() {
        val now = getPhoenixDateTime(2030, 11, 2, 18, 23, 13)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(15, 7, 19, 8, 56, 20))
    }

    @Test
    fun test_310() {
        val now = getPhoenixDateTime(2030, 11, 3, 10, 17, 41)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(15, 7, 20, 0, 50, 48))
    }

    @Test
    fun test_311() {
        val now = getPhoenixDateTime(2030, 11, 29, 19, 12, 46)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(15, 8, 15, 9, 45, 53))
    }

    @Test
    fun test_312() {
        val now = getPhoenixDateTime(2030, 12, 10, 18, 21, 31)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(15, 8, 26, 8, 54, 38))
    }

    @Test
    fun test_313() {
        val now = getPhoenixDateTime(2030, 12, 24, 1, 1, 38)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(15, 9, 9, 15, 34, 45))
    }

    @Test
    fun test_314() {
        val now = getPhoenixDateTime(2031, 1, 23, 14, 42, 29)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(15, 10, 9, 5, 15, 36))
    }

    @Test
    fun test_315() {
        val now = getPhoenixDateTime(2031, 2, 15, 18, 51, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(15, 11, 1, 9, 25, 0))
    }

    @Test
    fun test_316() {
        val now = getPhoenixDateTime(2031, 2, 19, 23, 38, 58)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(15, 11, 5, 14, 12, 5))
    }

    @Test
    fun test_317() {
        val now = getPhoenixDateTime(2031, 3, 6, 0, 25, 12)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(15, 11, 19, 14, 58, 19))
    }

    @Test
    fun test_318() {
        val now = getPhoenixDateTime(2031, 4, 4, 3, 30, 59)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(16, 0, 20, 18, 4, 6))
    }

    @Test
    fun test_319() {
        val now = getPhoenixDateTime(2031, 5, 10, 22, 41, 9)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(16, 1, 26, 13, 14, 16))
    }

    @Test
    fun test_320() {
        val now = getPhoenixDateTime(2031, 5, 17, 5, 33, 39)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(16, 2, 2, 20, 6, 46))
    }

    @Test
    fun test_321() {
        val now = getPhoenixDateTime(2031, 5, 27, 6, 9, 36)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(16, 2, 12, 20, 42, 43))
    }

    @Test
    fun test_322() {
        val now = getPhoenixDateTime(2031, 5, 29, 15, 3, 36)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(16, 2, 15, 5, 36, 43))
    }

    @Test
    fun test_323() {
        val now = getPhoenixDateTime(2031, 6, 19, 20, 57, 30)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(16, 3, 5, 11, 30, 37))
    }

    @Test
    fun test_324() {
        val now = getPhoenixDateTime(2031, 7, 13, 3, 24, 23)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(16, 3, 28, 17, 57, 30))
    }

    @Test
    fun test_325() {
        val now = getPhoenixDateTime(2031, 7, 24, 9, 32, 11)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(16, 4, 10, 0, 5, 18))
    }

    @Test
    fun test_326() {
        val now = getPhoenixDateTime(2031, 7, 31, 5, 58, 9)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(16, 4, 16, 20, 31, 16))
    }

    @Test
    fun test_327() {
        val now = getPhoenixDateTime(2031, 8, 6, 14, 45, 1)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(16, 4, 23, 5, 18, 8))
    }

    @Test
    fun test_328() {
        val now = getPhoenixDateTime(2031, 9, 2, 8, 53, 17)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(16, 5, 18, 23, 26, 24))
    }

    @Test
    fun test_329() {
        val now = getPhoenixDateTime(2031, 9, 25, 19, 59, 17)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(16, 6, 11, 10, 32, 24))
    }

    @Test
    fun test_330() {
        val now = getPhoenixDateTime(2031, 10, 2, 7, 57, 44)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(16, 6, 17, 22, 30, 51))
    }

    @Test
    fun test_331() {
        val now = getPhoenixDateTime(2031, 10, 9, 6, 33, 3)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(16, 6, 24, 21, 6, 10))
    }

    @Test
    fun test_332() {
        val now = getPhoenixDateTime(2031, 11, 18, 16, 27, 7)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(16, 8, 4, 7, 0, 14))
    }

    @Test
    fun test_333() {
        val now = getPhoenixDateTime(2031, 12, 16, 2, 52, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(16, 9, 1, 17, 26, 0))
    }

    @Test
    fun test_334() {
        val now = getPhoenixDateTime(2031, 12, 20, 14, 36, 42)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(16, 9, 6, 5, 9, 49))
    }

    @Test
    fun test_335() {
        val now = getPhoenixDateTime(2032, 1, 2, 18, 36, 48)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(16, 9, 19, 9, 9, 55))
    }

    @Test
    fun test_336() {
        val now = getPhoenixDateTime(2032, 1, 24, 6, 24, 29)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(16, 10, 9, 20, 57, 36))
    }

    @Test
    fun test_337() {
        val now = getPhoenixDateTime(2032, 2, 13, 4, 7, 21)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(16, 10, 29, 18, 40, 28))
    }

    @Test
    fun test_338() {
        val now = getPhoenixDateTime(2032, 3, 12, 20, 46, 37)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(16, 11, 27, 11, 19, 44))
    }

    @Test
    fun test_339() {
        val now = getPhoenixDateTime(2032, 3, 24, 8, 26, 59)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(17, 0, 9, 23, 0, 6))
    }

    @Test
    fun test_340() {
        val now = getPhoenixDateTime(2032, 4, 16, 13, 8, 40)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(17, 1, 2, 3, 41, 47))
    }

    @Test
    fun test_341() {
        val now = getPhoenixDateTime(2032, 4, 21, 7, 17, 26)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(17, 1, 6, 21, 50, 33))
    }

    @Test
    fun test_342() {
        val now = getPhoenixDateTime(2032, 4, 22, 21, 28, 1)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(17, 1, 8, 12, 1, 8))
    }

    @Test
    fun test_343() {
        val now = getPhoenixDateTime(2032, 4, 24, 19, 45, 33)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(17, 1, 10, 10, 18, 40))
    }

    @Test
    fun test_344() {
        val now = getPhoenixDateTime(2032, 6, 22, 0, 53, 54)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(17, 3, 7, 15, 27, 1))
    }

    @Test
    fun test_345() {
        val now = getPhoenixDateTime(2032, 8, 15, 13, 10, 48)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(17, 5, 1, 3, 43, 55))
    }

    @Test
    fun test_346() {
        val now = getPhoenixDateTime(2032, 8, 29, 16, 17, 13)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(17, 5, 15, 6, 50, 20))
    }

    @Test
    fun test_347() {
        val now = getPhoenixDateTime(2032, 8, 31, 11, 44, 2)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(17, 5, 17, 2, 17, 9))
    }

    @Test
    fun test_348() {
        val now = getPhoenixDateTime(2032, 10, 4, 9, 32, 50)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(17, 6, 20, 0, 5, 57))
    }

    @Test
    fun test_349() {
        val now = getPhoenixDateTime(2032, 10, 15, 10, 48, 30)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(17, 7, 1, 1, 21, 37))
    }

    @Test
    fun test_350() {
        val now = getPhoenixDateTime(2032, 10, 27, 3, 56, 45)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(17, 7, 12, 18, 29, 52))
    }

    @Test
    fun test_351() {
        val now = getPhoenixDateTime(2033, 1, 12, 11, 48, 47)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(17, 9, 29, 2, 21, 54))
    }

    @Test
    fun test_352() {
        val now = getPhoenixDateTime(2033, 1, 25, 0, 39, 8)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(17, 10, 10, 15, 12, 15))
    }

    @Test
    fun test_353() {
        val now = getPhoenixDateTime(2033, 3, 19, 2, 19, 17)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(18, 0, 4, 16, 52, 24))
    }

    @Test
    fun test_354() {
        val now = getPhoenixDateTime(2033, 5, 16, 20, 22, 37)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(18, 2, 2, 10, 55, 44))
    }

    @Test
    fun test_355() {
        val now = getPhoenixDateTime(2033, 6, 5, 9, 24, 48)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(18, 2, 21, 23, 57, 55))
    }

    @Test
    fun test_356() {
        val now = getPhoenixDateTime(2033, 6, 9, 6, 56, 26)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(18, 2, 25, 21, 29, 33))
    }

    @Test
    fun test_357() {
        val now = getPhoenixDateTime(2033, 6, 30, 5, 9, 33)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(18, 3, 15, 19, 42, 40))
    }

    @Test
    fun test_358() {
        val now = getPhoenixDateTime(2033, 8, 2, 19, 7, 51)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(18, 4, 19, 9, 40, 58))
    }

    @Test
    fun test_359() {
        val now = getPhoenixDateTime(2033, 8, 21, 18, 42, 38)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(18, 5, 7, 9, 15, 45))
    }

    @Test
    fun test_360() {
        val now = getPhoenixDateTime(2033, 9, 29, 5, 10, 21)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(18, 6, 14, 19, 43, 28))
    }

    @Test
    fun test_361() {
        val now = getPhoenixDateTime(2033, 11, 5, 5, 36, 34)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(18, 7, 21, 20, 9, 41))
    }

    @Test
    fun test_362() {
        val now = getPhoenixDateTime(2033, 11, 8, 12, 58, 7)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(18, 7, 25, 3, 31, 14))
    }

    @Test
    fun test_363() {
        val now = getPhoenixDateTime(2033, 12, 20, 21, 47, 20)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(18, 9, 6, 12, 20, 27))
    }

    @Test
    fun test_364() {
        val now = getPhoenixDateTime(2033, 12, 25, 12, 18, 34)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(18, 9, 11, 2, 51, 41))
    }

    @Test
    fun test_365() {
        val now = getPhoenixDateTime(2034, 1, 22, 2, 35, 18)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(18, 10, 7, 17, 8, 25))
    }

    @Test
    fun test_366() {
        val now = getPhoenixDateTime(2034, 1, 23, 3, 25, 50)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(18, 10, 8, 17, 58, 57))
    }

    @Test
    fun test_367() {
        val now = getPhoenixDateTime(2034, 1, 31, 0, 56, 20)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(18, 10, 16, 15, 29, 27))
    }

    @Test
    fun test_368() {
        val now = getPhoenixDateTime(2034, 2, 28, 2, 42, 44)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(18, 11, 13, 17, 15, 51))
    }

    @Test
    fun test_369() {
        val now = getPhoenixDateTime(2034, 2, 28, 20, 20, 39)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(18, 11, 14, 10, 53, 46))
    }

    @Test
    fun test_370() {
        val now = getPhoenixDateTime(2034, 3, 10, 23, 59, 20)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(18, 11, 24, 14, 32, 27))
    }

    @Test
    fun test_371() {
        val now = getPhoenixDateTime(2034, 3, 20, 0, 9, 58)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(19, 0, 5, 14, 43, 5))
    }

    @Test
    fun test_372() {
        val now = getPhoenixDateTime(2034, 3, 26, 4, 45, 2)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(19, 0, 11, 19, 18, 9))
    }

    @Test
    fun test_373() {
        val now = getPhoenixDateTime(2034, 5, 3, 4, 37, 2)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(19, 1, 18, 19, 10, 9))
    }

    @Test
    fun test_374() {
        val now = getPhoenixDateTime(2034, 5, 6, 22, 44, 11)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(19, 1, 22, 13, 17, 18))
    }

    @Test
    fun test_375() {
        val now = getPhoenixDateTime(2034, 5, 10, 13, 8, 21)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(19, 1, 26, 3, 41, 28))
    }

    @Test
    fun test_376() {
        val now = getPhoenixDateTime(2034, 5, 23, 0, 40, 5)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(19, 2, 8, 15, 13, 12))
    }

    @Test
    fun test_377() {
        val now = getPhoenixDateTime(2034, 7, 6, 1, 21, 57)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(19, 3, 21, 15, 55, 4))
    }

    @Test
    fun test_378() {
        val now = getPhoenixDateTime(2034, 7, 16, 7, 9, 36)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(19, 4, 1, 21, 42, 43))
    }

    @Test
    fun test_379() {
        val now = getPhoenixDateTime(2034, 7, 21, 13, 26, 10)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(19, 4, 7, 3, 59, 17))
    }

    @Test
    fun test_380() {
        val now = getPhoenixDateTime(2034, 8, 31, 18, 27, 51)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(19, 5, 17, 9, 0, 58))
    }

    @Test
    fun test_381() {
        val now = getPhoenixDateTime(2034, 9, 11, 23, 8, 48)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(19, 5, 28, 13, 41, 55))
    }

    @Test
    fun test_382() {
        val now = getPhoenixDateTime(2034, 9, 21, 21, 56, 17)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(19, 6, 7, 12, 29, 24))
    }

    @Test
    fun test_383() {
        val now = getPhoenixDateTime(2034, 9, 28, 21, 59, 55)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(19, 6, 14, 12, 33, 2))
    }

    @Test
    fun test_384() {
        val now = getPhoenixDateTime(2035, 1, 13, 16, 42, 0)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(19, 9, 30, 7, 15, 7))
    }

    @Test
    fun test_385() {
        val now = getPhoenixDateTime(2035, 1, 30, 17, 26, 51)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(19, 10, 16, 7, 59, 58))
    }

    @Test
    fun test_386() {
        val now = getPhoenixDateTime(2035, 2, 2, 10, 6, 17)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(19, 10, 19, 0, 39, 24))
    }

    @Test
    fun test_387() {
        val now = getPhoenixDateTime(2035, 2, 5, 13, 0, 30)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(19, 10, 22, 3, 33, 37))
    }

    @Test
    fun test_388() {
        val now = getPhoenixDateTime(2035, 2, 6, 13, 8, 10)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(19, 10, 23, 3, 41, 17))
    }

    @Test
    fun test_389() {
        val now = getPhoenixDateTime(2035, 2, 20, 1, 7, 12)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(19, 11, 5, 15, 40, 19))
    }

    @Test
    fun test_390() {
        val now = getPhoenixDateTime(2035, 3, 4, 17, 23, 8)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(19, 11, 18, 7, 56, 15))
    }

    @Test
    fun test_391() {
        val now = getPhoenixDateTime(2035, 4, 20, 9, 58, 26)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(20, 1, 6, 0, 31, 33))
    }

    @Test
    fun test_392() {
        val now = getPhoenixDateTime(2035, 4, 29, 13, 36, 44)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(20, 1, 15, 4, 9, 51))
    }

    @Test
    fun test_393() {
        val now = getPhoenixDateTime(2035, 5, 2, 9, 58, 44)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(20, 1, 18, 0, 31, 51))
    }

    @Test
    fun test_394() {
        val now = getPhoenixDateTime(2035, 5, 23, 17, 8, 43)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(20, 2, 9, 7, 41, 50))
    }

    @Test
    fun test_395() {
        val now = getPhoenixDateTime(2035, 6, 3, 8, 59, 13)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(20, 2, 19, 23, 32, 20))
    }

    @Test
    fun test_396() {
        val now = getPhoenixDateTime(2035, 6, 16, 20, 26, 31)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(20, 3, 2, 10, 59, 38))
    }

    @Test
    fun test_397() {
        val now = getPhoenixDateTime(2035, 9, 20, 17, 28, 57)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(20, 6, 6, 8, 2, 4))
    }

    @Test
    fun test_398() {
        val now = getPhoenixDateTime(2035, 10, 30, 20, 26, 27)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(20, 7, 16, 10, 59, 34))
    }

    @Test
    fun test_399() {
        val now = getPhoenixDateTime(2035, 11, 4, 5, 3, 51)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(20, 7, 20, 19, 36, 58))
    }

    @Test
    fun test_400() {
        val now = getPhoenixDateTime(2035, 12, 31, 8, 6, 31)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(20, 9, 16, 22, 39, 38))
    }

    @Test
    fun test_401() {
        val now = getPhoenixDateTime(2036, 2, 12, 21, 22, 38)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(20, 10, 29, 11, 55, 45))
    }

    @Test
    fun test_402() {
        val now = getPhoenixDateTime(2036, 2, 21, 16, 59, 16)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(20, 11, 7, 7, 32, 23))
    }

    @Test
    fun test_403() {
        val now = getPhoenixDateTime(2036, 3, 9, 15, 50, 57)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(20, 11, 24, 6, 24, 4))
    }

    @Test
    fun test_404() {
        val now = getPhoenixDateTime(2036, 4, 13, 3, 40, 25)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(21, 0, 29, 18, 13, 32))
    }

    @Test
    fun test_405() {
        val now = getPhoenixDateTime(2036, 4, 13, 22, 58, 16)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(21, 0, 30, 13, 31, 23))
    }

    @Test
    fun test_406() {
        val now = getPhoenixDateTime(2036, 5, 15, 7, 34, 11)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(21, 2, 0, 22, 7, 18))
    }

    @Test
    fun test_407() {
        val now = getPhoenixDateTime(2036, 5, 19, 8, 45, 17)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(21, 2, 4, 23, 18, 24))
    }

    @Test
    fun test_408() {
        val now = getPhoenixDateTime(2036, 5, 29, 6, 47, 23)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(21, 2, 14, 21, 20, 30))
    }

    @Test
    fun test_409() {
        val now = getPhoenixDateTime(2036, 7, 13, 6, 26, 29)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(21, 3, 28, 20, 59, 36))
    }

    @Test
    fun test_410() {
        val now = getPhoenixDateTime(2036, 7, 15, 5, 29, 3)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(21, 4, 0, 20, 2, 10))
    }

    @Test
    fun test_411() {
        val now = getPhoenixDateTime(2036, 8, 1, 22, 56, 54)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(21, 4, 18, 13, 30, 1))
    }

    @Test
    fun test_412() {
        val now = getPhoenixDateTime(2036, 8, 10, 7, 6, 24)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(21, 4, 26, 21, 39, 31))
    }

    @Test
    fun test_413() {
        val now = getPhoenixDateTime(2036, 8, 31, 11, 17, 55)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(21, 5, 17, 1, 51, 2))
    }

    @Test
    fun test_414() {
        val now = getPhoenixDateTime(2036, 9, 5, 16, 50, 57)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(21, 5, 22, 7, 24, 4))
    }

    @Test
    fun test_415() {
        val now = getPhoenixDateTime(2036, 10, 13, 11, 51, 8)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(21, 6, 29, 2, 24, 15))
    }

    @Test
    fun test_416() {
        val now = getPhoenixDateTime(2036, 11, 1, 16, 20, 37)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(21, 7, 18, 6, 53, 44))
    }

    @Test
    fun test_417() {
        val now = getPhoenixDateTime(2036, 11, 2, 22, 42, 57)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(21, 7, 19, 13, 16, 4))
    }

    @Test
    fun test_418() {
        val now = getPhoenixDateTime(2036, 11, 12, 2, 34, 40)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(21, 7, 28, 17, 7, 47))
    }

    @Test
    fun test_419() {
        val now = getPhoenixDateTime(2036, 12, 23, 14, 59, 18)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(21, 9, 9, 5, 32, 25))
    }

    @Test
    fun test_420() {
        val now = getPhoenixDateTime(2037, 2, 9, 11, 45, 25)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(21, 10, 26, 2, 18, 32))
    }

    @Test
    fun test_421() {
        val now = getPhoenixDateTime(2037, 2, 14, 9, 47, 35)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(21, 11, 0, 0, 20, 42))
    }

    @Test
    fun test_422() {
        val now = getPhoenixDateTime(2037, 2, 20, 4, 22, 31)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(21, 11, 5, 18, 55, 38))
    }

    @Test
    fun test_423() {
        val now = getPhoenixDateTime(2037, 2, 25, 20, 31, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(21, 11, 11, 11, 5, 0))
    }

    @Test
    fun test_424() {
        val now = getPhoenixDateTime(2037, 2, 26, 14, 42, 14)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(21, 11, 12, 5, 15, 21))
    }

    @Test
    fun test_425() {
        val now = getPhoenixDateTime(2037, 4, 23, 22, 12, 51)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(22, 1, 9, 12, 45, 58))
    }

    @Test
    fun test_426() {
        val now = getPhoenixDateTime(2037, 5, 2, 6, 27, 43)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(22, 1, 17, 21, 0, 50))
    }

    @Test
    fun test_427() {
        val now = getPhoenixDateTime(2037, 5, 27, 13, 20, 9)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(22, 2, 13, 3, 53, 16))
    }

    @Test
    fun test_428() {
        val now = getPhoenixDateTime(2037, 6, 3, 3, 3, 35)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(22, 2, 19, 17, 36, 42))
    }

    @Test
    fun test_429() {
        val now = getPhoenixDateTime(2037, 6, 24, 1, 35, 36)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(22, 3, 9, 16, 8, 43))
    }

    @Test
    fun test_430() {
        val now = getPhoenixDateTime(2037, 6, 27, 14, 53, 24)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(22, 3, 13, 5, 26, 31))
    }

    @Test
    fun test_431() {
        val now = getPhoenixDateTime(2037, 7, 11, 22, 10, 42)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(22, 3, 27, 12, 43, 49))
    }

    @Test
    fun test_432() {
        val now = getPhoenixDateTime(2037, 8, 2, 19, 52, 2)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(22, 4, 19, 10, 25, 9))
    }

    @Test
    fun test_433() {
        val now = getPhoenixDateTime(2037, 8, 25, 18, 26, 35)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(22, 5, 11, 8, 59, 42))
    }

    @Test
    fun test_434() {
        val now = getPhoenixDateTime(2037, 9, 14, 5, 28, 31)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(22, 5, 30, 20, 1, 38))
    }

    @Test
    fun test_435() {
        val now = getPhoenixDateTime(2037, 10, 17, 11, 11, 13)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(22, 7, 3, 1, 44, 20))
    }

    @Test
    fun test_436() {
        val now = getPhoenixDateTime(2037, 11, 9, 18, 40, 18)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(22, 7, 26, 9, 13, 25))
    }

    @Test
    fun test_437() {
        val now = getPhoenixDateTime(2037, 11, 19, 22, 47, 20)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(22, 8, 5, 13, 20, 27))
    }

    @Test
    fun test_438() {
        val now = getPhoenixDateTime(2037, 11, 24, 21, 29, 58)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(22, 8, 10, 12, 3, 5))
    }

    @Test
    fun test_439() {
        val now = getPhoenixDateTime(2037, 11, 30, 12, 49, 31)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(22, 8, 16, 3, 22, 38))
    }

    @Test
    fun test_440() {
        val now = getPhoenixDateTime(2038, 1, 20, 21, 4, 33)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(22, 10, 6, 11, 37, 40))
    }

    @Test
    fun test_441() {
        val now = getPhoenixDateTime(2038, 1, 28, 7, 47, 14)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(22, 10, 13, 22, 20, 21))
    }

    @Test
    fun test_442() {
        val now = getPhoenixDateTime(2038, 2, 2, 4, 15, 47)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(22, 10, 18, 18, 48, 54))
    }

    @Test
    fun test_443() {
        val now = getPhoenixDateTime(2038, 2, 17, 6, 48, 57)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(22, 11, 2, 21, 22, 4))
    }

    @Test
    fun test_444() {
        val now = getPhoenixDateTime(2038, 3, 12, 21, 2, 13)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(22, 11, 26, 11, 35, 20))
    }

    @Test
    fun test_445() {
        val now = getPhoenixDateTime(2038, 4, 26, 18, 46, 56)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(23, 1, 12, 9, 20, 3))
    }

    @Test
    fun test_446() {
        val now = getPhoenixDateTime(2038, 5, 29, 23, 19, 48)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(23, 2, 15, 13, 52, 55))
    }

    @Test
    fun test_447() {
        val now = getPhoenixDateTime(2038, 7, 15, 11, 46, 3)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(23, 4, 1, 2, 19, 10))
    }

    @Test
    fun test_448() {
        val now = getPhoenixDateTime(2038, 8, 17, 19, 47, 5)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(23, 5, 3, 10, 20, 12))
    }

    @Test
    fun test_449() {
        val now = getPhoenixDateTime(2038, 8, 20, 12, 51, 19)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(23, 5, 6, 3, 24, 26))
    }

    @Test
    fun test_450() {
        val now = getPhoenixDateTime(2038, 8, 24, 16, 52, 47)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(23, 5, 10, 7, 25, 54))
    }

    @Test
    fun test_451() {
        val now = getPhoenixDateTime(2038, 9, 8, 8, 51, 13)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(23, 5, 24, 23, 24, 20))
    }

    @Test
    fun test_452() {
        val now = getPhoenixDateTime(2038, 9, 14, 21, 33, 22)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(23, 6, 0, 12, 6, 29))
    }

    @Test
    fun test_453() {
        val now = getPhoenixDateTime(2038, 9, 18, 0, 37, 47)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(23, 6, 3, 15, 10, 54))
    }

    @Test
    fun test_454() {
        val now = getPhoenixDateTime(2038, 9, 24, 14, 2, 46)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(23, 6, 10, 4, 35, 53))
    }

    @Test
    fun test_455() {
        val now = getPhoenixDateTime(2038, 10, 20, 20, 24, 54)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(23, 7, 6, 10, 58, 1))
    }

    @Test
    fun test_456() {
        val now = getPhoenixDateTime(2038, 10, 23, 9, 43, 45)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(23, 7, 9, 0, 16, 52))
    }

    @Test
    fun test_457() {
        val now = getPhoenixDateTime(2038, 11, 6, 5, 35, 23)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(23, 7, 22, 20, 8, 30))
    }

    @Test
    fun test_458() {
        val now = getPhoenixDateTime(2038, 12, 20, 4, 35, 45)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(23, 9, 5, 19, 8, 52))
    }

    @Test
    fun test_459() {
        val now = getPhoenixDateTime(2039, 1, 29, 21, 50, 17)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(23, 10, 15, 12, 23, 24))
    }

    @Test
    fun test_460() {
        val now = getPhoenixDateTime(2039, 4, 5, 5, 41, 29)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(24, 0, 21, 20, 14, 36))
    }

    @Test
    fun test_461() {
        val now = getPhoenixDateTime(2039, 5, 28, 7, 7, 35)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(24, 2, 13, 21, 40, 42))
    }

    @Test
    fun test_462() {
        val now = getPhoenixDateTime(2039, 6, 2, 17, 44, 37)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(24, 2, 19, 8, 17, 44))
    }

    @Test
    fun test_463() {
        val now = getPhoenixDateTime(2039, 6, 20, 17, 54, 21)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(24, 3, 6, 8, 27, 28))
    }

    @Test
    fun test_464() {
        val now = getPhoenixDateTime(2039, 8, 21, 3, 23, 12)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(24, 5, 6, 17, 56, 19))
    }

    @Test
    fun test_465() {
        val now = getPhoenixDateTime(2039, 8, 31, 9, 27, 40)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(24, 5, 17, 0, 0, 47))
    }

    @Test
    fun test_466() {
        val now = getPhoenixDateTime(2039, 9, 4, 3, 10, 38)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(24, 5, 20, 17, 43, 45))
    }

    @Test
    fun test_467() {
        val now = getPhoenixDateTime(2039, 9, 17, 1, 25, 36)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(24, 6, 2, 15, 58, 43))
    }

    @Test
    fun test_468() {
        val now = getPhoenixDateTime(2039, 9, 26, 23, 31, 39)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(24, 6, 12, 14, 4, 46))
    }

    @Test
    fun test_469() {
        val now = getPhoenixDateTime(2039, 11, 7, 2, 5, 49)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(24, 7, 23, 16, 38, 56))
    }

    @Test
    fun test_470() {
        val now = getPhoenixDateTime(2039, 11, 25, 23, 9, 41)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(24, 8, 11, 13, 42, 48))
    }

    @Test
    fun test_471() {
        val now = getPhoenixDateTime(2039, 12, 12, 1, 25, 9)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(24, 8, 27, 15, 58, 16))
    }

    @Test
    fun test_472() {
        val now = getPhoenixDateTime(2040, 3, 4, 7, 39, 24)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(24, 11, 18, 22, 12, 31))
    }

    @Test
    fun test_473() {
        val now = getPhoenixDateTime(2040, 3, 4, 17, 43, 31)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(24, 11, 19, 8, 16, 38))
    }

    @Test
    fun test_474() {
        val now = getPhoenixDateTime(2040, 3, 5, 4, 38, 23)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(24, 11, 19, 19, 11, 30))
    }

    @Test
    fun test_475() {
        val now = getPhoenixDateTime(2040, 5, 4, 1, 45, 0)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(25, 1, 19, 16, 18, 7))
    }

    @Test
    fun test_476() {
        val now = getPhoenixDateTime(2040, 6, 11, 4, 53, 50)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(25, 2, 27, 19, 26, 57))
    }

    @Test
    fun test_477() {
        val now = getPhoenixDateTime(2040, 6, 15, 3, 16, 13)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(25, 3, 0, 17, 49, 20))
    }

    @Test
    fun test_478() {
        val now = getPhoenixDateTime(2040, 6, 20, 2, 20, 49)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(25, 3, 5, 16, 53, 56))
    }

    @Test
    fun test_479() {
        val now = getPhoenixDateTime(2040, 8, 10, 14, 0, 41)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(25, 4, 27, 4, 33, 48))
    }

    @Test
    fun test_480() {
        val now = getPhoenixDateTime(2040, 8, 17, 2, 58, 7)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(25, 5, 2, 17, 31, 14))
    }

    @Test
    fun test_481() {
        val now = getPhoenixDateTime(2040, 8, 23, 8, 34, 16)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(25, 5, 8, 23, 7, 23))
    }

    @Test
    fun test_482() {
        val now = getPhoenixDateTime(2040, 9, 6, 6, 9, 24)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(25, 5, 22, 20, 42, 31))
    }

    @Test
    fun test_483() {
        val now = getPhoenixDateTime(2040, 10, 16, 21, 19, 25)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(25, 7, 2, 11, 52, 32))
    }

    @Test
    fun test_484() {
        val now = getPhoenixDateTime(2040, 11, 5, 7, 42, 28)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(25, 7, 21, 22, 15, 35))
    }

    @Test
    fun test_485() {
        val now = getPhoenixDateTime(2040, 12, 11, 2, 14, 10)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(25, 8, 26, 16, 47, 17))
    }

    @Test
    fun test_486() {
        val now = getPhoenixDateTime(2041, 1, 2, 1, 19, 35)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(25, 9, 18, 15, 52, 42))
    }

    @Test
    fun test_487() {
        val now = getPhoenixDateTime(2041, 3, 20, 8, 18, 32)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(26, 0, 5, 22, 51, 39))
    }

    @Test
    fun test_488() {
        val now = getPhoenixDateTime(2041, 3, 23, 10, 41, 25)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(26, 0, 9, 1, 14, 32))
    }

    @Test
    fun test_489() {
        val now = getPhoenixDateTime(2041, 3, 23, 22, 48, 12)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(26, 0, 9, 13, 21, 19))
    }

    @Test
    fun test_490() {
        val now = getPhoenixDateTime(2041, 6, 26, 13, 32, 33)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(26, 3, 12, 4, 5, 40))
    }

    @Test
    fun test_491() {
        val now = getPhoenixDateTime(2041, 6, 27, 18, 37, 55)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(26, 3, 13, 9, 11, 2))
    }

    @Test
    fun test_492() {
        val now = getPhoenixDateTime(2041, 7, 7, 11, 42, 22)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(26, 3, 23, 2, 15, 29))
    }

    @Test
    fun test_493() {
        val now = getPhoenixDateTime(2041, 8, 13, 4, 34, 28)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(26, 4, 29, 19, 7, 35))
    }

    @Test
    fun test_494() {
        val now = getPhoenixDateTime(2041, 8, 16, 21, 33, 18)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(26, 5, 2, 12, 6, 25))
    }

    @Test
    fun test_495() {
        val now = getPhoenixDateTime(2041, 9, 1, 5, 17, 16)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(26, 5, 17, 19, 50, 23))
    }

    @Test
    fun test_496() {
        val now = getPhoenixDateTime(2041, 9, 5, 22, 11, 1)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(26, 5, 22, 12, 44, 8))
    }

    @Test
    fun test_497() {
        val now = getPhoenixDateTime(2041, 9, 19, 23, 17, 5)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(26, 6, 5, 13, 50, 12))
    }

    @Test
    fun test_498() {
        val now = getPhoenixDateTime(2041, 10, 19, 18, 35, 13)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(26, 7, 5, 9, 8, 20))
    }

    @Test
    fun test_499() {
        val now = getPhoenixDateTime(2041, 11, 28, 21, 42, 2)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(26, 8, 14, 12, 15, 9))
    }

    @Test
    fun test_500() {
        val now = getPhoenixDateTime(2041, 12, 2, 22, 37, 7)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(26, 8, 18, 13, 10, 14))
    }

    @Test
    fun test_501() {
        val now = getPhoenixDateTime(2041, 12, 14, 13, 40, 54)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(26, 9, 0, 4, 14, 1))
    }

    @Test
    fun test_502() {
        val now = getPhoenixDateTime(2041, 12, 20, 17, 49, 31)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(26, 9, 6, 8, 22, 38))
    }

    @Test
    fun test_503() {
        val now = getPhoenixDateTime(2041, 12, 26, 22, 3, 28)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(26, 9, 12, 12, 36, 35))
    }

    @Test
    fun test_504() {
        val now = getPhoenixDateTime(2041, 12, 30, 1, 39, 24)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(26, 9, 15, 16, 12, 31))
    }

    @Test
    fun test_505() {
        val now = getPhoenixDateTime(2042, 1, 26, 16, 20, 47)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(26, 10, 12, 6, 53, 54))
    }

    @Test
    fun test_506() {
        val now = getPhoenixDateTime(2042, 3, 11, 10, 0, 6)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(26, 11, 25, 0, 33, 13))
    }

    @Test
    fun test_507() {
        val now = getPhoenixDateTime(2042, 4, 21, 0, 52, 4)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(27, 1, 6, 15, 25, 11))
    }

    @Test
    fun test_508() {
        val now = getPhoenixDateTime(2042, 6, 1, 6, 30, 14)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(27, 2, 17, 21, 3, 21))
    }

    @Test
    fun test_509() {
        val now = getPhoenixDateTime(2042, 6, 12, 7, 57, 34)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(27, 2, 28, 22, 30, 41))
    }

    @Test
    fun test_510() {
        val now = getPhoenixDateTime(2042, 7, 6, 20, 17, 29)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(27, 3, 22, 10, 50, 36))
    }

    @Test
    fun test_511() {
        val now = getPhoenixDateTime(2042, 7, 20, 5, 46, 8)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(27, 4, 5, 20, 19, 15))
    }

    @Test
    fun test_512() {
        val now = getPhoenixDateTime(2042, 7, 21, 15, 17, 24)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(27, 4, 7, 5, 50, 31))
    }

    @Test
    fun test_513() {
        val now = getPhoenixDateTime(2042, 8, 11, 23, 14, 59)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(27, 4, 28, 13, 48, 6))
    }

    @Test
    fun test_514() {
        val now = getPhoenixDateTime(2042, 9, 12, 9, 58, 13)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(27, 5, 29, 0, 31, 20))
    }

    @Test
    fun test_515() {
        val now = getPhoenixDateTime(2042, 10, 20, 8, 51, 9)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(27, 7, 5, 23, 24, 16))
    }

    @Test
    fun test_516() {
        val now = getPhoenixDateTime(2042, 11, 25, 18, 33, 4)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(27, 8, 11, 9, 6, 11))
    }

    @Test
    fun test_517() {
        val now = getPhoenixDateTime(2042, 12, 22, 23, 12, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(27, 9, 8, 13, 45, 59))
    }

    @Test
    fun test_518() {
        val now = getPhoenixDateTime(2043, 1, 2, 6, 40, 9)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(27, 9, 18, 21, 13, 16))
    }

    @Test
    fun test_519() {
        val now = getPhoenixDateTime(2043, 1, 6, 15, 47, 57)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(27, 9, 23, 6, 21, 4))
    }

    @Test
    fun test_520() {
        val now = getPhoenixDateTime(2043, 1, 6, 16, 18, 29)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(27, 9, 23, 6, 51, 36))
    }

    @Test
    fun test_521() {
        val now = getPhoenixDateTime(2043, 1, 24, 17, 51, 44)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(27, 10, 10, 8, 24, 51))
    }

    @Test
    fun test_522() {
        val now = getPhoenixDateTime(2043, 1, 27, 20, 16, 51)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(27, 10, 13, 10, 49, 58))
    }

    @Test
    fun test_523() {
        val now = getPhoenixDateTime(2043, 1, 30, 2, 10, 1)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(27, 10, 15, 16, 43, 8))
    }

    @Test
    fun test_524() {
        val now = getPhoenixDateTime(2043, 2, 3, 23, 27, 51)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(27, 10, 20, 14, 0, 58))
    }

    @Test
    fun test_525() {
        val now = getPhoenixDateTime(2043, 2, 10, 2, 13, 57)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(27, 10, 26, 16, 47, 4))
    }

    @Test
    fun test_526() {
        val now = getPhoenixDateTime(2043, 3, 13, 1, 51, 13)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(27, 11, 26, 16, 24, 20))
    }

    @Test
    fun test_527() {
        val now = getPhoenixDateTime(2043, 4, 2, 3, 8, 12)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(28, 0, 18, 17, 41, 19))
    }

    @Test
    fun test_528() {
        val now = getPhoenixDateTime(2043, 4, 25, 0, 11, 1)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(28, 1, 10, 14, 44, 8))
    }

    @Test
    fun test_529() {
        val now = getPhoenixDateTime(2043, 5, 26, 11, 32, 22)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(28, 2, 12, 2, 5, 29))
    }

    @Test
    fun test_530() {
        val now = getPhoenixDateTime(2043, 7, 3, 11, 15, 18)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(28, 3, 19, 1, 48, 25))
    }

    @Test
    fun test_531() {
        val now = getPhoenixDateTime(2043, 7, 18, 5, 39, 50)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(28, 4, 3, 20, 12, 57))
    }

    @Test
    fun test_532() {
        val now = getPhoenixDateTime(2043, 8, 28, 21, 4, 48)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(28, 5, 14, 11, 37, 55))
    }

    @Test
    fun test_533() {
        val now = getPhoenixDateTime(2043, 8, 30, 20, 5, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(28, 5, 16, 10, 39, 0))
    }

    @Test
    fun test_534() {
        val now = getPhoenixDateTime(2043, 9, 6, 12, 19, 31)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(28, 5, 23, 2, 52, 38))
    }

    @Test
    fun test_535() {
        val now = getPhoenixDateTime(2043, 9, 23, 20, 54, 5)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(28, 6, 9, 11, 27, 12))
    }

    @Test
    fun test_536() {
        val now = getPhoenixDateTime(2043, 10, 5, 18, 58, 32)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(28, 6, 21, 9, 31, 39))
    }

    @Test
    fun test_537() {
        val now = getPhoenixDateTime(2043, 10, 8, 11, 32, 17)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(28, 6, 24, 2, 5, 24))
    }

    @Test
    fun test_538() {
        val now = getPhoenixDateTime(2043, 10, 25, 1, 49, 2)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(28, 7, 10, 16, 22, 9))
    }

    @Test
    fun test_539() {
        val now = getPhoenixDateTime(2043, 11, 10, 13, 47, 51)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(28, 7, 27, 4, 20, 58))
    }

    @Test
    fun test_540() {
        val now = getPhoenixDateTime(2043, 11, 19, 5, 27, 38)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(28, 8, 4, 20, 0, 45))
    }

    @Test
    fun test_541() {
        val now = getPhoenixDateTime(2043, 12, 5, 18, 1, 18)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(28, 8, 21, 8, 34, 25))
    }

    @Test
    fun test_542() {
        val now = getPhoenixDateTime(2043, 12, 14, 14, 13, 1)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(28, 9, 0, 4, 46, 8))
    }

    @Test
    fun test_543() {
        val now = getPhoenixDateTime(2043, 12, 28, 6, 19, 14)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(28, 9, 13, 20, 52, 21))
    }

    @Test
    fun test_544() {
        val now = getPhoenixDateTime(2044, 1, 1, 3, 49, 29)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(28, 9, 17, 18, 22, 36))
    }

    @Test
    fun test_545() {
        val now = getPhoenixDateTime(2044, 1, 11, 0, 34, 24)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(28, 9, 27, 15, 7, 31))
    }

    @Test
    fun test_546() {
        val now = getPhoenixDateTime(2044, 2, 4, 9, 16, 43)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(28, 10, 20, 23, 49, 50))
    }

    @Test
    fun test_547() {
        val now = getPhoenixDateTime(2044, 3, 26, 2, 55, 51)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(29, 0, 11, 17, 28, 58))
    }

    @Test
    fun test_548() {
        val now = getPhoenixDateTime(2044, 3, 30, 15, 31, 39)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(29, 0, 16, 6, 4, 46))
    }

    @Test
    fun test_549() {
        val now = getPhoenixDateTime(2044, 7, 18, 11, 17, 42)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(29, 4, 4, 1, 50, 49))
    }

    @Test
    fun test_550() {
        val now = getPhoenixDateTime(2044, 8, 9, 2, 21, 12)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(29, 4, 25, 16, 54, 19))
    }

    @Test
    fun test_551() {
        val now = getPhoenixDateTime(2044, 9, 1, 8, 15, 17)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(29, 5, 17, 22, 48, 24))
    }

    @Test
    fun test_552() {
        val now = getPhoenixDateTime(2044, 9, 8, 1, 5, 1)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(29, 5, 24, 15, 38, 8))
    }

    @Test
    fun test_553() {
        val now = getPhoenixDateTime(2044, 9, 29, 22, 27, 12)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(29, 6, 15, 13, 0, 19))
    }

    @Test
    fun test_554() {
        val now = getPhoenixDateTime(2044, 10, 11, 9, 37, 9)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(29, 6, 27, 0, 10, 16))
    }

    @Test
    fun test_555() {
        val now = getPhoenixDateTime(2044, 11, 10, 4, 17, 58)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(29, 7, 26, 18, 51, 5))
    }

    @Test
    fun test_556() {
        val now = getPhoenixDateTime(2044, 12, 23, 3, 49, 26)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(29, 9, 8, 18, 22, 33))
    }

    @Test
    fun test_557() {
        val now = getPhoenixDateTime(2044, 12, 28, 0, 47, 30)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(29, 9, 13, 15, 20, 37))
    }

    @Test
    fun test_558() {
        val now = getPhoenixDateTime(2045, 2, 7, 18, 20, 56)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(29, 10, 24, 8, 54, 3))
    }

    @Test
    fun test_559() {
        val now = getPhoenixDateTime(2045, 2, 11, 9, 49, 44)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(29, 10, 28, 0, 22, 51))
    }

    @Test
    fun test_560() {
        val now = getPhoenixDateTime(2045, 2, 14, 6, 25, 33)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(29, 10, 30, 20, 58, 40))
    }

    @Test
    fun test_561() {
        val now = getPhoenixDateTime(2045, 3, 4, 10, 10, 9)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(29, 11, 18, 0, 43, 16))
    }

    @Test
    fun test_562() {
        val now = getPhoenixDateTime(2045, 3, 27, 15, 43, 5)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(30, 0, 13, 6, 16, 12))
    }

    @Test
    fun test_563() {
        val now = getPhoenixDateTime(2045, 4, 30, 1, 11, 43)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(30, 1, 15, 15, 44, 50))
    }

    @Test
    fun test_564() {
        val now = getPhoenixDateTime(2045, 5, 9, 17, 45, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(30, 1, 25, 8, 19, 0))
    }

    @Test
    fun test_565() {
        val now = getPhoenixDateTime(2045, 5, 9, 18, 26, 10)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(30, 1, 25, 8, 59, 17))
    }

    @Test
    fun test_566() {
        val now = getPhoenixDateTime(2045, 5, 17, 18, 16, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(30, 2, 3, 8, 49, 59))
    }

    @Test
    fun test_567() {
        val now = getPhoenixDateTime(2045, 5, 29, 3, 24, 37)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(30, 2, 14, 17, 57, 44))
    }

    @Test
    fun test_568() {
        val now = getPhoenixDateTime(2045, 6, 16, 7, 12, 46)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(30, 3, 1, 21, 45, 53))
    }

    @Test
    fun test_569() {
        val now = getPhoenixDateTime(2045, 6, 20, 1, 36, 58)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(30, 3, 5, 16, 10, 5))
    }

    @Test
    fun test_570() {
        val now = getPhoenixDateTime(2045, 6, 28, 7, 46, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(30, 3, 13, 22, 19, 59))
    }

    @Test
    fun test_571() {
        val now = getPhoenixDateTime(2045, 7, 3, 3, 51, 15)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(30, 3, 18, 18, 24, 22))
    }

    @Test
    fun test_572() {
        val now = getPhoenixDateTime(2045, 7, 3, 21, 25, 36)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(30, 3, 19, 11, 58, 43))
    }

    @Test
    fun test_573() {
        val now = getPhoenixDateTime(2045, 8, 18, 2, 14, 19)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(30, 5, 3, 16, 47, 26))
    }

    @Test
    fun test_574() {
        val now = getPhoenixDateTime(2045, 9, 18, 2, 8, 39)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(30, 6, 3, 16, 41, 46))
    }

    @Test
    fun test_575() {
        val now = getPhoenixDateTime(2045, 9, 25, 21, 46, 36)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(30, 6, 11, 12, 19, 43))
    }

    @Test
    fun test_576() {
        val now = getPhoenixDateTime(2045, 10, 2, 2, 13, 1)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(30, 6, 17, 16, 46, 8))
    }

    @Test
    fun test_577() {
        val now = getPhoenixDateTime(2045, 10, 29, 0, 5, 20)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(30, 7, 14, 14, 38, 27))
    }

    @Test
    fun test_578() {
        val now = getPhoenixDateTime(2045, 10, 30, 5, 29, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(30, 7, 15, 20, 3, 0))
    }

    @Test
    fun test_579() {
        val now = getPhoenixDateTime(2045, 11, 1, 23, 28, 22)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(30, 7, 18, 14, 1, 29))
    }

    @Test
    fun test_580() {
        val now = getPhoenixDateTime(2045, 11, 6, 5, 35, 24)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(30, 7, 22, 20, 8, 31))
    }

    @Test
    fun test_581() {
        val now = getPhoenixDateTime(2045, 11, 8, 21, 13, 14)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(30, 7, 25, 11, 46, 21))
    }

    @Test
    fun test_582() {
        val now = getPhoenixDateTime(2045, 12, 8, 10, 38, 9)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(30, 8, 24, 1, 11, 16))
    }

    @Test
    fun test_583() {
        val now = getPhoenixDateTime(2045, 12, 9, 1, 28, 6)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(30, 8, 24, 16, 1, 13))
    }

    @Test
    fun test_584() {
        val now = getPhoenixDateTime(2046, 1, 22, 20, 46, 30)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(30, 10, 8, 11, 19, 37))
    }

    @Test
    fun test_585() {
        val now = getPhoenixDateTime(2046, 2, 8, 23, 38, 57)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(30, 10, 25, 14, 12, 4))
    }

    @Test
    fun test_586() {
        val now = getPhoenixDateTime(2046, 2, 10, 5, 39, 50)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(30, 10, 26, 20, 12, 57))
    }

    @Test
    fun test_587() {
        val now = getPhoenixDateTime(2046, 2, 15, 7, 54, 45)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(30, 11, 0, 22, 27, 52))
    }

    @Test
    fun test_588() {
        val now = getPhoenixDateTime(2046, 2, 21, 12, 32, 42)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(30, 11, 7, 3, 5, 49))
    }

    @Test
    fun test_589() {
        val now = getPhoenixDateTime(2046, 3, 25, 7, 52, 29)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 0, 10, 22, 25, 36))
    }

    @Test
    fun test_590() {
        val now = getPhoenixDateTime(2046, 4, 10, 11, 33, 7)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 0, 27, 2, 6, 14))
    }

    @Test
    fun test_591() {
        val now = getPhoenixDateTime(2046, 4, 28, 20, 52, 21)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 1, 14, 11, 25, 28))
    }

    @Test
    fun test_592() {
        val now = getPhoenixDateTime(2046, 5, 5, 9, 59, 22)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 1, 21, 0, 32, 29))
    }

    @Test
    fun test_593() {
        val now = getPhoenixDateTime(2046, 5, 5, 11, 26, 14)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 1, 21, 1, 59, 21))
    }

    @Test
    fun test_594() {
        val now = getPhoenixDateTime(2046, 5, 26, 13, 24, 5)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 2, 12, 3, 57, 12))
    }

    @Test
    fun test_595() {
        val now = getPhoenixDateTime(2046, 5, 28, 5, 4, 29)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 2, 13, 19, 37, 36))
    }

    @Test
    fun test_596() {
        val now = getPhoenixDateTime(2046, 6, 1, 12, 0, 10)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 2, 18, 2, 33, 17))
    }

    @Test
    fun test_597() {
        val now = getPhoenixDateTime(2046, 6, 9, 19, 26, 37)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 2, 26, 9, 59, 44))
    }

    @Test
    fun test_598() {
        val now = getPhoenixDateTime(2046, 6, 12, 8, 30, 58)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 2, 28, 23, 4, 5))
    }

    @Test
    fun test_599() {
        val now = getPhoenixDateTime(2046, 9, 5, 17, 17, 3)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 5, 22, 7, 50, 10))
    }

    @Test
    fun test_600() {
        val now = getPhoenixDateTime(2046, 10, 5, 5, 5, 6)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 6, 20, 19, 38, 13))
    }

    @Test
    fun test_601() {
        val now = getPhoenixDateTime(2046, 11, 28, 21, 58, 55)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 8, 14, 12, 32, 2))
    }

    @Test
    fun test_602() {
        val now = getPhoenixDateTime(2047, 1, 15, 19, 11, 6)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 10, 1, 9, 44, 13))
    }

    @Test
    fun test_603() {
        val now = getPhoenixDateTime(2047, 1, 17, 15, 5, 32)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 10, 3, 5, 38, 39))
    }

    @Test
    fun test_604() {
        val now = getPhoenixDateTime(2047, 1, 30, 9, 1, 57)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 10, 15, 23, 35, 4))
    }

    @Test
    fun test_605() {
        val now = getPhoenixDateTime(2047, 2, 3, 9, 21, 43)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 10, 19, 23, 54, 50))
    }

    @Test
    fun test_606() {
        val now = getPhoenixDateTime(2047, 2, 12, 1, 14, 50)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 10, 28, 15, 47, 57))
    }

    @Test
    fun test_607() {
        val now = getPhoenixDateTime(2047, 2, 16, 23, 44, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 11, 2, 14, 18, 0))
    }

    @Test
    fun test_608() {
        val now = getPhoenixDateTime(2047, 2, 18, 20, 2, 23)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 11, 4, 10, 35, 30))
    }

    @Test
    fun test_609() {
        val now = getPhoenixDateTime(2047, 3, 10, 13, 53, 7)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(31, 11, 24, 4, 26, 14))
    }

    @Test
    fun test_610() {
        val now = getPhoenixDateTime(2047, 4, 12, 10, 24, 25)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(32, 0, 29, 0, 57, 32))
    }

    @Test
    fun test_611() {
        val now = getPhoenixDateTime(2047, 4, 15, 10, 23, 55)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(32, 1, 1, 0, 57, 2))
    }

    @Test
    fun test_612() {
        val now = getPhoenixDateTime(2047, 4, 15, 16, 11, 6)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(32, 1, 1, 6, 44, 13))
    }

    @Test
    fun test_613() {
        val now = getPhoenixDateTime(2047, 4, 29, 10, 51, 29)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(32, 1, 15, 1, 24, 36))
    }

    @Test
    fun test_614() {
        val now = getPhoenixDateTime(2047, 5, 27, 1, 36, 29)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(32, 2, 12, 16, 9, 36))
    }

    @Test
    fun test_615() {
        val now = getPhoenixDateTime(2047, 5, 27, 22, 56, 51)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(32, 2, 13, 13, 29, 58))
    }

    @Test
    fun test_616() {
        val now = getPhoenixDateTime(2047, 5, 30, 20, 57, 49)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(32, 2, 16, 11, 30, 56))
    }

    @Test
    fun test_617() {
        val now = getPhoenixDateTime(2047, 6, 9, 19, 21, 47)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(32, 2, 26, 9, 54, 54))
    }

    @Test
    fun test_618() {
        val now = getPhoenixDateTime(2047, 6, 14, 6, 12, 34)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(32, 2, 30, 20, 45, 41))
    }

    @Test
    fun test_619() {
        val now = getPhoenixDateTime(2047, 7, 7, 0, 2, 5)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(32, 3, 22, 14, 35, 12))
    }

    @Test
    fun test_620() {
        val now = getPhoenixDateTime(2047, 8, 20, 16, 32, 35)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(32, 5, 6, 7, 5, 42))
    }

    @Test
    fun test_621() {
        val now = getPhoenixDateTime(2047, 8, 27, 11, 16, 32)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(32, 5, 13, 1, 49, 39))
    }

    @Test
    fun test_622() {
        val now = getPhoenixDateTime(2047, 9, 12, 9, 41, 20)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(32, 5, 29, 0, 14, 27))
    }

    @Test
    fun test_623() {
        val now = getPhoenixDateTime(2047, 10, 6, 22, 17, 1)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(32, 6, 22, 12, 50, 8))
    }

    @Test
    fun test_624() {
        val now = getPhoenixDateTime(2047, 10, 21, 19, 21, 4)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(32, 7, 7, 9, 54, 11))
    }

    @Test
    fun test_625() {
        val now = getPhoenixDateTime(2047, 12, 15, 13, 36, 33)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(32, 9, 1, 4, 9, 40))
    }

    @Test
    fun test_626() {
        val now = getPhoenixDateTime(2047, 12, 22, 3, 36, 56)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(32, 9, 7, 18, 10, 3))
    }

    @Test
    fun test_627() {
        val now = getPhoenixDateTime(2047, 12, 25, 15, 49, 4)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(32, 9, 11, 6, 22, 11))
    }

    @Test
    fun test_628() {
        val now = getPhoenixDateTime(2048, 2, 6, 23, 40, 36)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(32, 10, 23, 14, 13, 43))
    }

    @Test
    fun test_629() {
        val now = getPhoenixDateTime(2048, 2, 7, 17, 38, 6)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(32, 10, 24, 8, 11, 13))
    }

    @Test
    fun test_630() {
        val now = getPhoenixDateTime(2048, 3, 8, 19, 54, 48)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(32, 11, 23, 10, 27, 55))
    }

    @Test
    fun test_631() {
        val now = getPhoenixDateTime(2048, 4, 2, 11, 20, 21)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(33, 0, 19, 1, 53, 28))
    }

    @Test
    fun test_632() {
        val now = getPhoenixDateTime(2048, 4, 8, 12, 53, 27)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(33, 0, 25, 3, 26, 34))
    }

    @Test
    fun test_633() {
        val now = getPhoenixDateTime(2048, 5, 10, 12, 26, 56)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(33, 1, 26, 3, 0, 3))
    }

    @Test
    fun test_634() {
        val now = getPhoenixDateTime(2048, 5, 11, 20, 6, 6)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(33, 1, 27, 10, 39, 13))
    }

    @Test
    fun test_635() {
        val now = getPhoenixDateTime(2048, 6, 1, 12, 12, 0)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(33, 2, 18, 2, 45, 7))
    }

    @Test
    fun test_636() {
        val now = getPhoenixDateTime(2048, 6, 8, 16, 13, 10)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(33, 2, 25, 6, 46, 17))
    }

    @Test
    fun test_637() {
        val now = getPhoenixDateTime(2048, 6, 11, 11, 45, 50)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(33, 2, 28, 2, 18, 57))
    }

    @Test
    fun test_638() {
        val now = getPhoenixDateTime(2048, 6, 30, 6, 17, 21)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(33, 3, 15, 20, 50, 28))
    }

    @Test
    fun test_639() {
        val now = getPhoenixDateTime(2048, 7, 31, 0, 18, 57)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(33, 4, 16, 14, 52, 4))
    }

    @Test
    fun test_640() {
        val now = getPhoenixDateTime(2048, 9, 3, 11, 37, 12)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(33, 5, 20, 2, 10, 19))
    }

    @Test
    fun test_641() {
        val now = getPhoenixDateTime(2048, 9, 8, 7, 4, 48)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(33, 5, 24, 21, 37, 55))
    }

    @Test
    fun test_642() {
        val now = getPhoenixDateTime(2048, 9, 22, 8, 5, 50)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(33, 6, 7, 22, 38, 57))
    }

    @Test
    fun test_643() {
        val now = getPhoenixDateTime(2048, 10, 31, 7, 36, 42)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(33, 7, 16, 22, 9, 49))
    }

    @Test
    fun test_644() {
        val now = getPhoenixDateTime(2048, 11, 8, 3, 39, 41)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(33, 7, 24, 18, 12, 48))
    }

    @Test
    fun test_645() {
        val now = getPhoenixDateTime(2048, 11, 8, 17, 36, 21)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(33, 7, 25, 8, 9, 28))
    }

    @Test
    fun test_646() {
        val now = getPhoenixDateTime(2048, 11, 30, 11, 11, 7)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(33, 8, 16, 1, 44, 14))
    }

    @Test
    fun test_647() {
        val now = getPhoenixDateTime(2048, 12, 10, 8, 13, 35)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(33, 8, 25, 22, 46, 42))
    }

    @Test
    fun test_648() {
        val now = getPhoenixDateTime(2049, 1, 9, 8, 5, 8)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(33, 9, 25, 22, 38, 15))
    }

    @Test
    fun test_649() {
        val now = getPhoenixDateTime(2049, 1, 11, 19, 3, 3)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(33, 9, 28, 9, 36, 10))
    }

    @Test
    fun test_650() {
        val now = getPhoenixDateTime(2049, 1, 17, 7, 23, 54)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(33, 10, 2, 21, 57, 1))
    }

    @Test
    fun test_651() {
        val now = getPhoenixDateTime(2049, 3, 2, 22, 17, 8)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(33, 11, 16, 12, 50, 15))
    }

    @Test
    fun test_652() {
        val now = getPhoenixDateTime(2049, 3, 5, 23, 22, 21)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(33, 11, 19, 13, 55, 28))
    }

    @Test
    fun test_653() {
        val now = getPhoenixDateTime(2049, 3, 8, 2, 40, 21)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(33, 11, 21, 17, 13, 28))
    }

    @Test
    fun test_654() {
        val now = getPhoenixDateTime(2049, 3, 9, 14, 41, 31)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(33, 11, 23, 5, 14, 38))
    }

    @Test
    fun test_655() {
        val now = getPhoenixDateTime(2049, 3, 19, 3, 23, 29)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(34, 0, 4, 17, 56, 36))
    }

    @Test
    fun test_656() {
        val now = getPhoenixDateTime(2049, 3, 19, 8, 13, 21)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(34, 0, 4, 22, 46, 28))
    }

    @Test
    fun test_657() {
        val now = getPhoenixDateTime(2049, 3, 29, 11, 51, 45)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(34, 0, 15, 2, 24, 52))
    }

    @Test
    fun test_658() {
        val now = getPhoenixDateTime(2049, 4, 13, 7, 23, 32)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(34, 0, 29, 21, 56, 39))
    }

    @Test
    fun test_659() {
        val now = getPhoenixDateTime(2049, 4, 14, 15, 48, 37)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(34, 1, 0, 6, 21, 44))
    }

    @Test
    fun test_660() {
        val now = getPhoenixDateTime(2049, 4, 26, 2, 0, 18)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(34, 1, 11, 16, 33, 25))
    }

    @Test
    fun test_661() {
        val now = getPhoenixDateTime(2049, 4, 29, 16, 39, 29)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(34, 1, 15, 7, 12, 36))
    }

    @Test
    fun test_662() {
        val now = getPhoenixDateTime(2049, 5, 9, 21, 31, 31)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(34, 1, 25, 12, 4, 38))
    }

    @Test
    fun test_663() {
        val now = getPhoenixDateTime(2049, 5, 13, 6, 3, 58)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(34, 1, 28, 20, 37, 5))
    }

    @Test
    fun test_664() {
        val now = getPhoenixDateTime(2049, 6, 1, 16, 14, 19)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(34, 2, 18, 6, 47, 26))
    }

    @Test
    fun test_665() {
        val now = getPhoenixDateTime(2049, 7, 12, 2, 32, 41)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(34, 3, 27, 17, 5, 48))
    }

    @Test
    fun test_666() {
        val now = getPhoenixDateTime(2049, 7, 23, 5, 6, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(34, 4, 8, 19, 40, 0))
    }

    @Test
    fun test_667() {
        val now = getPhoenixDateTime(2049, 8, 12, 0, 27, 12)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(34, 4, 28, 15, 0, 19))
    }

    @Test
    fun test_668() {
        val now = getPhoenixDateTime(2049, 9, 7, 13, 8, 6)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(34, 5, 24, 3, 41, 13))
    }

    @Test
    fun test_669() {
        val now = getPhoenixDateTime(2049, 9, 16, 12, 22, 19)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(34, 6, 2, 2, 55, 26))
    }

    @Test
    fun test_670() {
        val now = getPhoenixDateTime(2049, 10, 9, 15, 20, 50)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(34, 6, 25, 5, 53, 57))
    }

    @Test
    fun test_671() {
        val now = getPhoenixDateTime(2049, 10, 10, 14, 30, 36)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(34, 6, 26, 5, 3, 43))
    }

    @Test
    fun test_672() {
        val now = getPhoenixDateTime(2049, 11, 15, 23, 53, 22)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(34, 8, 1, 14, 26, 29))
    }

    @Test
    fun test_673() {
        val now = getPhoenixDateTime(2049, 11, 18, 17, 15, 16)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(34, 8, 4, 7, 48, 23))
    }

    @Test
    fun test_674() {
        val now = getPhoenixDateTime(2049, 11, 28, 12, 13, 29)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(34, 8, 14, 2, 46, 36))
    }

    @Test
    fun test_675() {
        val now = getPhoenixDateTime(2049, 12, 11, 2, 7, 16)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(34, 8, 26, 16, 40, 23))
    }

    @Test
    fun test_676() {
        val now = getPhoenixDateTime(2050, 3, 1, 2, 19, 6)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(34, 11, 14, 16, 52, 13))
    }

    @Test
    fun test_677() {
        val now = getPhoenixDateTime(2050, 3, 5, 15, 11, 54)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(34, 11, 19, 5, 45, 1))
    }

    @Test
    fun test_678() {
        val now = getPhoenixDateTime(2050, 3, 23, 19, 10, 23)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(35, 0, 9, 9, 43, 30))
    }

    @Test
    fun test_679() {
        val now = getPhoenixDateTime(2050, 4, 2, 0, 53, 31)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(35, 0, 18, 15, 26, 38))
    }

    @Test
    fun test_680() {
        val now = getPhoenixDateTime(2050, 5, 5, 11, 52, 2)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(35, 1, 21, 2, 25, 9))
    }

    @Test
    fun test_681() {
        val now = getPhoenixDateTime(2050, 5, 19, 20, 17, 2)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(35, 2, 5, 10, 50, 9))
    }

    @Test
    fun test_682() {
        val now = getPhoenixDateTime(2050, 8, 8, 11, 55, 35)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(35, 4, 25, 2, 28, 42))
    }

    @Test
    fun test_683() {
        val now = getPhoenixDateTime(2050, 9, 1, 8, 2, 25)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(35, 5, 17, 22, 35, 32))
    }

    @Test
    fun test_684() {
        val now = getPhoenixDateTime(2050, 9, 13, 5, 38, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(35, 5, 29, 20, 12, 0))
    }

    @Test
    fun test_685() {
        val now = getPhoenixDateTime(2050, 10, 1, 10, 50, 33)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(35, 6, 17, 1, 23, 40))
    }

    @Test
    fun test_686() {
        val now = getPhoenixDateTime(2050, 10, 15, 7, 15, 47)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(35, 7, 0, 21, 48, 54))
    }

    @Test
    fun test_687() {
        val now = getPhoenixDateTime(2050, 11, 4, 22, 4, 42)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(35, 7, 21, 12, 37, 49))
    }

    @Test
    fun test_688() {
        val now = getPhoenixDateTime(2050, 11, 12, 11, 27, 51)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(35, 7, 29, 2, 0, 58))
    }

    @Test
    fun test_689() {
        val now = getPhoenixDateTime(2050, 12, 7, 13, 55, 5)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(35, 8, 23, 4, 28, 12))
    }

    @Test
    fun test_690() {
        val now = getPhoenixDateTime(2050, 12, 14, 5, 3, 36)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(35, 8, 29, 19, 36, 43))
    }

    @Test
    fun test_691() {
        val now = getPhoenixDateTime(2051, 1, 3, 11, 55, 59)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(35, 9, 20, 2, 29, 6))
    }

    @Test
    fun test_692() {
        val now = getPhoenixDateTime(2051, 1, 4, 17, 23, 46)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(35, 9, 21, 7, 56, 53))
    }

    @Test
    fun test_693() {
        val now = getPhoenixDateTime(2051, 1, 5, 21, 25, 48)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(35, 9, 22, 11, 58, 55))
    }

    @Test
    fun test_694() {
        val now = getPhoenixDateTime(2051, 2, 12, 19, 5, 8)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(35, 10, 29, 9, 38, 15))
    }

    @Test
    fun test_695() {
        val now = getPhoenixDateTime(2051, 3, 4, 10, 57, 27)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(35, 11, 18, 1, 30, 34))
    }

    @Test
    fun test_696() {
        val now = getPhoenixDateTime(2051, 3, 17, 17, 35, 37)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(36, 0, 3, 8, 8, 44))
    }

    @Test
    fun test_697() {
        val now = getPhoenixDateTime(2051, 4, 26, 6, 57, 48)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(36, 1, 11, 21, 30, 55))
    }

    @Test
    fun test_698() {
        val now = getPhoenixDateTime(2051, 5, 18, 18, 34, 55)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(36, 2, 4, 9, 8, 2))
    }

    @Test
    fun test_699() {
        val now = getPhoenixDateTime(2051, 6, 5, 20, 4, 51)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(36, 2, 22, 10, 37, 58))
    }

    @Test
    fun test_700() {
        val now = getPhoenixDateTime(2051, 6, 22, 22, 30, 25)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(36, 3, 8, 13, 3, 32))
    }

    @Test
    fun test_701() {
        val now = getPhoenixDateTime(2051, 7, 4, 13, 38, 57)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(36, 3, 20, 4, 12, 4))
    }

    @Test
    fun test_702() {
        val now = getPhoenixDateTime(2051, 7, 8, 14, 19, 0)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(36, 3, 24, 4, 52, 7))
    }

    @Test
    fun test_703() {
        val now = getPhoenixDateTime(2051, 7, 27, 5, 42, 5)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(36, 4, 12, 20, 15, 12))
    }

    @Test
    fun test_704() {
        val now = getPhoenixDateTime(2051, 9, 2, 5, 53, 31)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(36, 5, 18, 20, 26, 38))
    }

    @Test
    fun test_705() {
        val now = getPhoenixDateTime(2051, 9, 14, 6, 16, 10)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(36, 5, 30, 20, 49, 17))
    }

    @Test
    fun test_706() {
        val now = getPhoenixDateTime(2051, 10, 8, 1, 0, 13)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(36, 6, 23, 15, 33, 20))
    }

    @Test
    fun test_707() {
        val now = getPhoenixDateTime(2051, 10, 25, 2, 55, 58)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(36, 7, 10, 17, 29, 5))
    }

    @Test
    fun test_708() {
        val now = getPhoenixDateTime(2051, 11, 8, 18, 55, 14)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(36, 7, 25, 9, 28, 21))
    }

    @Test
    fun test_709() {
        val now = getPhoenixDateTime(2051, 12, 5, 11, 16, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(36, 8, 21, 1, 50, 0))
    }

    @Test
    fun test_710() {
        val now = getPhoenixDateTime(2052, 3, 7, 19, 1, 24)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(36, 11, 22, 9, 34, 31))
    }

    @Test
    fun test_711() {
        val now = getPhoenixDateTime(2052, 4, 2, 9, 16, 31)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(37, 0, 18, 23, 49, 38))
    }

    @Test
    fun test_712() {
        val now = getPhoenixDateTime(2052, 4, 18, 3, 36, 59)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(37, 1, 3, 18, 10, 6))
    }

    @Test
    fun test_713() {
        val now = getPhoenixDateTime(2052, 4, 21, 2, 0, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(37, 1, 6, 16, 34, 0))
    }

    @Test
    fun test_714() {
        val now = getPhoenixDateTime(2052, 4, 29, 19, 9, 33)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(37, 1, 15, 9, 42, 40))
    }

    @Test
    fun test_715() {
        val now = getPhoenixDateTime(2052, 5, 17, 17, 33, 31)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(37, 2, 3, 8, 6, 38))
    }

    @Test
    fun test_716() {
        val now = getPhoenixDateTime(2052, 5, 19, 3, 53, 10)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(37, 2, 4, 18, 26, 17))
    }

    @Test
    fun test_717() {
        val now = getPhoenixDateTime(2052, 5, 30, 5, 0, 12)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(37, 2, 15, 19, 33, 19))
    }

    @Test
    fun test_718() {
        val now = getPhoenixDateTime(2052, 6, 2, 21, 40, 19)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(37, 2, 19, 12, 13, 26))
    }

    @Test
    fun test_719() {
        val now = getPhoenixDateTime(2052, 6, 9, 19, 14, 3)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(37, 2, 26, 9, 47, 10))
    }

    @Test
    fun test_720() {
        val now = getPhoenixDateTime(2052, 6, 13, 18, 24, 25)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(37, 2, 30, 8, 57, 32))
    }

    @Test
    fun test_721() {
        val now = getPhoenixDateTime(2052, 6, 15, 15, 43, 43)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(37, 3, 1, 6, 16, 50))
    }

    @Test
    fun test_722() {
        val now = getPhoenixDateTime(2052, 6, 18, 21, 32, 46)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(37, 3, 4, 12, 5, 53))
    }

    @Test
    fun test_723() {
        val now = getPhoenixDateTime(2052, 7, 7, 13, 17, 28)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(37, 3, 23, 3, 50, 35))
    }

    @Test
    fun test_724() {
        val now = getPhoenixDateTime(2052, 8, 6, 18, 7, 29)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(37, 4, 23, 8, 40, 36))
    }

    @Test
    fun test_725() {
        val now = getPhoenixDateTime(2052, 8, 7, 2, 33, 5)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(37, 4, 23, 17, 6, 12))
    }

    @Test
    fun test_726() {
        val now = getPhoenixDateTime(2052, 9, 11, 20, 8, 31)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(37, 5, 28, 10, 41, 38))
    }

    @Test
    fun test_727() {
        val now = getPhoenixDateTime(2052, 9, 20, 9, 30, 27)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(37, 6, 6, 0, 3, 34))
    }

    @Test
    fun test_728() {
        val now = getPhoenixDateTime(2052, 10, 16, 7, 4, 17)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(37, 7, 1, 21, 37, 24))
    }

    @Test
    fun test_729() {
        val now = getPhoenixDateTime(2052, 10, 27, 0, 52, 18)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(37, 7, 12, 15, 25, 25))
    }

    @Test
    fun test_730() {
        val now = getPhoenixDateTime(2052, 10, 28, 21, 23, 39)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(37, 7, 14, 11, 56, 46))
    }

    @Test
    fun test_731() {
        val now = getPhoenixDateTime(2052, 11, 7, 7, 58, 59)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(37, 7, 23, 22, 32, 6))
    }

    @Test
    fun test_732() {
        val now = getPhoenixDateTime(2052, 11, 10, 3, 0, 10)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(37, 7, 26, 17, 33, 17))
    }

    @Test
    fun test_733() {
        val now = getPhoenixDateTime(2052, 11, 29, 7, 45, 18)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(37, 8, 14, 22, 18, 25))
    }

    @Test
    fun test_734() {
        val now = getPhoenixDateTime(2052, 12, 13, 9, 27, 24)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(37, 8, 29, 0, 0, 31))
    }

    @Test
    fun test_735() {
        val now = getPhoenixDateTime(2052, 12, 25, 19, 58, 49)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(37, 9, 11, 10, 31, 56))
    }

    @Test
    fun test_736() {
        val now = getPhoenixDateTime(2052, 12, 30, 10, 6, 16)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(37, 9, 16, 0, 39, 23))
    }

    @Test
    fun test_737() {
        val now = getPhoenixDateTime(2053, 1, 24, 7, 32, 4)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(37, 10, 9, 22, 5, 11))
    }

    @Test
    fun test_738() {
        val now = getPhoenixDateTime(2053, 1, 25, 3, 31, 59)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(37, 10, 10, 18, 5, 6))
    }

    @Test
    fun test_739() {
        val now = getPhoenixDateTime(2053, 2, 22, 19, 39, 0)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(37, 11, 8, 10, 12, 7))
    }

    @Test
    fun test_740() {
        val now = getPhoenixDateTime(2053, 3, 3, 13, 37, 51)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(37, 11, 17, 4, 10, 58))
    }

    @Test
    fun test_741() {
        val now = getPhoenixDateTime(2053, 3, 3, 18, 4, 42)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(37, 11, 17, 8, 37, 49))
    }

    @Test
    fun test_742() {
        val now = getPhoenixDateTime(2053, 3, 19, 10, 7, 31)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(38, 0, 5, 0, 40, 38))
    }

    @Test
    fun test_743() {
        val now = getPhoenixDateTime(2053, 4, 24, 2, 23, 2)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(38, 1, 9, 16, 56, 9))
    }

    @Test
    fun test_744() {
        val now = getPhoenixDateTime(2053, 5, 4, 18, 34, 48)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(38, 1, 20, 9, 7, 55))
    }

    @Test
    fun test_745() {
        val now = getPhoenixDateTime(2053, 5, 5, 23, 31, 13)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(38, 1, 21, 14, 4, 20))
    }

    @Test
    fun test_746() {
        val now = getPhoenixDateTime(2053, 5, 7, 21, 42, 48)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(38, 1, 23, 12, 15, 55))
    }

    @Test
    fun test_747() {
        val now = getPhoenixDateTime(2053, 5, 9, 7, 7, 32)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(38, 1, 24, 21, 40, 39))
    }

    @Test
    fun test_748() {
        val now = getPhoenixDateTime(2053, 5, 10, 6, 20, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(38, 1, 25, 20, 54, 0))
    }

    @Test
    fun test_749() {
        val now = getPhoenixDateTime(2053, 5, 30, 23, 5, 36)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(38, 2, 16, 13, 38, 43))
    }

    @Test
    fun test_750() {
        val now = getPhoenixDateTime(2053, 6, 10, 1, 32, 44)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(38, 2, 26, 16, 5, 51))
    }

    @Test
    fun test_751() {
        val now = getPhoenixDateTime(2053, 6, 27, 18, 17, 29)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(38, 3, 13, 8, 50, 36))
    }

    @Test
    fun test_752() {
        val now = getPhoenixDateTime(2053, 7, 15, 1, 21, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(38, 4, 0, 15, 55, 0))
    }

    @Test
    fun test_753() {
        val now = getPhoenixDateTime(2053, 7, 24, 13, 27, 56)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(38, 4, 10, 4, 1, 3))
    }

    @Test
    fun test_754() {
        val now = getPhoenixDateTime(2053, 8, 1, 19, 47, 17)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(38, 4, 18, 10, 20, 24))
    }

    @Test
    fun test_755() {
        val now = getPhoenixDateTime(2053, 8, 2, 7, 46, 35)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(38, 4, 18, 22, 19, 42))
    }

    @Test
    fun test_756() {
        val now = getPhoenixDateTime(2053, 8, 24, 7, 59, 22)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(38, 5, 9, 22, 32, 29))
    }

    @Test
    fun test_757() {
        val now = getPhoenixDateTime(2053, 9, 1, 23, 15, 39)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(38, 5, 18, 13, 48, 46))
    }

    @Test
    fun test_758() {
        val now = getPhoenixDateTime(2053, 10, 21, 6, 34, 55)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(38, 7, 6, 21, 8, 2))
    }

    @Test
    fun test_759() {
        val now = getPhoenixDateTime(2053, 11, 12, 11, 27, 49)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(38, 7, 29, 2, 0, 56))
    }

    @Test
    fun test_760() {
        val now = getPhoenixDateTime(2053, 11, 19, 20, 1, 1)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(38, 8, 5, 10, 34, 8))
    }

    @Test
    fun test_761() {
        val now = getPhoenixDateTime(2053, 12, 5, 5, 2, 34)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(38, 8, 20, 19, 35, 41))
    }

    @Test
    fun test_762() {
        val now = getPhoenixDateTime(2053, 12, 19, 10, 7, 28)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(38, 9, 5, 0, 40, 35))
    }

    @Test
    fun test_763() {
        val now = getPhoenixDateTime(2053, 12, 23, 3, 44, 0)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(38, 9, 8, 18, 17, 7))
    }

    @Test
    fun test_764() {
        val now = getPhoenixDateTime(2054, 1, 14, 13, 29, 44)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(38, 10, 0, 4, 2, 51))
    }

    @Test
    fun test_765() {
        val now = getPhoenixDateTime(2054, 3, 18, 7, 29, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(39, 0, 3, 22, 2, 59))
    }

    @Test
    fun test_766() {
        val now = getPhoenixDateTime(2054, 5, 1, 20, 29, 24)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(39, 1, 17, 11, 2, 31))
    }

    @Test
    fun test_767() {
        val now = getPhoenixDateTime(2054, 5, 3, 20, 23, 55)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(39, 1, 19, 10, 57, 2))
    }

    @Test
    fun test_768() {
        val now = getPhoenixDateTime(2054, 5, 19, 8, 58, 0)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(39, 2, 4, 23, 31, 7))
    }

    @Test
    fun test_769() {
        val now = getPhoenixDateTime(2054, 7, 14, 2, 4, 55)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(39, 3, 29, 16, 38, 2))
    }

    @Test
    fun test_770() {
        val now = getPhoenixDateTime(2054, 8, 5, 4, 24, 43)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(39, 4, 21, 18, 57, 50))
    }

    @Test
    fun test_771() {
        val now = getPhoenixDateTime(2054, 9, 8, 21, 38, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(39, 5, 25, 12, 12, 0))
    }

    @Test
    fun test_772() {
        val now = getPhoenixDateTime(2054, 10, 14, 9, 49, 10)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(39, 7, 0, 0, 22, 17))
    }

    @Test
    fun test_773() {
        val now = getPhoenixDateTime(2054, 11, 30, 15, 57, 55)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(39, 8, 16, 6, 31, 2))
    }

    @Test
    fun test_774() {
        val now = getPhoenixDateTime(2054, 12, 4, 10, 36, 42)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(39, 8, 20, 1, 9, 49))
    }

    @Test
    fun test_775() {
        val now = getPhoenixDateTime(2055, 1, 23, 12, 39, 42)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(39, 10, 9, 3, 12, 49))
    }

    @Test
    fun test_776() {
        val now = getPhoenixDateTime(2055, 2, 22, 8, 31, 42)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(39, 11, 7, 23, 4, 49))
    }

    @Test
    fun test_777() {
        val now = getPhoenixDateTime(2055, 3, 7, 8, 0, 5)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(39, 11, 20, 22, 33, 12))
    }

    @Test
    fun test_778() {
        val now = getPhoenixDateTime(2055, 3, 11, 1, 6, 6)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(39, 11, 24, 15, 39, 13))
    }

    @Test
    fun test_779() {
        val now = getPhoenixDateTime(2055, 3, 26, 3, 22, 36)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(40, 0, 11, 17, 55, 43))
    }

    @Test
    fun test_780() {
        val now = getPhoenixDateTime(2055, 4, 10, 11, 44, 2)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(40, 0, 27, 2, 17, 9))
    }

    @Test
    fun test_781() {
        val now = getPhoenixDateTime(2055, 4, 17, 13, 22, 13)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(40, 1, 3, 3, 55, 20))
    }

    @Test
    fun test_782() {
        val now = getPhoenixDateTime(2055, 4, 29, 22, 16, 22)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(40, 1, 15, 12, 49, 29))
    }

    @Test
    fun test_783() {
        val now = getPhoenixDateTime(2055, 4, 30, 22, 26, 58)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(40, 1, 16, 13, 0, 5))
    }

    @Test
    fun test_784() {
        val now = getPhoenixDateTime(2055, 5, 18, 14, 11, 15)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(40, 2, 4, 4, 44, 22))
    }

    @Test
    fun test_785() {
        val now = getPhoenixDateTime(2055, 5, 26, 5, 32, 1)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(40, 2, 11, 20, 5, 8))
    }

    @Test
    fun test_786() {
        val now = getPhoenixDateTime(2055, 6, 14, 18, 49, 14)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(40, 3, 0, 9, 22, 21))
    }

    @Test
    fun test_787() {
        val now = getPhoenixDateTime(2055, 6, 18, 21, 11, 13)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(40, 3, 4, 11, 44, 20))
    }

    @Test
    fun test_788() {
        val now = getPhoenixDateTime(2055, 7, 12, 13, 11, 58)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(40, 3, 28, 3, 45, 5))
    }

    @Test
    fun test_789() {
        val now = getPhoenixDateTime(2055, 7, 22, 19, 47, 55)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(40, 4, 8, 10, 21, 2))
    }

    @Test
    fun test_790() {
        val now = getPhoenixDateTime(2055, 8, 28, 22, 4, 56)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(40, 5, 14, 12, 38, 3))
    }

    @Test
    fun test_791() {
        val now = getPhoenixDateTime(2055, 9, 24, 9, 39, 37)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(40, 6, 10, 0, 12, 44))
    }

    @Test
    fun test_792() {
        val now = getPhoenixDateTime(2055, 10, 22, 19, 13, 54)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(40, 7, 8, 9, 47, 1))
    }

    @Test
    fun test_793() {
        val now = getPhoenixDateTime(2055, 10, 30, 6, 7, 46)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(40, 7, 15, 20, 40, 53))
    }

    @Test
    fun test_794() {
        val now = getPhoenixDateTime(2055, 11, 13, 5, 28, 58)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(40, 7, 29, 20, 2, 5))
    }

    @Test
    fun test_795() {
        val now = getPhoenixDateTime(2055, 11, 19, 2, 54, 30)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(40, 8, 4, 17, 27, 37))
    }

    @Test
    fun test_796() {
        val now = getPhoenixDateTime(2056, 1, 13, 8, 56, 43)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(40, 9, 29, 23, 29, 50))
    }

    @Test
    fun test_797() {
        val now = getPhoenixDateTime(2056, 1, 27, 6, 10, 57)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(40, 10, 12, 20, 44, 4))
    }

    @Test
    fun test_798() {
        val now = getPhoenixDateTime(2056, 2, 5, 20, 34, 29)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(40, 10, 22, 11, 7, 36))
    }

    @Test
    fun test_799() {
        val now = getPhoenixDateTime(2056, 2, 20, 22, 43, 55)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(40, 11, 6, 13, 17, 2))
    }

    @Test
    fun test_800() {
        val now = getPhoenixDateTime(2056, 3, 8, 16, 56, 9)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(40, 11, 23, 7, 29, 16))
    }

    @Test
    fun test_801() {
        val now = getPhoenixDateTime(2056, 3, 16, 20, 7, 40)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(41, 0, 2, 10, 40, 47))
    }

    @Test
    fun test_802() {
        val now = getPhoenixDateTime(2056, 3, 17, 15, 59, 50)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(41, 0, 3, 6, 32, 57))
    }

    @Test
    fun test_803() {
        val now = getPhoenixDateTime(2056, 4, 5, 17, 26, 10)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(41, 0, 22, 7, 59, 17))
    }

    @Test
    fun test_804() {
        val now = getPhoenixDateTime(2056, 4, 17, 5, 40, 14)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(41, 1, 2, 20, 13, 21))
    }

    @Test
    fun test_805() {
        val now = getPhoenixDateTime(2056, 4, 17, 18, 21, 39)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(41, 1, 3, 8, 54, 46))
    }

    @Test
    fun test_806() {
        val now = getPhoenixDateTime(2056, 4, 22, 16, 42, 8)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(41, 1, 8, 7, 15, 15))
    }

    @Test
    fun test_807() {
        val now = getPhoenixDateTime(2056, 4, 28, 9, 18, 0)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(41, 1, 13, 23, 51, 7))
    }

    @Test
    fun test_808() {
        val now = getPhoenixDateTime(2056, 5, 20, 20, 0, 11)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(41, 2, 6, 10, 33, 18))
    }

    @Test
    fun test_809() {
        val now = getPhoenixDateTime(2056, 6, 12, 20, 13, 37)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(41, 2, 29, 10, 46, 44))
    }

    @Test
    fun test_810() {
        val now = getPhoenixDateTime(2056, 6, 18, 8, 51, 41)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(41, 3, 3, 23, 24, 48))
    }

    @Test
    fun test_811() {
        val now = getPhoenixDateTime(2056, 7, 4, 2, 7, 56)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(41, 3, 19, 16, 41, 3))
    }

    @Test
    fun test_812() {
        val now = getPhoenixDateTime(2056, 7, 4, 10, 51, 8)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(41, 3, 20, 1, 24, 15))
    }

    @Test
    fun test_813() {
        val now = getPhoenixDateTime(2056, 7, 8, 23, 40, 30)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(41, 3, 24, 14, 13, 37))
    }

    @Test
    fun test_814() {
        val now = getPhoenixDateTime(2056, 9, 26, 2, 36, 11)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(41, 6, 11, 17, 9, 18))
    }

    @Test
    fun test_815() {
        val now = getPhoenixDateTime(2056, 10, 1, 19, 59, 41)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(41, 6, 17, 10, 32, 48))
    }

    @Test
    fun test_816() {
        val now = getPhoenixDateTime(2056, 10, 23, 9, 27, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(41, 7, 9, 0, 1, 0))
    }

    @Test
    fun test_817() {
        val now = getPhoenixDateTime(2056, 11, 13, 1, 2, 3)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(41, 7, 29, 15, 35, 10))
    }

    @Test
    fun test_818() {
        val now = getPhoenixDateTime(2056, 11, 18, 12, 18, 24)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(41, 8, 4, 2, 51, 31))
    }

    @Test
    fun test_819() {
        val now = getPhoenixDateTime(2056, 11, 26, 10, 22, 15)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(41, 8, 12, 0, 55, 22))
    }

    @Test
    fun test_820() {
        val now = getPhoenixDateTime(2056, 12, 5, 4, 2, 59)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(41, 8, 20, 18, 36, 6))
    }

    @Test
    fun test_821() {
        val now = getPhoenixDateTime(2056, 12, 26, 17, 9, 25)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(41, 9, 12, 7, 42, 32))
    }

    @Test
    fun test_822() {
        val now = getPhoenixDateTime(2056, 12, 30, 1, 0, 43)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(41, 9, 15, 15, 33, 50))
    }

    @Test
    fun test_823() {
        val now = getPhoenixDateTime(2057, 1, 28, 1, 18, 7)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(41, 10, 13, 15, 51, 14))
    }

    @Test
    fun test_824() {
        val now = getPhoenixDateTime(2057, 2, 16, 16, 28, 47)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(41, 11, 2, 7, 1, 54))
    }

    @Test
    fun test_825() {
        val now = getPhoenixDateTime(2057, 2, 17, 21, 47, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(41, 11, 3, 12, 20, 59))
    }

    @Test
    fun test_826() {
        val now = getPhoenixDateTime(2057, 3, 2, 0, 6, 43)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(41, 11, 15, 14, 39, 50))
    }

    @Test
    fun test_827() {
        val now = getPhoenixDateTime(2057, 4, 18, 11, 42, 23)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(42, 1, 4, 2, 15, 30))
    }

    @Test
    fun test_828() {
        val now = getPhoenixDateTime(2057, 4, 23, 4, 35, 48)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(42, 1, 8, 19, 8, 55))
    }

    @Test
    fun test_829() {
        val now = getPhoenixDateTime(2057, 4, 26, 12, 53, 58)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(42, 1, 12, 3, 27, 5))
    }

    @Test
    fun test_830() {
        val now = getPhoenixDateTime(2057, 5, 6, 10, 23, 14)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(42, 1, 22, 0, 56, 21))
    }

    @Test
    fun test_831() {
        val now = getPhoenixDateTime(2057, 5, 27, 19, 47, 43)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(42, 2, 13, 10, 20, 50))
    }

    @Test
    fun test_832() {
        val now = getPhoenixDateTime(2057, 5, 29, 11, 1, 33)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(42, 2, 15, 1, 34, 40))
    }

    @Test
    fun test_833() {
        val now = getPhoenixDateTime(2057, 6, 17, 22, 40, 38)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(42, 3, 3, 13, 13, 45))
    }

    @Test
    fun test_834() {
        val now = getPhoenixDateTime(2057, 6, 26, 22, 24, 3)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(42, 3, 12, 12, 57, 10))
    }

    @Test
    fun test_835() {
        val now = getPhoenixDateTime(2057, 7, 14, 0, 24, 50)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(42, 3, 29, 14, 57, 57))
    }

    @Test
    fun test_836() {
        val now = getPhoenixDateTime(2057, 7, 17, 19, 6, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(42, 4, 3, 9, 40, 0))
    }

    @Test
    fun test_837() {
        val now = getPhoenixDateTime(2057, 9, 18, 6, 25, 23)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(42, 6, 3, 20, 58, 30))
    }

    @Test
    fun test_838() {
        val now = getPhoenixDateTime(2057, 11, 18, 6, 34, 19)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(42, 8, 3, 21, 7, 26))
    }

    @Test
    fun test_839() {
        val now = getPhoenixDateTime(2057, 12, 20, 14, 24, 58)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(42, 9, 6, 4, 58, 5))
    }

    @Test
    fun test_840() {
        val now = getPhoenixDateTime(2058, 1, 11, 9, 26, 24)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(42, 9, 27, 23, 59, 31))
    }

    @Test
    fun test_841() {
        val now = getPhoenixDateTime(2058, 1, 31, 17, 0, 16)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(42, 10, 17, 7, 33, 23))
    }

    @Test
    fun test_842() {
        val now = getPhoenixDateTime(2058, 4, 21, 9, 2, 39)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(43, 1, 6, 23, 35, 46))
    }

    @Test
    fun test_843() {
        val now = getPhoenixDateTime(2058, 5, 25, 16, 48, 8)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(43, 2, 11, 7, 21, 15))
    }

    @Test
    fun test_844() {
        val now = getPhoenixDateTime(2058, 6, 1, 1, 11, 9)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(43, 2, 17, 15, 44, 16))
    }

    @Test
    fun test_845() {
        val now = getPhoenixDateTime(2058, 7, 4, 16, 41, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(43, 3, 20, 7, 14, 59))
    }

    @Test
    fun test_846() {
        val now = getPhoenixDateTime(2058, 7, 8, 21, 4, 38)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(43, 3, 24, 11, 37, 45))
    }

    @Test
    fun test_847() {
        val now = getPhoenixDateTime(2058, 7, 11, 20, 29, 58)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(43, 3, 27, 11, 3, 5))
    }

    @Test
    fun test_848() {
        val now = getPhoenixDateTime(2058, 7, 14, 17, 13, 24)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(43, 4, 0, 7, 46, 31))
    }

    @Test
    fun test_849() {
        val now = getPhoenixDateTime(2058, 7, 19, 12, 59, 36)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(43, 4, 5, 3, 32, 43))
    }

    @Test
    fun test_850() {
        val now = getPhoenixDateTime(2058, 7, 19, 20, 32, 29)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(43, 4, 5, 11, 5, 36))
    }

    @Test
    fun test_851() {
        val now = getPhoenixDateTime(2058, 7, 24, 14, 2, 11)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(43, 4, 10, 4, 35, 18))
    }

    @Test
    fun test_852() {
        val now = getPhoenixDateTime(2058, 8, 5, 5, 49, 50)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(43, 4, 21, 20, 22, 57))
    }

    @Test
    fun test_853() {
        val now = getPhoenixDateTime(2058, 8, 7, 2, 17, 54)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(43, 4, 23, 16, 51, 1))
    }

    @Test
    fun test_854() {
        val now = getPhoenixDateTime(2058, 8, 20, 0, 36, 9)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(43, 5, 5, 15, 9, 16))
    }

    @Test
    fun test_855() {
        val now = getPhoenixDateTime(2058, 8, 26, 17, 39, 40)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(43, 5, 12, 8, 12, 47))
    }

    @Test
    fun test_856() {
        val now = getPhoenixDateTime(2058, 9, 7, 8, 39, 37)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(43, 5, 23, 23, 12, 44))
    }

    @Test
    fun test_857() {
        val now = getPhoenixDateTime(2058, 9, 18, 11, 15, 4)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(43, 6, 4, 1, 48, 11))
    }

    @Test
    fun test_858() {
        val now = getPhoenixDateTime(2058, 9, 26, 3, 42, 30)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(43, 6, 11, 18, 15, 37))
    }

    @Test
    fun test_859() {
        val now = getPhoenixDateTime(2058, 9, 29, 19, 50, 48)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(43, 6, 15, 10, 23, 55))
    }

    @Test
    fun test_860() {
        val now = getPhoenixDateTime(2058, 10, 23, 2, 32, 8)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(43, 7, 8, 17, 5, 15))
    }

    @Test
    fun test_861() {
        val now = getPhoenixDateTime(2058, 11, 15, 4, 14, 31)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(43, 8, 0, 18, 47, 38))
    }

    @Test
    fun test_862() {
        val now = getPhoenixDateTime(2058, 11, 23, 3, 54, 15)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(43, 8, 8, 18, 27, 22))
    }

    @Test
    fun test_863() {
        val now = getPhoenixDateTime(2059, 1, 9, 20, 41, 48)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(43, 9, 26, 11, 14, 55))
    }

    @Test
    fun test_864() {
        val now = getPhoenixDateTime(2059, 1, 11, 6, 54, 28)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(43, 9, 27, 21, 27, 35))
    }

    @Test
    fun test_865() {
        val now = getPhoenixDateTime(2059, 2, 14, 20, 4, 36)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(43, 11, 0, 10, 37, 43))
    }

    @Test
    fun test_866() {
        val now = getPhoenixDateTime(2059, 4, 6, 1, 47, 57)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(44, 0, 22, 16, 21, 4))
    }

    @Test
    fun test_867() {
        val now = getPhoenixDateTime(2059, 4, 18, 16, 52, 21)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(44, 1, 4, 7, 25, 28))
    }

    @Test
    fun test_868() {
        val now = getPhoenixDateTime(2059, 4, 21, 11, 42, 39)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(44, 1, 7, 2, 15, 46))
    }

    @Test
    fun test_869() {
        val now = getPhoenixDateTime(2059, 4, 28, 23, 44, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(44, 1, 14, 14, 17, 59))
    }

    @Test
    fun test_870() {
        val now = getPhoenixDateTime(2059, 4, 29, 2, 53, 59)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(44, 1, 14, 17, 27, 6))
    }

    @Test
    fun test_871() {
        val now = getPhoenixDateTime(2059, 7, 26, 16, 17, 16)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(44, 4, 12, 6, 50, 23))
    }

    @Test
    fun test_872() {
        val now = getPhoenixDateTime(2059, 8, 5, 11, 2, 39)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(44, 4, 22, 1, 35, 46))
    }

    @Test
    fun test_873() {
        val now = getPhoenixDateTime(2059, 8, 16, 14, 39, 35)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(44, 5, 2, 5, 12, 42))
    }

    @Test
    fun test_874() {
        val now = getPhoenixDateTime(2059, 9, 13, 8, 19, 27)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(44, 5, 29, 22, 52, 34))
    }

    @Test
    fun test_875() {
        val now = getPhoenixDateTime(2059, 9, 28, 13, 1, 38)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(44, 6, 14, 3, 34, 45))
    }

    @Test
    fun test_876() {
        val now = getPhoenixDateTime(2059, 10, 3, 1, 52, 2)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(44, 6, 18, 16, 25, 9))
    }

    @Test
    fun test_877() {
        val now = getPhoenixDateTime(2059, 11, 5, 4, 4, 5)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(44, 7, 21, 18, 37, 12))
    }

    @Test
    fun test_878() {
        val now = getPhoenixDateTime(2059, 11, 25, 0, 5, 40)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(44, 8, 10, 14, 38, 47))
    }

    @Test
    fun test_879() {
        val now = getPhoenixDateTime(2059, 12, 28, 21, 30, 27)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(44, 9, 14, 12, 3, 34))
    }

    @Test
    fun test_880() {
        val now = getPhoenixDateTime(2060, 2, 14, 15, 10, 27)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(44, 11, 0, 5, 43, 34))
    }

    @Test
    fun test_881() {
        val now = getPhoenixDateTime(2060, 3, 10, 2, 31, 14)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(44, 11, 24, 17, 4, 21))
    }

    @Test
    fun test_882() {
        val now = getPhoenixDateTime(2060, 3, 12, 16, 49, 32)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(44, 11, 27, 7, 22, 39))
    }

    @Test
    fun test_883() {
        val now = getPhoenixDateTime(2060, 6, 16, 5, 19, 22)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(45, 3, 1, 19, 52, 29))
    }

    @Test
    fun test_884() {
        val now = getPhoenixDateTime(2060, 6, 27, 8, 50, 47)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(45, 3, 12, 23, 23, 54))
    }

    @Test
    fun test_885() {
        val now = getPhoenixDateTime(2060, 7, 16, 2, 22, 42)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(45, 4, 1, 16, 55, 49))
    }

    @Test
    fun test_886() {
        val now = getPhoenixDateTime(2060, 10, 12, 3, 50, 38)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(45, 6, 27, 18, 23, 45))
    }

    @Test
    fun test_887() {
        val now = getPhoenixDateTime(2060, 11, 6, 3, 3, 59)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(45, 7, 22, 17, 37, 6))
    }

    @Test
    fun test_888() {
        val now = getPhoenixDateTime(2060, 11, 24, 17, 7, 35)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(45, 8, 10, 7, 40, 42))
    }

    @Test
    fun test_889() {
        val now = getPhoenixDateTime(2060, 12, 7, 2, 41, 17)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(45, 8, 22, 17, 14, 24))
    }

    @Test
    fun test_890() {
        val now = getPhoenixDateTime(2061, 1, 20, 0, 15, 19)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(45, 10, 5, 14, 48, 26))
    }

    @Test
    fun test_891() {
        val now = getPhoenixDateTime(2061, 2, 13, 7, 13, 11)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(45, 10, 29, 21, 46, 18))
    }

    @Test
    fun test_892() {
        val now = getPhoenixDateTime(2061, 2, 26, 17, 17, 8)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(45, 11, 12, 7, 50, 15))
    }

    @Test
    fun test_893() {
        val now = getPhoenixDateTime(2061, 3, 7, 7, 21, 4)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(45, 11, 20, 21, 54, 11))
    }

    @Test
    fun test_894() {
        val now = getPhoenixDateTime(2061, 3, 25, 17, 16, 11)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(46, 0, 11, 7, 49, 18))
    }

    @Test
    fun test_895() {
        val now = getPhoenixDateTime(2061, 3, 26, 5, 26, 0)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(46, 0, 11, 19, 59, 7))
    }

    @Test
    fun test_896() {
        val now = getPhoenixDateTime(2061, 4, 10, 3, 48, 33)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(46, 0, 26, 18, 21, 40))
    }

    @Test
    fun test_897() {
        val now = getPhoenixDateTime(2061, 5, 14, 18, 49, 19)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(46, 2, 0, 9, 22, 26))
    }

    @Test
    fun test_898() {
        val now = getPhoenixDateTime(2061, 6, 21, 13, 22, 26)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(46, 3, 7, 3, 55, 33))
    }

    @Test
    fun test_899() {
        val now = getPhoenixDateTime(2061, 7, 1, 20, 43, 48)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(46, 3, 17, 11, 16, 55))
    }

    @Test
    fun test_900() {
        val now = getPhoenixDateTime(2061, 7, 26, 11, 13, 9)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(46, 4, 12, 1, 46, 16))
    }

    @Test
    fun test_901() {
        val now = getPhoenixDateTime(2061, 7, 28, 4, 55, 13)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(46, 4, 13, 19, 28, 20))
    }

    @Test
    fun test_902() {
        val now = getPhoenixDateTime(2061, 7, 30, 2, 46, 25)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(46, 4, 15, 17, 19, 32))
    }

    @Test
    fun test_903() {
        val now = getPhoenixDateTime(2061, 8, 8, 17, 35, 37)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(46, 4, 25, 8, 8, 44))
    }

    @Test
    fun test_904() {
        val now = getPhoenixDateTime(2061, 8, 13, 22, 57, 44)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(46, 4, 30, 13, 30, 51))
    }

    @Test
    fun test_905() {
        val now = getPhoenixDateTime(2061, 8, 15, 18, 54, 23)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(46, 5, 1, 9, 27, 30))
    }

    @Test
    fun test_906() {
        val now = getPhoenixDateTime(2061, 10, 5, 18, 39, 53)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(46, 6, 21, 9, 13, 0))
    }

    @Test
    fun test_907() {
        val now = getPhoenixDateTime(2061, 10, 11, 7, 24, 36)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(46, 6, 26, 21, 57, 43))
    }

    @Test
    fun test_908() {
        val now = getPhoenixDateTime(2061, 10, 11, 12, 38, 16)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(46, 6, 27, 3, 11, 23))
    }

    @Test
    fun test_909() {
        val now = getPhoenixDateTime(2061, 10, 21, 0, 5, 56)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(46, 7, 6, 14, 39, 3))
    }

    @Test
    fun test_910() {
        val now = getPhoenixDateTime(2061, 12, 15, 17, 16, 26)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(46, 9, 1, 7, 49, 33))
    }

    @Test
    fun test_911() {
        val now = getPhoenixDateTime(2061, 12, 30, 7, 55, 39)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(46, 9, 15, 22, 28, 46))
    }

    @Test
    fun test_912() {
        val now = getPhoenixDateTime(2062, 1, 5, 18, 3, 13)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(46, 9, 22, 8, 36, 20))
    }

    @Test
    fun test_913() {
        val now = getPhoenixDateTime(2062, 1, 8, 6, 9, 18)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(46, 9, 24, 20, 42, 25))
    }

    @Test
    fun test_914() {
        val now = getPhoenixDateTime(2062, 1, 24, 13, 3, 16)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(46, 10, 10, 3, 36, 23))
    }

    @Test
    fun test_915() {
        val now = getPhoenixDateTime(2062, 1, 25, 8, 29, 35)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(46, 10, 10, 23, 2, 42))
    }

    @Test
    fun test_916() {
        val now = getPhoenixDateTime(2062, 1, 28, 4, 12, 40)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(46, 10, 13, 18, 45, 47))
    }

    @Test
    fun test_917() {
        val now = getPhoenixDateTime(2062, 3, 23, 14, 20, 41)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(47, 0, 9, 4, 53, 48))
    }

    @Test
    fun test_918() {
        val now = getPhoenixDateTime(2062, 4, 5, 20, 30, 48)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(47, 0, 22, 11, 3, 55))
    }

    @Test
    fun test_919() {
        val now = getPhoenixDateTime(2062, 4, 10, 17, 47, 36)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(47, 0, 27, 8, 20, 43))
    }

    @Test
    fun test_920() {
        val now = getPhoenixDateTime(2062, 4, 10, 20, 54, 22)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(47, 0, 27, 11, 27, 29))
    }

    @Test
    fun test_921() {
        val now = getPhoenixDateTime(2062, 4, 30, 10, 43, 25)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(47, 1, 16, 1, 16, 32))
    }

    @Test
    fun test_922() {
        val now = getPhoenixDateTime(2062, 5, 19, 1, 55, 29)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(47, 2, 4, 16, 28, 36))
    }

    @Test
    fun test_923() {
        val now = getPhoenixDateTime(2062, 5, 22, 11, 23, 45)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(47, 2, 8, 1, 56, 52))
    }

    @Test
    fun test_924() {
        val now = getPhoenixDateTime(2062, 6, 15, 11, 25, 46)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(47, 3, 1, 1, 58, 53))
    }

    @Test
    fun test_925() {
        val now = getPhoenixDateTime(2062, 6, 19, 5, 18, 50)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(47, 3, 4, 19, 51, 57))
    }

    @Test
    fun test_926() {
        val now = getPhoenixDateTime(2062, 7, 8, 2, 15, 12)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(47, 3, 23, 16, 48, 19))
    }

    @Test
    fun test_927() {
        val now = getPhoenixDateTime(2062, 8, 4, 12, 3, 51)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(47, 4, 21, 2, 36, 58))
    }

    @Test
    fun test_928() {
        val now = getPhoenixDateTime(2062, 8, 7, 23, 56, 9)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(47, 4, 24, 14, 29, 16))
    }

    @Test
    fun test_929() {
        val now = getPhoenixDateTime(2062, 8, 14, 4, 6, 16)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(47, 4, 30, 18, 39, 23))
    }

    @Test
    fun test_930() {
        val now = getPhoenixDateTime(2062, 8, 22, 19, 52, 31)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(47, 5, 8, 10, 25, 38))
    }

    @Test
    fun test_931() {
        val now = getPhoenixDateTime(2062, 9, 9, 9, 45, 34)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(47, 5, 26, 0, 18, 41))
    }

    @Test
    fun test_932() {
        val now = getPhoenixDateTime(2062, 9, 12, 1, 2, 55)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(47, 5, 28, 15, 36, 2))
    }

    @Test
    fun test_933() {
        val now = getPhoenixDateTime(2062, 9, 12, 7, 47, 52)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(47, 5, 28, 22, 20, 59))
    }

    @Test
    fun test_934() {
        val now = getPhoenixDateTime(2062, 10, 14, 9, 56, 55)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(47, 7, 0, 0, 30, 2))
    }

    @Test
    fun test_935() {
        val now = getPhoenixDateTime(2062, 11, 14, 13, 22, 46)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(47, 8, 0, 3, 55, 53))
    }

    @Test
    fun test_936() {
        val now = getPhoenixDateTime(2062, 12, 18, 23, 21, 7)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(47, 9, 4, 13, 54, 14))
    }

    @Test
    fun test_937() {
        val now = getPhoenixDateTime(2062, 12, 26, 17, 33, 33)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(47, 9, 12, 8, 6, 40))
    }

    @Test
    fun test_938() {
        val now = getPhoenixDateTime(2063, 2, 2, 8, 53, 58)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(47, 10, 18, 23, 27, 5))
    }

    @Test
    fun test_939() {
        val now = getPhoenixDateTime(2063, 2, 5, 12, 45, 39)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(47, 10, 22, 3, 18, 46))
    }

    @Test
    fun test_940() {
        val now = getPhoenixDateTime(2063, 2, 23, 5, 20, 58)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(47, 11, 8, 19, 54, 5))
    }

    @Test
    fun test_941() {
        val now = getPhoenixDateTime(2063, 3, 18, 2, 38, 7)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(48, 0, 3, 17, 11, 14))
    }

    @Test
    fun test_942() {
        val now = getPhoenixDateTime(2063, 4, 2, 11, 18, 54)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(48, 0, 19, 1, 52, 1))
    }

    @Test
    fun test_943() {
        val now = getPhoenixDateTime(2063, 4, 9, 8, 58, 18)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(48, 0, 25, 23, 31, 25))
    }

    @Test
    fun test_944() {
        val now = getPhoenixDateTime(2063, 4, 9, 21, 51, 2)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(48, 0, 26, 12, 24, 9))
    }

    @Test
    fun test_945() {
        val now = getPhoenixDateTime(2063, 4, 13, 1, 42, 33)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(48, 0, 29, 16, 15, 40))
    }

    @Test
    fun test_946() {
        val now = getPhoenixDateTime(2063, 5, 25, 7, 44, 4)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(48, 2, 10, 22, 17, 11))
    }

    @Test
    fun test_947() {
        val now = getPhoenixDateTime(2063, 5, 26, 14, 37, 41)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(48, 2, 12, 5, 10, 48))
    }

    @Test
    fun test_948() {
        val now = getPhoenixDateTime(2063, 6, 4, 2, 39, 16)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(48, 2, 20, 17, 12, 23))
    }

    @Test
    fun test_949() {
        val now = getPhoenixDateTime(2063, 6, 13, 2, 2, 17)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(48, 2, 29, 16, 35, 24))
    }

    @Test
    fun test_950() {
        val now = getPhoenixDateTime(2063, 7, 8, 6, 14, 11)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(48, 3, 23, 20, 47, 18))
    }

    @Test
    fun test_951() {
        val now = getPhoenixDateTime(2063, 8, 8, 0, 45, 42)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(48, 4, 24, 15, 18, 49))
    }

    @Test
    fun test_952() {
        val now = getPhoenixDateTime(2063, 8, 24, 4, 37, 55)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(48, 5, 9, 19, 11, 2))
    }

    @Test
    fun test_953() {
        val now = getPhoenixDateTime(2063, 9, 3, 14, 22, 4)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(48, 5, 20, 4, 55, 11))
    }

    @Test
    fun test_954() {
        val now = getPhoenixDateTime(2063, 9, 8, 2, 13, 27)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(48, 5, 24, 16, 46, 34))
    }

    @Test
    fun test_955() {
        val now = getPhoenixDateTime(2063, 9, 9, 9, 4, 55)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(48, 5, 25, 23, 38, 2))
    }

    @Test
    fun test_956() {
        val now = getPhoenixDateTime(2063, 9, 21, 23, 7, 24)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(48, 6, 7, 13, 40, 31))
    }

    @Test
    fun test_957() {
        val now = getPhoenixDateTime(2063, 10, 10, 19, 39, 28)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(48, 6, 26, 10, 12, 35))
    }

    @Test
    fun test_958() {
        val now = getPhoenixDateTime(2063, 11, 16, 9, 47, 50)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(48, 8, 2, 0, 20, 57))
    }

    @Test
    fun test_959() {
        val now = getPhoenixDateTime(2063, 11, 23, 21, 41, 54)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(48, 8, 9, 12, 15, 1))
    }

    @Test
    fun test_960() {
        val now = getPhoenixDateTime(2063, 12, 16, 19, 47, 24)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(48, 9, 2, 10, 20, 31))
    }

    @Test
    fun test_961() {
        val now = getPhoenixDateTime(2063, 12, 25, 20, 21, 8)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(48, 9, 11, 10, 54, 15))
    }

    @Test
    fun test_962() {
        val now = getPhoenixDateTime(2063, 12, 26, 8, 51, 26)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(48, 9, 11, 23, 24, 33))
    }

    @Test
    fun test_963() {
        val now = getPhoenixDateTime(2063, 12, 26, 14, 14, 6)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(48, 9, 12, 4, 47, 13))
    }

    @Test
    fun test_964() {
        val now = getPhoenixDateTime(2063, 12, 27, 11, 9, 30)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(48, 9, 13, 1, 42, 37))
    }

    @Test
    fun test_965() {
        val now = getPhoenixDateTime(2064, 2, 1, 17, 8, 49)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(48, 10, 18, 7, 41, 56))
    }

    @Test
    fun test_966() {
        val now = getPhoenixDateTime(2064, 3, 10, 11, 54, 8)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(48, 11, 25, 2, 27, 15))
    }

    @Test
    fun test_967() {
        val now = getPhoenixDateTime(2064, 4, 7, 6, 54, 24)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(49, 0, 23, 21, 27, 31))
    }

    @Test
    fun test_968() {
        val now = getPhoenixDateTime(2064, 4, 10, 17, 39, 18)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(49, 0, 27, 8, 12, 25))
    }

    @Test
    fun test_969() {
        val now = getPhoenixDateTime(2064, 4, 13, 7, 43, 35)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(49, 0, 29, 22, 16, 42))
    }

    @Test
    fun test_970() {
        val now = getPhoenixDateTime(2064, 4, 13, 12, 8, 23)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(49, 0, 30, 2, 41, 30))
    }

    @Test
    fun test_971() {
        val now = getPhoenixDateTime(2064, 4, 15, 3, 24, 14)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(49, 1, 0, 17, 57, 21))
    }

    @Test
    fun test_972() {
        val now = getPhoenixDateTime(2064, 4, 17, 15, 5, 42)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(49, 1, 3, 5, 38, 49))
    }

    @Test
    fun test_973() {
        val now = getPhoenixDateTime(2064, 5, 6, 9, 6, 56)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(49, 1, 21, 23, 40, 3))
    }

    @Test
    fun test_974() {
        val now = getPhoenixDateTime(2064, 5, 25, 9, 42, 40)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(49, 2, 11, 0, 15, 47))
    }

    @Test
    fun test_975() {
        val now = getPhoenixDateTime(2064, 5, 31, 5, 46, 36)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(49, 2, 16, 20, 19, 43))
    }

    @Test
    fun test_976() {
        val now = getPhoenixDateTime(2064, 6, 21, 21, 9, 31)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(49, 3, 7, 11, 42, 38))
    }

    @Test
    fun test_977() {
        val now = getPhoenixDateTime(2064, 8, 20, 6, 10, 23)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(49, 5, 5, 20, 43, 30))
    }

    @Test
    fun test_978() {
        val now = getPhoenixDateTime(2064, 9, 25, 16, 9, 10)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(49, 6, 11, 6, 42, 17))
    }

    @Test
    fun test_979() {
        val now = getPhoenixDateTime(2064, 9, 27, 0, 41, 16)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(49, 6, 12, 15, 14, 23))
    }

    @Test
    fun test_980() {
        val now = getPhoenixDateTime(2064, 10, 16, 19, 36, 41)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(49, 7, 2, 10, 9, 48))
    }

    @Test
    fun test_981() {
        val now = getPhoenixDateTime(2064, 10, 21, 14, 12, 48)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(49, 7, 7, 4, 45, 55))
    }

    @Test
    fun test_982() {
        val now = getPhoenixDateTime(2064, 11, 24, 0, 28, 21)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(49, 8, 9, 15, 1, 28))
    }

    @Test
    fun test_983() {
        val now = getPhoenixDateTime(2065, 1, 19, 4, 44, 26)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(49, 10, 4, 19, 17, 33))
    }

    @Test
    fun test_984() {
        val now = getPhoenixDateTime(2065, 1, 27, 15, 18, 58)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(49, 10, 13, 5, 52, 5))
    }

    @Test
    fun test_985() {
        val now = getPhoenixDateTime(2065, 1, 28, 5, 19, 15)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(49, 10, 13, 19, 52, 22))
    }

    @Test
    fun test_986() {
        val now = getPhoenixDateTime(2065, 3, 21, 6, 58, 4)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(50, 0, 6, 21, 31, 11))
    }

    @Test
    fun test_987() {
        val now = getPhoenixDateTime(2065, 5, 4, 14, 36, 25)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(50, 1, 20, 5, 9, 32))
    }

    @Test
    fun test_988() {
        val now = getPhoenixDateTime(2065, 5, 8, 5, 17, 0)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(50, 1, 23, 19, 50, 7))
    }

    @Test
    fun test_989() {
        val now = getPhoenixDateTime(2065, 5, 13, 18, 22, 21)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(50, 1, 29, 8, 55, 28))
    }

    @Test
    fun test_990() {
        val now = getPhoenixDateTime(2065, 5, 16, 23, 25, 48)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(50, 2, 2, 13, 58, 55))
    }

    @Test
    fun test_991() {
        val now = getPhoenixDateTime(2065, 6, 1, 10, 8, 22)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(50, 2, 18, 0, 41, 29))
    }

    @Test
    fun test_992() {
        val now = getPhoenixDateTime(2065, 6, 19, 23, 6, 1)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(50, 3, 5, 13, 39, 8))
    }

    @Test
    fun test_993() {
        val now = getPhoenixDateTime(2065, 6, 26, 14, 12, 37)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(50, 3, 12, 4, 45, 44))
    }

    @Test
    fun test_994() {
        val now = getPhoenixDateTime(2065, 7, 13, 22, 48, 15)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(50, 3, 29, 13, 21, 22))
    }

    @Test
    fun test_995() {
        val now = getPhoenixDateTime(2065, 7, 25, 4, 57, 11)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(50, 4, 10, 19, 30, 18))
    }

    @Test
    fun test_996() {
        val now = getPhoenixDateTime(2065, 8, 3, 2, 59, 6)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(50, 4, 19, 17, 32, 13))
    }

    @Test
    fun test_997() {
        val now = getPhoenixDateTime(2065, 10, 21, 5, 39, 40)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(50, 7, 6, 20, 12, 47))
    }

    @Test
    fun test_998() {
        val now = getPhoenixDateTime(2065, 11, 18, 18, 32, 6)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(50, 8, 4, 9, 5, 13))
    }

    @Test
    fun test_999() {
        val now = getPhoenixDateTime(2065, 12, 28, 22, 25, 59)
        val marriedDuration = getMarriedDuration(now)
        assertDuration(marriedDuration, Duration(50, 9, 14, 12, 59, 6))
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