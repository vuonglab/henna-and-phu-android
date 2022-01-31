package com.vuonglab.hennaandphu

import com.google.common.truth.Truth
import org.junit.Test

class MonthsStateUpdateUnitTests {
    @Test
    fun appStartZeroMonth() {
        runTest(-1, 0, StateUpdate.SHOW_DISABLED)
    }

    @Test
    fun appStartOneMonth() {
        runTest(-1, 1, StateUpdate.SHOW_ENABLED)
    }

    @Test
    fun appStartTwoMonths() {
        runTest(-1, 2, StateUpdate.SHOW_ENABLED)
    }

    @Test
    fun appStartFourMonths() {
        runTest(-1, 4, StateUpdate.SHOW_ENABLED)
    }

    @Test
    fun appStartElevenMonths() {
        runTest(-1, 11, StateUpdate.SHOW_ENABLED)
    }

    @Test
    fun zeroToOneMonth() {
        runTest(0, 1, StateUpdate.SHOW_ENABLED)
    }

    @Test
    fun zeroToTwoMonths() {
        runTest(0, 2, StateUpdate.SHOW_ENABLED)
    }

    @Test
    fun zeroToSixMonths() {
        runTest(0, 6, StateUpdate.SHOW_ENABLED)
    }

    @Test
    fun zeroToElevenMonths() {
        runTest(0, 11, StateUpdate.SHOW_ENABLED)
    }

    @Test
    fun zeroToZeroMonth() {
        runTest(0, 0, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun oneToTwoMonths() {
        runTest(1, 2, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun oneToTenMonths() {
        runTest(1, 10, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun oneToElevenMonths() {
        runTest(1, 11, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun oneToZeroMonth() {
        runTest(1, 0, StateUpdate.SHOW_DISABLED)
    }

    @Test
    fun oneToOneMonth() {
        runTest(1, 1, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToThreeMonths() {
        runTest(2, 3, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToFiveMonths() {
        runTest(2, 5, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToElevenMonths() {
        runTest(2, 11, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToZeroMonth() {
        runTest(2, 0, StateUpdate.SHOW_DISABLED)
    }

    @Test
    fun twoToOneMonth() {
        runTest(2, 1, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToTwoMonths() {
        runTest(2, 2, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun sixToNineMonths() {
        runTest(6, 9, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun sixToElevenMonths() {
        runTest(6, 11, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun sixToZeroMonth() {
        runTest(6, 0, StateUpdate.SHOW_DISABLED)
    }

    @Test
    fun sixToOneMonth() {
        runTest(6, 1, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun sixToTwoMonths() {
        runTest(6, 2, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun sixToFiveMonths() {
        runTest(6, 5, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun elevenToElevenMonths() {
        runTest(11, 11, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun elevenToZeroMonth() {
        runTest(11, 0, StateUpdate.SHOW_DISABLED)
    }

    @Test
    fun elevenToOneMonth() {
        runTest(11, 1, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun elevenToTwoMonths() {
        runTest(11, 2, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun elevenToTenMonths() {
        runTest(11, 10, StateUpdate.NOT_NEEDED)
    }

    private fun runTest(
        previousMonthsDuration: Long,
        currentMonthsDuration: Long,
        expectedStateUpdate: StateUpdate
    ) {
        val stateUpdate = getStateUpdate(currentMonthsDuration, previousMonthsDuration)
        Truth.assertThat(stateUpdate).isEqualTo(expectedStateUpdate)
    }
}