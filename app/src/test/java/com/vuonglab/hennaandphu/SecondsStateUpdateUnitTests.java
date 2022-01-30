package com.vuonglab.hennaandphu;

import com.vuonglab.hennaandphu.UIUpdateOptimizations.StateUpdate;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;
import static com.vuonglab.hennaandphu.UIUpdateOptimizations.getStateUpdate;

public class SecondsStateUpdateUnitTests {
    @Test
    public void appStartZeroSecond() {
        runTest(-1, 0, StateUpdate.SHOW_DISABLED);
    }

    @Test
    public void appStartOneSecond() {
        runTest(-1, 1, StateUpdate.SHOW_ENABLED);
    }

    @Test
    public void appStartTwoSeconds() {
        runTest(-1, 2, StateUpdate.SHOW_ENABLED);
    }

    @Test
    public void appStartFiftyNineSeconds() {
        runTest(-1, 59, StateUpdate.SHOW_ENABLED);
    }

    @Test
    public void zeroToOneSecond() {
        runTest(0, 1, StateUpdate.SHOW_ENABLED);
    }

    @Test
    public void zeroToTwoSeconds() {
        runTest(0, 2, StateUpdate.SHOW_ENABLED);
    }

    @Test
    public void zeroToFiftyNineSeconds() {
        runTest(0, 59, StateUpdate.SHOW_ENABLED);
    }

    @Test
    public void zeroToZeroSecond() {
        runTest(0, 0, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void oneToTwoSeconds() {
        runTest(1, 2, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void oneToFiftyNineSeconds() {
        runTest(1, 59, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void oneToZeroSecond() {
        runTest(1, 0, StateUpdate.SHOW_DISABLED);
    }

    @Test
    public void oneToOneSecond() {
        runTest(1, 1, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToThreeSeconds() {
        runTest(2, 3, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToFiftyNineSeconds() {
        runTest(2, 59, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToZeroSecond() {
        runTest(2, 0, StateUpdate.SHOW_DISABLED);
    }

    @Test
    public void twoToOneSecond() {
        runTest(2, 1, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToTwoSeconds() {
        runTest(2, 2, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void threeToFourSeconds() {
        runTest(3, 4, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void threeToFiftyNineSeconds() {
        runTest(3, 59, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void threeToZeroSecond() {
        runTest(3, 0, StateUpdate.SHOW_DISABLED);
    }

    @Test
    public void threeToOneSecond() {
        runTest(3, 1, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void threeToTwoSeconds() {
        runTest(3, 2, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void threeToThreeSeconds() {
        runTest(3, 3, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void fiftyEightToFiftyNineSeconds() {
        runTest(58, 59, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void fiftyEightToZeroSecond() {
        runTest(58, 0, StateUpdate.SHOW_DISABLED);
    }

    @Test
    public void fiftyEightToOneSecond() {
        runTest(58, 1, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void fiftyEightToTwoSeconds() {
        runTest(58, 2, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void fiftyEightToFiftyEightSeconds() {
        runTest(58, 58, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void fiftyNineToZeroSecond() {
        runTest(59, 0, StateUpdate.SHOW_DISABLED);
    }

    @Test
    public void fiftyNineToOneSecond() {
        runTest(59, 1, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void fiftyNineToTwoSeconds() {
        runTest(59, 2, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void fiftyNineToThreeSeconds() {
        runTest(59, 3, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void fiftyNineToFiftyEightSeconds() {
        runTest(59, 58, StateUpdate.NOT_NEEDED);
    }

    @Test
    public void fiftyNineToFiftyNineSeconds() {
        runTest(59, 59, StateUpdate.NOT_NEEDED);
    }

    private void runTest(long previousSecondsDuration, long currentSecondsDuration, StateUpdate expectedStateUpdate) {
        StateUpdate stateUpdate = getStateUpdate(currentSecondsDuration, previousSecondsDuration);
        assertThat(stateUpdate).isEqualTo(expectedStateUpdate);
    }
}