package com.vuonglab.hennaandphu;

import com.vuonglab.hennaandphu.UIUpdateOptimizations.LabelUpdate;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;
import static com.vuonglab.hennaandphu.UIUpdateOptimizations.getLabelUpdate;

public class MonthsLabelUpdateUnitTests {
    @Test
    public void appStartZeroMonth() {
        runTest(-1, 0, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void appStartOneMonth() {
        runTest(-1, 1, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void appStartTwoMonths() {
        runTest(-1, 2, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void appStartSixMonths() {
        runTest(-1, 6, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void appStartElevenMonths() {
        runTest(-1, 11, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void zeroToOneMonth() {
        runTest(0, 1, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void zeroToTwoMonths() {
        runTest(0, 2, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void zeroToFiveMonths() {
        runTest(0, 5, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void zeroToElevenMonths() {
        runTest(0, 11, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void zeroToZeroMonth() {
        runTest(0, 0, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void oneToTwoMonths() {
        runTest(1, 2, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void oneToEightMonths() {
        runTest(1, 8, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void oneToElevenMonths() {
        runTest(1, 11, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void oneToZeroMonth() {
        runTest(1, 0, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void oneToOneMonth() {
        runTest(1, 1, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToThreeMonths() {
        runTest(2, 3, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToNineMonths() {
        runTest(2, 9, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToElevenMonths() {
        runTest(2, 11, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToZeroMonth() {
        runTest(2, 0, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void twoToOneMonth() {
        runTest(2, 1, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void twoToTwoMonths() {
        runTest(2, 2, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void eightToNineMonths() {
        runTest(8, 9, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void eightToElevenMonths() {
        runTest(8, 11, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void eightToZeroMonth() {
        runTest(8, 0, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void eightToOneMonth() {
        runTest(8, 1, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void eightToTwoMonths() {
        runTest(8, 2, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void eightToFiveMonths() {
        runTest(8, 5, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void elevenToElevenMonths() {
        runTest(11, 11, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void elevenToZeroMonth() {
        runTest(11, 0, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void elevenToOneMonth() {
        runTest(11, 1, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void elevenToTwoMonths() {
        runTest(11, 2, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void elevenToTenMonths() {
        runTest(11, 10, LabelUpdate.NOT_NEEDED);
    }

    private void runTest(long previousMonthsDuration, long currentMonthsDuration, LabelUpdate expectedLabelUpdate) {
        LabelUpdate labelUpdate = getLabelUpdate(currentMonthsDuration, previousMonthsDuration);
        assertThat(labelUpdate).isEqualTo(expectedLabelUpdate);
    }
}