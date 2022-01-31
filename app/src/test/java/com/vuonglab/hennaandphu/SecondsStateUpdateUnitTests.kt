package com.vuonglab.hennaandphu

import com.google.common.truth.Truth
import org.junit.Test

class SecondsStateUpdateUnitTests {
    @Test
    fun appStartZeroSecond() {
        runTest(-1, 0, StateUpdate.SHOW_DISABLED)
    }

    @Test
    fun appStartOneSecond() {
        runTest(-1, 1, StateUpdate.SHOW_ENABLED)
    }

    @Test
    fun appStartTwoSeconds() {
        runTest(-1, 2, StateUpdate.SHOW_ENABLED)
    }

    @Test
    fun appStartFiftyNineSeconds() {
        runTest(-1, 59, StateUpdate.SHOW_ENABLED)
    }

    @Test
    fun zeroToOneSecond() {
        runTest(0, 1, StateUpdate.SHOW_ENABLED)
    }

    @Test
    fun zeroToTwoSeconds() {
        runTest(0, 2, StateUpdate.SHOW_ENABLED)
    }

    @Test
    fun zeroToFiftyNineSeconds() {
        runTest(0, 59, StateUpdate.SHOW_ENABLED)
    }

    @Test
    fun zeroToZeroSecond() {
        runTest(0, 0, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun oneToTwoSeconds() {
        runTest(1, 2, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun oneToFiftyNineSeconds() {
        runTest(1, 59, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun oneToZeroSecond() {
        runTest(1, 0, StateUpdate.SHOW_DISABLED)
    }

    @Test
    fun oneToOneSecond() {
        runTest(1, 1, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToThreeSeconds() {
        runTest(2, 3, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToFiftyNineSeconds() {
        runTest(2, 59, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToZeroSecond() {
        runTest(2, 0, StateUpdate.SHOW_DISABLED)
    }

    @Test
    fun twoToOneSecond() {
        runTest(2, 1, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToTwoSeconds() {
        runTest(2, 2, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToFourSeconds() {
        runTest(3, 4, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToFiftyNineSeconds() {
        runTest(3, 59, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToZeroSecond() {
        runTest(3, 0, StateUpdate.SHOW_DISABLED)
    }

    @Test
    fun threeToOneSecond() {
        runTest(3, 1, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToTwoSeconds() {
        runTest(3, 2, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToThreeSeconds() {
        runTest(3, 3, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun fiftyEightToFiftyNineSeconds() {
        runTest(58, 59, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun fiftyEightToZeroSecond() {
        runTest(58, 0, StateUpdate.SHOW_DISABLED)
    }

    @Test
    fun fiftyEightToOneSecond() {
        runTest(58, 1, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun fiftyEightToTwoSeconds() {
        runTest(58, 2, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun fiftyEightToFiftyEightSeconds() {
        runTest(58, 58, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun fiftyNineToZeroSecond() {
        runTest(59, 0, StateUpdate.SHOW_DISABLED)
    }

    @Test
    fun fiftyNineToOneSecond() {
        runTest(59, 1, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun fiftyNineToTwoSeconds() {
        runTest(59, 2, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun fiftyNineToThreeSeconds() {
        runTest(59, 3, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun fiftyNineToFiftyEightSeconds() {
        runTest(59, 58, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun fiftyNineToFiftyNineSeconds() {
        runTest(59, 59, StateUpdate.NOT_NEEDED)
    }

    private fun runTest(
        previousSecondsDuration: Long,
        currentSecondsDuration: Long,
        expectedStateUpdate: StateUpdate
    ) {
        val stateUpdate = getStateUpdate(currentSecondsDuration, previousSecondsDuration)
        Truth.assertThat(stateUpdate).isEqualTo(expectedStateUpdate)
    }
}