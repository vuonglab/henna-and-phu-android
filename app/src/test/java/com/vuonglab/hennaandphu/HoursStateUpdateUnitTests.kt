package com.vuonglab.hennaandphu

import com.google.common.truth.Truth
import org.junit.Test

class HoursStateUpdateUnitTests {
    @Test
    fun appStartZeroHour() {
        runTest(-1, 0, StateUpdate.SHOW_DISABLED)
    }

    @Test
    fun appStartOneHour() {
        runTest(-1, 1, StateUpdate.SHOW_ENABLED)
    }

    @Test
    fun appStartTwoHours() {
        runTest(-1, 2, StateUpdate.SHOW_ENABLED)
    }

    @Test
    fun appStartTwentyThreeHours() {
        runTest(-1, 23, StateUpdate.SHOW_ENABLED)
    }

    @Test
    fun zeroToOneHour() {
        runTest(0, 1, StateUpdate.SHOW_ENABLED)
    }

    @Test
    fun zeroToTwoHours() {
        runTest(0, 2, StateUpdate.SHOW_ENABLED)
    }

    @Test
    fun zeroToTwentyThreeHours() {
        runTest(0, 23, StateUpdate.SHOW_ENABLED)
    }

    @Test
    fun zeroToZeroHour() {
        runTest(0, 0, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun oneToTwoHours() {
        runTest(1, 2, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun oneToTwentyThreeHours() {
        runTest(1, 23, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun oneToZeroHour() {
        runTest(1, 0, StateUpdate.SHOW_DISABLED)
    }

    @Test
    fun oneToOneHour() {
        runTest(1, 1, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToThreeHours() {
        runTest(2, 3, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToSeventeenHours() {
        runTest(2, 17, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToTwentyThreeHours() {
        runTest(2, 23, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToZeroHour() {
        runTest(2, 0, StateUpdate.SHOW_DISABLED)
    }

    @Test
    fun twoToOneHour() {
        runTest(2, 1, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToTwoHours() {
        runTest(2, 2, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToFourHours() {
        runTest(3, 4, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToFourteenHours() {
        runTest(3, 14, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToTwentyThreeHours() {
        runTest(3, 23, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToZeroHour() {
        runTest(3, 0, StateUpdate.SHOW_DISABLED)
    }

    @Test
    fun threeToOneHour() {
        runTest(3, 1, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToTwoHours() {
        runTest(3, 2, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun threeToThreeHours() {
        runTest(3, 3, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun sixteenToTwentyThreeHours() {
        runTest(16, 23, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun sixteenToZeroHour() {
        runTest(16, 0, StateUpdate.SHOW_DISABLED)
    }

    @Test
    fun sixteenToOneHour() {
        runTest(16, 1, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun sixteenToTwoHours() {
        runTest(16, 2, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun twentyThreeToZeroHour() {
        runTest(23, 0, StateUpdate.SHOW_DISABLED)
    }

    @Test
    fun twentyThreeToOneHour() {
        runTest(23, 1, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun twentyThreeToTwoHours() {
        runTest(23, 2, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun twentyThreeToTenHours() {
        runTest(23, 10, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun twentyThreeToTwentyHours() {
        runTest(23, 20, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun twentyThreeToTwentyThreeHours() {
        runTest(23, 23, StateUpdate.NOT_NEEDED)
    }

    private fun runTest(
        previousHoursDuration: Long,
        currentHoursDuration: Long,
        expectedStateUpdate: StateUpdate
    ) {
        val stateUpdate = getStateUpdate(currentHoursDuration, previousHoursDuration)
        Truth.assertThat(stateUpdate).isEqualTo(expectedStateUpdate)
    }
}