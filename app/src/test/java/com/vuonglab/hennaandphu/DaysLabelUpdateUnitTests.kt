package com.vuonglab.hennaandphu

import com.google.common.truth.Truth
import org.junit.Test

class DaysLabelUpdateUnitTests {
    @Test
    fun appStartZeroDay() {
        runTest(-1, 0, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun appStartOneDay() {
        runTest(-1, 1, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun appStartTwoDays() {
        runTest(-1, 2, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun appStartThirteenDays() {
        runTest(-1, 13, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun appStartTwentySevenDays() {
        runTest(-1, 27, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun appStartTwentyEightDays() {
        runTest(-1, 28, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun appStartTwentyNineDays() {
        runTest(-1, 29, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun appStartThirtyDays() {
        runTest(-1, 30, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun zeroToOneDay() {
        runTest(0, 1, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun zeroToTwoDays() {
        runTest(0, 2, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun zeroToElevenDays() {
        runTest(0, 11, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun zeroToTwentySevenDays() {
        runTest(0, 27, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun zeroToTwentyEightDays() {
        runTest(0, 28, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun zeroToTwentyNineDays() {
        runTest(0, 29, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun zeroToThirtyDays() {
        runTest(0, 30, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun zeroToZeroDay() {
        runTest(0, 0, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun oneToTwoDays() {
        runTest(1, 2, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun oneToNineDays() {
        runTest(1, 9, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun oneToTwentySevenDays() {
        runTest(1, 27, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun oneToTwentyEightDays() {
        runTest(1, 28, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun oneToTwentyNineDays() {
        runTest(1, 29, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun oneToThirtyDays() {
        runTest(1, 30, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun oneToZeroDay() {
        runTest(1, 0, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun oneToOneDay() {
        runTest(1, 1, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToThreeDays() {
        runTest(2, 3, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToSeventeenDays() {
        runTest(2, 17, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToTwentyThreeDays() {
        runTest(2, 23, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToTwentySevenDays() {
        runTest(2, 27, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToTwentyEightDays() {
        runTest(2, 28, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToTwentyNineDays() {
        runTest(2, 29, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToThirtyDays() {
        runTest(2, 30, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToZeroDay() {
        runTest(2, 0, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun twoToOneDay() {
        runTest(2, 1, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun twoToTwoDays() {
        runTest(2, 2, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToFourDays() {
        runTest(3, 4, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToTwelveDays() {
        runTest(3, 12, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToTwentyTwoDays() {
        runTest(3, 22, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToTwentySevenDays() {
        runTest(3, 27, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToTwentyEightDays() {
        runTest(3, 28, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToTwentyNineDays() {
        runTest(3, 29, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToThirtyDays() {
        runTest(3, 30, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToZeroDay() {
        runTest(3, 0, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun threeToOneDay() {
        runTest(3, 1, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun threeToTwoDays() {
        runTest(3, 2, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToThreeDays() {
        runTest(3, 3, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun sixteenToSeventeenDays() {
        runTest(16, 17, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun sixteenToTwentyOneDays() {
        runTest(16, 21, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun sixteenToTwentySevenDays() {
        runTest(16, 27, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun sixteenToTwentyEightDays() {
        runTest(16, 28, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun sixteenToTwentyNineDays() {
        runTest(16, 29, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun sixteenToThirtyDays() {
        runTest(16, 30, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun sixteenToZeroDay() {
        runTest(16, 0, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun sixteenToOneDay() {
        runTest(16, 1, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun sixteenToTwoDays() {
        runTest(16, 2, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun sixteenToSixteenDays() {
        runTest(16, 16, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twentyThreeToZeroDay() {
        runTest(23, 0, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun twentyThreeToOneDay() {
        runTest(23, 1, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun twentyThreeToTwoDays() {
        runTest(23, 2, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twentyThreeToTenDays() {
        runTest(23, 10, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twentyThreeToTwentyDays() {
        runTest(23, 20, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twentyThreeToTwentyThreeDays() {
        runTest(23, 23, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twentyThreeToTwentySevenDays() {
        runTest(23, 27, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twentyThreeToTwentyEightDays() {
        runTest(23, 28, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twentyThreeToTwentyNineDays() {
        runTest(23, 29, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twentyThreeToThirtyDays() {
        runTest(23, 30, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twentySevenToTwentySevenDays() {
        runTest(27, 27, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twentySevenToTwentyEightDays() {
        runTest(27, 28, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twentySevenToTwentyNineDays() {
        runTest(27, 29, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twentySevenToThirtyDays() {
        runTest(27, 30, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twentySevenToZeroDay() {
        runTest(27, 0, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun twentySevenToOneDay() {
        runTest(27, 1, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun twentySevenToTwoDays() {
        runTest(27, 2, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twentySevenToTenDays() {
        runTest(27, 10, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twentyEightToTwentyEightDays() {
        runTest(28, 28, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twentyEightToTwentyNineDays() {
        runTest(28, 29, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twentyEightToThirtyDays() {
        runTest(28, 30, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twentyEightToZeroDay() {
        runTest(28, 0, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun twentyEightToOneDay() {
        runTest(28, 1, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun twentyEightToTwoDays() {
        runTest(28, 2, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twentyEightToFourteenDays() {
        runTest(28, 14, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twentyNineToTwentyNineDays() {
        runTest(29, 29, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twentyNineToThirtyDays() {
        runTest(29, 30, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twentyNineToZeroDay() {
        runTest(29, 0, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun twentyNineToOneDay() {
        runTest(29, 1, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun twentyNineToTwoDays() {
        runTest(29, 29, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twentyNineToEighteenDays() {
        runTest(29, 18, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun thirtyToThirtyDays() {
        runTest(30, 30, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun thirtyToZeroDay() {
        runTest(30, 0, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun thirtyToOneDay() {
        runTest(30, 1, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun thirtyToTwoDays() {
        runTest(30, 2, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun thirtyToTwentyTwoDays() {
        runTest(30, 22, LabelUpdate.NOT_NEEDED)
    }

    private fun runTest(
        previousDaysDuration: Long,
        currentDaysDuration: Long,
        expectedLabelUpdate: LabelUpdate
    ) {
        val labelUpdate = getLabelUpdate(currentDaysDuration, previousDaysDuration)
        Truth.assertThat(labelUpdate).isEqualTo(expectedLabelUpdate)
    }
}