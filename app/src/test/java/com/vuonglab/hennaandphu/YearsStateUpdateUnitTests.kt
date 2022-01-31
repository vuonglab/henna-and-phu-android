package com.vuonglab.hennaandphu

import com.google.common.truth.Truth
import org.junit.Test

class YearsStateUpdateUnitTests {
    @Test
    fun appStartZeroYear() {
        runTest(-1, 0, StateUpdate.SHOW_DISABLED)
    }

    @Test
    fun appStartOneYear() {
        runTest(-1, 1, StateUpdate.SHOW_ENABLED)
    }

    @Test
    fun appStartTwoYears() {
        runTest(-1, 2, StateUpdate.SHOW_ENABLED)
    }

    @Test
    fun appStartFiftyYears() {
        runTest(-1, 50, StateUpdate.SHOW_ENABLED)
    }

    @Test
    fun zeroYearToOneYear() {
        runTest(0, 1, StateUpdate.SHOW_ENABLED)
    }

    @Test
    fun zeroYearToTwoYears() {
        runTest(0, 2, StateUpdate.SHOW_ENABLED)
    }

    @Test
    fun zeroYearToThreeYears() {
        runTest(0, 3, StateUpdate.SHOW_ENABLED)
    }

    @Test
    fun oneYearToTwoYears() {
        runTest(1, 2, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun oneYearToThreeYears() {
        runTest(1, 2, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun twoYearsToThreeYears() {
        runTest(2, 3, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun twoYearsToFourYears() {
        runTest(2, 4, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun threeYearsToFourYears() {
        runTest(3, 4, StateUpdate.NOT_NEEDED)
    }

    //<editor-fold desc="Decreasing years (theoretical)">
    @Test
    fun fourYearsToThreeYears() {
        runTest(4, 3, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun fourYearsToTwoYears() {
        runTest(4, 2, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun threeYearsToTwoYears() {
        runTest(3, 2, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun threeYearsToOneYear() {
        runTest(3, 1, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun threeYearsToZeroYear() {
        runTest(3, 0, StateUpdate.SHOW_DISABLED)
    }

    @Test
    fun twoYearsToOneYear() {
        runTest(2, 1, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun twoYearsToZeroYear() {
        runTest(2, 0, StateUpdate.SHOW_DISABLED)
    }

    @Test
    fun oneYearToZeroYear() {
        runTest(1, 0, StateUpdate.SHOW_DISABLED)
    }

    //</editor-fold>
    //<editor-fold desc="Same years (theoretical)">
    @Test
    fun zeroYearToZeroYear() {
        runTest(0, 0, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun oneYearToOneYear() {
        runTest(1, 1, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun twoYearsToTwoYears() {
        runTest(2, 2, StateUpdate.NOT_NEEDED)
    }

    @Test
    fun fiftyYearsToFiftyYears() {
        runTest(2, 2, StateUpdate.NOT_NEEDED)
    }

    //</editor-fold>
    private fun runTest(
        previousYearsDuration: Long,
        currentYearsDuration: Long,
        expectedStateUpdate: StateUpdate
    ) {
        val stateUpdate = getStateUpdate(currentYearsDuration, previousYearsDuration)
        Truth.assertThat(stateUpdate).isEqualTo(expectedStateUpdate)
    }
}