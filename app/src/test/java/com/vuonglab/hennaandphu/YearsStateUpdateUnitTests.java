package com.vuonglab.hennaandphu;

import com.vuonglab.hennaandphu.UIUpdateOptimizations.StateUpdate;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;
import static com.vuonglab.hennaandphu.UIUpdateOptimizations.GetYearsStateUpdate;

public class YearsStateUpdateUnitTests {
    @Test
    public void appStartZeroYear() { runTest(-1, 0, StateUpdate.SHOW_DISABLED); }

    @Test
    public void appStartOneYear() { runTest(-1, 1, StateUpdate.SHOW_ENABLED); }

    @Test
    public void appStartTwoYears() {
        runTest(-1, 2, StateUpdate.SHOW_ENABLED);
    }

    @Test
    public void appStartFiftyYears() {
        runTest(-1, 50, StateUpdate.SHOW_ENABLED);
    }

    @Test
    public void zeroYearToOneYear() {
        runTest(0, 1, StateUpdate.SHOW_ENABLED);
    }

    @Test
    public void zeroYearToTwoYears() {
        runTest(0, 2, StateUpdate.SHOW_ENABLED);
    }

    @Test
    public void zeroYearToThreeYears() {
        runTest(0, 3, StateUpdate.SHOW_ENABLED);
    }

    @Test
    public void oneYearToTwoYears() {
        runTest(1, 2, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void oneYearToThreeYears() {
        runTest(1, 2, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void twoYearsToThreeYears() {
        runTest(2, 3, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void twoYearsToFourYears() {
        runTest(2, 4, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void threeYearsToFourYears() {
        runTest(3, 4, StateUpdate.NOT_NEEDED);
    }

    //<editor-fold desc="Decreasing years (theoretical)">
    @Test
    public void fourYearsToThreeYears() {
        runTest(4, 3, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void fourYearsToTwoYears() {
        runTest(4, 2, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void threeYearsToTwoYears() {
        runTest(3, 2, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void threeYearsToOneYear() {
        runTest(3, 1, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void threeYearsToZeroYear() {
        runTest(3, 0, StateUpdate.SHOW_DISABLED);
    }

    @Test
    public void twoYearsToOneYear() {
        runTest(2, 1, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void twoYearsToZeroYear() {
        runTest(2, 0, StateUpdate.SHOW_DISABLED);
    }

    @Test
    public void oneYearToZeroYear() {
        runTest(1, 0, StateUpdate.SHOW_DISABLED);
    }
    //</editor-fold>

    //<editor-fold desc="Same years (theoretical)">
    @Test
    public void zeroYearToZeroYear() {
        runTest(0, 0, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void oneYearToOneYear() {
        runTest(1, 1, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void twoYearsToTwoYears() {
        runTest(2, 2, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void FiftyYearsToFiftyYears() {
        runTest(2, 2, StateUpdate.NOT_NEEDED);
    }
    //</editor-fold>
    private void runTest(long previousYearsDuration, long currentYearsDuration, StateUpdate expectedStateUpdate) {
        StateUpdate stateUpdate = GetYearsStateUpdate(currentYearsDuration, previousYearsDuration);
        assertThat(stateUpdate).isEqualTo(expectedStateUpdate);
    }
}