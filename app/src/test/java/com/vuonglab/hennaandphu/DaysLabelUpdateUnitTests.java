package com.vuonglab.hennaandphu;

import com.vuonglab.hennaandphu.UIUpdateOptimizations.LabelUpdate;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;
import static com.vuonglab.hennaandphu.UIUpdateOptimizations.getLabelUpdate;

public class DaysLabelUpdateUnitTests {
    @Test
    public void appStartZeroDay() {
        runTest(-1, 0, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void appStartOneDay() {
        runTest(-1, 1, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void appStartTwoDays() {
        runTest(-1, 2, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void appStartThirteenDays() {
        runTest(-1, 13, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void appStartTwentySevenDays() {
        runTest(-1, 27, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void appStartTwentyEightDays() {
        runTest(-1, 28, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void appStartTwentyNineDays() {
        runTest(-1, 29, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void appStartThirtyDays() {
        runTest(-1, 30, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void zeroToOneDay() {
        runTest(0, 1, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void zeroToTwoDays() {
        runTest(0, 2, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void zeroToElevenDays() {
        runTest(0, 11, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void zeroToTwentySevenDays() {
        runTest(0, 27, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void zeroToTwentyEightDays() {
        runTest(0, 28, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void zeroToTwentyNineDays() {
        runTest(0, 29, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void zeroToThirtyDays() {
        runTest(0, 30, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void zeroToZeroDay() {
        runTest(0, 0, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void oneToTwoDays() {
        runTest(1, 2, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void oneToNineDays() {
        runTest(1, 9, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void oneToTwentySevenDays() {
        runTest(1, 27, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void oneToTwentyEightDays() {
        runTest(1, 28, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void oneToTwentyNineDays() {
        runTest(1, 29, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void oneToThirtyDays() {
        runTest(1, 30, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void oneToZeroDay() {
        runTest(1, 0, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void oneToOneDay() {
        runTest(1, 1, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToThreeDays() {
        runTest(2, 3, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToSeventeenDays() {
        runTest(2, 17, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToTwentyThreeDays() {
        runTest(2, 23, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToTwentySevenDays() {
        runTest(2, 27, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToTwentyEightDays() {
        runTest(2, 28, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToTwentyNineDays() {
        runTest(2, 29, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToThirtyDays() {
        runTest(2, 30, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToZeroDay() {
        runTest(2, 0, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void twoToOneDay() {
        runTest(2, 1, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void twoToTwoDays() {
        runTest(2, 2, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void threeToFourDays() {
        runTest(3, 4, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void threeToTwelveDays() {
        runTest(3, 12, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void threeToTwentyTwoDays() {
        runTest(3, 22, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void threeToTwentySevenDays() {
        runTest(3, 27, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void threeToTwentyEightDays() {
        runTest(3, 28, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void threeToTwentyNineDays() {
        runTest(3, 29, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void threeToThirtyDays() {
        runTest(3, 30, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void threeToZeroDay() {
        runTest(3, 0, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void threeToOneDay() {
        runTest(3, 1, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void threeToTwoDays() {
        runTest(3, 2, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void threeToThreeDays() {
        runTest(3, 3, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void sixteenToSeventeenDays() {
        runTest(16, 17, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void sixteenToTwentyOneDays() {
        runTest(16, 21, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void sixteenToTwentySevenDays() {
        runTest(16, 27, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void sixteenToTwentyEightDays() {
        runTest(16, 28, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void sixteenToTwentyNineDays() {
        runTest(16, 29, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void sixteenToThirtyDays() {
        runTest(16, 30, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void sixteenToZeroDay() {
        runTest(16, 0, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void sixteenToOneDay() {
        runTest(16, 1, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void sixteenToTwoDays() {
        runTest(16, 2, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void sixteenToSixteenDays() {
        runTest(16, 16, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twentyThreeToZeroDay() {
        runTest(23, 0, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void twentyThreeToOneDay() {
        runTest(23, 1, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void twentyThreeToTwoDays() {
        runTest(23, 2, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twentyThreeToTenDays() {
        runTest(23, 10, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twentyThreeToTwentyDays() {
        runTest(23, 20, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twentyThreeToTwentyThreeDays() {
        runTest(23, 23, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twentyThreeToTwentySevenDays() {
        runTest(23, 27, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twentyThreeToTwentyEightDays() {
        runTest(23, 28, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twentyThreeToTwentyNineDays() {
        runTest(23, 29, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twentyThreeToThirtyDays() {
        runTest(23, 30, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twentySevenToTwentySevenDays() {
        runTest(27, 27, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twentySevenToTwentyEightDays() {
        runTest(27, 28, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twentySevenToTwentyNineDays() {
        runTest(27, 29, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twentySevenToThirtyDays() {
        runTest(27, 30, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twentySevenToZeroDay() {
        runTest(27, 0, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void twentySevenToOneDay() {
        runTest(27, 1, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void twentySevenToTwoDays() {
        runTest(27, 2, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twentySevenToTenDays() {
        runTest(27, 10, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twentyEightToTwentyEightDays() {
        runTest(28, 28, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twentyEightToTwentyNineDays() {
        runTest(28, 29, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twentyEightToThirtyDays() {
        runTest(28, 30, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twentyEightToZeroDay() {
        runTest(28, 0, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void twentyEightToOneDay() {
        runTest(28, 1, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void twentyEightToTwoDays() {
        runTest(28, 2, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twentyEightToFourteenDays() {
        runTest(28, 14, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twentyNineToTwentyNineDays() {
        runTest(29, 29, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twentyNineToThirtyDays() {
        runTest(29, 30, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twentyNineToZeroDay() {
        runTest(29, 0, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void twentyNineToOneDay() {
        runTest(29, 1, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void twentyNineToTwoDays() {
        runTest(29, 29, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twentyNineToEighteenDays() {
        runTest(29, 18, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void thirtyToThirtyDays() {
        runTest(30, 30, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void thirtyToZeroDay() {
        runTest(30, 0, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void thirtyToOneDay() {
        runTest(30, 1, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void thirtyToTwoDays() {
        runTest(30, 2, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void thirtyToTwentyTwoDays() {
        runTest(30, 22, LabelUpdate.NOT_NEEDED);
    }

    private void runTest(long previousDaysDuration, long currentDaysDuration, LabelUpdate expectedLabelUpdate) {
        LabelUpdate labelUpdate = getLabelUpdate(currentDaysDuration, previousDaysDuration);
        assertThat(labelUpdate).isEqualTo(expectedLabelUpdate);
    }
}