package com.vuonglab.hennaandphu;

import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static com.google.common.truth.Truth.assertThat;

public class GeneratedDurationUnitTests {
    @Test
    public void test_000() {
        ZonedDateTime now = getPhoenixDateTime(2015, 3, 14, 10, 9, 57);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 0, 0, 0, 43, 4));
    }

    @Test
    public void test_001() {
        ZonedDateTime now = getPhoenixDateTime(2015, 4, 17, 22, 38, 29);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 1, 3, 13, 11, 36));
    }

    @Test
    public void test_002() {
        ZonedDateTime now = getPhoenixDateTime(2015, 4, 25, 14, 45, 31);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 1, 11, 5, 18, 38));
    }

    @Test
    public void test_003() {
        ZonedDateTime now = getPhoenixDateTime(2015, 5, 3, 7, 31, 35);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 1, 18, 22, 4, 42));
    }

    @Test
    public void test_004() {
        ZonedDateTime now = getPhoenixDateTime(2015, 5, 13, 20, 27, 13);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 1, 29, 11, 0, 20));
    }

    @Test
    public void test_005() {
        ZonedDateTime now = getPhoenixDateTime(2015, 5, 16, 11, 0, 7);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 2, 2, 1, 33, 14));
    }

    @Test
    public void test_006() {
        ZonedDateTime now = getPhoenixDateTime(2015, 5, 17, 2, 38, 12);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 2, 2, 17, 11, 19));
    }

    @Test
    public void test_007() {
        ZonedDateTime now = getPhoenixDateTime(2015, 5, 19, 22, 40, 5);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 2, 5, 13, 13, 12));
    }

    @Test
    public void test_008() {
        ZonedDateTime now = getPhoenixDateTime(2015, 6, 1, 21, 43, 29);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 2, 18, 12, 16, 36));
    }

    @Test
    public void test_009() {
        ZonedDateTime now = getPhoenixDateTime(2015, 6, 12, 2, 37, 6);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 2, 28, 17, 10, 13));
    }

    @Test
    public void test_010() {
        ZonedDateTime now = getPhoenixDateTime(2015, 6, 13, 18, 37, 1);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 2, 30, 9, 10, 8));
    }

    @Test
    public void test_011() {
        ZonedDateTime now = getPhoenixDateTime(2015, 7, 2, 6, 57, 55);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 3, 17, 21, 31, 2));
    }

    @Test
    public void test_012() {
        ZonedDateTime now = getPhoenixDateTime(2015, 7, 9, 18, 40, 3);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 3, 25, 9, 13, 10));
    }

    @Test
    public void test_013() {
        ZonedDateTime now = getPhoenixDateTime(2015, 7, 28, 10, 33, 20);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 4, 14, 1, 6, 27));
    }

    @Test
    public void test_014() {
        ZonedDateTime now = getPhoenixDateTime(2015, 8, 5, 4, 6, 33);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 4, 21, 18, 39, 40));
    }

    @Test
    public void test_015() {
        ZonedDateTime now = getPhoenixDateTime(2015, 8, 7, 4, 45, 37);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 4, 23, 19, 18, 44));
    }

    @Test
    public void test_016() {
        ZonedDateTime now = getPhoenixDateTime(2015, 8, 8, 11, 26, 37);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 4, 25, 1, 59, 44));
    }

    @Test
    public void test_017() {
        ZonedDateTime now = getPhoenixDateTime(2015, 9, 10, 5, 8, 19);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 5, 26, 19, 41, 26));
    }

    @Test
    public void test_018() {
        ZonedDateTime now = getPhoenixDateTime(2015, 9, 17, 14, 59, 2);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 6, 3, 5, 32, 9));
    }

    @Test
    public void test_019() {
        ZonedDateTime now = getPhoenixDateTime(2015, 10, 19, 14, 10, 26);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 7, 5, 4, 43, 33));
    }

    @Test
    public void test_020() {
        ZonedDateTime now = getPhoenixDateTime(2015, 11, 28, 6, 35, 33);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 8, 13, 21, 8, 40));
    }

    @Test
    public void test_021() {
        ZonedDateTime now = getPhoenixDateTime(2015, 11, 30, 14, 38, 53);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 8, 16, 5, 12, 0));
    }

    @Test
    public void test_022() {
        ZonedDateTime now = getPhoenixDateTime(2016, 1, 5, 16, 55, 9);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 9, 22, 7, 28, 16));
    }

    @Test
    public void test_023() {
        ZonedDateTime now = getPhoenixDateTime(2016, 1, 8, 5, 49, 4);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 9, 24, 20, 22, 11));
    }

    @Test
    public void test_024() {
        ZonedDateTime now = getPhoenixDateTime(2016, 1, 28, 4, 28, 27);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 10, 13, 19, 1, 34));
    }

    @Test
    public void test_025() {
        ZonedDateTime now = getPhoenixDateTime(2016, 3, 5, 8, 46, 1);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 11, 19, 23, 19, 8));
    }

    @Test
    public void test_026() {
        ZonedDateTime now = getPhoenixDateTime(2016, 3, 7, 18, 40, 10);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 11, 22, 9, 13, 17));
    }

    @Test
    public void test_027() {
        ZonedDateTime now = getPhoenixDateTime(2016, 3, 9, 11, 27, 36);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 11, 24, 2, 0, 43));
    }

    @Test
    public void test_028() {
        ZonedDateTime now = getPhoenixDateTime(2016, 3, 12, 23, 33, 24);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(0, 11, 27, 14, 6, 31));
    }

    @Test
    public void test_029() {
        ZonedDateTime now = getPhoenixDateTime(2016, 3, 14, 10, 26, 52);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(1, 0, 0, 0, 59, 59));
    }

    @Test
    public void test_030() {
        ZonedDateTime now = getPhoenixDateTime(2016, 3, 31, 13, 4, 7);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(1, 0, 17, 3, 37, 14));
    }

    @Test
    public void test_031() {
        ZonedDateTime now = getPhoenixDateTime(2016, 4, 8, 8, 59, 52);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(1, 0, 24, 23, 32, 59));
    }

    @Test
    public void test_032() {
        ZonedDateTime now = getPhoenixDateTime(2016, 4, 12, 7, 38, 43);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(1, 0, 28, 22, 11, 50));
    }

    @Test
    public void test_033() {
        ZonedDateTime now = getPhoenixDateTime(2016, 5, 2, 7, 50, 52);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(1, 1, 17, 22, 23, 59));
    }

    @Test
    public void test_034() {
        ZonedDateTime now = getPhoenixDateTime(2016, 5, 3, 7, 51, 15);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(1, 1, 18, 22, 24, 22));
    }

    @Test
    public void test_035() {
        ZonedDateTime now = getPhoenixDateTime(2016, 6, 4, 22, 13, 13);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(1, 2, 21, 12, 46, 20));
    }

    @Test
    public void test_036() {
        ZonedDateTime now = getPhoenixDateTime(2016, 6, 19, 10, 39, 22);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(1, 3, 5, 1, 12, 29));
    }

    @Test
    public void test_037() {
        ZonedDateTime now = getPhoenixDateTime(2016, 6, 28, 21, 49, 11);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(1, 3, 14, 12, 22, 18));
    }

    @Test
    public void test_038() {
        ZonedDateTime now = getPhoenixDateTime(2016, 7, 29, 10, 59, 42);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(1, 4, 15, 1, 32, 49));
    }

    @Test
    public void test_039() {
        ZonedDateTime now = getPhoenixDateTime(2016, 8, 3, 18, 21, 45);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(1, 4, 20, 8, 54, 52));
    }

    @Test
    public void test_040() {
        ZonedDateTime now = getPhoenixDateTime(2016, 8, 5, 5, 22, 24);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(1, 4, 21, 19, 55, 31));
    }

    @Test
    public void test_041() {
        ZonedDateTime now = getPhoenixDateTime(2016, 9, 12, 7, 38, 51);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(1, 5, 28, 22, 11, 58));
    }

    @Test
    public void test_042() {
        ZonedDateTime now = getPhoenixDateTime(2016, 10, 26, 3, 2, 34);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(1, 7, 11, 17, 35, 41));
    }

    @Test
    public void test_043() {
        ZonedDateTime now = getPhoenixDateTime(2016, 10, 28, 5, 22, 33);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(1, 7, 13, 19, 55, 40));
    }

    @Test
    public void test_044() {
        ZonedDateTime now = getPhoenixDateTime(2016, 10, 29, 21, 39, 3);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(1, 7, 15, 12, 12, 10));
    }

    @Test
    public void test_045() {
        ZonedDateTime now = getPhoenixDateTime(2016, 11, 1, 11, 56, 27);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(1, 7, 18, 2, 29, 34));
    }

    @Test
    public void test_046() {
        ZonedDateTime now = getPhoenixDateTime(2016, 11, 8, 18, 18, 24);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(1, 7, 25, 8, 51, 31));
    }

    @Test
    public void test_047() {
        ZonedDateTime now = getPhoenixDateTime(2016, 11, 20, 8, 10, 25);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(1, 8, 5, 22, 43, 32));
    }

    @Test
    public void test_048() {
        ZonedDateTime now = getPhoenixDateTime(2016, 11, 27, 8, 1, 7);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(1, 8, 12, 22, 34, 14));
    }

    @Test
    public void test_049() {
        ZonedDateTime now = getPhoenixDateTime(2016, 12, 2, 16, 39, 9);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(1, 8, 18, 7, 12, 16));
    }

    @Test
    public void test_050() {
        ZonedDateTime now = getPhoenixDateTime(2016, 12, 5, 3, 26, 12);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(1, 8, 20, 17, 59, 19));
    }

    @Test
    public void test_051() {
        ZonedDateTime now = getPhoenixDateTime(2017, 1, 14, 10, 16, 42);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(1, 10, 0, 0, 49, 49));
    }

    @Test
    public void test_052() {
        ZonedDateTime now = getPhoenixDateTime(2017, 2, 1, 6, 52, 25);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(1, 10, 17, 21, 25, 32));
    }

    @Test
    public void test_053() {
        ZonedDateTime now = getPhoenixDateTime(2017, 2, 19, 16, 32, 40);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(1, 11, 5, 7, 5, 47));
    }

    @Test
    public void test_054() {
        ZonedDateTime now = getPhoenixDateTime(2017, 3, 31, 13, 6, 8);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 0, 17, 3, 39, 15));
    }

    @Test
    public void test_055() {
        ZonedDateTime now = getPhoenixDateTime(2017, 4, 16, 14, 20, 5);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 1, 2, 4, 53, 12));
    }

    @Test
    public void test_056() {
        ZonedDateTime now = getPhoenixDateTime(2017, 6, 3, 22, 48, 46);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 2, 20, 13, 21, 53));
    }

    @Test
    public void test_057() {
        ZonedDateTime now = getPhoenixDateTime(2017, 8, 4, 15, 38, 40);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 4, 21, 6, 11, 47));
    }

    @Test
    public void test_058() {
        ZonedDateTime now = getPhoenixDateTime(2017, 9, 3, 20, 57, 54);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 5, 20, 11, 31, 1));
    }

    @Test
    public void test_059() {
        ZonedDateTime now = getPhoenixDateTime(2017, 10, 3, 9, 34, 32);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 6, 19, 0, 7, 39));
    }

    @Test
    public void test_060() {
        ZonedDateTime now = getPhoenixDateTime(2017, 10, 20, 2, 17, 44);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 5, 16, 50, 51));
    }

    @Test
    public void test_061() {
        ZonedDateTime now = getPhoenixDateTime(2017, 11, 14, 8, 2, 49);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 7, 30, 22, 35, 56));
    }

    @Test
    public void test_062() {
        ZonedDateTime now = getPhoenixDateTime(2017, 12, 29, 2, 2, 45);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 9, 14, 16, 35, 52));
    }

    @Test
    public void test_063() {
        ZonedDateTime now = getPhoenixDateTime(2018, 1, 21, 8, 58, 8);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 10, 6, 23, 31, 15));
    }

    @Test
    public void test_064() {
        ZonedDateTime now = getPhoenixDateTime(2018, 3, 13, 21, 12, 4);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(2, 11, 27, 11, 45, 11));
    }

    @Test
    public void test_065() {
        ZonedDateTime now = getPhoenixDateTime(2018, 3, 15, 10, 35, 39);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(3, 0, 1, 1, 8, 46));
    }

    @Test
    public void test_066() {
        ZonedDateTime now = getPhoenixDateTime(2018, 6, 10, 15, 24, 25);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(3, 2, 27, 5, 57, 32));
    }

    @Test
    public void test_067() {
        ZonedDateTime now = getPhoenixDateTime(2018, 6, 18, 12, 38, 8);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(3, 3, 4, 3, 11, 15));
    }

    @Test
    public void test_068() {
        ZonedDateTime now = getPhoenixDateTime(2018, 7, 13, 15, 38, 13);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(3, 3, 29, 6, 11, 20));
    }

    @Test
    public void test_069() {
        ZonedDateTime now = getPhoenixDateTime(2018, 9, 17, 1, 12, 14);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(3, 6, 2, 15, 45, 21));
    }

    @Test
    public void test_070() {
        ZonedDateTime now = getPhoenixDateTime(2018, 10, 7, 4, 27, 25);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(3, 6, 22, 19, 0, 32));
    }

    @Test
    public void test_071() {
        ZonedDateTime now = getPhoenixDateTime(2018, 11, 14, 20, 28, 3);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(3, 8, 0, 11, 1, 10));
    }

    @Test
    public void test_072() {
        ZonedDateTime now = getPhoenixDateTime(2018, 11, 30, 1, 50, 24);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(3, 8, 15, 16, 23, 31));
    }

    @Test
    public void test_073() {
        ZonedDateTime now = getPhoenixDateTime(2019, 1, 6, 0, 42, 49);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(3, 9, 22, 15, 15, 56));
    }

    @Test
    public void test_074() {
        ZonedDateTime now = getPhoenixDateTime(2019, 1, 6, 16, 48, 25);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(3, 9, 23, 7, 21, 32));
    }

    @Test
    public void test_075() {
        ZonedDateTime now = getPhoenixDateTime(2019, 1, 7, 10, 24, 29);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(3, 9, 24, 0, 57, 36));
    }

    @Test
    public void test_076() {
        ZonedDateTime now = getPhoenixDateTime(2019, 1, 18, 0, 32, 48);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(3, 10, 3, 15, 5, 55));
    }

    @Test
    public void test_077() {
        ZonedDateTime now = getPhoenixDateTime(2019, 2, 9, 1, 37, 43);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(3, 10, 25, 16, 10, 50));
    }

    @Test
    public void test_078() {
        ZonedDateTime now = getPhoenixDateTime(2019, 2, 11, 19, 49, 4);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(3, 10, 28, 10, 22, 11));
    }

    @Test
    public void test_079() {
        ZonedDateTime now = getPhoenixDateTime(2019, 3, 8, 20, 58, 58);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(3, 11, 22, 11, 32, 5));
    }

    @Test
    public void test_080() {
        ZonedDateTime now = getPhoenixDateTime(2019, 3, 23, 8, 35, 41);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(4, 0, 8, 23, 8, 48));
    }

    @Test
    public void test_081() {
        ZonedDateTime now = getPhoenixDateTime(2019, 4, 3, 2, 58, 33);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(4, 0, 19, 17, 31, 40));
    }

    @Test
    public void test_082() {
        ZonedDateTime now = getPhoenixDateTime(2019, 4, 25, 2, 27, 16);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(4, 1, 10, 17, 0, 23));
    }

    @Test
    public void test_083() {
        ZonedDateTime now = getPhoenixDateTime(2019, 4, 29, 5, 18, 53);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(4, 1, 14, 19, 52, 0));
    }

    @Test
    public void test_084() {
        ZonedDateTime now = getPhoenixDateTime(2019, 5, 29, 12, 11, 50);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(4, 2, 15, 2, 44, 57));
    }

    @Test
    public void test_085() {
        ZonedDateTime now = getPhoenixDateTime(2019, 6, 6, 15, 47, 28);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(4, 2, 23, 6, 20, 35));
    }

    @Test
    public void test_086() {
        ZonedDateTime now = getPhoenixDateTime(2019, 7, 9, 14, 7, 1);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(4, 3, 25, 4, 40, 8));
    }

    @Test
    public void test_087() {
        ZonedDateTime now = getPhoenixDateTime(2019, 9, 2, 9, 5, 27);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(4, 5, 18, 23, 38, 34));
    }

    @Test
    public void test_088() {
        ZonedDateTime now = getPhoenixDateTime(2019, 9, 7, 12, 37, 5);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(4, 5, 24, 3, 10, 12));
    }

    @Test
    public void test_089() {
        ZonedDateTime now = getPhoenixDateTime(2019, 11, 7, 9, 48, 41);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(4, 7, 24, 0, 21, 48));
    }

    @Test
    public void test_090() {
        ZonedDateTime now = getPhoenixDateTime(2019, 12, 21, 11, 22, 55);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(4, 9, 7, 1, 56, 2));
    }

    @Test
    public void test_091() {
        ZonedDateTime now = getPhoenixDateTime(2020, 1, 8, 14, 14, 0);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(4, 9, 25, 4, 47, 7));
    }

    @Test
    public void test_092() {
        ZonedDateTime now = getPhoenixDateTime(2020, 2, 25, 10, 32, 45);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(4, 11, 11, 1, 5, 52));
    }

    @Test
    public void test_093() {
        ZonedDateTime now = getPhoenixDateTime(2020, 2, 26, 14, 12, 35);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(4, 11, 12, 4, 45, 42));
    }

    @Test
    public void test_094() {
        ZonedDateTime now = getPhoenixDateTime(2020, 5, 24, 21, 51, 17);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(5, 2, 10, 12, 24, 24));
    }

    @Test
    public void test_095() {
        ZonedDateTime now = getPhoenixDateTime(2020, 6, 21, 9, 17, 57);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(5, 3, 6, 23, 51, 4));
    }

    @Test
    public void test_096() {
        ZonedDateTime now = getPhoenixDateTime(2020, 6, 27, 21, 31, 45);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(5, 3, 13, 12, 4, 52));
    }

    @Test
    public void test_097() {
        ZonedDateTime now = getPhoenixDateTime(2020, 6, 28, 18, 53, 48);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(5, 3, 14, 9, 26, 55));
    }

    @Test
    public void test_098() {
        ZonedDateTime now = getPhoenixDateTime(2020, 7, 3, 13, 11, 17);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(5, 3, 19, 3, 44, 24));
    }

    @Test
    public void test_099() {
        ZonedDateTime now = getPhoenixDateTime(2020, 8, 2, 4, 7, 49);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(5, 4, 18, 18, 40, 56));
    }

    @Test
    public void test_100() {
        ZonedDateTime now = getPhoenixDateTime(2020, 8, 26, 23, 22, 59);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(5, 5, 12, 13, 56, 6));
    }

    @Test
    public void test_101() {
        ZonedDateTime now = getPhoenixDateTime(2020, 9, 3, 8, 15, 21);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(5, 5, 19, 22, 48, 28));
    }

    @Test
    public void test_102() {
        ZonedDateTime now = getPhoenixDateTime(2020, 9, 10, 7, 16, 2);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(5, 5, 26, 21, 49, 9));
    }

    @Test
    public void test_103() {
        ZonedDateTime now = getPhoenixDateTime(2020, 9, 16, 0, 13, 26);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(5, 6, 1, 14, 46, 33));
    }

    @Test
    public void test_104() {
        ZonedDateTime now = getPhoenixDateTime(2020, 9, 17, 4, 5, 29);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(5, 6, 2, 18, 38, 36));
    }

    @Test
    public void test_105() {
        ZonedDateTime now = getPhoenixDateTime(2020, 9, 21, 9, 35, 4);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(5, 6, 7, 0, 8, 11));
    }

    @Test
    public void test_106() {
        ZonedDateTime now = getPhoenixDateTime(2020, 10, 13, 21, 20, 25);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(5, 6, 29, 11, 53, 32));
    }

    @Test
    public void test_107() {
        ZonedDateTime now = getPhoenixDateTime(2020, 11, 3, 4, 4, 59);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(5, 7, 19, 18, 38, 6));
    }

    @Test
    public void test_108() {
        ZonedDateTime now = getPhoenixDateTime(2020, 11, 16, 13, 19, 39);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(5, 8, 2, 3, 52, 46));
    }

    @Test
    public void test_109() {
        ZonedDateTime now = getPhoenixDateTime(2020, 11, 27, 0, 40, 38);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(5, 8, 12, 15, 13, 45));
    }

    @Test
    public void test_110() {
        ZonedDateTime now = getPhoenixDateTime(2020, 12, 9, 0, 41, 41);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(5, 8, 24, 15, 14, 48));
    }

    @Test
    public void test_111() {
        ZonedDateTime now = getPhoenixDateTime(2020, 12, 23, 4, 6, 28);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(5, 9, 8, 18, 39, 35));
    }

    @Test
    public void test_112() {
        ZonedDateTime now = getPhoenixDateTime(2021, 2, 4, 14, 43, 44);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(5, 10, 21, 5, 16, 51));
    }

    @Test
    public void test_113() {
        ZonedDateTime now = getPhoenixDateTime(2021, 3, 1, 9, 51, 27);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(5, 11, 15, 0, 24, 34));
    }

    @Test
    public void test_114() {
        ZonedDateTime now = getPhoenixDateTime(2021, 4, 13, 19, 18, 41);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(6, 0, 30, 9, 51, 48));
    }

    @Test
    public void test_115() {
        ZonedDateTime now = getPhoenixDateTime(2021, 5, 24, 6, 44, 1);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(6, 2, 9, 21, 17, 8));
    }

    @Test
    public void test_116() {
        ZonedDateTime now = getPhoenixDateTime(2021, 5, 27, 23, 25, 46);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(6, 2, 13, 13, 58, 53));
    }

    @Test
    public void test_117() {
        ZonedDateTime now = getPhoenixDateTime(2021, 5, 29, 12, 57, 25);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(6, 2, 15, 3, 30, 32));
    }

    @Test
    public void test_118() {
        ZonedDateTime now = getPhoenixDateTime(2021, 6, 12, 12, 15, 22);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(6, 2, 29, 2, 48, 29));
    }

    @Test
    public void test_119() {
        ZonedDateTime now = getPhoenixDateTime(2021, 6, 30, 5, 49, 34);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(6, 3, 15, 20, 22, 41));
    }

    @Test
    public void test_120() {
        ZonedDateTime now = getPhoenixDateTime(2021, 7, 1, 18, 22, 1);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(6, 3, 17, 8, 55, 8));
    }

    @Test
    public void test_121() {
        ZonedDateTime now = getPhoenixDateTime(2021, 7, 29, 7, 2, 47);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(6, 4, 14, 21, 35, 54));
    }

    @Test
    public void test_122() {
        ZonedDateTime now = getPhoenixDateTime(2021, 8, 12, 8, 46, 55);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(6, 4, 28, 23, 20, 2));
    }

    @Test
    public void test_123() {
        ZonedDateTime now = getPhoenixDateTime(2021, 8, 13, 19, 39, 16);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(6, 4, 30, 10, 12, 23));
    }

    @Test
    public void test_124() {
        ZonedDateTime now = getPhoenixDateTime(2021, 9, 1, 3, 45, 50);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(6, 5, 17, 18, 18, 57));
    }

    @Test
    public void test_125() {
        ZonedDateTime now = getPhoenixDateTime(2021, 9, 4, 16, 2, 48);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(6, 5, 21, 6, 35, 55));
    }

    @Test
    public void test_126() {
        ZonedDateTime now = getPhoenixDateTime(2021, 9, 15, 10, 19, 32);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(6, 6, 1, 0, 52, 39));
    }

    @Test
    public void test_127() {
        ZonedDateTime now = getPhoenixDateTime(2021, 10, 11, 14, 28, 9);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(6, 6, 27, 5, 1, 16));
    }

    @Test
    public void test_128() {
        ZonedDateTime now = getPhoenixDateTime(2021, 10, 11, 20, 9, 36);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(6, 6, 27, 10, 42, 43));
    }

    @Test
    public void test_129() {
        ZonedDateTime now = getPhoenixDateTime(2021, 11, 1, 3, 30, 59);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(6, 7, 17, 18, 4, 6));
    }

    @Test
    public void test_130() {
        ZonedDateTime now = getPhoenixDateTime(2021, 11, 12, 12, 1, 0);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(6, 7, 29, 2, 34, 7));
    }

    @Test
    public void test_131() {
        ZonedDateTime now = getPhoenixDateTime(2022, 1, 3, 21, 5, 8);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(6, 9, 20, 11, 38, 15));
    }

    @Test
    public void test_132() {
        ZonedDateTime now = getPhoenixDateTime(2022, 2, 5, 8, 25, 37);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(6, 10, 21, 22, 58, 44));
    }

    @Test
    public void test_133() {
        ZonedDateTime now = getPhoenixDateTime(2022, 2, 19, 10, 59, 22);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(6, 11, 5, 1, 32, 29));
    }

    @Test
    public void test_134() {
        ZonedDateTime now = getPhoenixDateTime(2022, 2, 27, 14, 13, 53);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(6, 11, 13, 4, 47, 0));
    }

    @Test
    public void test_135() {
        ZonedDateTime now = getPhoenixDateTime(2022, 2, 28, 1, 39, 53);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(6, 11, 13, 16, 13, 0));
    }

    @Test
    public void test_136() {
        ZonedDateTime now = getPhoenixDateTime(2022, 4, 10, 5, 0, 58);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(7, 0, 26, 19, 34, 5));
    }

    @Test
    public void test_137() {
        ZonedDateTime now = getPhoenixDateTime(2022, 4, 23, 8, 59, 59);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(7, 1, 8, 23, 33, 6));
    }

    @Test
    public void test_138() {
        ZonedDateTime now = getPhoenixDateTime(2022, 5, 21, 6, 3, 2);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(7, 2, 6, 20, 36, 9));
    }

    @Test
    public void test_139() {
        ZonedDateTime now = getPhoenixDateTime(2022, 7, 2, 3, 9, 30);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(7, 3, 17, 17, 42, 37));
    }

    @Test
    public void test_140() {
        ZonedDateTime now = getPhoenixDateTime(2022, 7, 14, 5, 24, 48);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(7, 3, 29, 19, 57, 55));
    }

    @Test
    public void test_141() {
        ZonedDateTime now = getPhoenixDateTime(2022, 7, 15, 9, 24, 24);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(7, 4, 0, 23, 57, 31));
    }

    @Test
    public void test_142() {
        ZonedDateTime now = getPhoenixDateTime(2022, 8, 4, 10, 18, 9);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(7, 4, 21, 0, 51, 16));
    }

    @Test
    public void test_143() {
        ZonedDateTime now = getPhoenixDateTime(2022, 8, 12, 19, 16, 21);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(7, 4, 29, 9, 49, 28));
    }

    @Test
    public void test_144() {
        ZonedDateTime now = getPhoenixDateTime(2022, 9, 7, 20, 5, 2);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(7, 5, 24, 10, 38, 9));
    }

    @Test
    public void test_145() {
        ZonedDateTime now = getPhoenixDateTime(2022, 9, 18, 5, 33, 9);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(7, 6, 3, 20, 6, 16));
    }

    @Test
    public void test_146() {
        ZonedDateTime now = getPhoenixDateTime(2022, 9, 18, 23, 9, 41);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(7, 6, 4, 13, 42, 48));
    }

    @Test
    public void test_147() {
        ZonedDateTime now = getPhoenixDateTime(2022, 10, 22, 16, 29, 5);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(7, 7, 8, 7, 2, 12));
    }

    @Test
    public void test_148() {
        ZonedDateTime now = getPhoenixDateTime(2022, 12, 3, 15, 31, 50);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(7, 8, 19, 6, 4, 57));
    }

    @Test
    public void test_149() {
        ZonedDateTime now = getPhoenixDateTime(2022, 12, 5, 18, 6, 0);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(7, 8, 21, 8, 39, 7));
    }

    @Test
    public void test_150() {
        ZonedDateTime now = getPhoenixDateTime(2022, 12, 9, 17, 36, 19);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(7, 8, 25, 8, 9, 26));
    }

    @Test
    public void test_151() {
        ZonedDateTime now = getPhoenixDateTime(2022, 12, 19, 23, 33, 46);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(7, 9, 5, 14, 6, 53));
    }

    @Test
    public void test_152() {
        ZonedDateTime now = getPhoenixDateTime(2022, 12, 30, 3, 13, 48);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(7, 9, 15, 17, 46, 55));
    }

    @Test
    public void test_153() {
        ZonedDateTime now = getPhoenixDateTime(2023, 1, 30, 20, 5, 16);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(7, 10, 16, 10, 38, 23));
    }

    @Test
    public void test_154() {
        ZonedDateTime now = getPhoenixDateTime(2023, 2, 2, 5, 3, 58);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(7, 10, 18, 19, 37, 5));
    }

    @Test
    public void test_155() {
        ZonedDateTime now = getPhoenixDateTime(2023, 2, 5, 16, 54, 27);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(7, 10, 22, 7, 27, 34));
    }

    @Test
    public void test_156() {
        ZonedDateTime now = getPhoenixDateTime(2023, 3, 2, 7, 38, 33);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(7, 11, 15, 22, 11, 40));
    }

    @Test
    public void test_157() {
        ZonedDateTime now = getPhoenixDateTime(2023, 3, 6, 5, 31, 32);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(7, 11, 19, 20, 4, 39));
    }

    @Test
    public void test_158() {
        ZonedDateTime now = getPhoenixDateTime(2023, 3, 17, 11, 28, 36);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(8, 0, 3, 2, 1, 43));
    }

    @Test
    public void test_159() {
        ZonedDateTime now = getPhoenixDateTime(2023, 5, 2, 9, 42, 52);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(8, 1, 18, 0, 15, 59));
    }

    @Test
    public void test_160() {
        ZonedDateTime now = getPhoenixDateTime(2023, 5, 19, 8, 27, 28);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(8, 2, 4, 23, 0, 35));
    }

    @Test
    public void test_161() {
        ZonedDateTime now = getPhoenixDateTime(2023, 5, 29, 19, 16, 15);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(8, 2, 15, 9, 49, 22));
    }

    @Test
    public void test_162() {
        ZonedDateTime now = getPhoenixDateTime(2023, 6, 7, 19, 0, 25);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(8, 2, 24, 9, 33, 32));
    }

    @Test
    public void test_163() {
        ZonedDateTime now = getPhoenixDateTime(2023, 7, 7, 12, 25, 49);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(8, 3, 23, 2, 58, 56));
    }

    @Test
    public void test_164() {
        ZonedDateTime now = getPhoenixDateTime(2023, 7, 14, 4, 54, 8);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(8, 3, 29, 19, 27, 15));
    }

    @Test
    public void test_165() {
        ZonedDateTime now = getPhoenixDateTime(2023, 8, 7, 3, 26, 11);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(8, 4, 23, 17, 59, 18));
    }

    @Test
    public void test_166() {
        ZonedDateTime now = getPhoenixDateTime(2023, 9, 8, 9, 21, 4);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(8, 5, 24, 23, 54, 11));
    }

    @Test
    public void test_167() {
        ZonedDateTime now = getPhoenixDateTime(2023, 9, 20, 0, 57, 51);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(8, 6, 5, 15, 30, 58));
    }

    @Test
    public void test_168() {
        ZonedDateTime now = getPhoenixDateTime(2023, 10, 31, 11, 58, 31);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(8, 7, 17, 2, 31, 38));
    }

    @Test
    public void test_169() {
        ZonedDateTime now = getPhoenixDateTime(2023, 12, 20, 14, 45, 42);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(8, 9, 6, 5, 18, 49));
    }

    @Test
    public void test_170() {
        ZonedDateTime now = getPhoenixDateTime(2024, 1, 24, 22, 46, 20);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(8, 10, 10, 13, 19, 27));
    }

    @Test
    public void test_171() {
        ZonedDateTime now = getPhoenixDateTime(2024, 2, 13, 21, 34, 4);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(8, 10, 30, 12, 7, 11));
    }

    @Test
    public void test_172() {
        ZonedDateTime now = getPhoenixDateTime(2024, 2, 29, 3, 47, 24);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(8, 11, 14, 18, 20, 31));
    }

    @Test
    public void test_173() {
        ZonedDateTime now = getPhoenixDateTime(2024, 3, 3, 2, 48, 50);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(8, 11, 17, 17, 21, 57));
    }

    @Test
    public void test_174() {
        ZonedDateTime now = getPhoenixDateTime(2024, 3, 17, 21, 41, 42);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(9, 0, 3, 12, 14, 49));
    }

    @Test
    public void test_175() {
        ZonedDateTime now = getPhoenixDateTime(2024, 4, 9, 15, 55, 16);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(9, 0, 26, 6, 28, 23));
    }

    @Test
    public void test_176() {
        ZonedDateTime now = getPhoenixDateTime(2024, 5, 4, 8, 24, 45);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(9, 1, 19, 22, 57, 52));
    }

    @Test
    public void test_177() {
        ZonedDateTime now = getPhoenixDateTime(2024, 5, 10, 1, 10, 54);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(9, 1, 25, 15, 44, 1));
    }

    @Test
    public void test_178() {
        ZonedDateTime now = getPhoenixDateTime(2024, 6, 12, 13, 11, 42);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(9, 2, 29, 3, 44, 49));
    }

    @Test
    public void test_179() {
        ZonedDateTime now = getPhoenixDateTime(2024, 6, 12, 14, 55, 45);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(9, 2, 29, 5, 28, 52));
    }

    @Test
    public void test_180() {
        ZonedDateTime now = getPhoenixDateTime(2024, 7, 18, 17, 1, 27);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(9, 4, 4, 7, 34, 34));
    }

    @Test
    public void test_181() {
        ZonedDateTime now = getPhoenixDateTime(2024, 7, 20, 1, 48, 2);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(9, 4, 5, 16, 21, 9));
    }

    @Test
    public void test_182() {
        ZonedDateTime now = getPhoenixDateTime(2024, 8, 3, 21, 58, 56);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(9, 4, 20, 12, 32, 3));
    }

    @Test
    public void test_183() {
        ZonedDateTime now = getPhoenixDateTime(2024, 8, 12, 14, 51, 18);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(9, 4, 29, 5, 24, 25));
    }

    @Test
    public void test_184() {
        ZonedDateTime now = getPhoenixDateTime(2024, 10, 29, 6, 10, 15);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(9, 7, 14, 20, 43, 22));
    }

    @Test
    public void test_185() {
        ZonedDateTime now = getPhoenixDateTime(2024, 10, 30, 14, 0, 52);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(9, 7, 16, 4, 33, 59));
    }

    @Test
    public void test_186() {
        ZonedDateTime now = getPhoenixDateTime(2024, 12, 5, 6, 12, 11);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(9, 8, 20, 20, 45, 18));
    }

    @Test
    public void test_187() {
        ZonedDateTime now = getPhoenixDateTime(2024, 12, 16, 3, 22, 39);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(9, 9, 1, 17, 55, 46));
    }

    @Test
    public void test_188() {
        ZonedDateTime now = getPhoenixDateTime(2025, 1, 3, 11, 38, 14);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(9, 9, 20, 2, 11, 21));
    }

    @Test
    public void test_189() {
        ZonedDateTime now = getPhoenixDateTime(2025, 1, 14, 13, 53, 38);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(9, 10, 0, 4, 26, 45));
    }

    @Test
    public void test_190() {
        ZonedDateTime now = getPhoenixDateTime(2025, 2, 5, 22, 8, 16);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(9, 10, 22, 12, 41, 23));
    }

    @Test
    public void test_191() {
        ZonedDateTime now = getPhoenixDateTime(2025, 3, 7, 8, 26, 56);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(9, 11, 20, 23, 0, 3));
    }

    @Test
    public void test_192() {
        ZonedDateTime now = getPhoenixDateTime(2025, 3, 11, 18, 18, 3);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(9, 11, 25, 8, 51, 10));
    }

    @Test
    public void test_193() {
        ZonedDateTime now = getPhoenixDateTime(2025, 4, 14, 13, 59, 4);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(10, 1, 0, 4, 32, 11));
    }

    @Test
    public void test_194() {
        ZonedDateTime now = getPhoenixDateTime(2025, 5, 2, 4, 58, 17);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(10, 1, 17, 19, 31, 24));
    }

    @Test
    public void test_195() {
        ZonedDateTime now = getPhoenixDateTime(2025, 5, 21, 12, 44, 5);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(10, 2, 7, 3, 17, 12));
    }

    @Test
    public void test_196() {
        ZonedDateTime now = getPhoenixDateTime(2025, 6, 14, 0, 4, 31);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(10, 2, 30, 14, 37, 38));
    }

    @Test
    public void test_197() {
        ZonedDateTime now = getPhoenixDateTime(2025, 6, 26, 11, 35, 51);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(10, 3, 12, 2, 8, 58));
    }

    @Test
    public void test_198() {
        ZonedDateTime now = getPhoenixDateTime(2025, 7, 25, 8, 7, 13);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(10, 4, 10, 22, 40, 20));
    }

    @Test
    public void test_199() {
        ZonedDateTime now = getPhoenixDateTime(2025, 7, 31, 20, 25, 22);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(10, 4, 17, 10, 58, 29));
    }

    @Test
    public void test_200() {
        ZonedDateTime now = getPhoenixDateTime(2025, 8, 8, 23, 20, 21);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(10, 4, 25, 13, 53, 28));
    }

    @Test
    public void test_201() {
        ZonedDateTime now = getPhoenixDateTime(2025, 8, 11, 13, 35, 53);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(10, 4, 28, 4, 9, 0));
    }

    @Test
    public void test_202() {
        ZonedDateTime now = getPhoenixDateTime(2025, 8, 16, 4, 8, 45);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(10, 5, 1, 18, 41, 52));
    }

    @Test
    public void test_203() {
        ZonedDateTime now = getPhoenixDateTime(2025, 8, 26, 3, 44, 13);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(10, 5, 11, 18, 17, 20));
    }

    @Test
    public void test_204() {
        ZonedDateTime now = getPhoenixDateTime(2025, 8, 31, 11, 59, 20);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(10, 5, 17, 2, 32, 27));
    }

    @Test
    public void test_205() {
        ZonedDateTime now = getPhoenixDateTime(2025, 9, 5, 10, 1, 24);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(10, 5, 22, 0, 34, 31));
    }

    @Test
    public void test_206() {
        ZonedDateTime now = getPhoenixDateTime(2025, 9, 22, 15, 44, 38);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(10, 6, 8, 6, 17, 45));
    }

    @Test
    public void test_207() {
        ZonedDateTime now = getPhoenixDateTime(2025, 9, 26, 11, 16, 19);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(10, 6, 12, 1, 49, 26));
    }

    @Test
    public void test_208() {
        ZonedDateTime now = getPhoenixDateTime(2025, 9, 27, 18, 24, 22);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(10, 6, 13, 8, 57, 29));
    }

    @Test
    public void test_209() {
        ZonedDateTime now = getPhoenixDateTime(2025, 9, 28, 10, 3, 32);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(10, 6, 14, 0, 36, 39));
    }

    @Test
    public void test_210() {
        ZonedDateTime now = getPhoenixDateTime(2025, 10, 9, 23, 12, 15);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(10, 6, 25, 13, 45, 22));
    }

    @Test
    public void test_211() {
        ZonedDateTime now = getPhoenixDateTime(2025, 10, 10, 8, 41, 44);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(10, 6, 25, 23, 14, 51));
    }

    @Test
    public void test_212() {
        ZonedDateTime now = getPhoenixDateTime(2025, 10, 26, 10, 37, 17);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(10, 7, 12, 1, 10, 24));
    }

    @Test
    public void test_213() {
        ZonedDateTime now = getPhoenixDateTime(2025, 12, 10, 13, 52, 51);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(10, 8, 26, 4, 25, 58));
    }

    @Test
    public void test_214() {
        ZonedDateTime now = getPhoenixDateTime(2026, 1, 3, 13, 13, 25);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(10, 9, 20, 3, 46, 32));
    }

    @Test
    public void test_215() {
        ZonedDateTime now = getPhoenixDateTime(2026, 1, 28, 11, 19, 34);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(10, 10, 14, 1, 52, 41));
    }

    @Test
    public void test_216() {
        ZonedDateTime now = getPhoenixDateTime(2026, 2, 11, 4, 52, 3);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(10, 10, 27, 19, 25, 10));
    }

    @Test
    public void test_217() {
        ZonedDateTime now = getPhoenixDateTime(2026, 3, 10, 5, 20, 26);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(10, 11, 23, 19, 53, 33));
    }

    @Test
    public void test_218() {
        ZonedDateTime now = getPhoenixDateTime(2026, 4, 8, 15, 16, 18);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(11, 0, 25, 5, 49, 25));
    }

    @Test
    public void test_219() {
        ZonedDateTime now = getPhoenixDateTime(2026, 4, 11, 0, 39, 46);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(11, 0, 27, 15, 12, 53));
    }

    @Test
    public void test_220() {
        ZonedDateTime now = getPhoenixDateTime(2026, 4, 18, 17, 46, 50);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(11, 1, 4, 8, 19, 57));
    }

    @Test
    public void test_221() {
        ZonedDateTime now = getPhoenixDateTime(2026, 5, 13, 22, 9, 54);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(11, 1, 29, 12, 43, 1));
    }

    @Test
    public void test_222() {
        ZonedDateTime now = getPhoenixDateTime(2026, 6, 4, 9, 54, 57);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(11, 2, 21, 0, 28, 4));
    }

    @Test
    public void test_223() {
        ZonedDateTime now = getPhoenixDateTime(2026, 6, 10, 21, 53, 0);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(11, 2, 27, 12, 26, 7));
    }

    @Test
    public void test_224() {
        ZonedDateTime now = getPhoenixDateTime(2026, 6, 21, 5, 36, 16);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(11, 3, 6, 20, 9, 23));
    }

    @Test
    public void test_225() {
        ZonedDateTime now = getPhoenixDateTime(2026, 7, 8, 12, 26, 41);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(11, 3, 24, 2, 59, 48));
    }

    @Test
    public void test_226() {
        ZonedDateTime now = getPhoenixDateTime(2026, 8, 8, 14, 16, 21);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(11, 4, 25, 4, 49, 28));
    }

    @Test
    public void test_227() {
        ZonedDateTime now = getPhoenixDateTime(2026, 8, 28, 22, 22, 49);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(11, 5, 14, 12, 55, 56));
    }

    @Test
    public void test_228() {
        ZonedDateTime now = getPhoenixDateTime(2026, 9, 9, 10, 48, 1);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(11, 5, 26, 1, 21, 8));
    }

    @Test
    public void test_229() {
        ZonedDateTime now = getPhoenixDateTime(2026, 9, 16, 21, 2, 54);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(11, 6, 2, 11, 36, 1));
    }

    @Test
    public void test_230() {
        ZonedDateTime now = getPhoenixDateTime(2026, 9, 20, 18, 34, 51);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(11, 6, 6, 9, 7, 58));
    }

    @Test
    public void test_231() {
        ZonedDateTime now = getPhoenixDateTime(2026, 9, 22, 16, 47, 24);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(11, 6, 8, 7, 20, 31));
    }

    @Test
    public void test_232() {
        ZonedDateTime now = getPhoenixDateTime(2026, 11, 19, 20, 20, 12);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(11, 8, 5, 10, 53, 19));
    }

    @Test
    public void test_233() {
        ZonedDateTime now = getPhoenixDateTime(2026, 12, 19, 13, 25, 15);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(11, 9, 5, 3, 58, 22));
    }

    @Test
    public void test_234() {
        ZonedDateTime now = getPhoenixDateTime(2027, 1, 12, 21, 43, 59);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(11, 9, 29, 12, 17, 6));
    }

    @Test
    public void test_235() {
        ZonedDateTime now = getPhoenixDateTime(2027, 2, 3, 9, 57, 49);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(11, 10, 20, 0, 30, 56));
    }

    @Test
    public void test_236() {
        ZonedDateTime now = getPhoenixDateTime(2027, 3, 11, 13, 9, 25);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(11, 11, 25, 3, 42, 32));
    }

    @Test
    public void test_237() {
        ZonedDateTime now = getPhoenixDateTime(2027, 3, 15, 7, 58, 14);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(12, 0, 0, 22, 31, 21));
    }

    @Test
    public void test_238() {
        ZonedDateTime now = getPhoenixDateTime(2027, 4, 11, 16, 18, 17);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(12, 0, 28, 6, 51, 24));
    }

    @Test
    public void test_239() {
        ZonedDateTime now = getPhoenixDateTime(2027, 4, 23, 0, 28, 24);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(12, 1, 8, 15, 1, 31));
    }

    @Test
    public void test_240() {
        ZonedDateTime now = getPhoenixDateTime(2027, 4, 25, 18, 0, 9);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(12, 1, 11, 8, 33, 16));
    }

    @Test
    public void test_241() {
        ZonedDateTime now = getPhoenixDateTime(2027, 4, 26, 9, 10, 34);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(12, 1, 11, 23, 43, 41));
    }

    @Test
    public void test_242() {
        ZonedDateTime now = getPhoenixDateTime(2027, 4, 27, 15, 28, 52);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(12, 1, 13, 6, 1, 59));
    }

    @Test
    public void test_243() {
        ZonedDateTime now = getPhoenixDateTime(2027, 5, 8, 11, 50, 39);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(12, 1, 24, 2, 23, 46));
    }

    @Test
    public void test_244() {
        ZonedDateTime now = getPhoenixDateTime(2027, 5, 10, 8, 7, 39);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(12, 1, 25, 22, 40, 46));
    }

    @Test
    public void test_245() {
        ZonedDateTime now = getPhoenixDateTime(2027, 5, 21, 18, 51, 15);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(12, 2, 7, 9, 24, 22));
    }

    @Test
    public void test_246() {
        ZonedDateTime now = getPhoenixDateTime(2027, 7, 12, 6, 6, 20);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(12, 3, 27, 20, 39, 27));
    }

    @Test
    public void test_247() {
        ZonedDateTime now = getPhoenixDateTime(2027, 7, 21, 0, 30, 56);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(12, 4, 6, 15, 4, 3));
    }

    @Test
    public void test_248() {
        ZonedDateTime now = getPhoenixDateTime(2027, 7, 25, 8, 4, 33);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(12, 4, 10, 22, 37, 40));
    }

    @Test
    public void test_249() {
        ZonedDateTime now = getPhoenixDateTime(2027, 8, 28, 8, 27, 3);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(12, 5, 13, 23, 0, 10));
    }

    @Test
    public void test_250() {
        ZonedDateTime now = getPhoenixDateTime(2027, 9, 8, 18, 9, 48);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(12, 5, 25, 8, 42, 55));
    }

    @Test
    public void test_251() {
        ZonedDateTime now = getPhoenixDateTime(2027, 9, 16, 2, 55, 52);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(12, 6, 1, 17, 28, 59));
    }

    @Test
    public void test_252() {
        ZonedDateTime now = getPhoenixDateTime(2027, 9, 17, 21, 30, 38);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(12, 6, 3, 12, 3, 45));
    }

    @Test
    public void test_253() {
        ZonedDateTime now = getPhoenixDateTime(2027, 10, 1, 0, 49, 30);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(12, 6, 16, 15, 22, 37));
    }

    @Test
    public void test_254() {
        ZonedDateTime now = getPhoenixDateTime(2027, 10, 21, 10, 58, 38);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(12, 7, 7, 1, 31, 45));
    }

    @Test
    public void test_255() {
        ZonedDateTime now = getPhoenixDateTime(2027, 10, 25, 8, 15, 0);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(12, 7, 10, 22, 48, 7));
    }

    @Test
    public void test_256() {
        ZonedDateTime now = getPhoenixDateTime(2027, 11, 10, 13, 32, 4);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(12, 7, 27, 4, 5, 11));
    }

    @Test
    public void test_257() {
        ZonedDateTime now = getPhoenixDateTime(2027, 11, 13, 3, 1, 19);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(12, 7, 29, 17, 34, 26));
    }

    @Test
    public void test_258() {
        ZonedDateTime now = getPhoenixDateTime(2027, 11, 14, 3, 37, 23);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(12, 7, 30, 18, 10, 30));
    }

    @Test
    public void test_259() {
        ZonedDateTime now = getPhoenixDateTime(2027, 12, 18, 6, 36, 48);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(12, 9, 3, 21, 9, 55));
    }

    @Test
    public void test_260() {
        ZonedDateTime now = getPhoenixDateTime(2027, 12, 19, 3, 50, 20);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(12, 9, 4, 18, 23, 27));
    }

    @Test
    public void test_261() {
        ZonedDateTime now = getPhoenixDateTime(2028, 1, 23, 23, 56, 59);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(12, 10, 9, 14, 30, 6));
    }

    @Test
    public void test_262() {
        ZonedDateTime now = getPhoenixDateTime(2028, 1, 27, 5, 46, 45);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(12, 10, 12, 20, 19, 52));
    }

    @Test
    public void test_263() {
        ZonedDateTime now = getPhoenixDateTime(2028, 1, 28, 9, 53, 58);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(12, 10, 14, 0, 27, 5));
    }

    @Test
    public void test_264() {
        ZonedDateTime now = getPhoenixDateTime(2028, 2, 7, 7, 46, 51);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(12, 10, 23, 22, 19, 58));
    }

    @Test
    public void test_265() {
        ZonedDateTime now = getPhoenixDateTime(2028, 3, 7, 9, 8, 27);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(12, 11, 21, 23, 41, 34));
    }

    @Test
    public void test_266() {
        ZonedDateTime now = getPhoenixDateTime(2028, 6, 6, 2, 17, 31);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(13, 2, 22, 16, 50, 38));
    }

    @Test
    public void test_267() {
        ZonedDateTime now = getPhoenixDateTime(2028, 6, 11, 22, 23, 42);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(13, 2, 28, 12, 56, 49));
    }

    @Test
    public void test_268() {
        ZonedDateTime now = getPhoenixDateTime(2028, 7, 21, 20, 44, 24);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(13, 4, 7, 11, 17, 31));
    }

    @Test
    public void test_269() {
        ZonedDateTime now = getPhoenixDateTime(2028, 8, 19, 9, 33, 33);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(13, 5, 5, 0, 6, 40));
    }

    @Test
    public void test_270() {
        ZonedDateTime now = getPhoenixDateTime(2028, 9, 5, 19, 5, 56);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(13, 5, 22, 9, 39, 3));
    }

    @Test
    public void test_271() {
        ZonedDateTime now = getPhoenixDateTime(2028, 9, 21, 4, 50, 22);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(13, 6, 6, 19, 23, 29));
    }

    @Test
    public void test_272() {
        ZonedDateTime now = getPhoenixDateTime(2028, 9, 27, 0, 45, 24);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(13, 6, 12, 15, 18, 31));
    }

    @Test
    public void test_273() {
        ZonedDateTime now = getPhoenixDateTime(2028, 9, 28, 19, 23, 47);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(13, 6, 14, 9, 56, 54));
    }

    @Test
    public void test_274() {
        ZonedDateTime now = getPhoenixDateTime(2028, 10, 10, 22, 21, 31);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(13, 6, 26, 12, 54, 38));
    }

    @Test
    public void test_275() {
        ZonedDateTime now = getPhoenixDateTime(2028, 11, 8, 4, 45, 6);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(13, 7, 24, 19, 18, 13));
    }

    @Test
    public void test_276() {
        ZonedDateTime now = getPhoenixDateTime(2028, 11, 22, 11, 52, 10);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(13, 8, 8, 2, 25, 17));
    }

    @Test
    public void test_277() {
        ZonedDateTime now = getPhoenixDateTime(2028, 12, 18, 11, 47, 37);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(13, 9, 4, 2, 20, 44));
    }

    @Test
    public void test_278() {
        ZonedDateTime now = getPhoenixDateTime(2028, 12, 19, 15, 21, 5);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(13, 9, 5, 5, 54, 12));
    }

    @Test
    public void test_279() {
        ZonedDateTime now = getPhoenixDateTime(2029, 1, 9, 18, 38, 49);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(13, 9, 26, 9, 11, 56));
    }

    @Test
    public void test_280() {
        ZonedDateTime now = getPhoenixDateTime(2029, 1, 19, 12, 1, 22);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(13, 10, 5, 2, 34, 29));
    }

    @Test
    public void test_281() {
        ZonedDateTime now = getPhoenixDateTime(2029, 1, 24, 17, 14, 12);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(13, 10, 10, 7, 47, 19));
    }

    @Test
    public void test_282() {
        ZonedDateTime now = getPhoenixDateTime(2029, 2, 3, 15, 40, 53);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(13, 10, 20, 6, 14, 0));
    }

    @Test
    public void test_283() {
        ZonedDateTime now = getPhoenixDateTime(2029, 2, 20, 21, 30, 55);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(13, 11, 6, 12, 4, 2));
    }

    @Test
    public void test_284() {
        ZonedDateTime now = getPhoenixDateTime(2029, 4, 11, 21, 52, 26);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(14, 0, 28, 12, 25, 33));
    }

    @Test
    public void test_285() {
        ZonedDateTime now = getPhoenixDateTime(2029, 4, 25, 8, 54, 50);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(14, 1, 10, 23, 27, 57));
    }

    @Test
    public void test_286() {
        ZonedDateTime now = getPhoenixDateTime(2029, 5, 11, 11, 31, 9);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(14, 1, 27, 2, 4, 16));
    }

    @Test
    public void test_287() {
        ZonedDateTime now = getPhoenixDateTime(2029, 6, 14, 16, 36, 56);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(14, 3, 0, 7, 10, 3));
    }

    @Test
    public void test_288() {
        ZonedDateTime now = getPhoenixDateTime(2029, 6, 19, 23, 45, 22);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(14, 3, 5, 14, 18, 29));
    }

    @Test
    public void test_289() {
        ZonedDateTime now = getPhoenixDateTime(2029, 6, 30, 23, 45, 37);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(14, 3, 16, 14, 18, 44));
    }

    @Test
    public void test_290() {
        ZonedDateTime now = getPhoenixDateTime(2029, 7, 1, 8, 22, 48);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(14, 3, 16, 22, 55, 55));
    }

    @Test
    public void test_291() {
        ZonedDateTime now = getPhoenixDateTime(2029, 7, 6, 8, 58, 25);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(14, 3, 21, 23, 31, 32));
    }

    @Test
    public void test_292() {
        ZonedDateTime now = getPhoenixDateTime(2029, 7, 17, 23, 49, 0);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(14, 4, 3, 14, 22, 7));
    }

    @Test
    public void test_293() {
        ZonedDateTime now = getPhoenixDateTime(2029, 9, 5, 14, 5, 42);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(14, 5, 22, 4, 38, 49));
    }

    @Test
    public void test_294() {
        ZonedDateTime now = getPhoenixDateTime(2029, 10, 20, 20, 27, 8);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(14, 7, 6, 11, 0, 15));
    }

    @Test
    public void test_295() {
        ZonedDateTime now = getPhoenixDateTime(2029, 11, 6, 12, 51, 9);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(14, 7, 23, 3, 24, 16));
    }

    @Test
    public void test_296() {
        ZonedDateTime now = getPhoenixDateTime(2029, 11, 10, 10, 11, 29);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(14, 7, 27, 0, 44, 36));
    }

    @Test
    public void test_297() {
        ZonedDateTime now = getPhoenixDateTime(2029, 11, 24, 17, 41, 25);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(14, 8, 10, 8, 14, 32));
    }

    @Test
    public void test_298() {
        ZonedDateTime now = getPhoenixDateTime(2029, 12, 31, 13, 42, 14);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(14, 9, 17, 4, 15, 21));
    }

    @Test
    public void test_299() {
        ZonedDateTime now = getPhoenixDateTime(2030, 1, 19, 12, 27, 49);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(14, 10, 5, 3, 0, 56));
    }

    @Test
    public void test_300() {
        ZonedDateTime now = getPhoenixDateTime(2030, 2, 12, 15, 35, 27);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(14, 10, 29, 6, 8, 34));
    }

    @Test
    public void test_301() {
        ZonedDateTime now = getPhoenixDateTime(2030, 2, 19, 21, 55, 32);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(14, 11, 5, 12, 28, 39));
    }

    @Test
    public void test_302() {
        ZonedDateTime now = getPhoenixDateTime(2030, 3, 31, 14, 27, 31);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(15, 0, 17, 5, 0, 38));
    }

    @Test
    public void test_303() {
        ZonedDateTime now = getPhoenixDateTime(2030, 4, 7, 2, 10, 4);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(15, 0, 23, 16, 43, 11));
    }

    @Test
    public void test_304() {
        ZonedDateTime now = getPhoenixDateTime(2030, 4, 7, 15, 9, 58);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(15, 0, 24, 5, 43, 5));
    }

    @Test
    public void test_305() {
        ZonedDateTime now = getPhoenixDateTime(2030, 6, 19, 1, 31, 38);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(15, 3, 4, 16, 4, 45));
    }

    @Test
    public void test_306() {
        ZonedDateTime now = getPhoenixDateTime(2030, 6, 20, 17, 53, 36);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(15, 3, 6, 8, 26, 43));
    }

    @Test
    public void test_307() {
        ZonedDateTime now = getPhoenixDateTime(2030, 7, 1, 12, 8, 1);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(15, 3, 17, 2, 41, 8));
    }

    @Test
    public void test_308() {
        ZonedDateTime now = getPhoenixDateTime(2030, 7, 15, 4, 3, 42);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(15, 4, 0, 18, 36, 49));
    }

    @Test
    public void test_309() {
        ZonedDateTime now = getPhoenixDateTime(2030, 11, 2, 18, 23, 13);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(15, 7, 19, 8, 56, 20));
    }

    @Test
    public void test_310() {
        ZonedDateTime now = getPhoenixDateTime(2030, 11, 3, 10, 17, 41);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(15, 7, 20, 0, 50, 48));
    }

    @Test
    public void test_311() {
        ZonedDateTime now = getPhoenixDateTime(2030, 11, 29, 19, 12, 46);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(15, 8, 15, 9, 45, 53));
    }

    @Test
    public void test_312() {
        ZonedDateTime now = getPhoenixDateTime(2030, 12, 10, 18, 21, 31);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(15, 8, 26, 8, 54, 38));
    }

    @Test
    public void test_313() {
        ZonedDateTime now = getPhoenixDateTime(2030, 12, 24, 1, 1, 38);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(15, 9, 9, 15, 34, 45));
    }

    @Test
    public void test_314() {
        ZonedDateTime now = getPhoenixDateTime(2031, 1, 23, 14, 42, 29);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(15, 10, 9, 5, 15, 36));
    }

    @Test
    public void test_315() {
        ZonedDateTime now = getPhoenixDateTime(2031, 2, 15, 18, 51, 53);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(15, 11, 1, 9, 25, 0));
    }

    @Test
    public void test_316() {
        ZonedDateTime now = getPhoenixDateTime(2031, 2, 19, 23, 38, 58);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(15, 11, 5, 14, 12, 5));
    }

    @Test
    public void test_317() {
        ZonedDateTime now = getPhoenixDateTime(2031, 3, 6, 0, 25, 12);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(15, 11, 19, 14, 58, 19));
    }

    @Test
    public void test_318() {
        ZonedDateTime now = getPhoenixDateTime(2031, 4, 4, 3, 30, 59);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(16, 0, 20, 18, 4, 6));
    }

    @Test
    public void test_319() {
        ZonedDateTime now = getPhoenixDateTime(2031, 5, 10, 22, 41, 9);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(16, 1, 26, 13, 14, 16));
    }

    @Test
    public void test_320() {
        ZonedDateTime now = getPhoenixDateTime(2031, 5, 17, 5, 33, 39);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(16, 2, 2, 20, 6, 46));
    }

    @Test
    public void test_321() {
        ZonedDateTime now = getPhoenixDateTime(2031, 5, 27, 6, 9, 36);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(16, 2, 12, 20, 42, 43));
    }

    @Test
    public void test_322() {
        ZonedDateTime now = getPhoenixDateTime(2031, 5, 29, 15, 3, 36);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(16, 2, 15, 5, 36, 43));
    }

    @Test
    public void test_323() {
        ZonedDateTime now = getPhoenixDateTime(2031, 6, 19, 20, 57, 30);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(16, 3, 5, 11, 30, 37));
    }

    @Test
    public void test_324() {
        ZonedDateTime now = getPhoenixDateTime(2031, 7, 13, 3, 24, 23);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(16, 3, 28, 17, 57, 30));
    }

    @Test
    public void test_325() {
        ZonedDateTime now = getPhoenixDateTime(2031, 7, 24, 9, 32, 11);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(16, 4, 10, 0, 5, 18));
    }

    @Test
    public void test_326() {
        ZonedDateTime now = getPhoenixDateTime(2031, 7, 31, 5, 58, 9);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(16, 4, 16, 20, 31, 16));
    }

    @Test
    public void test_327() {
        ZonedDateTime now = getPhoenixDateTime(2031, 8, 6, 14, 45, 1);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(16, 4, 23, 5, 18, 8));
    }

    @Test
    public void test_328() {
        ZonedDateTime now = getPhoenixDateTime(2031, 9, 2, 8, 53, 17);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(16, 5, 18, 23, 26, 24));
    }

    @Test
    public void test_329() {
        ZonedDateTime now = getPhoenixDateTime(2031, 9, 25, 19, 59, 17);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(16, 6, 11, 10, 32, 24));
    }

    @Test
    public void test_330() {
        ZonedDateTime now = getPhoenixDateTime(2031, 10, 2, 7, 57, 44);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(16, 6, 17, 22, 30, 51));
    }

    @Test
    public void test_331() {
        ZonedDateTime now = getPhoenixDateTime(2031, 10, 9, 6, 33, 3);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(16, 6, 24, 21, 6, 10));
    }

    @Test
    public void test_332() {
        ZonedDateTime now = getPhoenixDateTime(2031, 11, 18, 16, 27, 7);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(16, 8, 4, 7, 0, 14));
    }

    @Test
    public void test_333() {
        ZonedDateTime now = getPhoenixDateTime(2031, 12, 16, 2, 52, 53);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(16, 9, 1, 17, 26, 0));
    }

    @Test
    public void test_334() {
        ZonedDateTime now = getPhoenixDateTime(2031, 12, 20, 14, 36, 42);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(16, 9, 6, 5, 9, 49));
    }

    @Test
    public void test_335() {
        ZonedDateTime now = getPhoenixDateTime(2032, 1, 2, 18, 36, 48);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(16, 9, 19, 9, 9, 55));
    }

    @Test
    public void test_336() {
        ZonedDateTime now = getPhoenixDateTime(2032, 1, 24, 6, 24, 29);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(16, 10, 9, 20, 57, 36));
    }

    @Test
    public void test_337() {
        ZonedDateTime now = getPhoenixDateTime(2032, 2, 13, 4, 7, 21);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(16, 10, 29, 18, 40, 28));
    }

    @Test
    public void test_338() {
        ZonedDateTime now = getPhoenixDateTime(2032, 3, 12, 20, 46, 37);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(16, 11, 27, 11, 19, 44));
    }

    @Test
    public void test_339() {
        ZonedDateTime now = getPhoenixDateTime(2032, 3, 24, 8, 26, 59);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(17, 0, 9, 23, 0, 6));
    }

    @Test
    public void test_340() {
        ZonedDateTime now = getPhoenixDateTime(2032, 4, 16, 13, 8, 40);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(17, 1, 2, 3, 41, 47));
    }

    @Test
    public void test_341() {
        ZonedDateTime now = getPhoenixDateTime(2032, 4, 21, 7, 17, 26);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(17, 1, 6, 21, 50, 33));
    }

    @Test
    public void test_342() {
        ZonedDateTime now = getPhoenixDateTime(2032, 4, 22, 21, 28, 1);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(17, 1, 8, 12, 1, 8));
    }

    @Test
    public void test_343() {
        ZonedDateTime now = getPhoenixDateTime(2032, 4, 24, 19, 45, 33);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(17, 1, 10, 10, 18, 40));
    }

    @Test
    public void test_344() {
        ZonedDateTime now = getPhoenixDateTime(2032, 6, 22, 0, 53, 54);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(17, 3, 7, 15, 27, 1));
    }

    @Test
    public void test_345() {
        ZonedDateTime now = getPhoenixDateTime(2032, 8, 15, 13, 10, 48);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(17, 5, 1, 3, 43, 55));
    }

    @Test
    public void test_346() {
        ZonedDateTime now = getPhoenixDateTime(2032, 8, 29, 16, 17, 13);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(17, 5, 15, 6, 50, 20));
    }

    @Test
    public void test_347() {
        ZonedDateTime now = getPhoenixDateTime(2032, 8, 31, 11, 44, 2);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(17, 5, 17, 2, 17, 9));
    }

    @Test
    public void test_348() {
        ZonedDateTime now = getPhoenixDateTime(2032, 10, 4, 9, 32, 50);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(17, 6, 20, 0, 5, 57));
    }

    @Test
    public void test_349() {
        ZonedDateTime now = getPhoenixDateTime(2032, 10, 15, 10, 48, 30);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(17, 7, 1, 1, 21, 37));
    }

    @Test
    public void test_350() {
        ZonedDateTime now = getPhoenixDateTime(2032, 10, 27, 3, 56, 45);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(17, 7, 12, 18, 29, 52));
    }

    @Test
    public void test_351() {
        ZonedDateTime now = getPhoenixDateTime(2033, 1, 12, 11, 48, 47);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(17, 9, 29, 2, 21, 54));
    }

    @Test
    public void test_352() {
        ZonedDateTime now = getPhoenixDateTime(2033, 1, 25, 0, 39, 8);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(17, 10, 10, 15, 12, 15));
    }

    @Test
    public void test_353() {
        ZonedDateTime now = getPhoenixDateTime(2033, 3, 19, 2, 19, 17);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(18, 0, 4, 16, 52, 24));
    }

    @Test
    public void test_354() {
        ZonedDateTime now = getPhoenixDateTime(2033, 5, 16, 20, 22, 37);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(18, 2, 2, 10, 55, 44));
    }

    @Test
    public void test_355() {
        ZonedDateTime now = getPhoenixDateTime(2033, 6, 5, 9, 24, 48);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(18, 2, 21, 23, 57, 55));
    }

    @Test
    public void test_356() {
        ZonedDateTime now = getPhoenixDateTime(2033, 6, 9, 6, 56, 26);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(18, 2, 25, 21, 29, 33));
    }

    @Test
    public void test_357() {
        ZonedDateTime now = getPhoenixDateTime(2033, 6, 30, 5, 9, 33);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(18, 3, 15, 19, 42, 40));
    }

    @Test
    public void test_358() {
        ZonedDateTime now = getPhoenixDateTime(2033, 8, 2, 19, 7, 51);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(18, 4, 19, 9, 40, 58));
    }

    @Test
    public void test_359() {
        ZonedDateTime now = getPhoenixDateTime(2033, 8, 21, 18, 42, 38);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(18, 5, 7, 9, 15, 45));
    }

    @Test
    public void test_360() {
        ZonedDateTime now = getPhoenixDateTime(2033, 9, 29, 5, 10, 21);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(18, 6, 14, 19, 43, 28));
    }

    @Test
    public void test_361() {
        ZonedDateTime now = getPhoenixDateTime(2033, 11, 5, 5, 36, 34);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(18, 7, 21, 20, 9, 41));
    }

    @Test
    public void test_362() {
        ZonedDateTime now = getPhoenixDateTime(2033, 11, 8, 12, 58, 7);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(18, 7, 25, 3, 31, 14));
    }

    @Test
    public void test_363() {
        ZonedDateTime now = getPhoenixDateTime(2033, 12, 20, 21, 47, 20);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(18, 9, 6, 12, 20, 27));
    }

    @Test
    public void test_364() {
        ZonedDateTime now = getPhoenixDateTime(2033, 12, 25, 12, 18, 34);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(18, 9, 11, 2, 51, 41));
    }

    @Test
    public void test_365() {
        ZonedDateTime now = getPhoenixDateTime(2034, 1, 22, 2, 35, 18);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(18, 10, 7, 17, 8, 25));
    }

    @Test
    public void test_366() {
        ZonedDateTime now = getPhoenixDateTime(2034, 1, 23, 3, 25, 50);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(18, 10, 8, 17, 58, 57));
    }

    @Test
    public void test_367() {
        ZonedDateTime now = getPhoenixDateTime(2034, 1, 31, 0, 56, 20);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(18, 10, 16, 15, 29, 27));
    }

    @Test
    public void test_368() {
        ZonedDateTime now = getPhoenixDateTime(2034, 2, 28, 2, 42, 44);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(18, 11, 13, 17, 15, 51));
    }

    @Test
    public void test_369() {
        ZonedDateTime now = getPhoenixDateTime(2034, 2, 28, 20, 20, 39);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(18, 11, 14, 10, 53, 46));
    }

    @Test
    public void test_370() {
        ZonedDateTime now = getPhoenixDateTime(2034, 3, 10, 23, 59, 20);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(18, 11, 24, 14, 32, 27));
    }

    @Test
    public void test_371() {
        ZonedDateTime now = getPhoenixDateTime(2034, 3, 20, 0, 9, 58);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(19, 0, 5, 14, 43, 5));
    }

    @Test
    public void test_372() {
        ZonedDateTime now = getPhoenixDateTime(2034, 3, 26, 4, 45, 2);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(19, 0, 11, 19, 18, 9));
    }

    @Test
    public void test_373() {
        ZonedDateTime now = getPhoenixDateTime(2034, 5, 3, 4, 37, 2);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(19, 1, 18, 19, 10, 9));
    }

    @Test
    public void test_374() {
        ZonedDateTime now = getPhoenixDateTime(2034, 5, 6, 22, 44, 11);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(19, 1, 22, 13, 17, 18));
    }

    @Test
    public void test_375() {
        ZonedDateTime now = getPhoenixDateTime(2034, 5, 10, 13, 8, 21);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(19, 1, 26, 3, 41, 28));
    }

    @Test
    public void test_376() {
        ZonedDateTime now = getPhoenixDateTime(2034, 5, 23, 0, 40, 5);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(19, 2, 8, 15, 13, 12));
    }

    @Test
    public void test_377() {
        ZonedDateTime now = getPhoenixDateTime(2034, 7, 6, 1, 21, 57);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(19, 3, 21, 15, 55, 4));
    }

    @Test
    public void test_378() {
        ZonedDateTime now = getPhoenixDateTime(2034, 7, 16, 7, 9, 36);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(19, 4, 1, 21, 42, 43));
    }

    @Test
    public void test_379() {
        ZonedDateTime now = getPhoenixDateTime(2034, 7, 21, 13, 26, 10);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(19, 4, 7, 3, 59, 17));
    }

    @Test
    public void test_380() {
        ZonedDateTime now = getPhoenixDateTime(2034, 8, 31, 18, 27, 51);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(19, 5, 17, 9, 0, 58));
    }

    @Test
    public void test_381() {
        ZonedDateTime now = getPhoenixDateTime(2034, 9, 11, 23, 8, 48);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(19, 5, 28, 13, 41, 55));
    }

    @Test
    public void test_382() {
        ZonedDateTime now = getPhoenixDateTime(2034, 9, 21, 21, 56, 17);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(19, 6, 7, 12, 29, 24));
    }

    @Test
    public void test_383() {
        ZonedDateTime now = getPhoenixDateTime(2034, 9, 28, 21, 59, 55);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(19, 6, 14, 12, 33, 2));
    }

    @Test
    public void test_384() {
        ZonedDateTime now = getPhoenixDateTime(2035, 1, 13, 16, 42, 0);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(19, 9, 30, 7, 15, 7));
    }

    @Test
    public void test_385() {
        ZonedDateTime now = getPhoenixDateTime(2035, 1, 30, 17, 26, 51);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(19, 10, 16, 7, 59, 58));
    }

    @Test
    public void test_386() {
        ZonedDateTime now = getPhoenixDateTime(2035, 2, 2, 10, 6, 17);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(19, 10, 19, 0, 39, 24));
    }

    @Test
    public void test_387() {
        ZonedDateTime now = getPhoenixDateTime(2035, 2, 5, 13, 0, 30);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(19, 10, 22, 3, 33, 37));
    }

    @Test
    public void test_388() {
        ZonedDateTime now = getPhoenixDateTime(2035, 2, 6, 13, 8, 10);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(19, 10, 23, 3, 41, 17));
    }

    @Test
    public void test_389() {
        ZonedDateTime now = getPhoenixDateTime(2035, 2, 20, 1, 7, 12);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(19, 11, 5, 15, 40, 19));
    }

    @Test
    public void test_390() {
        ZonedDateTime now = getPhoenixDateTime(2035, 3, 4, 17, 23, 8);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(19, 11, 18, 7, 56, 15));
    }

    @Test
    public void test_391() {
        ZonedDateTime now = getPhoenixDateTime(2035, 4, 20, 9, 58, 26);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(20, 1, 6, 0, 31, 33));
    }

    @Test
    public void test_392() {
        ZonedDateTime now = getPhoenixDateTime(2035, 4, 29, 13, 36, 44);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(20, 1, 15, 4, 9, 51));
    }

    @Test
    public void test_393() {
        ZonedDateTime now = getPhoenixDateTime(2035, 5, 2, 9, 58, 44);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(20, 1, 18, 0, 31, 51));
    }

    @Test
    public void test_394() {
        ZonedDateTime now = getPhoenixDateTime(2035, 5, 23, 17, 8, 43);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(20, 2, 9, 7, 41, 50));
    }

    @Test
    public void test_395() {
        ZonedDateTime now = getPhoenixDateTime(2035, 6, 3, 8, 59, 13);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(20, 2, 19, 23, 32, 20));
    }

    @Test
    public void test_396() {
        ZonedDateTime now = getPhoenixDateTime(2035, 6, 16, 20, 26, 31);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(20, 3, 2, 10, 59, 38));
    }

    @Test
    public void test_397() {
        ZonedDateTime now = getPhoenixDateTime(2035, 9, 20, 17, 28, 57);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(20, 6, 6, 8, 2, 4));
    }

    @Test
    public void test_398() {
        ZonedDateTime now = getPhoenixDateTime(2035, 10, 30, 20, 26, 27);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(20, 7, 16, 10, 59, 34));
    }

    @Test
    public void test_399() {
        ZonedDateTime now = getPhoenixDateTime(2035, 11, 4, 5, 3, 51);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(20, 7, 20, 19, 36, 58));
    }

    @Test
    public void test_400() {
        ZonedDateTime now = getPhoenixDateTime(2035, 12, 31, 8, 6, 31);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(20, 9, 16, 22, 39, 38));
    }

    @Test
    public void test_401() {
        ZonedDateTime now = getPhoenixDateTime(2036, 2, 12, 21, 22, 38);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(20, 10, 29, 11, 55, 45));
    }

    @Test
    public void test_402() {
        ZonedDateTime now = getPhoenixDateTime(2036, 2, 21, 16, 59, 16);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(20, 11, 7, 7, 32, 23));
    }

    @Test
    public void test_403() {
        ZonedDateTime now = getPhoenixDateTime(2036, 3, 9, 15, 50, 57);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(20, 11, 24, 6, 24, 4));
    }

    @Test
    public void test_404() {
        ZonedDateTime now = getPhoenixDateTime(2036, 4, 13, 3, 40, 25);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(21, 0, 29, 18, 13, 32));
    }

    @Test
    public void test_405() {
        ZonedDateTime now = getPhoenixDateTime(2036, 4, 13, 22, 58, 16);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(21, 0, 30, 13, 31, 23));
    }

    @Test
    public void test_406() {
        ZonedDateTime now = getPhoenixDateTime(2036, 5, 15, 7, 34, 11);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(21, 2, 0, 22, 7, 18));
    }

    @Test
    public void test_407() {
        ZonedDateTime now = getPhoenixDateTime(2036, 5, 19, 8, 45, 17);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(21, 2, 4, 23, 18, 24));
    }

    @Test
    public void test_408() {
        ZonedDateTime now = getPhoenixDateTime(2036, 5, 29, 6, 47, 23);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(21, 2, 14, 21, 20, 30));
    }

    @Test
    public void test_409() {
        ZonedDateTime now = getPhoenixDateTime(2036, 7, 13, 6, 26, 29);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(21, 3, 28, 20, 59, 36));
    }

    @Test
    public void test_410() {
        ZonedDateTime now = getPhoenixDateTime(2036, 7, 15, 5, 29, 3);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(21, 4, 0, 20, 2, 10));
    }

    @Test
    public void test_411() {
        ZonedDateTime now = getPhoenixDateTime(2036, 8, 1, 22, 56, 54);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(21, 4, 18, 13, 30, 1));
    }

    @Test
    public void test_412() {
        ZonedDateTime now = getPhoenixDateTime(2036, 8, 10, 7, 6, 24);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(21, 4, 26, 21, 39, 31));
    }

    @Test
    public void test_413() {
        ZonedDateTime now = getPhoenixDateTime(2036, 8, 31, 11, 17, 55);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(21, 5, 17, 1, 51, 2));
    }

    @Test
    public void test_414() {
        ZonedDateTime now = getPhoenixDateTime(2036, 9, 5, 16, 50, 57);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(21, 5, 22, 7, 24, 4));
    }

    @Test
    public void test_415() {
        ZonedDateTime now = getPhoenixDateTime(2036, 10, 13, 11, 51, 8);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(21, 6, 29, 2, 24, 15));
    }

    @Test
    public void test_416() {
        ZonedDateTime now = getPhoenixDateTime(2036, 11, 1, 16, 20, 37);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(21, 7, 18, 6, 53, 44));
    }

    @Test
    public void test_417() {
        ZonedDateTime now = getPhoenixDateTime(2036, 11, 2, 22, 42, 57);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(21, 7, 19, 13, 16, 4));
    }

    @Test
    public void test_418() {
        ZonedDateTime now = getPhoenixDateTime(2036, 11, 12, 2, 34, 40);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(21, 7, 28, 17, 7, 47));
    }

    @Test
    public void test_419() {
        ZonedDateTime now = getPhoenixDateTime(2036, 12, 23, 14, 59, 18);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(21, 9, 9, 5, 32, 25));
    }

    @Test
    public void test_420() {
        ZonedDateTime now = getPhoenixDateTime(2037, 2, 9, 11, 45, 25);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(21, 10, 26, 2, 18, 32));
    }

    @Test
    public void test_421() {
        ZonedDateTime now = getPhoenixDateTime(2037, 2, 14, 9, 47, 35);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(21, 11, 0, 0, 20, 42));
    }

    @Test
    public void test_422() {
        ZonedDateTime now = getPhoenixDateTime(2037, 2, 20, 4, 22, 31);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(21, 11, 5, 18, 55, 38));
    }

    @Test
    public void test_423() {
        ZonedDateTime now = getPhoenixDateTime(2037, 2, 25, 20, 31, 53);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(21, 11, 11, 11, 5, 0));
    }

    @Test
    public void test_424() {
        ZonedDateTime now = getPhoenixDateTime(2037, 2, 26, 14, 42, 14);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(21, 11, 12, 5, 15, 21));
    }

    @Test
    public void test_425() {
        ZonedDateTime now = getPhoenixDateTime(2037, 4, 23, 22, 12, 51);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(22, 1, 9, 12, 45, 58));
    }

    @Test
    public void test_426() {
        ZonedDateTime now = getPhoenixDateTime(2037, 5, 2, 6, 27, 43);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(22, 1, 17, 21, 0, 50));
    }

    @Test
    public void test_427() {
        ZonedDateTime now = getPhoenixDateTime(2037, 5, 27, 13, 20, 9);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(22, 2, 13, 3, 53, 16));
    }

    @Test
    public void test_428() {
        ZonedDateTime now = getPhoenixDateTime(2037, 6, 3, 3, 3, 35);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(22, 2, 19, 17, 36, 42));
    }

    @Test
    public void test_429() {
        ZonedDateTime now = getPhoenixDateTime(2037, 6, 24, 1, 35, 36);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(22, 3, 9, 16, 8, 43));
    }

    @Test
    public void test_430() {
        ZonedDateTime now = getPhoenixDateTime(2037, 6, 27, 14, 53, 24);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(22, 3, 13, 5, 26, 31));
    }

    @Test
    public void test_431() {
        ZonedDateTime now = getPhoenixDateTime(2037, 7, 11, 22, 10, 42);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(22, 3, 27, 12, 43, 49));
    }

    @Test
    public void test_432() {
        ZonedDateTime now = getPhoenixDateTime(2037, 8, 2, 19, 52, 2);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(22, 4, 19, 10, 25, 9));
    }

    @Test
    public void test_433() {
        ZonedDateTime now = getPhoenixDateTime(2037, 8, 25, 18, 26, 35);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(22, 5, 11, 8, 59, 42));
    }

    @Test
    public void test_434() {
        ZonedDateTime now = getPhoenixDateTime(2037, 9, 14, 5, 28, 31);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(22, 5, 30, 20, 1, 38));
    }

    @Test
    public void test_435() {
        ZonedDateTime now = getPhoenixDateTime(2037, 10, 17, 11, 11, 13);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(22, 7, 3, 1, 44, 20));
    }

    @Test
    public void test_436() {
        ZonedDateTime now = getPhoenixDateTime(2037, 11, 9, 18, 40, 18);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(22, 7, 26, 9, 13, 25));
    }

    @Test
    public void test_437() {
        ZonedDateTime now = getPhoenixDateTime(2037, 11, 19, 22, 47, 20);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(22, 8, 5, 13, 20, 27));
    }

    @Test
    public void test_438() {
        ZonedDateTime now = getPhoenixDateTime(2037, 11, 24, 21, 29, 58);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(22, 8, 10, 12, 3, 5));
    }

    @Test
    public void test_439() {
        ZonedDateTime now = getPhoenixDateTime(2037, 11, 30, 12, 49, 31);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(22, 8, 16, 3, 22, 38));
    }

    @Test
    public void test_440() {
        ZonedDateTime now = getPhoenixDateTime(2038, 1, 20, 21, 4, 33);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(22, 10, 6, 11, 37, 40));
    }

    @Test
    public void test_441() {
        ZonedDateTime now = getPhoenixDateTime(2038, 1, 28, 7, 47, 14);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(22, 10, 13, 22, 20, 21));
    }

    @Test
    public void test_442() {
        ZonedDateTime now = getPhoenixDateTime(2038, 2, 2, 4, 15, 47);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(22, 10, 18, 18, 48, 54));
    }

    @Test
    public void test_443() {
        ZonedDateTime now = getPhoenixDateTime(2038, 2, 17, 6, 48, 57);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(22, 11, 2, 21, 22, 4));
    }

    @Test
    public void test_444() {
        ZonedDateTime now = getPhoenixDateTime(2038, 3, 12, 21, 2, 13);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(22, 11, 26, 11, 35, 20));
    }

    @Test
    public void test_445() {
        ZonedDateTime now = getPhoenixDateTime(2038, 4, 26, 18, 46, 56);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(23, 1, 12, 9, 20, 3));
    }

    @Test
    public void test_446() {
        ZonedDateTime now = getPhoenixDateTime(2038, 5, 29, 23, 19, 48);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(23, 2, 15, 13, 52, 55));
    }

    @Test
    public void test_447() {
        ZonedDateTime now = getPhoenixDateTime(2038, 7, 15, 11, 46, 3);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(23, 4, 1, 2, 19, 10));
    }

    @Test
    public void test_448() {
        ZonedDateTime now = getPhoenixDateTime(2038, 8, 17, 19, 47, 5);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(23, 5, 3, 10, 20, 12));
    }

    @Test
    public void test_449() {
        ZonedDateTime now = getPhoenixDateTime(2038, 8, 20, 12, 51, 19);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(23, 5, 6, 3, 24, 26));
    }

    @Test
    public void test_450() {
        ZonedDateTime now = getPhoenixDateTime(2038, 8, 24, 16, 52, 47);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(23, 5, 10, 7, 25, 54));
    }

    @Test
    public void test_451() {
        ZonedDateTime now = getPhoenixDateTime(2038, 9, 8, 8, 51, 13);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(23, 5, 24, 23, 24, 20));
    }

    @Test
    public void test_452() {
        ZonedDateTime now = getPhoenixDateTime(2038, 9, 14, 21, 33, 22);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(23, 6, 0, 12, 6, 29));
    }

    @Test
    public void test_453() {
        ZonedDateTime now = getPhoenixDateTime(2038, 9, 18, 0, 37, 47);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(23, 6, 3, 15, 10, 54));
    }

    @Test
    public void test_454() {
        ZonedDateTime now = getPhoenixDateTime(2038, 9, 24, 14, 2, 46);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(23, 6, 10, 4, 35, 53));
    }

    @Test
    public void test_455() {
        ZonedDateTime now = getPhoenixDateTime(2038, 10, 20, 20, 24, 54);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(23, 7, 6, 10, 58, 1));
    }

    @Test
    public void test_456() {
        ZonedDateTime now = getPhoenixDateTime(2038, 10, 23, 9, 43, 45);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(23, 7, 9, 0, 16, 52));
    }

    @Test
    public void test_457() {
        ZonedDateTime now = getPhoenixDateTime(2038, 11, 6, 5, 35, 23);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(23, 7, 22, 20, 8, 30));
    }

    @Test
    public void test_458() {
        ZonedDateTime now = getPhoenixDateTime(2038, 12, 20, 4, 35, 45);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(23, 9, 5, 19, 8, 52));
    }

    @Test
    public void test_459() {
        ZonedDateTime now = getPhoenixDateTime(2039, 1, 29, 21, 50, 17);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(23, 10, 15, 12, 23, 24));
    }

    @Test
    public void test_460() {
        ZonedDateTime now = getPhoenixDateTime(2039, 4, 5, 5, 41, 29);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(24, 0, 21, 20, 14, 36));
    }

    @Test
    public void test_461() {
        ZonedDateTime now = getPhoenixDateTime(2039, 5, 28, 7, 7, 35);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(24, 2, 13, 21, 40, 42));
    }

    @Test
    public void test_462() {
        ZonedDateTime now = getPhoenixDateTime(2039, 6, 2, 17, 44, 37);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(24, 2, 19, 8, 17, 44));
    }

    @Test
    public void test_463() {
        ZonedDateTime now = getPhoenixDateTime(2039, 6, 20, 17, 54, 21);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(24, 3, 6, 8, 27, 28));
    }

    @Test
    public void test_464() {
        ZonedDateTime now = getPhoenixDateTime(2039, 8, 21, 3, 23, 12);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(24, 5, 6, 17, 56, 19));
    }

    @Test
    public void test_465() {
        ZonedDateTime now = getPhoenixDateTime(2039, 8, 31, 9, 27, 40);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(24, 5, 17, 0, 0, 47));
    }

    @Test
    public void test_466() {
        ZonedDateTime now = getPhoenixDateTime(2039, 9, 4, 3, 10, 38);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(24, 5, 20, 17, 43, 45));
    }

    @Test
    public void test_467() {
        ZonedDateTime now = getPhoenixDateTime(2039, 9, 17, 1, 25, 36);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(24, 6, 2, 15, 58, 43));
    }

    @Test
    public void test_468() {
        ZonedDateTime now = getPhoenixDateTime(2039, 9, 26, 23, 31, 39);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(24, 6, 12, 14, 4, 46));
    }

    @Test
    public void test_469() {
        ZonedDateTime now = getPhoenixDateTime(2039, 11, 7, 2, 5, 49);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(24, 7, 23, 16, 38, 56));
    }

    @Test
    public void test_470() {
        ZonedDateTime now = getPhoenixDateTime(2039, 11, 25, 23, 9, 41);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(24, 8, 11, 13, 42, 48));
    }

    @Test
    public void test_471() {
        ZonedDateTime now = getPhoenixDateTime(2039, 12, 12, 1, 25, 9);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(24, 8, 27, 15, 58, 16));
    }

    @Test
    public void test_472() {
        ZonedDateTime now = getPhoenixDateTime(2040, 3, 4, 7, 39, 24);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(24, 11, 18, 22, 12, 31));
    }

    @Test
    public void test_473() {
        ZonedDateTime now = getPhoenixDateTime(2040, 3, 4, 17, 43, 31);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(24, 11, 19, 8, 16, 38));
    }

    @Test
    public void test_474() {
        ZonedDateTime now = getPhoenixDateTime(2040, 3, 5, 4, 38, 23);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(24, 11, 19, 19, 11, 30));
    }

    @Test
    public void test_475() {
        ZonedDateTime now = getPhoenixDateTime(2040, 5, 4, 1, 45, 0);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(25, 1, 19, 16, 18, 7));
    }

    @Test
    public void test_476() {
        ZonedDateTime now = getPhoenixDateTime(2040, 6, 11, 4, 53, 50);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(25, 2, 27, 19, 26, 57));
    }

    @Test
    public void test_477() {
        ZonedDateTime now = getPhoenixDateTime(2040, 6, 15, 3, 16, 13);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(25, 3, 0, 17, 49, 20));
    }

    @Test
    public void test_478() {
        ZonedDateTime now = getPhoenixDateTime(2040, 6, 20, 2, 20, 49);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(25, 3, 5, 16, 53, 56));
    }

    @Test
    public void test_479() {
        ZonedDateTime now = getPhoenixDateTime(2040, 8, 10, 14, 0, 41);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(25, 4, 27, 4, 33, 48));
    }

    @Test
    public void test_480() {
        ZonedDateTime now = getPhoenixDateTime(2040, 8, 17, 2, 58, 7);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(25, 5, 2, 17, 31, 14));
    }

    @Test
    public void test_481() {
        ZonedDateTime now = getPhoenixDateTime(2040, 8, 23, 8, 34, 16);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(25, 5, 8, 23, 7, 23));
    }

    @Test
    public void test_482() {
        ZonedDateTime now = getPhoenixDateTime(2040, 9, 6, 6, 9, 24);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(25, 5, 22, 20, 42, 31));
    }

    @Test
    public void test_483() {
        ZonedDateTime now = getPhoenixDateTime(2040, 10, 16, 21, 19, 25);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(25, 7, 2, 11, 52, 32));
    }

    @Test
    public void test_484() {
        ZonedDateTime now = getPhoenixDateTime(2040, 11, 5, 7, 42, 28);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(25, 7, 21, 22, 15, 35));
    }

    @Test
    public void test_485() {
        ZonedDateTime now = getPhoenixDateTime(2040, 12, 11, 2, 14, 10);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(25, 8, 26, 16, 47, 17));
    }

    @Test
    public void test_486() {
        ZonedDateTime now = getPhoenixDateTime(2041, 1, 2, 1, 19, 35);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(25, 9, 18, 15, 52, 42));
    }

    @Test
    public void test_487() {
        ZonedDateTime now = getPhoenixDateTime(2041, 3, 20, 8, 18, 32);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(26, 0, 5, 22, 51, 39));
    }

    @Test
    public void test_488() {
        ZonedDateTime now = getPhoenixDateTime(2041, 3, 23, 10, 41, 25);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(26, 0, 9, 1, 14, 32));
    }

    @Test
    public void test_489() {
        ZonedDateTime now = getPhoenixDateTime(2041, 3, 23, 22, 48, 12);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(26, 0, 9, 13, 21, 19));
    }

    @Test
    public void test_490() {
        ZonedDateTime now = getPhoenixDateTime(2041, 6, 26, 13, 32, 33);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(26, 3, 12, 4, 5, 40));
    }

    @Test
    public void test_491() {
        ZonedDateTime now = getPhoenixDateTime(2041, 6, 27, 18, 37, 55);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(26, 3, 13, 9, 11, 2));
    }

    @Test
    public void test_492() {
        ZonedDateTime now = getPhoenixDateTime(2041, 7, 7, 11, 42, 22);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(26, 3, 23, 2, 15, 29));
    }

    @Test
    public void test_493() {
        ZonedDateTime now = getPhoenixDateTime(2041, 8, 13, 4, 34, 28);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(26, 4, 29, 19, 7, 35));
    }

    @Test
    public void test_494() {
        ZonedDateTime now = getPhoenixDateTime(2041, 8, 16, 21, 33, 18);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(26, 5, 2, 12, 6, 25));
    }

    @Test
    public void test_495() {
        ZonedDateTime now = getPhoenixDateTime(2041, 9, 1, 5, 17, 16);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(26, 5, 17, 19, 50, 23));
    }

    @Test
    public void test_496() {
        ZonedDateTime now = getPhoenixDateTime(2041, 9, 5, 22, 11, 1);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(26, 5, 22, 12, 44, 8));
    }

    @Test
    public void test_497() {
        ZonedDateTime now = getPhoenixDateTime(2041, 9, 19, 23, 17, 5);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(26, 6, 5, 13, 50, 12));
    }

    @Test
    public void test_498() {
        ZonedDateTime now = getPhoenixDateTime(2041, 10, 19, 18, 35, 13);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(26, 7, 5, 9, 8, 20));
    }

    @Test
    public void test_499() {
        ZonedDateTime now = getPhoenixDateTime(2041, 11, 28, 21, 42, 2);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(26, 8, 14, 12, 15, 9));
    }

    @Test
    public void test_500() {
        ZonedDateTime now = getPhoenixDateTime(2041, 12, 2, 22, 37, 7);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(26, 8, 18, 13, 10, 14));
    }

    @Test
    public void test_501() {
        ZonedDateTime now = getPhoenixDateTime(2041, 12, 14, 13, 40, 54);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(26, 9, 0, 4, 14, 1));
    }

    @Test
    public void test_502() {
        ZonedDateTime now = getPhoenixDateTime(2041, 12, 20, 17, 49, 31);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(26, 9, 6, 8, 22, 38));
    }

    @Test
    public void test_503() {
        ZonedDateTime now = getPhoenixDateTime(2041, 12, 26, 22, 3, 28);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(26, 9, 12, 12, 36, 35));
    }

    @Test
    public void test_504() {
        ZonedDateTime now = getPhoenixDateTime(2041, 12, 30, 1, 39, 24);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(26, 9, 15, 16, 12, 31));
    }

    @Test
    public void test_505() {
        ZonedDateTime now = getPhoenixDateTime(2042, 1, 26, 16, 20, 47);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(26, 10, 12, 6, 53, 54));
    }

    @Test
    public void test_506() {
        ZonedDateTime now = getPhoenixDateTime(2042, 3, 11, 10, 0, 6);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(26, 11, 25, 0, 33, 13));
    }

    @Test
    public void test_507() {
        ZonedDateTime now = getPhoenixDateTime(2042, 4, 21, 0, 52, 4);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(27, 1, 6, 15, 25, 11));
    }

    @Test
    public void test_508() {
        ZonedDateTime now = getPhoenixDateTime(2042, 6, 1, 6, 30, 14);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(27, 2, 17, 21, 3, 21));
    }

    @Test
    public void test_509() {
        ZonedDateTime now = getPhoenixDateTime(2042, 6, 12, 7, 57, 34);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(27, 2, 28, 22, 30, 41));
    }

    @Test
    public void test_510() {
        ZonedDateTime now = getPhoenixDateTime(2042, 7, 6, 20, 17, 29);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(27, 3, 22, 10, 50, 36));
    }

    @Test
    public void test_511() {
        ZonedDateTime now = getPhoenixDateTime(2042, 7, 20, 5, 46, 8);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(27, 4, 5, 20, 19, 15));
    }

    @Test
    public void test_512() {
        ZonedDateTime now = getPhoenixDateTime(2042, 7, 21, 15, 17, 24);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(27, 4, 7, 5, 50, 31));
    }

    @Test
    public void test_513() {
        ZonedDateTime now = getPhoenixDateTime(2042, 8, 11, 23, 14, 59);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(27, 4, 28, 13, 48, 6));
    }

    @Test
    public void test_514() {
        ZonedDateTime now = getPhoenixDateTime(2042, 9, 12, 9, 58, 13);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(27, 5, 29, 0, 31, 20));
    }

    @Test
    public void test_515() {
        ZonedDateTime now = getPhoenixDateTime(2042, 10, 20, 8, 51, 9);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(27, 7, 5, 23, 24, 16));
    }

    @Test
    public void test_516() {
        ZonedDateTime now = getPhoenixDateTime(2042, 11, 25, 18, 33, 4);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(27, 8, 11, 9, 6, 11));
    }

    @Test
    public void test_517() {
        ZonedDateTime now = getPhoenixDateTime(2042, 12, 22, 23, 12, 52);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(27, 9, 8, 13, 45, 59));
    }

    @Test
    public void test_518() {
        ZonedDateTime now = getPhoenixDateTime(2043, 1, 2, 6, 40, 9);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(27, 9, 18, 21, 13, 16));
    }

    @Test
    public void test_519() {
        ZonedDateTime now = getPhoenixDateTime(2043, 1, 6, 15, 47, 57);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(27, 9, 23, 6, 21, 4));
    }

    @Test
    public void test_520() {
        ZonedDateTime now = getPhoenixDateTime(2043, 1, 6, 16, 18, 29);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(27, 9, 23, 6, 51, 36));
    }

    @Test
    public void test_521() {
        ZonedDateTime now = getPhoenixDateTime(2043, 1, 24, 17, 51, 44);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(27, 10, 10, 8, 24, 51));
    }

    @Test
    public void test_522() {
        ZonedDateTime now = getPhoenixDateTime(2043, 1, 27, 20, 16, 51);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(27, 10, 13, 10, 49, 58));
    }

    @Test
    public void test_523() {
        ZonedDateTime now = getPhoenixDateTime(2043, 1, 30, 2, 10, 1);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(27, 10, 15, 16, 43, 8));
    }

    @Test
    public void test_524() {
        ZonedDateTime now = getPhoenixDateTime(2043, 2, 3, 23, 27, 51);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(27, 10, 20, 14, 0, 58));
    }

    @Test
    public void test_525() {
        ZonedDateTime now = getPhoenixDateTime(2043, 2, 10, 2, 13, 57);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(27, 10, 26, 16, 47, 4));
    }

    @Test
    public void test_526() {
        ZonedDateTime now = getPhoenixDateTime(2043, 3, 13, 1, 51, 13);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(27, 11, 26, 16, 24, 20));
    }

    @Test
    public void test_527() {
        ZonedDateTime now = getPhoenixDateTime(2043, 4, 2, 3, 8, 12);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(28, 0, 18, 17, 41, 19));
    }

    @Test
    public void test_528() {
        ZonedDateTime now = getPhoenixDateTime(2043, 4, 25, 0, 11, 1);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(28, 1, 10, 14, 44, 8));
    }

    @Test
    public void test_529() {
        ZonedDateTime now = getPhoenixDateTime(2043, 5, 26, 11, 32, 22);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(28, 2, 12, 2, 5, 29));
    }

    @Test
    public void test_530() {
        ZonedDateTime now = getPhoenixDateTime(2043, 7, 3, 11, 15, 18);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(28, 3, 19, 1, 48, 25));
    }

    @Test
    public void test_531() {
        ZonedDateTime now = getPhoenixDateTime(2043, 7, 18, 5, 39, 50);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(28, 4, 3, 20, 12, 57));
    }

    @Test
    public void test_532() {
        ZonedDateTime now = getPhoenixDateTime(2043, 8, 28, 21, 4, 48);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(28, 5, 14, 11, 37, 55));
    }

    @Test
    public void test_533() {
        ZonedDateTime now = getPhoenixDateTime(2043, 8, 30, 20, 5, 53);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(28, 5, 16, 10, 39, 0));
    }

    @Test
    public void test_534() {
        ZonedDateTime now = getPhoenixDateTime(2043, 9, 6, 12, 19, 31);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(28, 5, 23, 2, 52, 38));
    }

    @Test
    public void test_535() {
        ZonedDateTime now = getPhoenixDateTime(2043, 9, 23, 20, 54, 5);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(28, 6, 9, 11, 27, 12));
    }

    @Test
    public void test_536() {
        ZonedDateTime now = getPhoenixDateTime(2043, 10, 5, 18, 58, 32);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(28, 6, 21, 9, 31, 39));
    }

    @Test
    public void test_537() {
        ZonedDateTime now = getPhoenixDateTime(2043, 10, 8, 11, 32, 17);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(28, 6, 24, 2, 5, 24));
    }

    @Test
    public void test_538() {
        ZonedDateTime now = getPhoenixDateTime(2043, 10, 25, 1, 49, 2);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(28, 7, 10, 16, 22, 9));
    }

    @Test
    public void test_539() {
        ZonedDateTime now = getPhoenixDateTime(2043, 11, 10, 13, 47, 51);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(28, 7, 27, 4, 20, 58));
    }

    @Test
    public void test_540() {
        ZonedDateTime now = getPhoenixDateTime(2043, 11, 19, 5, 27, 38);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(28, 8, 4, 20, 0, 45));
    }

    @Test
    public void test_541() {
        ZonedDateTime now = getPhoenixDateTime(2043, 12, 5, 18, 1, 18);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(28, 8, 21, 8, 34, 25));
    }

    @Test
    public void test_542() {
        ZonedDateTime now = getPhoenixDateTime(2043, 12, 14, 14, 13, 1);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(28, 9, 0, 4, 46, 8));
    }

    @Test
    public void test_543() {
        ZonedDateTime now = getPhoenixDateTime(2043, 12, 28, 6, 19, 14);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(28, 9, 13, 20, 52, 21));
    }

    @Test
    public void test_544() {
        ZonedDateTime now = getPhoenixDateTime(2044, 1, 1, 3, 49, 29);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(28, 9, 17, 18, 22, 36));
    }

    @Test
    public void test_545() {
        ZonedDateTime now = getPhoenixDateTime(2044, 1, 11, 0, 34, 24);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(28, 9, 27, 15, 7, 31));
    }

    @Test
    public void test_546() {
        ZonedDateTime now = getPhoenixDateTime(2044, 2, 4, 9, 16, 43);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(28, 10, 20, 23, 49, 50));
    }

    @Test
    public void test_547() {
        ZonedDateTime now = getPhoenixDateTime(2044, 3, 26, 2, 55, 51);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(29, 0, 11, 17, 28, 58));
    }

    @Test
    public void test_548() {
        ZonedDateTime now = getPhoenixDateTime(2044, 3, 30, 15, 31, 39);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(29, 0, 16, 6, 4, 46));
    }

    @Test
    public void test_549() {
        ZonedDateTime now = getPhoenixDateTime(2044, 7, 18, 11, 17, 42);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(29, 4, 4, 1, 50, 49));
    }

    @Test
    public void test_550() {
        ZonedDateTime now = getPhoenixDateTime(2044, 8, 9, 2, 21, 12);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(29, 4, 25, 16, 54, 19));
    }

    @Test
    public void test_551() {
        ZonedDateTime now = getPhoenixDateTime(2044, 9, 1, 8, 15, 17);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(29, 5, 17, 22, 48, 24));
    }

    @Test
    public void test_552() {
        ZonedDateTime now = getPhoenixDateTime(2044, 9, 8, 1, 5, 1);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(29, 5, 24, 15, 38, 8));
    }

    @Test
    public void test_553() {
        ZonedDateTime now = getPhoenixDateTime(2044, 9, 29, 22, 27, 12);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(29, 6, 15, 13, 0, 19));
    }

    @Test
    public void test_554() {
        ZonedDateTime now = getPhoenixDateTime(2044, 10, 11, 9, 37, 9);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(29, 6, 27, 0, 10, 16));
    }

    @Test
    public void test_555() {
        ZonedDateTime now = getPhoenixDateTime(2044, 11, 10, 4, 17, 58);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(29, 7, 26, 18, 51, 5));
    }

    @Test
    public void test_556() {
        ZonedDateTime now = getPhoenixDateTime(2044, 12, 23, 3, 49, 26);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(29, 9, 8, 18, 22, 33));
    }

    @Test
    public void test_557() {
        ZonedDateTime now = getPhoenixDateTime(2044, 12, 28, 0, 47, 30);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(29, 9, 13, 15, 20, 37));
    }

    @Test
    public void test_558() {
        ZonedDateTime now = getPhoenixDateTime(2045, 2, 7, 18, 20, 56);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(29, 10, 24, 8, 54, 3));
    }

    @Test
    public void test_559() {
        ZonedDateTime now = getPhoenixDateTime(2045, 2, 11, 9, 49, 44);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(29, 10, 28, 0, 22, 51));
    }

    @Test
    public void test_560() {
        ZonedDateTime now = getPhoenixDateTime(2045, 2, 14, 6, 25, 33);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(29, 10, 30, 20, 58, 40));
    }

    @Test
    public void test_561() {
        ZonedDateTime now = getPhoenixDateTime(2045, 3, 4, 10, 10, 9);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(29, 11, 18, 0, 43, 16));
    }

    @Test
    public void test_562() {
        ZonedDateTime now = getPhoenixDateTime(2045, 3, 27, 15, 43, 5);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(30, 0, 13, 6, 16, 12));
    }

    @Test
    public void test_563() {
        ZonedDateTime now = getPhoenixDateTime(2045, 4, 30, 1, 11, 43);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(30, 1, 15, 15, 44, 50));
    }

    @Test
    public void test_564() {
        ZonedDateTime now = getPhoenixDateTime(2045, 5, 9, 17, 45, 53);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(30, 1, 25, 8, 19, 0));
    }

    @Test
    public void test_565() {
        ZonedDateTime now = getPhoenixDateTime(2045, 5, 9, 18, 26, 10);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(30, 1, 25, 8, 59, 17));
    }

    @Test
    public void test_566() {
        ZonedDateTime now = getPhoenixDateTime(2045, 5, 17, 18, 16, 52);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(30, 2, 3, 8, 49, 59));
    }

    @Test
    public void test_567() {
        ZonedDateTime now = getPhoenixDateTime(2045, 5, 29, 3, 24, 37);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(30, 2, 14, 17, 57, 44));
    }

    @Test
    public void test_568() {
        ZonedDateTime now = getPhoenixDateTime(2045, 6, 16, 7, 12, 46);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(30, 3, 1, 21, 45, 53));
    }

    @Test
    public void test_569() {
        ZonedDateTime now = getPhoenixDateTime(2045, 6, 20, 1, 36, 58);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(30, 3, 5, 16, 10, 5));
    }

    @Test
    public void test_570() {
        ZonedDateTime now = getPhoenixDateTime(2045, 6, 28, 7, 46, 52);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(30, 3, 13, 22, 19, 59));
    }

    @Test
    public void test_571() {
        ZonedDateTime now = getPhoenixDateTime(2045, 7, 3, 3, 51, 15);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(30, 3, 18, 18, 24, 22));
    }

    @Test
    public void test_572() {
        ZonedDateTime now = getPhoenixDateTime(2045, 7, 3, 21, 25, 36);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(30, 3, 19, 11, 58, 43));
    }

    @Test
    public void test_573() {
        ZonedDateTime now = getPhoenixDateTime(2045, 8, 18, 2, 14, 19);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(30, 5, 3, 16, 47, 26));
    }

    @Test
    public void test_574() {
        ZonedDateTime now = getPhoenixDateTime(2045, 9, 18, 2, 8, 39);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(30, 6, 3, 16, 41, 46));
    }

    @Test
    public void test_575() {
        ZonedDateTime now = getPhoenixDateTime(2045, 9, 25, 21, 46, 36);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(30, 6, 11, 12, 19, 43));
    }

    @Test
    public void test_576() {
        ZonedDateTime now = getPhoenixDateTime(2045, 10, 2, 2, 13, 1);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(30, 6, 17, 16, 46, 8));
    }

    @Test
    public void test_577() {
        ZonedDateTime now = getPhoenixDateTime(2045, 10, 29, 0, 5, 20);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(30, 7, 14, 14, 38, 27));
    }

    @Test
    public void test_578() {
        ZonedDateTime now = getPhoenixDateTime(2045, 10, 30, 5, 29, 53);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(30, 7, 15, 20, 3, 0));
    }

    @Test
    public void test_579() {
        ZonedDateTime now = getPhoenixDateTime(2045, 11, 1, 23, 28, 22);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(30, 7, 18, 14, 1, 29));
    }

    @Test
    public void test_580() {
        ZonedDateTime now = getPhoenixDateTime(2045, 11, 6, 5, 35, 24);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(30, 7, 22, 20, 8, 31));
    }

    @Test
    public void test_581() {
        ZonedDateTime now = getPhoenixDateTime(2045, 11, 8, 21, 13, 14);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(30, 7, 25, 11, 46, 21));
    }

    @Test
    public void test_582() {
        ZonedDateTime now = getPhoenixDateTime(2045, 12, 8, 10, 38, 9);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(30, 8, 24, 1, 11, 16));
    }

    @Test
    public void test_583() {
        ZonedDateTime now = getPhoenixDateTime(2045, 12, 9, 1, 28, 6);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(30, 8, 24, 16, 1, 13));
    }

    @Test
    public void test_584() {
        ZonedDateTime now = getPhoenixDateTime(2046, 1, 22, 20, 46, 30);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(30, 10, 8, 11, 19, 37));
    }

    @Test
    public void test_585() {
        ZonedDateTime now = getPhoenixDateTime(2046, 2, 8, 23, 38, 57);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(30, 10, 25, 14, 12, 4));
    }

    @Test
    public void test_586() {
        ZonedDateTime now = getPhoenixDateTime(2046, 2, 10, 5, 39, 50);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(30, 10, 26, 20, 12, 57));
    }

    @Test
    public void test_587() {
        ZonedDateTime now = getPhoenixDateTime(2046, 2, 15, 7, 54, 45);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(30, 11, 0, 22, 27, 52));
    }

    @Test
    public void test_588() {
        ZonedDateTime now = getPhoenixDateTime(2046, 2, 21, 12, 32, 42);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(30, 11, 7, 3, 5, 49));
    }

    @Test
    public void test_589() {
        ZonedDateTime now = getPhoenixDateTime(2046, 3, 25, 7, 52, 29);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 0, 10, 22, 25, 36));
    }

    @Test
    public void test_590() {
        ZonedDateTime now = getPhoenixDateTime(2046, 4, 10, 11, 33, 7);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 0, 27, 2, 6, 14));
    }

    @Test
    public void test_591() {
        ZonedDateTime now = getPhoenixDateTime(2046, 4, 28, 20, 52, 21);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 1, 14, 11, 25, 28));
    }

    @Test
    public void test_592() {
        ZonedDateTime now = getPhoenixDateTime(2046, 5, 5, 9, 59, 22);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 1, 21, 0, 32, 29));
    }

    @Test
    public void test_593() {
        ZonedDateTime now = getPhoenixDateTime(2046, 5, 5, 11, 26, 14);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 1, 21, 1, 59, 21));
    }

    @Test
    public void test_594() {
        ZonedDateTime now = getPhoenixDateTime(2046, 5, 26, 13, 24, 5);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 2, 12, 3, 57, 12));
    }

    @Test
    public void test_595() {
        ZonedDateTime now = getPhoenixDateTime(2046, 5, 28, 5, 4, 29);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 2, 13, 19, 37, 36));
    }

    @Test
    public void test_596() {
        ZonedDateTime now = getPhoenixDateTime(2046, 6, 1, 12, 0, 10);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 2, 18, 2, 33, 17));
    }

    @Test
    public void test_597() {
        ZonedDateTime now = getPhoenixDateTime(2046, 6, 9, 19, 26, 37);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 2, 26, 9, 59, 44));
    }

    @Test
    public void test_598() {
        ZonedDateTime now = getPhoenixDateTime(2046, 6, 12, 8, 30, 58);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 2, 28, 23, 4, 5));
    }

    @Test
    public void test_599() {
        ZonedDateTime now = getPhoenixDateTime(2046, 9, 5, 17, 17, 3);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 5, 22, 7, 50, 10));
    }

    @Test
    public void test_600() {
        ZonedDateTime now = getPhoenixDateTime(2046, 10, 5, 5, 5, 6);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 6, 20, 19, 38, 13));
    }

    @Test
    public void test_601() {
        ZonedDateTime now = getPhoenixDateTime(2046, 11, 28, 21, 58, 55);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 8, 14, 12, 32, 2));
    }

    @Test
    public void test_602() {
        ZonedDateTime now = getPhoenixDateTime(2047, 1, 15, 19, 11, 6);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 10, 1, 9, 44, 13));
    }

    @Test
    public void test_603() {
        ZonedDateTime now = getPhoenixDateTime(2047, 1, 17, 15, 5, 32);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 10, 3, 5, 38, 39));
    }

    @Test
    public void test_604() {
        ZonedDateTime now = getPhoenixDateTime(2047, 1, 30, 9, 1, 57);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 10, 15, 23, 35, 4));
    }

    @Test
    public void test_605() {
        ZonedDateTime now = getPhoenixDateTime(2047, 2, 3, 9, 21, 43);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 10, 19, 23, 54, 50));
    }

    @Test
    public void test_606() {
        ZonedDateTime now = getPhoenixDateTime(2047, 2, 12, 1, 14, 50);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 10, 28, 15, 47, 57));
    }

    @Test
    public void test_607() {
        ZonedDateTime now = getPhoenixDateTime(2047, 2, 16, 23, 44, 53);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 11, 2, 14, 18, 0));
    }

    @Test
    public void test_608() {
        ZonedDateTime now = getPhoenixDateTime(2047, 2, 18, 20, 2, 23);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 11, 4, 10, 35, 30));
    }

    @Test
    public void test_609() {
        ZonedDateTime now = getPhoenixDateTime(2047, 3, 10, 13, 53, 7);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(31, 11, 24, 4, 26, 14));
    }

    @Test
    public void test_610() {
        ZonedDateTime now = getPhoenixDateTime(2047, 4, 12, 10, 24, 25);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(32, 0, 29, 0, 57, 32));
    }

    @Test
    public void test_611() {
        ZonedDateTime now = getPhoenixDateTime(2047, 4, 15, 10, 23, 55);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(32, 1, 1, 0, 57, 2));
    }

    @Test
    public void test_612() {
        ZonedDateTime now = getPhoenixDateTime(2047, 4, 15, 16, 11, 6);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(32, 1, 1, 6, 44, 13));
    }

    @Test
    public void test_613() {
        ZonedDateTime now = getPhoenixDateTime(2047, 4, 29, 10, 51, 29);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(32, 1, 15, 1, 24, 36));
    }

    @Test
    public void test_614() {
        ZonedDateTime now = getPhoenixDateTime(2047, 5, 27, 1, 36, 29);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(32, 2, 12, 16, 9, 36));
    }

    @Test
    public void test_615() {
        ZonedDateTime now = getPhoenixDateTime(2047, 5, 27, 22, 56, 51);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(32, 2, 13, 13, 29, 58));
    }

    @Test
    public void test_616() {
        ZonedDateTime now = getPhoenixDateTime(2047, 5, 30, 20, 57, 49);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(32, 2, 16, 11, 30, 56));
    }

    @Test
    public void test_617() {
        ZonedDateTime now = getPhoenixDateTime(2047, 6, 9, 19, 21, 47);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(32, 2, 26, 9, 54, 54));
    }

    @Test
    public void test_618() {
        ZonedDateTime now = getPhoenixDateTime(2047, 6, 14, 6, 12, 34);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(32, 2, 30, 20, 45, 41));
    }

    @Test
    public void test_619() {
        ZonedDateTime now = getPhoenixDateTime(2047, 7, 7, 0, 2, 5);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(32, 3, 22, 14, 35, 12));
    }

    @Test
    public void test_620() {
        ZonedDateTime now = getPhoenixDateTime(2047, 8, 20, 16, 32, 35);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(32, 5, 6, 7, 5, 42));
    }

    @Test
    public void test_621() {
        ZonedDateTime now = getPhoenixDateTime(2047, 8, 27, 11, 16, 32);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(32, 5, 13, 1, 49, 39));
    }

    @Test
    public void test_622() {
        ZonedDateTime now = getPhoenixDateTime(2047, 9, 12, 9, 41, 20);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(32, 5, 29, 0, 14, 27));
    }

    @Test
    public void test_623() {
        ZonedDateTime now = getPhoenixDateTime(2047, 10, 6, 22, 17, 1);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(32, 6, 22, 12, 50, 8));
    }

    @Test
    public void test_624() {
        ZonedDateTime now = getPhoenixDateTime(2047, 10, 21, 19, 21, 4);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(32, 7, 7, 9, 54, 11));
    }

    @Test
    public void test_625() {
        ZonedDateTime now = getPhoenixDateTime(2047, 12, 15, 13, 36, 33);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(32, 9, 1, 4, 9, 40));
    }

    @Test
    public void test_626() {
        ZonedDateTime now = getPhoenixDateTime(2047, 12, 22, 3, 36, 56);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(32, 9, 7, 18, 10, 3));
    }

    @Test
    public void test_627() {
        ZonedDateTime now = getPhoenixDateTime(2047, 12, 25, 15, 49, 4);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(32, 9, 11, 6, 22, 11));
    }

    @Test
    public void test_628() {
        ZonedDateTime now = getPhoenixDateTime(2048, 2, 6, 23, 40, 36);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(32, 10, 23, 14, 13, 43));
    }

    @Test
    public void test_629() {
        ZonedDateTime now = getPhoenixDateTime(2048, 2, 7, 17, 38, 6);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(32, 10, 24, 8, 11, 13));
    }

    @Test
    public void test_630() {
        ZonedDateTime now = getPhoenixDateTime(2048, 3, 8, 19, 54, 48);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(32, 11, 23, 10, 27, 55));
    }

    @Test
    public void test_631() {
        ZonedDateTime now = getPhoenixDateTime(2048, 4, 2, 11, 20, 21);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(33, 0, 19, 1, 53, 28));
    }

    @Test
    public void test_632() {
        ZonedDateTime now = getPhoenixDateTime(2048, 4, 8, 12, 53, 27);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(33, 0, 25, 3, 26, 34));
    }

    @Test
    public void test_633() {
        ZonedDateTime now = getPhoenixDateTime(2048, 5, 10, 12, 26, 56);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(33, 1, 26, 3, 0, 3));
    }

    @Test
    public void test_634() {
        ZonedDateTime now = getPhoenixDateTime(2048, 5, 11, 20, 6, 6);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(33, 1, 27, 10, 39, 13));
    }

    @Test
    public void test_635() {
        ZonedDateTime now = getPhoenixDateTime(2048, 6, 1, 12, 12, 0);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(33, 2, 18, 2, 45, 7));
    }

    @Test
    public void test_636() {
        ZonedDateTime now = getPhoenixDateTime(2048, 6, 8, 16, 13, 10);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(33, 2, 25, 6, 46, 17));
    }

    @Test
    public void test_637() {
        ZonedDateTime now = getPhoenixDateTime(2048, 6, 11, 11, 45, 50);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(33, 2, 28, 2, 18, 57));
    }

    @Test
    public void test_638() {
        ZonedDateTime now = getPhoenixDateTime(2048, 6, 30, 6, 17, 21);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(33, 3, 15, 20, 50, 28));
    }

    @Test
    public void test_639() {
        ZonedDateTime now = getPhoenixDateTime(2048, 7, 31, 0, 18, 57);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(33, 4, 16, 14, 52, 4));
    }

    @Test
    public void test_640() {
        ZonedDateTime now = getPhoenixDateTime(2048, 9, 3, 11, 37, 12);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(33, 5, 20, 2, 10, 19));
    }

    @Test
    public void test_641() {
        ZonedDateTime now = getPhoenixDateTime(2048, 9, 8, 7, 4, 48);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(33, 5, 24, 21, 37, 55));
    }

    @Test
    public void test_642() {
        ZonedDateTime now = getPhoenixDateTime(2048, 9, 22, 8, 5, 50);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(33, 6, 7, 22, 38, 57));
    }

    @Test
    public void test_643() {
        ZonedDateTime now = getPhoenixDateTime(2048, 10, 31, 7, 36, 42);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(33, 7, 16, 22, 9, 49));
    }

    @Test
    public void test_644() {
        ZonedDateTime now = getPhoenixDateTime(2048, 11, 8, 3, 39, 41);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(33, 7, 24, 18, 12, 48));
    }

    @Test
    public void test_645() {
        ZonedDateTime now = getPhoenixDateTime(2048, 11, 8, 17, 36, 21);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(33, 7, 25, 8, 9, 28));
    }

    @Test
    public void test_646() {
        ZonedDateTime now = getPhoenixDateTime(2048, 11, 30, 11, 11, 7);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(33, 8, 16, 1, 44, 14));
    }

    @Test
    public void test_647() {
        ZonedDateTime now = getPhoenixDateTime(2048, 12, 10, 8, 13, 35);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(33, 8, 25, 22, 46, 42));
    }

    @Test
    public void test_648() {
        ZonedDateTime now = getPhoenixDateTime(2049, 1, 9, 8, 5, 8);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(33, 9, 25, 22, 38, 15));
    }

    @Test
    public void test_649() {
        ZonedDateTime now = getPhoenixDateTime(2049, 1, 11, 19, 3, 3);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(33, 9, 28, 9, 36, 10));
    }

    @Test
    public void test_650() {
        ZonedDateTime now = getPhoenixDateTime(2049, 1, 17, 7, 23, 54);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(33, 10, 2, 21, 57, 1));
    }

    @Test
    public void test_651() {
        ZonedDateTime now = getPhoenixDateTime(2049, 3, 2, 22, 17, 8);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(33, 11, 16, 12, 50, 15));
    }

    @Test
    public void test_652() {
        ZonedDateTime now = getPhoenixDateTime(2049, 3, 5, 23, 22, 21);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(33, 11, 19, 13, 55, 28));
    }

    @Test
    public void test_653() {
        ZonedDateTime now = getPhoenixDateTime(2049, 3, 8, 2, 40, 21);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(33, 11, 21, 17, 13, 28));
    }

    @Test
    public void test_654() {
        ZonedDateTime now = getPhoenixDateTime(2049, 3, 9, 14, 41, 31);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(33, 11, 23, 5, 14, 38));
    }

    @Test
    public void test_655() {
        ZonedDateTime now = getPhoenixDateTime(2049, 3, 19, 3, 23, 29);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(34, 0, 4, 17, 56, 36));
    }

    @Test
    public void test_656() {
        ZonedDateTime now = getPhoenixDateTime(2049, 3, 19, 8, 13, 21);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(34, 0, 4, 22, 46, 28));
    }

    @Test
    public void test_657() {
        ZonedDateTime now = getPhoenixDateTime(2049, 3, 29, 11, 51, 45);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(34, 0, 15, 2, 24, 52));
    }

    @Test
    public void test_658() {
        ZonedDateTime now = getPhoenixDateTime(2049, 4, 13, 7, 23, 32);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(34, 0, 29, 21, 56, 39));
    }

    @Test
    public void test_659() {
        ZonedDateTime now = getPhoenixDateTime(2049, 4, 14, 15, 48, 37);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(34, 1, 0, 6, 21, 44));
    }

    @Test
    public void test_660() {
        ZonedDateTime now = getPhoenixDateTime(2049, 4, 26, 2, 0, 18);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(34, 1, 11, 16, 33, 25));
    }

    @Test
    public void test_661() {
        ZonedDateTime now = getPhoenixDateTime(2049, 4, 29, 16, 39, 29);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(34, 1, 15, 7, 12, 36));
    }

    @Test
    public void test_662() {
        ZonedDateTime now = getPhoenixDateTime(2049, 5, 9, 21, 31, 31);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(34, 1, 25, 12, 4, 38));
    }

    @Test
    public void test_663() {
        ZonedDateTime now = getPhoenixDateTime(2049, 5, 13, 6, 3, 58);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(34, 1, 28, 20, 37, 5));
    }

    @Test
    public void test_664() {
        ZonedDateTime now = getPhoenixDateTime(2049, 6, 1, 16, 14, 19);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(34, 2, 18, 6, 47, 26));
    }

    @Test
    public void test_665() {
        ZonedDateTime now = getPhoenixDateTime(2049, 7, 12, 2, 32, 41);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(34, 3, 27, 17, 5, 48));
    }

    @Test
    public void test_666() {
        ZonedDateTime now = getPhoenixDateTime(2049, 7, 23, 5, 6, 53);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(34, 4, 8, 19, 40, 0));
    }

    @Test
    public void test_667() {
        ZonedDateTime now = getPhoenixDateTime(2049, 8, 12, 0, 27, 12);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(34, 4, 28, 15, 0, 19));
    }

    @Test
    public void test_668() {
        ZonedDateTime now = getPhoenixDateTime(2049, 9, 7, 13, 8, 6);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(34, 5, 24, 3, 41, 13));
    }

    @Test
    public void test_669() {
        ZonedDateTime now = getPhoenixDateTime(2049, 9, 16, 12, 22, 19);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(34, 6, 2, 2, 55, 26));
    }

    @Test
    public void test_670() {
        ZonedDateTime now = getPhoenixDateTime(2049, 10, 9, 15, 20, 50);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(34, 6, 25, 5, 53, 57));
    }

    @Test
    public void test_671() {
        ZonedDateTime now = getPhoenixDateTime(2049, 10, 10, 14, 30, 36);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(34, 6, 26, 5, 3, 43));
    }

    @Test
    public void test_672() {
        ZonedDateTime now = getPhoenixDateTime(2049, 11, 15, 23, 53, 22);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(34, 8, 1, 14, 26, 29));
    }

    @Test
    public void test_673() {
        ZonedDateTime now = getPhoenixDateTime(2049, 11, 18, 17, 15, 16);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(34, 8, 4, 7, 48, 23));
    }

    @Test
    public void test_674() {
        ZonedDateTime now = getPhoenixDateTime(2049, 11, 28, 12, 13, 29);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(34, 8, 14, 2, 46, 36));
    }

    @Test
    public void test_675() {
        ZonedDateTime now = getPhoenixDateTime(2049, 12, 11, 2, 7, 16);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(34, 8, 26, 16, 40, 23));
    }

    @Test
    public void test_676() {
        ZonedDateTime now = getPhoenixDateTime(2050, 3, 1, 2, 19, 6);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(34, 11, 14, 16, 52, 13));
    }

    @Test
    public void test_677() {
        ZonedDateTime now = getPhoenixDateTime(2050, 3, 5, 15, 11, 54);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(34, 11, 19, 5, 45, 1));
    }

    @Test
    public void test_678() {
        ZonedDateTime now = getPhoenixDateTime(2050, 3, 23, 19, 10, 23);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(35, 0, 9, 9, 43, 30));
    }

    @Test
    public void test_679() {
        ZonedDateTime now = getPhoenixDateTime(2050, 4, 2, 0, 53, 31);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(35, 0, 18, 15, 26, 38));
    }

    @Test
    public void test_680() {
        ZonedDateTime now = getPhoenixDateTime(2050, 5, 5, 11, 52, 2);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(35, 1, 21, 2, 25, 9));
    }

    @Test
    public void test_681() {
        ZonedDateTime now = getPhoenixDateTime(2050, 5, 19, 20, 17, 2);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(35, 2, 5, 10, 50, 9));
    }

    @Test
    public void test_682() {
        ZonedDateTime now = getPhoenixDateTime(2050, 8, 8, 11, 55, 35);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(35, 4, 25, 2, 28, 42));
    }

    @Test
    public void test_683() {
        ZonedDateTime now = getPhoenixDateTime(2050, 9, 1, 8, 2, 25);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(35, 5, 17, 22, 35, 32));
    }

    @Test
    public void test_684() {
        ZonedDateTime now = getPhoenixDateTime(2050, 9, 13, 5, 38, 53);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(35, 5, 29, 20, 12, 0));
    }

    @Test
    public void test_685() {
        ZonedDateTime now = getPhoenixDateTime(2050, 10, 1, 10, 50, 33);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(35, 6, 17, 1, 23, 40));
    }

    @Test
    public void test_686() {
        ZonedDateTime now = getPhoenixDateTime(2050, 10, 15, 7, 15, 47);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(35, 7, 0, 21, 48, 54));
    }

    @Test
    public void test_687() {
        ZonedDateTime now = getPhoenixDateTime(2050, 11, 4, 22, 4, 42);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(35, 7, 21, 12, 37, 49));
    }

    @Test
    public void test_688() {
        ZonedDateTime now = getPhoenixDateTime(2050, 11, 12, 11, 27, 51);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(35, 7, 29, 2, 0, 58));
    }

    @Test
    public void test_689() {
        ZonedDateTime now = getPhoenixDateTime(2050, 12, 7, 13, 55, 5);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(35, 8, 23, 4, 28, 12));
    }

    @Test
    public void test_690() {
        ZonedDateTime now = getPhoenixDateTime(2050, 12, 14, 5, 3, 36);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(35, 8, 29, 19, 36, 43));
    }

    @Test
    public void test_691() {
        ZonedDateTime now = getPhoenixDateTime(2051, 1, 3, 11, 55, 59);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(35, 9, 20, 2, 29, 6));
    }

    @Test
    public void test_692() {
        ZonedDateTime now = getPhoenixDateTime(2051, 1, 4, 17, 23, 46);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(35, 9, 21, 7, 56, 53));
    }

    @Test
    public void test_693() {
        ZonedDateTime now = getPhoenixDateTime(2051, 1, 5, 21, 25, 48);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(35, 9, 22, 11, 58, 55));
    }

    @Test
    public void test_694() {
        ZonedDateTime now = getPhoenixDateTime(2051, 2, 12, 19, 5, 8);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(35, 10, 29, 9, 38, 15));
    }

    @Test
    public void test_695() {
        ZonedDateTime now = getPhoenixDateTime(2051, 3, 4, 10, 57, 27);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(35, 11, 18, 1, 30, 34));
    }

    @Test
    public void test_696() {
        ZonedDateTime now = getPhoenixDateTime(2051, 3, 17, 17, 35, 37);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(36, 0, 3, 8, 8, 44));
    }

    @Test
    public void test_697() {
        ZonedDateTime now = getPhoenixDateTime(2051, 4, 26, 6, 57, 48);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(36, 1, 11, 21, 30, 55));
    }

    @Test
    public void test_698() {
        ZonedDateTime now = getPhoenixDateTime(2051, 5, 18, 18, 34, 55);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(36, 2, 4, 9, 8, 2));
    }

    @Test
    public void test_699() {
        ZonedDateTime now = getPhoenixDateTime(2051, 6, 5, 20, 4, 51);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(36, 2, 22, 10, 37, 58));
    }

    @Test
    public void test_700() {
        ZonedDateTime now = getPhoenixDateTime(2051, 6, 22, 22, 30, 25);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(36, 3, 8, 13, 3, 32));
    }

    @Test
    public void test_701() {
        ZonedDateTime now = getPhoenixDateTime(2051, 7, 4, 13, 38, 57);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(36, 3, 20, 4, 12, 4));
    }

    @Test
    public void test_702() {
        ZonedDateTime now = getPhoenixDateTime(2051, 7, 8, 14, 19, 0);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(36, 3, 24, 4, 52, 7));
    }

    @Test
    public void test_703() {
        ZonedDateTime now = getPhoenixDateTime(2051, 7, 27, 5, 42, 5);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(36, 4, 12, 20, 15, 12));
    }

    @Test
    public void test_704() {
        ZonedDateTime now = getPhoenixDateTime(2051, 9, 2, 5, 53, 31);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(36, 5, 18, 20, 26, 38));
    }

    @Test
    public void test_705() {
        ZonedDateTime now = getPhoenixDateTime(2051, 9, 14, 6, 16, 10);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(36, 5, 30, 20, 49, 17));
    }

    @Test
    public void test_706() {
        ZonedDateTime now = getPhoenixDateTime(2051, 10, 8, 1, 0, 13);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(36, 6, 23, 15, 33, 20));
    }

    @Test
    public void test_707() {
        ZonedDateTime now = getPhoenixDateTime(2051, 10, 25, 2, 55, 58);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(36, 7, 10, 17, 29, 5));
    }

    @Test
    public void test_708() {
        ZonedDateTime now = getPhoenixDateTime(2051, 11, 8, 18, 55, 14);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(36, 7, 25, 9, 28, 21));
    }

    @Test
    public void test_709() {
        ZonedDateTime now = getPhoenixDateTime(2051, 12, 5, 11, 16, 53);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(36, 8, 21, 1, 50, 0));
    }

    @Test
    public void test_710() {
        ZonedDateTime now = getPhoenixDateTime(2052, 3, 7, 19, 1, 24);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(36, 11, 22, 9, 34, 31));
    }

    @Test
    public void test_711() {
        ZonedDateTime now = getPhoenixDateTime(2052, 4, 2, 9, 16, 31);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(37, 0, 18, 23, 49, 38));
    }

    @Test
    public void test_712() {
        ZonedDateTime now = getPhoenixDateTime(2052, 4, 18, 3, 36, 59);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(37, 1, 3, 18, 10, 6));
    }

    @Test
    public void test_713() {
        ZonedDateTime now = getPhoenixDateTime(2052, 4, 21, 2, 0, 53);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(37, 1, 6, 16, 34, 0));
    }

    @Test
    public void test_714() {
        ZonedDateTime now = getPhoenixDateTime(2052, 4, 29, 19, 9, 33);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(37, 1, 15, 9, 42, 40));
    }

    @Test
    public void test_715() {
        ZonedDateTime now = getPhoenixDateTime(2052, 5, 17, 17, 33, 31);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(37, 2, 3, 8, 6, 38));
    }

    @Test
    public void test_716() {
        ZonedDateTime now = getPhoenixDateTime(2052, 5, 19, 3, 53, 10);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(37, 2, 4, 18, 26, 17));
    }

    @Test
    public void test_717() {
        ZonedDateTime now = getPhoenixDateTime(2052, 5, 30, 5, 0, 12);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(37, 2, 15, 19, 33, 19));
    }

    @Test
    public void test_718() {
        ZonedDateTime now = getPhoenixDateTime(2052, 6, 2, 21, 40, 19);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(37, 2, 19, 12, 13, 26));
    }

    @Test
    public void test_719() {
        ZonedDateTime now = getPhoenixDateTime(2052, 6, 9, 19, 14, 3);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(37, 2, 26, 9, 47, 10));
    }

    @Test
    public void test_720() {
        ZonedDateTime now = getPhoenixDateTime(2052, 6, 13, 18, 24, 25);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(37, 2, 30, 8, 57, 32));
    }

    @Test
    public void test_721() {
        ZonedDateTime now = getPhoenixDateTime(2052, 6, 15, 15, 43, 43);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(37, 3, 1, 6, 16, 50));
    }

    @Test
    public void test_722() {
        ZonedDateTime now = getPhoenixDateTime(2052, 6, 18, 21, 32, 46);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(37, 3, 4, 12, 5, 53));
    }

    @Test
    public void test_723() {
        ZonedDateTime now = getPhoenixDateTime(2052, 7, 7, 13, 17, 28);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(37, 3, 23, 3, 50, 35));
    }

    @Test
    public void test_724() {
        ZonedDateTime now = getPhoenixDateTime(2052, 8, 6, 18, 7, 29);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(37, 4, 23, 8, 40, 36));
    }

    @Test
    public void test_725() {
        ZonedDateTime now = getPhoenixDateTime(2052, 8, 7, 2, 33, 5);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(37, 4, 23, 17, 6, 12));
    }

    @Test
    public void test_726() {
        ZonedDateTime now = getPhoenixDateTime(2052, 9, 11, 20, 8, 31);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(37, 5, 28, 10, 41, 38));
    }

    @Test
    public void test_727() {
        ZonedDateTime now = getPhoenixDateTime(2052, 9, 20, 9, 30, 27);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(37, 6, 6, 0, 3, 34));
    }

    @Test
    public void test_728() {
        ZonedDateTime now = getPhoenixDateTime(2052, 10, 16, 7, 4, 17);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(37, 7, 1, 21, 37, 24));
    }

    @Test
    public void test_729() {
        ZonedDateTime now = getPhoenixDateTime(2052, 10, 27, 0, 52, 18);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(37, 7, 12, 15, 25, 25));
    }

    @Test
    public void test_730() {
        ZonedDateTime now = getPhoenixDateTime(2052, 10, 28, 21, 23, 39);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(37, 7, 14, 11, 56, 46));
    }

    @Test
    public void test_731() {
        ZonedDateTime now = getPhoenixDateTime(2052, 11, 7, 7, 58, 59);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(37, 7, 23, 22, 32, 6));
    }

    @Test
    public void test_732() {
        ZonedDateTime now = getPhoenixDateTime(2052, 11, 10, 3, 0, 10);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(37, 7, 26, 17, 33, 17));
    }

    @Test
    public void test_733() {
        ZonedDateTime now = getPhoenixDateTime(2052, 11, 29, 7, 45, 18);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(37, 8, 14, 22, 18, 25));
    }

    @Test
    public void test_734() {
        ZonedDateTime now = getPhoenixDateTime(2052, 12, 13, 9, 27, 24);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(37, 8, 29, 0, 0, 31));
    }

    @Test
    public void test_735() {
        ZonedDateTime now = getPhoenixDateTime(2052, 12, 25, 19, 58, 49);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(37, 9, 11, 10, 31, 56));
    }

    @Test
    public void test_736() {
        ZonedDateTime now = getPhoenixDateTime(2052, 12, 30, 10, 6, 16);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(37, 9, 16, 0, 39, 23));
    }

    @Test
    public void test_737() {
        ZonedDateTime now = getPhoenixDateTime(2053, 1, 24, 7, 32, 4);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(37, 10, 9, 22, 5, 11));
    }

    @Test
    public void test_738() {
        ZonedDateTime now = getPhoenixDateTime(2053, 1, 25, 3, 31, 59);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(37, 10, 10, 18, 5, 6));
    }

    @Test
    public void test_739() {
        ZonedDateTime now = getPhoenixDateTime(2053, 2, 22, 19, 39, 0);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(37, 11, 8, 10, 12, 7));
    }

    @Test
    public void test_740() {
        ZonedDateTime now = getPhoenixDateTime(2053, 3, 3, 13, 37, 51);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(37, 11, 17, 4, 10, 58));
    }

    @Test
    public void test_741() {
        ZonedDateTime now = getPhoenixDateTime(2053, 3, 3, 18, 4, 42);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(37, 11, 17, 8, 37, 49));
    }

    @Test
    public void test_742() {
        ZonedDateTime now = getPhoenixDateTime(2053, 3, 19, 10, 7, 31);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(38, 0, 5, 0, 40, 38));
    }

    @Test
    public void test_743() {
        ZonedDateTime now = getPhoenixDateTime(2053, 4, 24, 2, 23, 2);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(38, 1, 9, 16, 56, 9));
    }

    @Test
    public void test_744() {
        ZonedDateTime now = getPhoenixDateTime(2053, 5, 4, 18, 34, 48);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(38, 1, 20, 9, 7, 55));
    }

    @Test
    public void test_745() {
        ZonedDateTime now = getPhoenixDateTime(2053, 5, 5, 23, 31, 13);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(38, 1, 21, 14, 4, 20));
    }

    @Test
    public void test_746() {
        ZonedDateTime now = getPhoenixDateTime(2053, 5, 7, 21, 42, 48);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(38, 1, 23, 12, 15, 55));
    }

    @Test
    public void test_747() {
        ZonedDateTime now = getPhoenixDateTime(2053, 5, 9, 7, 7, 32);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(38, 1, 24, 21, 40, 39));
    }

    @Test
    public void test_748() {
        ZonedDateTime now = getPhoenixDateTime(2053, 5, 10, 6, 20, 53);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(38, 1, 25, 20, 54, 0));
    }

    @Test
    public void test_749() {
        ZonedDateTime now = getPhoenixDateTime(2053, 5, 30, 23, 5, 36);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(38, 2, 16, 13, 38, 43));
    }

    @Test
    public void test_750() {
        ZonedDateTime now = getPhoenixDateTime(2053, 6, 10, 1, 32, 44);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(38, 2, 26, 16, 5, 51));
    }

    @Test
    public void test_751() {
        ZonedDateTime now = getPhoenixDateTime(2053, 6, 27, 18, 17, 29);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(38, 3, 13, 8, 50, 36));
    }

    @Test
    public void test_752() {
        ZonedDateTime now = getPhoenixDateTime(2053, 7, 15, 1, 21, 53);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(38, 4, 0, 15, 55, 0));
    }

    @Test
    public void test_753() {
        ZonedDateTime now = getPhoenixDateTime(2053, 7, 24, 13, 27, 56);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(38, 4, 10, 4, 1, 3));
    }

    @Test
    public void test_754() {
        ZonedDateTime now = getPhoenixDateTime(2053, 8, 1, 19, 47, 17);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(38, 4, 18, 10, 20, 24));
    }

    @Test
    public void test_755() {
        ZonedDateTime now = getPhoenixDateTime(2053, 8, 2, 7, 46, 35);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(38, 4, 18, 22, 19, 42));
    }

    @Test
    public void test_756() {
        ZonedDateTime now = getPhoenixDateTime(2053, 8, 24, 7, 59, 22);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(38, 5, 9, 22, 32, 29));
    }

    @Test
    public void test_757() {
        ZonedDateTime now = getPhoenixDateTime(2053, 9, 1, 23, 15, 39);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(38, 5, 18, 13, 48, 46));
    }

    @Test
    public void test_758() {
        ZonedDateTime now = getPhoenixDateTime(2053, 10, 21, 6, 34, 55);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(38, 7, 6, 21, 8, 2));
    }

    @Test
    public void test_759() {
        ZonedDateTime now = getPhoenixDateTime(2053, 11, 12, 11, 27, 49);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(38, 7, 29, 2, 0, 56));
    }

    @Test
    public void test_760() {
        ZonedDateTime now = getPhoenixDateTime(2053, 11, 19, 20, 1, 1);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(38, 8, 5, 10, 34, 8));
    }

    @Test
    public void test_761() {
        ZonedDateTime now = getPhoenixDateTime(2053, 12, 5, 5, 2, 34);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(38, 8, 20, 19, 35, 41));
    }

    @Test
    public void test_762() {
        ZonedDateTime now = getPhoenixDateTime(2053, 12, 19, 10, 7, 28);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(38, 9, 5, 0, 40, 35));
    }

    @Test
    public void test_763() {
        ZonedDateTime now = getPhoenixDateTime(2053, 12, 23, 3, 44, 0);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(38, 9, 8, 18, 17, 7));
    }

    @Test
    public void test_764() {
        ZonedDateTime now = getPhoenixDateTime(2054, 1, 14, 13, 29, 44);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(38, 10, 0, 4, 2, 51));
    }

    @Test
    public void test_765() {
        ZonedDateTime now = getPhoenixDateTime(2054, 3, 18, 7, 29, 52);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(39, 0, 3, 22, 2, 59));
    }

    @Test
    public void test_766() {
        ZonedDateTime now = getPhoenixDateTime(2054, 5, 1, 20, 29, 24);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(39, 1, 17, 11, 2, 31));
    }

    @Test
    public void test_767() {
        ZonedDateTime now = getPhoenixDateTime(2054, 5, 3, 20, 23, 55);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(39, 1, 19, 10, 57, 2));
    }

    @Test
    public void test_768() {
        ZonedDateTime now = getPhoenixDateTime(2054, 5, 19, 8, 58, 0);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(39, 2, 4, 23, 31, 7));
    }

    @Test
    public void test_769() {
        ZonedDateTime now = getPhoenixDateTime(2054, 7, 14, 2, 4, 55);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(39, 3, 29, 16, 38, 2));
    }

    @Test
    public void test_770() {
        ZonedDateTime now = getPhoenixDateTime(2054, 8, 5, 4, 24, 43);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(39, 4, 21, 18, 57, 50));
    }

    @Test
    public void test_771() {
        ZonedDateTime now = getPhoenixDateTime(2054, 9, 8, 21, 38, 53);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(39, 5, 25, 12, 12, 0));
    }

    @Test
    public void test_772() {
        ZonedDateTime now = getPhoenixDateTime(2054, 10, 14, 9, 49, 10);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(39, 7, 0, 0, 22, 17));
    }

    @Test
    public void test_773() {
        ZonedDateTime now = getPhoenixDateTime(2054, 11, 30, 15, 57, 55);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(39, 8, 16, 6, 31, 2));
    }

    @Test
    public void test_774() {
        ZonedDateTime now = getPhoenixDateTime(2054, 12, 4, 10, 36, 42);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(39, 8, 20, 1, 9, 49));
    }

    @Test
    public void test_775() {
        ZonedDateTime now = getPhoenixDateTime(2055, 1, 23, 12, 39, 42);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(39, 10, 9, 3, 12, 49));
    }

    @Test
    public void test_776() {
        ZonedDateTime now = getPhoenixDateTime(2055, 2, 22, 8, 31, 42);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(39, 11, 7, 23, 4, 49));
    }

    @Test
    public void test_777() {
        ZonedDateTime now = getPhoenixDateTime(2055, 3, 7, 8, 0, 5);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(39, 11, 20, 22, 33, 12));
    }

    @Test
    public void test_778() {
        ZonedDateTime now = getPhoenixDateTime(2055, 3, 11, 1, 6, 6);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(39, 11, 24, 15, 39, 13));
    }

    @Test
    public void test_779() {
        ZonedDateTime now = getPhoenixDateTime(2055, 3, 26, 3, 22, 36);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(40, 0, 11, 17, 55, 43));
    }

    @Test
    public void test_780() {
        ZonedDateTime now = getPhoenixDateTime(2055, 4, 10, 11, 44, 2);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(40, 0, 27, 2, 17, 9));
    }

    @Test
    public void test_781() {
        ZonedDateTime now = getPhoenixDateTime(2055, 4, 17, 13, 22, 13);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(40, 1, 3, 3, 55, 20));
    }

    @Test
    public void test_782() {
        ZonedDateTime now = getPhoenixDateTime(2055, 4, 29, 22, 16, 22);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(40, 1, 15, 12, 49, 29));
    }

    @Test
    public void test_783() {
        ZonedDateTime now = getPhoenixDateTime(2055, 4, 30, 22, 26, 58);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(40, 1, 16, 13, 0, 5));
    }

    @Test
    public void test_784() {
        ZonedDateTime now = getPhoenixDateTime(2055, 5, 18, 14, 11, 15);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(40, 2, 4, 4, 44, 22));
    }

    @Test
    public void test_785() {
        ZonedDateTime now = getPhoenixDateTime(2055, 5, 26, 5, 32, 1);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(40, 2, 11, 20, 5, 8));
    }

    @Test
    public void test_786() {
        ZonedDateTime now = getPhoenixDateTime(2055, 6, 14, 18, 49, 14);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(40, 3, 0, 9, 22, 21));
    }

    @Test
    public void test_787() {
        ZonedDateTime now = getPhoenixDateTime(2055, 6, 18, 21, 11, 13);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(40, 3, 4, 11, 44, 20));
    }

    @Test
    public void test_788() {
        ZonedDateTime now = getPhoenixDateTime(2055, 7, 12, 13, 11, 58);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(40, 3, 28, 3, 45, 5));
    }

    @Test
    public void test_789() {
        ZonedDateTime now = getPhoenixDateTime(2055, 7, 22, 19, 47, 55);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(40, 4, 8, 10, 21, 2));
    }

    @Test
    public void test_790() {
        ZonedDateTime now = getPhoenixDateTime(2055, 8, 28, 22, 4, 56);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(40, 5, 14, 12, 38, 3));
    }

    @Test
    public void test_791() {
        ZonedDateTime now = getPhoenixDateTime(2055, 9, 24, 9, 39, 37);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(40, 6, 10, 0, 12, 44));
    }

    @Test
    public void test_792() {
        ZonedDateTime now = getPhoenixDateTime(2055, 10, 22, 19, 13, 54);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(40, 7, 8, 9, 47, 1));
    }

    @Test
    public void test_793() {
        ZonedDateTime now = getPhoenixDateTime(2055, 10, 30, 6, 7, 46);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(40, 7, 15, 20, 40, 53));
    }

    @Test
    public void test_794() {
        ZonedDateTime now = getPhoenixDateTime(2055, 11, 13, 5, 28, 58);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(40, 7, 29, 20, 2, 5));
    }

    @Test
    public void test_795() {
        ZonedDateTime now = getPhoenixDateTime(2055, 11, 19, 2, 54, 30);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(40, 8, 4, 17, 27, 37));
    }

    @Test
    public void test_796() {
        ZonedDateTime now = getPhoenixDateTime(2056, 1, 13, 8, 56, 43);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(40, 9, 29, 23, 29, 50));
    }

    @Test
    public void test_797() {
        ZonedDateTime now = getPhoenixDateTime(2056, 1, 27, 6, 10, 57);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(40, 10, 12, 20, 44, 4));
    }

    @Test
    public void test_798() {
        ZonedDateTime now = getPhoenixDateTime(2056, 2, 5, 20, 34, 29);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(40, 10, 22, 11, 7, 36));
    }

    @Test
    public void test_799() {
        ZonedDateTime now = getPhoenixDateTime(2056, 2, 20, 22, 43, 55);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(40, 11, 6, 13, 17, 2));
    }

    @Test
    public void test_800() {
        ZonedDateTime now = getPhoenixDateTime(2056, 3, 8, 16, 56, 9);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(40, 11, 23, 7, 29, 16));
    }

    @Test
    public void test_801() {
        ZonedDateTime now = getPhoenixDateTime(2056, 3, 16, 20, 7, 40);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(41, 0, 2, 10, 40, 47));
    }

    @Test
    public void test_802() {
        ZonedDateTime now = getPhoenixDateTime(2056, 3, 17, 15, 59, 50);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(41, 0, 3, 6, 32, 57));
    }

    @Test
    public void test_803() {
        ZonedDateTime now = getPhoenixDateTime(2056, 4, 5, 17, 26, 10);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(41, 0, 22, 7, 59, 17));
    }

    @Test
    public void test_804() {
        ZonedDateTime now = getPhoenixDateTime(2056, 4, 17, 5, 40, 14);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(41, 1, 2, 20, 13, 21));
    }

    @Test
    public void test_805() {
        ZonedDateTime now = getPhoenixDateTime(2056, 4, 17, 18, 21, 39);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(41, 1, 3, 8, 54, 46));
    }

    @Test
    public void test_806() {
        ZonedDateTime now = getPhoenixDateTime(2056, 4, 22, 16, 42, 8);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(41, 1, 8, 7, 15, 15));
    }

    @Test
    public void test_807() {
        ZonedDateTime now = getPhoenixDateTime(2056, 4, 28, 9, 18, 0);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(41, 1, 13, 23, 51, 7));
    }

    @Test
    public void test_808() {
        ZonedDateTime now = getPhoenixDateTime(2056, 5, 20, 20, 0, 11);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(41, 2, 6, 10, 33, 18));
    }

    @Test
    public void test_809() {
        ZonedDateTime now = getPhoenixDateTime(2056, 6, 12, 20, 13, 37);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(41, 2, 29, 10, 46, 44));
    }

    @Test
    public void test_810() {
        ZonedDateTime now = getPhoenixDateTime(2056, 6, 18, 8, 51, 41);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(41, 3, 3, 23, 24, 48));
    }

    @Test
    public void test_811() {
        ZonedDateTime now = getPhoenixDateTime(2056, 7, 4, 2, 7, 56);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(41, 3, 19, 16, 41, 3));
    }

    @Test
    public void test_812() {
        ZonedDateTime now = getPhoenixDateTime(2056, 7, 4, 10, 51, 8);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(41, 3, 20, 1, 24, 15));
    }

    @Test
    public void test_813() {
        ZonedDateTime now = getPhoenixDateTime(2056, 7, 8, 23, 40, 30);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(41, 3, 24, 14, 13, 37));
    }

    @Test
    public void test_814() {
        ZonedDateTime now = getPhoenixDateTime(2056, 9, 26, 2, 36, 11);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(41, 6, 11, 17, 9, 18));
    }

    @Test
    public void test_815() {
        ZonedDateTime now = getPhoenixDateTime(2056, 10, 1, 19, 59, 41);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(41, 6, 17, 10, 32, 48));
    }

    @Test
    public void test_816() {
        ZonedDateTime now = getPhoenixDateTime(2056, 10, 23, 9, 27, 53);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(41, 7, 9, 0, 1, 0));
    }

    @Test
    public void test_817() {
        ZonedDateTime now = getPhoenixDateTime(2056, 11, 13, 1, 2, 3);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(41, 7, 29, 15, 35, 10));
    }

    @Test
    public void test_818() {
        ZonedDateTime now = getPhoenixDateTime(2056, 11, 18, 12, 18, 24);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(41, 8, 4, 2, 51, 31));
    }

    @Test
    public void test_819() {
        ZonedDateTime now = getPhoenixDateTime(2056, 11, 26, 10, 22, 15);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(41, 8, 12, 0, 55, 22));
    }

    @Test
    public void test_820() {
        ZonedDateTime now = getPhoenixDateTime(2056, 12, 5, 4, 2, 59);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(41, 8, 20, 18, 36, 6));
    }

    @Test
    public void test_821() {
        ZonedDateTime now = getPhoenixDateTime(2056, 12, 26, 17, 9, 25);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(41, 9, 12, 7, 42, 32));
    }

    @Test
    public void test_822() {
        ZonedDateTime now = getPhoenixDateTime(2056, 12, 30, 1, 0, 43);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(41, 9, 15, 15, 33, 50));
    }

    @Test
    public void test_823() {
        ZonedDateTime now = getPhoenixDateTime(2057, 1, 28, 1, 18, 7);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(41, 10, 13, 15, 51, 14));
    }

    @Test
    public void test_824() {
        ZonedDateTime now = getPhoenixDateTime(2057, 2, 16, 16, 28, 47);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(41, 11, 2, 7, 1, 54));
    }

    @Test
    public void test_825() {
        ZonedDateTime now = getPhoenixDateTime(2057, 2, 17, 21, 47, 52);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(41, 11, 3, 12, 20, 59));
    }

    @Test
    public void test_826() {
        ZonedDateTime now = getPhoenixDateTime(2057, 3, 2, 0, 6, 43);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(41, 11, 15, 14, 39, 50));
    }

    @Test
    public void test_827() {
        ZonedDateTime now = getPhoenixDateTime(2057, 4, 18, 11, 42, 23);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(42, 1, 4, 2, 15, 30));
    }

    @Test
    public void test_828() {
        ZonedDateTime now = getPhoenixDateTime(2057, 4, 23, 4, 35, 48);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(42, 1, 8, 19, 8, 55));
    }

    @Test
    public void test_829() {
        ZonedDateTime now = getPhoenixDateTime(2057, 4, 26, 12, 53, 58);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(42, 1, 12, 3, 27, 5));
    }

    @Test
    public void test_830() {
        ZonedDateTime now = getPhoenixDateTime(2057, 5, 6, 10, 23, 14);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(42, 1, 22, 0, 56, 21));
    }

    @Test
    public void test_831() {
        ZonedDateTime now = getPhoenixDateTime(2057, 5, 27, 19, 47, 43);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(42, 2, 13, 10, 20, 50));
    }

    @Test
    public void test_832() {
        ZonedDateTime now = getPhoenixDateTime(2057, 5, 29, 11, 1, 33);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(42, 2, 15, 1, 34, 40));
    }

    @Test
    public void test_833() {
        ZonedDateTime now = getPhoenixDateTime(2057, 6, 17, 22, 40, 38);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(42, 3, 3, 13, 13, 45));
    }

    @Test
    public void test_834() {
        ZonedDateTime now = getPhoenixDateTime(2057, 6, 26, 22, 24, 3);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(42, 3, 12, 12, 57, 10));
    }

    @Test
    public void test_835() {
        ZonedDateTime now = getPhoenixDateTime(2057, 7, 14, 0, 24, 50);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(42, 3, 29, 14, 57, 57));
    }

    @Test
    public void test_836() {
        ZonedDateTime now = getPhoenixDateTime(2057, 7, 17, 19, 6, 53);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(42, 4, 3, 9, 40, 0));
    }

    @Test
    public void test_837() {
        ZonedDateTime now = getPhoenixDateTime(2057, 9, 18, 6, 25, 23);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(42, 6, 3, 20, 58, 30));
    }

    @Test
    public void test_838() {
        ZonedDateTime now = getPhoenixDateTime(2057, 11, 18, 6, 34, 19);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(42, 8, 3, 21, 7, 26));
    }

    @Test
    public void test_839() {
        ZonedDateTime now = getPhoenixDateTime(2057, 12, 20, 14, 24, 58);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(42, 9, 6, 4, 58, 5));
    }

    @Test
    public void test_840() {
        ZonedDateTime now = getPhoenixDateTime(2058, 1, 11, 9, 26, 24);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(42, 9, 27, 23, 59, 31));
    }

    @Test
    public void test_841() {
        ZonedDateTime now = getPhoenixDateTime(2058, 1, 31, 17, 0, 16);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(42, 10, 17, 7, 33, 23));
    }

    @Test
    public void test_842() {
        ZonedDateTime now = getPhoenixDateTime(2058, 4, 21, 9, 2, 39);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(43, 1, 6, 23, 35, 46));
    }

    @Test
    public void test_843() {
        ZonedDateTime now = getPhoenixDateTime(2058, 5, 25, 16, 48, 8);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(43, 2, 11, 7, 21, 15));
    }

    @Test
    public void test_844() {
        ZonedDateTime now = getPhoenixDateTime(2058, 6, 1, 1, 11, 9);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(43, 2, 17, 15, 44, 16));
    }

    @Test
    public void test_845() {
        ZonedDateTime now = getPhoenixDateTime(2058, 7, 4, 16, 41, 52);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(43, 3, 20, 7, 14, 59));
    }

    @Test
    public void test_846() {
        ZonedDateTime now = getPhoenixDateTime(2058, 7, 8, 21, 4, 38);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(43, 3, 24, 11, 37, 45));
    }

    @Test
    public void test_847() {
        ZonedDateTime now = getPhoenixDateTime(2058, 7, 11, 20, 29, 58);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(43, 3, 27, 11, 3, 5));
    }

    @Test
    public void test_848() {
        ZonedDateTime now = getPhoenixDateTime(2058, 7, 14, 17, 13, 24);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(43, 4, 0, 7, 46, 31));
    }

    @Test
    public void test_849() {
        ZonedDateTime now = getPhoenixDateTime(2058, 7, 19, 12, 59, 36);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(43, 4, 5, 3, 32, 43));
    }

    @Test
    public void test_850() {
        ZonedDateTime now = getPhoenixDateTime(2058, 7, 19, 20, 32, 29);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(43, 4, 5, 11, 5, 36));
    }

    @Test
    public void test_851() {
        ZonedDateTime now = getPhoenixDateTime(2058, 7, 24, 14, 2, 11);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(43, 4, 10, 4, 35, 18));
    }

    @Test
    public void test_852() {
        ZonedDateTime now = getPhoenixDateTime(2058, 8, 5, 5, 49, 50);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(43, 4, 21, 20, 22, 57));
    }

    @Test
    public void test_853() {
        ZonedDateTime now = getPhoenixDateTime(2058, 8, 7, 2, 17, 54);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(43, 4, 23, 16, 51, 1));
    }

    @Test
    public void test_854() {
        ZonedDateTime now = getPhoenixDateTime(2058, 8, 20, 0, 36, 9);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(43, 5, 5, 15, 9, 16));
    }

    @Test
    public void test_855() {
        ZonedDateTime now = getPhoenixDateTime(2058, 8, 26, 17, 39, 40);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(43, 5, 12, 8, 12, 47));
    }

    @Test
    public void test_856() {
        ZonedDateTime now = getPhoenixDateTime(2058, 9, 7, 8, 39, 37);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(43, 5, 23, 23, 12, 44));
    }

    @Test
    public void test_857() {
        ZonedDateTime now = getPhoenixDateTime(2058, 9, 18, 11, 15, 4);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(43, 6, 4, 1, 48, 11));
    }

    @Test
    public void test_858() {
        ZonedDateTime now = getPhoenixDateTime(2058, 9, 26, 3, 42, 30);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(43, 6, 11, 18, 15, 37));
    }

    @Test
    public void test_859() {
        ZonedDateTime now = getPhoenixDateTime(2058, 9, 29, 19, 50, 48);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(43, 6, 15, 10, 23, 55));
    }

    @Test
    public void test_860() {
        ZonedDateTime now = getPhoenixDateTime(2058, 10, 23, 2, 32, 8);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(43, 7, 8, 17, 5, 15));
    }

    @Test
    public void test_861() {
        ZonedDateTime now = getPhoenixDateTime(2058, 11, 15, 4, 14, 31);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(43, 8, 0, 18, 47, 38));
    }

    @Test
    public void test_862() {
        ZonedDateTime now = getPhoenixDateTime(2058, 11, 23, 3, 54, 15);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(43, 8, 8, 18, 27, 22));
    }

    @Test
    public void test_863() {
        ZonedDateTime now = getPhoenixDateTime(2059, 1, 9, 20, 41, 48);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(43, 9, 26, 11, 14, 55));
    }

    @Test
    public void test_864() {
        ZonedDateTime now = getPhoenixDateTime(2059, 1, 11, 6, 54, 28);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(43, 9, 27, 21, 27, 35));
    }

    @Test
    public void test_865() {
        ZonedDateTime now = getPhoenixDateTime(2059, 2, 14, 20, 4, 36);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(43, 11, 0, 10, 37, 43));
    }

    @Test
    public void test_866() {
        ZonedDateTime now = getPhoenixDateTime(2059, 4, 6, 1, 47, 57);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(44, 0, 22, 16, 21, 4));
    }

    @Test
    public void test_867() {
        ZonedDateTime now = getPhoenixDateTime(2059, 4, 18, 16, 52, 21);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(44, 1, 4, 7, 25, 28));
    }

    @Test
    public void test_868() {
        ZonedDateTime now = getPhoenixDateTime(2059, 4, 21, 11, 42, 39);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(44, 1, 7, 2, 15, 46));
    }

    @Test
    public void test_869() {
        ZonedDateTime now = getPhoenixDateTime(2059, 4, 28, 23, 44, 52);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(44, 1, 14, 14, 17, 59));
    }

    @Test
    public void test_870() {
        ZonedDateTime now = getPhoenixDateTime(2059, 4, 29, 2, 53, 59);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(44, 1, 14, 17, 27, 6));
    }

    @Test
    public void test_871() {
        ZonedDateTime now = getPhoenixDateTime(2059, 7, 26, 16, 17, 16);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(44, 4, 12, 6, 50, 23));
    }

    @Test
    public void test_872() {
        ZonedDateTime now = getPhoenixDateTime(2059, 8, 5, 11, 2, 39);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(44, 4, 22, 1, 35, 46));
    }

    @Test
    public void test_873() {
        ZonedDateTime now = getPhoenixDateTime(2059, 8, 16, 14, 39, 35);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(44, 5, 2, 5, 12, 42));
    }

    @Test
    public void test_874() {
        ZonedDateTime now = getPhoenixDateTime(2059, 9, 13, 8, 19, 27);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(44, 5, 29, 22, 52, 34));
    }

    @Test
    public void test_875() {
        ZonedDateTime now = getPhoenixDateTime(2059, 9, 28, 13, 1, 38);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(44, 6, 14, 3, 34, 45));
    }

    @Test
    public void test_876() {
        ZonedDateTime now = getPhoenixDateTime(2059, 10, 3, 1, 52, 2);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(44, 6, 18, 16, 25, 9));
    }

    @Test
    public void test_877() {
        ZonedDateTime now = getPhoenixDateTime(2059, 11, 5, 4, 4, 5);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(44, 7, 21, 18, 37, 12));
    }

    @Test
    public void test_878() {
        ZonedDateTime now = getPhoenixDateTime(2059, 11, 25, 0, 5, 40);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(44, 8, 10, 14, 38, 47));
    }

    @Test
    public void test_879() {
        ZonedDateTime now = getPhoenixDateTime(2059, 12, 28, 21, 30, 27);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(44, 9, 14, 12, 3, 34));
    }

    @Test
    public void test_880() {
        ZonedDateTime now = getPhoenixDateTime(2060, 2, 14, 15, 10, 27);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(44, 11, 0, 5, 43, 34));
    }

    @Test
    public void test_881() {
        ZonedDateTime now = getPhoenixDateTime(2060, 3, 10, 2, 31, 14);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(44, 11, 24, 17, 4, 21));
    }

    @Test
    public void test_882() {
        ZonedDateTime now = getPhoenixDateTime(2060, 3, 12, 16, 49, 32);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(44, 11, 27, 7, 22, 39));
    }

    @Test
    public void test_883() {
        ZonedDateTime now = getPhoenixDateTime(2060, 6, 16, 5, 19, 22);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(45, 3, 1, 19, 52, 29));
    }

    @Test
    public void test_884() {
        ZonedDateTime now = getPhoenixDateTime(2060, 6, 27, 8, 50, 47);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(45, 3, 12, 23, 23, 54));
    }

    @Test
    public void test_885() {
        ZonedDateTime now = getPhoenixDateTime(2060, 7, 16, 2, 22, 42);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(45, 4, 1, 16, 55, 49));
    }

    @Test
    public void test_886() {
        ZonedDateTime now = getPhoenixDateTime(2060, 10, 12, 3, 50, 38);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(45, 6, 27, 18, 23, 45));
    }

    @Test
    public void test_887() {
        ZonedDateTime now = getPhoenixDateTime(2060, 11, 6, 3, 3, 59);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(45, 7, 22, 17, 37, 6));
    }

    @Test
    public void test_888() {
        ZonedDateTime now = getPhoenixDateTime(2060, 11, 24, 17, 7, 35);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(45, 8, 10, 7, 40, 42));
    }

    @Test
    public void test_889() {
        ZonedDateTime now = getPhoenixDateTime(2060, 12, 7, 2, 41, 17);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(45, 8, 22, 17, 14, 24));
    }

    @Test
    public void test_890() {
        ZonedDateTime now = getPhoenixDateTime(2061, 1, 20, 0, 15, 19);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(45, 10, 5, 14, 48, 26));
    }

    @Test
    public void test_891() {
        ZonedDateTime now = getPhoenixDateTime(2061, 2, 13, 7, 13, 11);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(45, 10, 29, 21, 46, 18));
    }

    @Test
    public void test_892() {
        ZonedDateTime now = getPhoenixDateTime(2061, 2, 26, 17, 17, 8);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(45, 11, 12, 7, 50, 15));
    }

    @Test
    public void test_893() {
        ZonedDateTime now = getPhoenixDateTime(2061, 3, 7, 7, 21, 4);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(45, 11, 20, 21, 54, 11));
    }

    @Test
    public void test_894() {
        ZonedDateTime now = getPhoenixDateTime(2061, 3, 25, 17, 16, 11);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(46, 0, 11, 7, 49, 18));
    }

    @Test
    public void test_895() {
        ZonedDateTime now = getPhoenixDateTime(2061, 3, 26, 5, 26, 0);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(46, 0, 11, 19, 59, 7));
    }

    @Test
    public void test_896() {
        ZonedDateTime now = getPhoenixDateTime(2061, 4, 10, 3, 48, 33);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(46, 0, 26, 18, 21, 40));
    }

    @Test
    public void test_897() {
        ZonedDateTime now = getPhoenixDateTime(2061, 5, 14, 18, 49, 19);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(46, 2, 0, 9, 22, 26));
    }

    @Test
    public void test_898() {
        ZonedDateTime now = getPhoenixDateTime(2061, 6, 21, 13, 22, 26);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(46, 3, 7, 3, 55, 33));
    }

    @Test
    public void test_899() {
        ZonedDateTime now = getPhoenixDateTime(2061, 7, 1, 20, 43, 48);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(46, 3, 17, 11, 16, 55));
    }

    @Test
    public void test_900() {
        ZonedDateTime now = getPhoenixDateTime(2061, 7, 26, 11, 13, 9);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(46, 4, 12, 1, 46, 16));
    }

    @Test
    public void test_901() {
        ZonedDateTime now = getPhoenixDateTime(2061, 7, 28, 4, 55, 13);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(46, 4, 13, 19, 28, 20));
    }

    @Test
    public void test_902() {
        ZonedDateTime now = getPhoenixDateTime(2061, 7, 30, 2, 46, 25);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(46, 4, 15, 17, 19, 32));
    }

    @Test
    public void test_903() {
        ZonedDateTime now = getPhoenixDateTime(2061, 8, 8, 17, 35, 37);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(46, 4, 25, 8, 8, 44));
    }

    @Test
    public void test_904() {
        ZonedDateTime now = getPhoenixDateTime(2061, 8, 13, 22, 57, 44);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(46, 4, 30, 13, 30, 51));
    }

    @Test
    public void test_905() {
        ZonedDateTime now = getPhoenixDateTime(2061, 8, 15, 18, 54, 23);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(46, 5, 1, 9, 27, 30));
    }

    @Test
    public void test_906() {
        ZonedDateTime now = getPhoenixDateTime(2061, 10, 5, 18, 39, 53);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(46, 6, 21, 9, 13, 0));
    }

    @Test
    public void test_907() {
        ZonedDateTime now = getPhoenixDateTime(2061, 10, 11, 7, 24, 36);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(46, 6, 26, 21, 57, 43));
    }

    @Test
    public void test_908() {
        ZonedDateTime now = getPhoenixDateTime(2061, 10, 11, 12, 38, 16);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(46, 6, 27, 3, 11, 23));
    }

    @Test
    public void test_909() {
        ZonedDateTime now = getPhoenixDateTime(2061, 10, 21, 0, 5, 56);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(46, 7, 6, 14, 39, 3));
    }

    @Test
    public void test_910() {
        ZonedDateTime now = getPhoenixDateTime(2061, 12, 15, 17, 16, 26);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(46, 9, 1, 7, 49, 33));
    }

    @Test
    public void test_911() {
        ZonedDateTime now = getPhoenixDateTime(2061, 12, 30, 7, 55, 39);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(46, 9, 15, 22, 28, 46));
    }

    @Test
    public void test_912() {
        ZonedDateTime now = getPhoenixDateTime(2062, 1, 5, 18, 3, 13);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(46, 9, 22, 8, 36, 20));
    }

    @Test
    public void test_913() {
        ZonedDateTime now = getPhoenixDateTime(2062, 1, 8, 6, 9, 18);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(46, 9, 24, 20, 42, 25));
    }

    @Test
    public void test_914() {
        ZonedDateTime now = getPhoenixDateTime(2062, 1, 24, 13, 3, 16);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(46, 10, 10, 3, 36, 23));
    }

    @Test
    public void test_915() {
        ZonedDateTime now = getPhoenixDateTime(2062, 1, 25, 8, 29, 35);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(46, 10, 10, 23, 2, 42));
    }

    @Test
    public void test_916() {
        ZonedDateTime now = getPhoenixDateTime(2062, 1, 28, 4, 12, 40);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(46, 10, 13, 18, 45, 47));
    }

    @Test
    public void test_917() {
        ZonedDateTime now = getPhoenixDateTime(2062, 3, 23, 14, 20, 41);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(47, 0, 9, 4, 53, 48));
    }

    @Test
    public void test_918() {
        ZonedDateTime now = getPhoenixDateTime(2062, 4, 5, 20, 30, 48);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(47, 0, 22, 11, 3, 55));
    }

    @Test
    public void test_919() {
        ZonedDateTime now = getPhoenixDateTime(2062, 4, 10, 17, 47, 36);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(47, 0, 27, 8, 20, 43));
    }

    @Test
    public void test_920() {
        ZonedDateTime now = getPhoenixDateTime(2062, 4, 10, 20, 54, 22);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(47, 0, 27, 11, 27, 29));
    }

    @Test
    public void test_921() {
        ZonedDateTime now = getPhoenixDateTime(2062, 4, 30, 10, 43, 25);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(47, 1, 16, 1, 16, 32));
    }

    @Test
    public void test_922() {
        ZonedDateTime now = getPhoenixDateTime(2062, 5, 19, 1, 55, 29);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(47, 2, 4, 16, 28, 36));
    }

    @Test
    public void test_923() {
        ZonedDateTime now = getPhoenixDateTime(2062, 5, 22, 11, 23, 45);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(47, 2, 8, 1, 56, 52));
    }

    @Test
    public void test_924() {
        ZonedDateTime now = getPhoenixDateTime(2062, 6, 15, 11, 25, 46);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(47, 3, 1, 1, 58, 53));
    }

    @Test
    public void test_925() {
        ZonedDateTime now = getPhoenixDateTime(2062, 6, 19, 5, 18, 50);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(47, 3, 4, 19, 51, 57));
    }

    @Test
    public void test_926() {
        ZonedDateTime now = getPhoenixDateTime(2062, 7, 8, 2, 15, 12);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(47, 3, 23, 16, 48, 19));
    }

    @Test
    public void test_927() {
        ZonedDateTime now = getPhoenixDateTime(2062, 8, 4, 12, 3, 51);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(47, 4, 21, 2, 36, 58));
    }

    @Test
    public void test_928() {
        ZonedDateTime now = getPhoenixDateTime(2062, 8, 7, 23, 56, 9);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(47, 4, 24, 14, 29, 16));
    }

    @Test
    public void test_929() {
        ZonedDateTime now = getPhoenixDateTime(2062, 8, 14, 4, 6, 16);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(47, 4, 30, 18, 39, 23));
    }

    @Test
    public void test_930() {
        ZonedDateTime now = getPhoenixDateTime(2062, 8, 22, 19, 52, 31);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(47, 5, 8, 10, 25, 38));
    }

    @Test
    public void test_931() {
        ZonedDateTime now = getPhoenixDateTime(2062, 9, 9, 9, 45, 34);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(47, 5, 26, 0, 18, 41));
    }

    @Test
    public void test_932() {
        ZonedDateTime now = getPhoenixDateTime(2062, 9, 12, 1, 2, 55);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(47, 5, 28, 15, 36, 2));
    }

    @Test
    public void test_933() {
        ZonedDateTime now = getPhoenixDateTime(2062, 9, 12, 7, 47, 52);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(47, 5, 28, 22, 20, 59));
    }

    @Test
    public void test_934() {
        ZonedDateTime now = getPhoenixDateTime(2062, 10, 14, 9, 56, 55);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(47, 7, 0, 0, 30, 2));
    }

    @Test
    public void test_935() {
        ZonedDateTime now = getPhoenixDateTime(2062, 11, 14, 13, 22, 46);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(47, 8, 0, 3, 55, 53));
    }

    @Test
    public void test_936() {
        ZonedDateTime now = getPhoenixDateTime(2062, 12, 18, 23, 21, 7);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(47, 9, 4, 13, 54, 14));
    }

    @Test
    public void test_937() {
        ZonedDateTime now = getPhoenixDateTime(2062, 12, 26, 17, 33, 33);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(47, 9, 12, 8, 6, 40));
    }

    @Test
    public void test_938() {
        ZonedDateTime now = getPhoenixDateTime(2063, 2, 2, 8, 53, 58);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(47, 10, 18, 23, 27, 5));
    }

    @Test
    public void test_939() {
        ZonedDateTime now = getPhoenixDateTime(2063, 2, 5, 12, 45, 39);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(47, 10, 22, 3, 18, 46));
    }

    @Test
    public void test_940() {
        ZonedDateTime now = getPhoenixDateTime(2063, 2, 23, 5, 20, 58);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(47, 11, 8, 19, 54, 5));
    }

    @Test
    public void test_941() {
        ZonedDateTime now = getPhoenixDateTime(2063, 3, 18, 2, 38, 7);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(48, 0, 3, 17, 11, 14));
    }

    @Test
    public void test_942() {
        ZonedDateTime now = getPhoenixDateTime(2063, 4, 2, 11, 18, 54);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(48, 0, 19, 1, 52, 1));
    }

    @Test
    public void test_943() {
        ZonedDateTime now = getPhoenixDateTime(2063, 4, 9, 8, 58, 18);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(48, 0, 25, 23, 31, 25));
    }

    @Test
    public void test_944() {
        ZonedDateTime now = getPhoenixDateTime(2063, 4, 9, 21, 51, 2);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(48, 0, 26, 12, 24, 9));
    }

    @Test
    public void test_945() {
        ZonedDateTime now = getPhoenixDateTime(2063, 4, 13, 1, 42, 33);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(48, 0, 29, 16, 15, 40));
    }

    @Test
    public void test_946() {
        ZonedDateTime now = getPhoenixDateTime(2063, 5, 25, 7, 44, 4);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(48, 2, 10, 22, 17, 11));
    }

    @Test
    public void test_947() {
        ZonedDateTime now = getPhoenixDateTime(2063, 5, 26, 14, 37, 41);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(48, 2, 12, 5, 10, 48));
    }

    @Test
    public void test_948() {
        ZonedDateTime now = getPhoenixDateTime(2063, 6, 4, 2, 39, 16);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(48, 2, 20, 17, 12, 23));
    }

    @Test
    public void test_949() {
        ZonedDateTime now = getPhoenixDateTime(2063, 6, 13, 2, 2, 17);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(48, 2, 29, 16, 35, 24));
    }

    @Test
    public void test_950() {
        ZonedDateTime now = getPhoenixDateTime(2063, 7, 8, 6, 14, 11);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(48, 3, 23, 20, 47, 18));
    }

    @Test
    public void test_951() {
        ZonedDateTime now = getPhoenixDateTime(2063, 8, 8, 0, 45, 42);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(48, 4, 24, 15, 18, 49));
    }

    @Test
    public void test_952() {
        ZonedDateTime now = getPhoenixDateTime(2063, 8, 24, 4, 37, 55);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(48, 5, 9, 19, 11, 2));
    }

    @Test
    public void test_953() {
        ZonedDateTime now = getPhoenixDateTime(2063, 9, 3, 14, 22, 4);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(48, 5, 20, 4, 55, 11));
    }

    @Test
    public void test_954() {
        ZonedDateTime now = getPhoenixDateTime(2063, 9, 8, 2, 13, 27);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(48, 5, 24, 16, 46, 34));
    }

    @Test
    public void test_955() {
        ZonedDateTime now = getPhoenixDateTime(2063, 9, 9, 9, 4, 55);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(48, 5, 25, 23, 38, 2));
    }

    @Test
    public void test_956() {
        ZonedDateTime now = getPhoenixDateTime(2063, 9, 21, 23, 7, 24);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(48, 6, 7, 13, 40, 31));
    }

    @Test
    public void test_957() {
        ZonedDateTime now = getPhoenixDateTime(2063, 10, 10, 19, 39, 28);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(48, 6, 26, 10, 12, 35));
    }

    @Test
    public void test_958() {
        ZonedDateTime now = getPhoenixDateTime(2063, 11, 16, 9, 47, 50);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(48, 8, 2, 0, 20, 57));
    }

    @Test
    public void test_959() {
        ZonedDateTime now = getPhoenixDateTime(2063, 11, 23, 21, 41, 54);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(48, 8, 9, 12, 15, 1));
    }

    @Test
    public void test_960() {
        ZonedDateTime now = getPhoenixDateTime(2063, 12, 16, 19, 47, 24);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(48, 9, 2, 10, 20, 31));
    }

    @Test
    public void test_961() {
        ZonedDateTime now = getPhoenixDateTime(2063, 12, 25, 20, 21, 8);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(48, 9, 11, 10, 54, 15));
    }

    @Test
    public void test_962() {
        ZonedDateTime now = getPhoenixDateTime(2063, 12, 26, 8, 51, 26);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(48, 9, 11, 23, 24, 33));
    }

    @Test
    public void test_963() {
        ZonedDateTime now = getPhoenixDateTime(2063, 12, 26, 14, 14, 6);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(48, 9, 12, 4, 47, 13));
    }

    @Test
    public void test_964() {
        ZonedDateTime now = getPhoenixDateTime(2063, 12, 27, 11, 9, 30);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(48, 9, 13, 1, 42, 37));
    }

    @Test
    public void test_965() {
        ZonedDateTime now = getPhoenixDateTime(2064, 2, 1, 17, 8, 49);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(48, 10, 18, 7, 41, 56));
    }

    @Test
    public void test_966() {
        ZonedDateTime now = getPhoenixDateTime(2064, 3, 10, 11, 54, 8);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(48, 11, 25, 2, 27, 15));
    }

    @Test
    public void test_967() {
        ZonedDateTime now = getPhoenixDateTime(2064, 4, 7, 6, 54, 24);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(49, 0, 23, 21, 27, 31));
    }

    @Test
    public void test_968() {
        ZonedDateTime now = getPhoenixDateTime(2064, 4, 10, 17, 39, 18);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(49, 0, 27, 8, 12, 25));
    }

    @Test
    public void test_969() {
        ZonedDateTime now = getPhoenixDateTime(2064, 4, 13, 7, 43, 35);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(49, 0, 29, 22, 16, 42));
    }

    @Test
    public void test_970() {
        ZonedDateTime now = getPhoenixDateTime(2064, 4, 13, 12, 8, 23);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(49, 0, 30, 2, 41, 30));
    }

    @Test
    public void test_971() {
        ZonedDateTime now = getPhoenixDateTime(2064, 4, 15, 3, 24, 14);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(49, 1, 0, 17, 57, 21));
    }

    @Test
    public void test_972() {
        ZonedDateTime now = getPhoenixDateTime(2064, 4, 17, 15, 5, 42);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(49, 1, 3, 5, 38, 49));
    }

    @Test
    public void test_973() {
        ZonedDateTime now = getPhoenixDateTime(2064, 5, 6, 9, 6, 56);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(49, 1, 21, 23, 40, 3));
    }

    @Test
    public void test_974() {
        ZonedDateTime now = getPhoenixDateTime(2064, 5, 25, 9, 42, 40);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(49, 2, 11, 0, 15, 47));
    }

    @Test
    public void test_975() {
        ZonedDateTime now = getPhoenixDateTime(2064, 5, 31, 5, 46, 36);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(49, 2, 16, 20, 19, 43));
    }

    @Test
    public void test_976() {
        ZonedDateTime now = getPhoenixDateTime(2064, 6, 21, 21, 9, 31);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(49, 3, 7, 11, 42, 38));
    }

    @Test
    public void test_977() {
        ZonedDateTime now = getPhoenixDateTime(2064, 8, 20, 6, 10, 23);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(49, 5, 5, 20, 43, 30));
    }

    @Test
    public void test_978() {
        ZonedDateTime now = getPhoenixDateTime(2064, 9, 25, 16, 9, 10);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(49, 6, 11, 6, 42, 17));
    }

    @Test
    public void test_979() {
        ZonedDateTime now = getPhoenixDateTime(2064, 9, 27, 0, 41, 16);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(49, 6, 12, 15, 14, 23));
    }

    @Test
    public void test_980() {
        ZonedDateTime now = getPhoenixDateTime(2064, 10, 16, 19, 36, 41);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(49, 7, 2, 10, 9, 48));
    }

    @Test
    public void test_981() {
        ZonedDateTime now = getPhoenixDateTime(2064, 10, 21, 14, 12, 48);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(49, 7, 7, 4, 45, 55));
    }

    @Test
    public void test_982() {
        ZonedDateTime now = getPhoenixDateTime(2064, 11, 24, 0, 28, 21);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(49, 8, 9, 15, 1, 28));
    }

    @Test
    public void test_983() {
        ZonedDateTime now = getPhoenixDateTime(2065, 1, 19, 4, 44, 26);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(49, 10, 4, 19, 17, 33));
    }

    @Test
    public void test_984() {
        ZonedDateTime now = getPhoenixDateTime(2065, 1, 27, 15, 18, 58);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(49, 10, 13, 5, 52, 5));
    }

    @Test
    public void test_985() {
        ZonedDateTime now = getPhoenixDateTime(2065, 1, 28, 5, 19, 15);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(49, 10, 13, 19, 52, 22));
    }

    @Test
    public void test_986() {
        ZonedDateTime now = getPhoenixDateTime(2065, 3, 21, 6, 58, 4);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(50, 0, 6, 21, 31, 11));
    }

    @Test
    public void test_987() {
        ZonedDateTime now = getPhoenixDateTime(2065, 5, 4, 14, 36, 25);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(50, 1, 20, 5, 9, 32));
    }

    @Test
    public void test_988() {
        ZonedDateTime now = getPhoenixDateTime(2065, 5, 8, 5, 17, 0);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(50, 1, 23, 19, 50, 7));
    }

    @Test
    public void test_989() {
        ZonedDateTime now = getPhoenixDateTime(2065, 5, 13, 18, 22, 21);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(50, 1, 29, 8, 55, 28));
    }

    @Test
    public void test_990() {
        ZonedDateTime now = getPhoenixDateTime(2065, 5, 16, 23, 25, 48);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(50, 2, 2, 13, 58, 55));
    }

    @Test
    public void test_991() {
        ZonedDateTime now = getPhoenixDateTime(2065, 6, 1, 10, 8, 22);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(50, 2, 18, 0, 41, 29));
    }

    @Test
    public void test_992() {
        ZonedDateTime now = getPhoenixDateTime(2065, 6, 19, 23, 6, 1);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(50, 3, 5, 13, 39, 8));
    }

    @Test
    public void test_993() {
        ZonedDateTime now = getPhoenixDateTime(2065, 6, 26, 14, 12, 37);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(50, 3, 12, 4, 45, 44));
    }

    @Test
    public void test_994() {
        ZonedDateTime now = getPhoenixDateTime(2065, 7, 13, 22, 48, 15);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(50, 3, 29, 13, 21, 22));
    }

    @Test
    public void test_995() {
        ZonedDateTime now = getPhoenixDateTime(2065, 7, 25, 4, 57, 11);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(50, 4, 10, 19, 30, 18));
    }

    @Test
    public void test_996() {
        ZonedDateTime now = getPhoenixDateTime(2065, 8, 3, 2, 59, 6);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(50, 4, 19, 17, 32, 13));
    }

    @Test
    public void test_997() {
        ZonedDateTime now = getPhoenixDateTime(2065, 10, 21, 5, 39, 40);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(50, 7, 6, 20, 12, 47));
    }

    @Test
    public void test_998() {
        ZonedDateTime now = getPhoenixDateTime(2065, 11, 18, 18, 32, 6);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(50, 8, 4, 9, 5, 13));
    }

    @Test
    public void test_999() {
        ZonedDateTime now = getPhoenixDateTime(2065, 12, 28, 22, 25, 59);
        Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(now);
        assertDuration(marriedDuration, new Duration(50, 9, 14, 12, 59, 6));
    }

    private ZonedDateTime getPhoenixDateTime(int year, int month, int dayOfMonth, int hour, int minute, int second)
    {
        return ZonedDateTime.of(year, month, dayOfMonth, hour, minute, second, 0, ZoneId.of("US/Arizona"));
    }

    private void assertDuration(Duration actualDuration, Duration expectedDuration)
    {
        assertThat(actualDuration.getYears()).isEqualTo(expectedDuration.getYears());
        assertThat(actualDuration.getMonths()).isEqualTo(expectedDuration.getMonths());
        assertThat(actualDuration.getDays()).isEqualTo(expectedDuration.getDays());

        assertThat(actualDuration.getHours()).isEqualTo(expectedDuration.getHours());
        assertThat(actualDuration.getMinutes()).isEqualTo(expectedDuration.getMinutes());
        assertThat(actualDuration.getSeconds()).isEqualTo(expectedDuration.getSeconds());
    }
}