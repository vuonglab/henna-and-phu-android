package com.vuonglab.hennaandphu

import com.google.common.truth.Truth
import org.junit.Test

class MinutesLabelUpdateUnitTests {
    @Test
    fun appStartZeroMinute() {
        runTest(-1, 0, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun appStartOneMinute() {
        runTest(-1, 1, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun appStartTwoMinutes() {
        runTest(-1, 2, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun appStartFiftyNineMinutes() {
        runTest(-1, 59, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun zeroToOneMinute() {
        runTest(0, 1, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun zeroToTwoMinutes() {
        runTest(0, 2, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun zeroToFiftyNineMinutes() {
        runTest(0, 59, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun zeroToZeroMinute() {
        runTest(0, 0, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun oneToTwoMinutes() {
        runTest(1, 2, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun oneToFiftyNineMinutes() {
        runTest(1, 59, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun oneToZeroMinute() {
        runTest(1, 0, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun oneToOneMinute() {
        runTest(1, 1, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToThirtyMinutes() {
        runTest(2, 30, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToFiftyNineMinutes() {
        runTest(2, 59, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToZeroMinute() {
        runTest(2, 0, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun twoToOneMinute() {
        runTest(2, 1, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun twoToTwoMinutes() {
        runTest(2, 2, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToFortyFiveMinutes() {
        runTest(3, 45, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToFiftyNineMinutes() {
        runTest(3, 59, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToZeroMinute() {
        runTest(3, 0, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun threeToOneMinute() {
        runTest(3, 1, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun threeToTwoMinutes() {
        runTest(3, 2, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToThreeMinutes() {
        runTest(3, 3, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun sixteenToFiftyNineMinutes() {
        runTest(16, 59, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun sixteenToZeroMinute() {
        runTest(16, 0, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun sixteenToOneMinute() {
        runTest(16, 1, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun sixteenToTwoMinutes() {
        runTest(16, 2, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun sixteenToFiftyEightMinutes() {
        runTest(16, 58, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun fiftyNineToZeroMinute() {
        runTest(59, 0, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun fiftyNineToOneMinute() {
        runTest(59, 1, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun fiftyNineToTwoMinutes() {
        runTest(59, 2, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun fiftyNineToTenMinutes() {
        runTest(59, 10, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun fiftyNineToTwentyMinutes() {
        runTest(59, 20, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun fiftyNineToFiftyNineMinutes() {
        runTest(59, 59, LabelUpdate.NOT_NEEDED)
    }

    private fun runTest(
        previousMinutesDuration: Long,
        currentMinutesDuration: Long,
        expectedLabelUpdate: LabelUpdate
    ) {
        val labelUpdate = getLabelUpdate(currentMinutesDuration, previousMinutesDuration)
        Truth.assertThat(labelUpdate).isEqualTo(expectedLabelUpdate)
    }
}