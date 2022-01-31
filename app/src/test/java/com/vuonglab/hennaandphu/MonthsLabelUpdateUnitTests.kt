package com.vuonglab.hennaandphu

import com.google.common.truth.Truth
import org.junit.Test

class MonthsLabelUpdateUnitTests {
    @Test
    fun appStartZeroMonth() {
        runTest(-1, 0, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun appStartOneMonth() {
        runTest(-1, 1, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun appStartTwoMonths() {
        runTest(-1, 2, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun appStartSixMonths() {
        runTest(-1, 6, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun appStartElevenMonths() {
        runTest(-1, 11, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun zeroToOneMonth() {
        runTest(0, 1, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun zeroToTwoMonths() {
        runTest(0, 2, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun zeroToFiveMonths() {
        runTest(0, 5, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun zeroToElevenMonths() {
        runTest(0, 11, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun zeroToZeroMonth() {
        runTest(0, 0, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun oneToTwoMonths() {
        runTest(1, 2, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun oneToEightMonths() {
        runTest(1, 8, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun oneToElevenMonths() {
        runTest(1, 11, LabelUpdate.SHOW_PLURAL)
    }

    @Test
    fun oneToZeroMonth() {
        runTest(1, 0, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun oneToOneMonth() {
        runTest(1, 1, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToThreeMonths() {
        runTest(2, 3, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToNineMonths() {
        runTest(2, 9, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToElevenMonths() {
        runTest(2, 11, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun twoToZeroMonth() {
        runTest(2, 0, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun twoToOneMonth() {
        runTest(2, 1, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun twoToTwoMonths() {
        runTest(2, 2, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun eightToNineMonths() {
        runTest(8, 9, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun eightToElevenMonths() {
        runTest(8, 11, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun eightToZeroMonth() {
        runTest(8, 0, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun eightToOneMonth() {
        runTest(8, 1, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun eightToTwoMonths() {
        runTest(8, 2, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun eightToFiveMonths() {
        runTest(8, 5, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun elevenToElevenMonths() {
        runTest(11, 11, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun elevenToZeroMonth() {
        runTest(11, 0, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun elevenToOneMonth() {
        runTest(11, 1, LabelUpdate.SHOW_SINGULAR)
    }

    @Test
    fun elevenToTwoMonths() {
        runTest(11, 2, LabelUpdate.NOT_NEEDED)
    }

    @Test
    fun elevenToTenMonths() {
        runTest(11, 10, LabelUpdate.NOT_NEEDED)
    }

    private fun runTest(
        previousMonthsDuration: Long,
        currentMonthsDuration: Long,
        expectedLabelUpdate: LabelUpdate
    ) {
        val labelUpdate = getLabelUpdate(currentMonthsDuration, previousMonthsDuration)
        Truth.assertThat(labelUpdate).isEqualTo(expectedLabelUpdate)
    }
}