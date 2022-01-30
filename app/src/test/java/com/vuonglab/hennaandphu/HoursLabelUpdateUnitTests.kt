package com.vuonglab.hennaandphu

import com.google.common.truth.Truth
import org.junit.Test

class HoursLabelUpdateUnitTests {
    @Test
    fun appStartZeroHour() {
        runTest(-1, 0, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun appStartOneHour() {
        runTest(-1, 1, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun appStartTwoHours() {
        runTest(-1, 2, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun appStartTwentyThreeHours() {
        runTest(-1, 23, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun zeroToOneHour() {
        runTest(0, 1, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun zeroToTwoHours() {
        runTest(0, 2, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun zeroToTwentyThreeHours() {
        runTest(0, 23, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun zeroToZeroHour() {
        runTest(0, 0, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun oneToTwoHours() {
        runTest(1, 2, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun oneToTwentyThreeHours() {
        runTest(1, 23, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun oneToZeroHour() {
        runTest(1, 0, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun oneToOneHour() {
        runTest(1, 1, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToThreeHours() {
        runTest(2, 3, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToSeventeenHours() {
        runTest(2, 17, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToTwentyThreeHours() {
        runTest(2, 23, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToZeroHour() {
        runTest(2, 0, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun twoToOneHour() {
        runTest(2, 1, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun twoToTwoHours() {
        runTest(2, 2, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToFourHours() {
        runTest(3, 4, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToFourteenHours() {
        runTest(3, 14, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToTwentyThreeHours() {
        runTest(3, 23, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToZeroHour() {
        runTest(3, 0, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun threeToOneHour() {
        runTest(3, 1, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun threeToTwoHours() {
        runTest(3, 2, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToThreeHours() {
        runTest(3, 3, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun sixteenToTwentyThreeHours() {
        runTest(16, 23, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun sixteenToZeroHour() {
        runTest(16, 0, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun sixteenToOneHour() {
        runTest(16, 1, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun sixteenToTwoHours() {
        runTest(16, 2, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twentyThreeToZeroHour() {
        runTest(23, 0, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun twentyThreeToOneHour() {
        runTest(23, 1, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun twentyThreeToTwoHours() {
        runTest(23, 2, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twentyThreeToTenHours() {
        runTest(23, 10, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twentyThreeToTwentyHours() {
        runTest(23, 20, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twentyThreeToTwentyThreeHours() {
        runTest(23, 23, LabelUpdate.NOT_NEEDED)
    }

    private fun runTest(
        previousHoursDuration: Long,
        currentHoursDuration: Long,
        expectedLabelUpdate: LabelUpdate
    ) {
        val labelUpdate = getLabelUpdate(currentHoursDuration, previousHoursDuration)
        Truth.assertThat(labelUpdate).isEqualTo(expectedLabelUpdate)
    }
}