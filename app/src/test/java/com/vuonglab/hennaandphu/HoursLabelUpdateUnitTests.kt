package com.vuonglab.hennaandphu;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;
import static com.vuonglab.hennaandphu.UIUpdateOptimizationsKt.getLabelUpdate;

public class HoursLabelUpdateUnitTests {
    @Test
    public void appStartZeroHour() {
        runTest(-1, 0, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void appStartOneHour() {
        runTest(-1, 1, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void appStartTwoHours() {
        runTest(-1, 2, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void appStartTwentyThreeHours() {
        runTest(-1, 23, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void zeroToOneHour() {
        runTest(0, 1, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void zeroToTwoHours() {
        runTest(0, 2, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void zeroToTwentyThreeHours() {
        runTest(0, 23, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void zeroToZeroHour() {
        runTest(0, 0, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void oneToTwoHours() {
        runTest(1, 2, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void oneToTwentyThreeHours() {
        runTest(1, 23, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void oneToZeroHour() {
        runTest(1, 0, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void oneToOneHour() {
        runTest(1, 1, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToThreeHours() {
        runTest(2, 3, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToSeventeenHours() {
        runTest(2, 17, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToTwentyThreeHours() {
        runTest(2, 23, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToZeroHour() {
        runTest(2, 0, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void twoToOneHour() {
        runTest(2, 1, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void twoToTwoHours() {
        runTest(2, 2, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void threeToFourHours() {
        runTest(3, 4, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void threeToFourteenHours() {
        runTest(3, 14, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void threeToTwentyThreeHours() {
        runTest(3, 23, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void threeToZeroHour() {
        runTest(3, 0, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void threeToOneHour() {
        runTest(3, 1, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void threeToTwoHours() {
        runTest(3, 2, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void threeToThreeHours() {
        runTest(3, 3, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void sixteenToTwentyThreeHours() {
        runTest(16, 23, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void sixteenToZeroHour() {
        runTest(16, 0, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void sixteenToOneHour() {
        runTest(16, 1, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void sixteenToTwoHours() {
        runTest(16, 2, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twentyThreeToZeroHour() {
        runTest(23, 0, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void twentyThreeToOneHour() {
        runTest(23, 1, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void twentyThreeToTwoHours() {
        runTest(23, 2, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twentyThreeToTenHours() {
        runTest(23, 10, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twentyThreeToTwentyHours() {
        runTest(23, 20, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twentyThreeToTwentyThreeHours() {
        runTest(23, 23, LabelUpdate.NOT_NEEDED);
    }

    private void runTest(long previousHoursDuration, long currentHoursDuration, LabelUpdate expectedLabelUpdate) {
        LabelUpdate labelUpdate = getLabelUpdate(currentHoursDuration, previousHoursDuration);
        assertThat(labelUpdate).isEqualTo(expectedLabelUpdate);
    }
}