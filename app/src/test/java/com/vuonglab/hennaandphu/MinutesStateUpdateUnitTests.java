package com.vuonglab.hennaandphu;

import com.vuonglab.hennaandphu.UIUpdateOptimizations.StateUpdate;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;
import static com.vuonglab.hennaandphu.UIUpdateOptimizations.GetStateUpdate;

public class MinutesStateUpdateUnitTests {
    @Test
    public void appStartZeroMinute() {
        runTest(-1, 0, StateUpdate.SHOW_DISABLED);
    }

    @Test
    public void appStartOneMinute() {
        runTest(-1, 1, StateUpdate.SHOW_ENABLED);
    }

    @Test
    public void appStartTwoMinutes() {
        runTest(-1, 2, StateUpdate.SHOW_ENABLED);
    }

    @Test
    public void appStartFiftyNineMinutes() {
        runTest(-1, 59, StateUpdate.SHOW_ENABLED);
    }

    @Test
    public void zeroToOneMinute() {
        runTest(0, 1, StateUpdate.SHOW_ENABLED);
    }

    @Test
    public void zeroToTwoMinutes() {
        runTest(0, 2, StateUpdate.SHOW_ENABLED);
    }

    @Test
    public void zeroToFiftyNineMinutes() {
        runTest(0, 59, StateUpdate.SHOW_ENABLED);
    }

    @Test
    public void zeroToZeroMinute() {
        runTest(0, 0, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void oneToTwoMinutes() {
        runTest(1, 2, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void oneToFiftyNineMinutes() {
        runTest(1, 59, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void oneToZeroMinute() {
        runTest(1, 0, StateUpdate.SHOW_DISABLED);
    }

    @Test
    public void oneToOneMinute() {
        runTest(1, 1, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToThirtyMinutes() {
        runTest(2, 30, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToFiftyNineMinutes() {
        runTest(2, 59, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToZeroMinute() {
        runTest(2, 0, StateUpdate.SHOW_DISABLED);
    }

    @Test
    public void twoToOneMinute() {
        runTest(2, 1, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToTwoMinutes() {
        runTest(2, 2, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void threeToFortyFiveMinutes() {
        runTest(3, 45, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void threeToFiftyNineMinutes() {
        runTest(3, 59, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void threeToZeroMinute() {
        runTest(3, 0, StateUpdate.SHOW_DISABLED);
    }

    @Test
    public void threeToOneMinute() {
        runTest(3, 1, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void threeToTwoMinutes() {
        runTest(3, 2, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void threeToThreeMinutes() {
        runTest(3, 3, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void sixteenToFiftyNineMinutes() {
        runTest(16, 59, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void sixteenToZeroMinute() {
        runTest(16, 0, StateUpdate.SHOW_DISABLED);
    }

    @Test
    public void sixteenToOneMinute() {
        runTest(16, 1, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void sixteenToTwoMinutes() {
        runTest(16, 2, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void sixteenToFiftyEightMinutes() {
        runTest(16, 58, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void fiftyNineToZeroMinute() {
        runTest(59, 0, StateUpdate.SHOW_DISABLED);
    }

    @Test
    public void fiftyNineToOneMinute() {
        runTest(59, 1, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void fiftyNineToTwoMinutes() {
        runTest(59, 2, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void fiftyNineToTenMinutes() {
        runTest(59, 10, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void fiftyNineToTwentyMinutes() {
        runTest(59, 20, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void fiftyNineToFiftyNineMinutes() {
        runTest(59, 59, StateUpdate.NOT_NEEDED);
    }

    private void runTest(long previousMinutesDuration, long currentMinutesDuration, StateUpdate expectedStateUpdate) {
        StateUpdate stateUpdate = GetStateUpdate(currentMinutesDuration, previousMinutesDuration);
        assertThat(stateUpdate).isEqualTo(expectedStateUpdate);
    }
}