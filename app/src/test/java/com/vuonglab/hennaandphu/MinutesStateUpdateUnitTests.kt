package com.vuonglab.hennaandphu

import com.google.common.truth.Truth
import org.junit.Test

class MinutesStateUpdateUnitTests {
    @Test
    fun appStartZeroMinute() {
        runTest(-1, 0, StateUpdate.SHOW_DISABLED)
    }

    @Test
    fun appStartOneMinute() {
        runTest(-1, 1, StateUpdate.SHOW_ENABLED)
    }

    @Test
    fun appStartTwoMinutes() {
        runTest(-1, 2, StateUpdate.SHOW_ENABLED)
    }

    @Test
    fun appStartFiftyNineMinutes() {
        runTest(-1, 59, StateUpdate.SHOW_ENABLED)
    }

    @Test
    fun zeroToOneMinute() {
        runTest(0, 1, StateUpdate.SHOW_ENABLED)
    }

    @Test
    fun zeroToTwoMinutes() {
        runTest(0, 2, StateUpdate.SHOW_ENABLED)
    }

    @Test
    fun zeroToFiftyNineMinutes() {
        runTest(0, 59, StateUpdate.SHOW_ENABLED)
    }

    @Test
    fun zeroToZeroMinute() {
        runTest(0, 0, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun oneToTwoMinutes() {
        runTest(1, 2, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun oneToFiftyNineMinutes() {
        runTest(1, 59, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun oneToZeroMinute() {
        runTest(1, 0, StateUpdate.SHOW_DISABLED)
    }

    @Test
    fun oneToOneMinute() {
        runTest(1, 1, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToThirtyMinutes() {
        runTest(2, 30, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToFiftyNineMinutes() {
        runTest(2, 59, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToZeroMinute() {
        runTest(2, 0, StateUpdate.SHOW_DISABLED)
    }

    @Test
    fun twoToOneMinute() {
        runTest(2, 1, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToTwoMinutes() {
        runTest(2, 2, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToFortyFiveMinutes() {
        runTest(3, 45, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToFiftyNineMinutes() {
        runTest(3, 59, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToZeroMinute() {
        runTest(3, 0, StateUpdate.SHOW_DISABLED)
    }

    @Test
    fun threeToOneMinute() {
        runTest(3, 1, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToTwoMinutes() {
        runTest(3, 2, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToThreeMinutes() {
        runTest(3, 3, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun sixteenToFiftyNineMinutes() {
        runTest(16, 59, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun sixteenToZeroMinute() {
        runTest(16, 0, StateUpdate.SHOW_DISABLED)
    }

    @Test
    fun sixteenToOneMinute() {
        runTest(16, 1, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun sixteenToTwoMinutes() {
        runTest(16, 2, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun sixteenToFiftyEightMinutes() {
        runTest(16, 58, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun fiftyNineToZeroMinute() {
        runTest(59, 0, StateUpdate.SHOW_DISABLED)
    }

    @Test
    fun fiftyNineToOneMinute() {
        runTest(59, 1, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun fiftyNineToTwoMinutes() {
        runTest(59, 2, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun fiftyNineToTenMinutes() {
        runTest(59, 10, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun fiftyNineToTwentyMinutes() {
        runTest(59, 20, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun fiftyNineToFiftyNineMinutes() {
        runTest(59, 59, StateUpdate.NOT_NEEDED)
    }

    private fun runTest(
        previousMinutesDuration: Long,
        currentMinutesDuration: Long,
        expectedStateUpdate: StateUpdate
    ) {
        val stateUpdate = getStateUpdate(currentMinutesDuration, previousMinutesDuration)
        Truth.assertThat(stateUpdate).isEqualTo(expectedStateUpdate)
    }
}