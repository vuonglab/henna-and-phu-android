package com.vuonglab.hennaandphu

import com.google.common.truth.Truth
import org.junit.Test

class SecondsLabelUpdateUnitTests {
    @Test
    fun appStartZeroSecond() {
        runTest(-1, 0, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun appStartOneSecond() {
        runTest(-1, 1, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun appStartTwoSeconds() {
        runTest(-1, 2, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun appStartFiftyNineSeconds() {
        runTest(-1, 59, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun zeroToOneSecond() {
        runTest(0, 1, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun zeroToTwoSeconds() {
        runTest(0, 2, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun zeroToFiftyNineSeconds() {
        runTest(0, 59, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun zeroToZeroSecond() {
        runTest(0, 0, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun oneToTwoSeconds() {
        runTest(1, 2, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun oneToFiftyNineSeconds() {
        runTest(1, 59, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun oneToZeroSecond() {
        runTest(1, 0, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun oneToOneSecond() {
        runTest(1, 1, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToThreeSeconds() {
        runTest(2, 3, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToFiftyNineSeconds() {
        runTest(2, 59, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToZeroSecond() {
        runTest(2, 0, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun twoToOneSecond() {
        runTest(2, 1, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun twoToTwoSeconds() {
        runTest(2, 2, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToFourSeconds() {
        runTest(3, 4, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToFiftyNineSeconds() {
        runTest(3, 59, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToZeroSecond() {
        runTest(3, 0, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun threeToOneSecond() {
        runTest(3, 1, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun threeToTwoSeconds() {
        runTest(3, 2, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToThreeSeconds() {
        runTest(3, 3, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun fiftyEightToFiftyNineSeconds() {
        runTest(58, 59, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun fiftyEightToZeroSecond() {
        runTest(58, 0, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun fiftyEightToOneSecond() {
        runTest(58, 1, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun fiftyEightToTwoSeconds() {
        runTest(58, 2, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun fiftyEightToFiftyEightSeconds() {
        runTest(58, 58, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun fiftyNineToZeroSecond() {
        runTest(59, 0, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun fiftyNineToOneSecond() {
        runTest(59, 1, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun fiftyNineToTwoSeconds() {
        runTest(59, 2, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun fiftyNineToThreeSeconds() {
        runTest(59, 3, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun fiftyNineToFiftyEightSeconds() {
        runTest(59, 58, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun fiftyNineToFiftyNineSeconds() {
        runTest(59, 59, LabelUpdate.NOT_NEEDED)
    }

    private fun runTest(
        previousSecondsDuration: Long,
        currentSecondsDuration: Long,
        expectedLabelUpdate: LabelUpdate
    ) {
        val labelUpdate = getLabelUpdate(currentSecondsDuration, previousSecondsDuration)
        Truth.assertThat(labelUpdate).isEqualTo(expectedLabelUpdate)
    }
}