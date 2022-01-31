package com.vuonglab.hennaandphu

import com.google.common.truth.Truth
import org.junit.Test

class YearsLabelUpdateUnitTests {
    @Test
    fun appStartZeroYear() {
        runTest(-1, 0, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun appStartOneYear() {
        runTest(-1, 1, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun appStartTwoYears() {
        runTest(-1, 2, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun appStartFiftyYears() {
        runTest(-1, 50, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun zeroYearToOneYear() {
        runTest(0, 1, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun zeroYearToTwoYears() {
        runTest(0, 2, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun zeroYearToThreeYears() {
        runTest(0, 3, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun oneYearToTwoYears() {
        runTest(1, 2, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun oneYearToThreeYears() {
        runTest(1, 2, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun twoYearsToThreeYears() {
        runTest(2, 3, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twoYearsToFourYears() {
        runTest(2, 4, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun threeYearsToFourYears() {
        runTest(3, 4, LabelUpdate.NOT_NEEDED)
    }

    //<editor-fold desc="Decreasing years (theoretical)">
    @Test
    fun fourYearsToThreeYears() {
        runTest(4, 3, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun fourYearsToTwoYears() {
        runTest(4, 2, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun threeYearsToTwoYears() {
        runTest(3, 2, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun threeYearsToOneYear() {
        runTest(3, 1, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun threeYearsToZeroYear() {
        runTest(3, 0, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun twoYearsToOneYear() {
        runTest(2, 1, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun twoYearsToZeroYear() {
        runTest(2, 0, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun oneYearToZeroYear() {
        runTest(1, 0, LabelUpdate.NOT_NEEDED)
    }

    //</editor-fold>
    //<editor-fold desc="Same years (theoretical)">
    @Test
    fun zeroYearToZeroYear() {
        runTest(0, 0, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun oneYearToOneYear() {
        runTest(1, 1, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twoYearsToTwoYears() {
        runTest(2, 2, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun fiftyYearsToFiftyYears() {
        runTest(2, 2, LabelUpdate.NOT_NEEDED)
    }

    //</editor-fold>
    private fun runTest(
        previousYearsDuration: Long,
        currentYearsDuration: Long,
        expectedLabelUpdate: LabelUpdate
    ) {
        val labelUpdate = getLabelUpdate(currentYearsDuration, previousYearsDuration)
        Truth.assertThat(labelUpdate).isEqualTo(expectedLabelUpdate)
    }
}