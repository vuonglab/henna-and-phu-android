package com.vuonglab.hennaandphu;

import com.vuonglab.hennaandphu.UIUpdateOptimizations.StateUpdate;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;
import static com.vuonglab.hennaandphu.UIUpdateOptimizations.GetStateUpdate;

public class MonthsStateUpdateUnitTests {
    @Test
    public void appStartZeroMonth() {
        runTest(-1, 0, StateUpdate.SHOW_DISABLED);
    }

    @Test
    public void appStartOneMonth() {
        runTest(-1, 1, StateUpdate.SHOW_ENABLED);
    }

    @Test
    public void appStartTwoMonths() {
        runTest(-1, 2, StateUpdate.SHOW_ENABLED);
    }

    @Test
    public void appStartFourMonths() {
        runTest(-1, 4, StateUpdate.SHOW_ENABLED);
    }

    @Test
    public void appStartElevenMonths() {
        runTest(-1, 11, StateUpdate.SHOW_ENABLED);
    }

    @Test
    public void zeroToOneMonth() {
        runTest(0, 1, StateUpdate.SHOW_ENABLED);
    }

    @Test
    public void zeroToTwoMonths() {
        runTest(0, 2, StateUpdate.SHOW_ENABLED);
    }

    @Test
    public void zeroToSixMonths() {
        runTest(0, 6, StateUpdate.SHOW_ENABLED);
    }

    @Test
    public void zeroToElevenMonths() {
        runTest(0, 11, StateUpdate.SHOW_ENABLED);
    }

    @Test
    public void zeroToZeroMonth() {
        runTest(0, 0, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void oneToTwoMonths() {
        runTest(1, 2, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void oneToTenMonths() {
        runTest(1, 10, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void oneToElevenMonths() {
        runTest(1, 11, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void oneToZeroMonth() {
        runTest(1, 0, StateUpdate.SHOW_DISABLED);
    }

    @Test
    public void oneToOneMonth() {
        runTest(1, 1, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToThreeMonths() {
        runTest(2, 3, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToFiveMonths() {
        runTest(2, 5, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToElevenMonths() {
        runTest(2, 11, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToZeroMonth() {
        runTest(2, 0, StateUpdate.SHOW_DISABLED);
    }

    @Test
    public void twoToOneMonth() {
        runTest(2, 1, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToTwoMonths() {
        runTest(2, 2, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void sixToNineMonths() {
        runTest(6, 9, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void sixToElevenMonths() {
        runTest(6, 11, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void sixToZeroMonth() {
        runTest(6, 0, StateUpdate.SHOW_DISABLED);
    }

    @Test
    public void sixToOneMonth() {
        runTest(6, 1, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void sixToTwoMonths() {
        runTest(6, 2, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void sixToFiveMonths() {
        runTest(6, 5, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void elevenToElevenMonths() {
        runTest(11, 11, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void elevenToZeroMonth() {
        runTest(11, 0, StateUpdate.SHOW_DISABLED);
    }

    @Test
    public void elevenToOneMonth() {
        runTest(11, 1, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void elevenToTwoMonths() {
        runTest(11, 2, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void elevenToTenMonths() {
        runTest(11, 10, StateUpdate.NOT_NEEDED);
    }

    private void runTest(long previousMonthsDuration, long currentMonthsDuration, StateUpdate expectedStateUpdate) {
        StateUpdate stateUpdate = GetStateUpdate(currentMonthsDuration, previousMonthsDuration);
        assertThat(stateUpdate).isEqualTo(expectedStateUpdate);
    }
}