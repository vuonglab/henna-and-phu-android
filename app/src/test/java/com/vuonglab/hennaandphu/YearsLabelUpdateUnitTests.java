package com.vuonglab.hennaandphu;

import static com.google.common.truth.Truth.assertThat;
import org.junit.Test;

import static com.vuonglab.hennaandphu.UIUpdateOptimizations.GetLabelUpdate;
import com.vuonglab.hennaandphu.UIUpdateOptimizations.LabelUpdate;

public class YearsLabelUpdateUnitTests {
    @Test
    public void appStartZeroYear() {
        runTest(-1, 0, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void appStartOneYear() {
        runTest(-1, 1, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void appStartTwoYears() {
        runTest(-1, 2, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void appStartFiftyYears() {
        runTest(-1, 50, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void zeroYearToOneYear() {
        runTest(0, 1, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void zeroYearToTwoYears() {
        runTest(0, 2, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void zeroYearToThreeYears() {
        runTest(0, 3, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void oneYearToTwoYears() {
        runTest(1, 2, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void oneYearToThreeYears() {
        runTest(1, 2, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void twoYearsToThreeYears() {
        runTest(2, 3, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twoYearsToFourYears() {
        runTest(2, 4, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void threeYearsToFourYears() {
        runTest(3, 4, LabelUpdate.NOT_NEEDED);
    }

    //<editor-fold desc="Decreasing years (theoretical)">
    @Test
    public void fourYearsToThreeYears() {
        runTest(4, 3, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void fourYearsToTwoYears() {
        runTest(4, 2, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void threeYearsToTwoYears() {
        runTest(3, 2, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void threeYearsToOneYear() {
        runTest(3, 1, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void threeYearsToZeroYear() {
        runTest(3, 0, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void twoYearsToOneYear() {
        runTest(2, 1, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void twoYearsToZeroYear() {
        runTest(2, 0, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void oneYearToZeroYear() {
        runTest(1, 0, LabelUpdate.NOT_NEEDED);
    }
    //</editor-fold>

    //<editor-fold desc="Same years (theoretical)">
    @Test
    public void zeroYearToZeroYear() {
        runTest(0, 0, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void oneYearToOneYear() {
        runTest(1, 1, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twoYearsToTwoYears() {
        runTest(2, 2, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void FiftyYearsToFiftyYears() {
        runTest(2, 2, LabelUpdate.NOT_NEEDED);
    }
    //</editor-fold>

    private void runTest(long previousYearsDuration, long currentYearsDuration, LabelUpdate expectedLabelUpdate) {
        LabelUpdate labelUpdate = GetLabelUpdate(currentYearsDuration, previousYearsDuration);
        assertThat(labelUpdate).isEqualTo(expectedLabelUpdate);
    }
}