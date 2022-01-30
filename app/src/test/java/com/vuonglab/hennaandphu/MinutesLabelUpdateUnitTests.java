package com.vuonglab.hennaandphu;

import com.vuonglab.hennaandphu.UIUpdateOptimizations.LabelUpdate;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;
import static com.vuonglab.hennaandphu.UIUpdateOptimizations.getLabelUpdate;

public class MinutesLabelUpdateUnitTests {
    @Test
    public void appStartZeroMinute() {
        runTest(-1, 0, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void appStartOneMinute() {
        runTest(-1, 1, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void appStartTwoMinutes() {
        runTest(-1, 2, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void appStartFiftyNineMinutes() {
        runTest(-1, 59, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void zeroToOneMinute() {
        runTest(0, 1, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void zeroToTwoMinutes() {
        runTest(0, 2, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void zeroToFiftyNineMinutes() {
        runTest(0, 59, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void zeroToZeroMinute() {
        runTest(0, 0, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void oneToTwoMinutes() {
        runTest(1, 2, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void oneToFiftyNineMinutes() {
        runTest(1, 59, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void oneToZeroMinute() {
        runTest(1, 0, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void oneToOneMinute() {
        runTest(1, 1, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToThirtyMinutes() {
        runTest(2, 30, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToFiftyNineMinutes() {
        runTest(2, 59, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToZeroMinute() {
        runTest(2, 0, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void twoToOneMinute() {
        runTest(2, 1, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void twoToTwoMinutes() {
        runTest(2, 2, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void threeToFortyFiveMinutes() {
        runTest(3, 45, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void threeToFiftyNineMinutes() {
        runTest(3, 59, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void threeToZeroMinute() {
        runTest(3, 0, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void threeToOneMinute() {
        runTest(3, 1, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void threeToTwoMinutes() {
        runTest(3, 2, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void threeToThreeMinutes() {
        runTest(3, 3, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void sixteenToFiftyNineMinutes() {
        runTest(16, 59, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void sixteenToZeroMinute() {
        runTest(16, 0, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void sixteenToOneMinute() {
        runTest(16, 1, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void sixteenToTwoMinutes() {
        runTest(16, 2, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void sixteenToFiftyEightMinutes() {
        runTest(16, 58, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void fiftyNineToZeroMinute() {
        runTest(59, 0, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void fiftyNineToOneMinute() {
        runTest(59, 1, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void fiftyNineToTwoMinutes() {
        runTest(59, 2, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void fiftyNineToTenMinutes() {
        runTest(59, 10, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void fiftyNineToTwentyMinutes() {
        runTest(59, 20, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void fiftyNineToFiftyNineMinutes() {
        runTest(59, 59, LabelUpdate.NOT_NEEDED);
    }

    private void runTest(long previousMinutesDuration, long currentMinutesDuration, LabelUpdate expectedLabelUpdate) {
        LabelUpdate labelUpdate = getLabelUpdate(currentMinutesDuration, previousMinutesDuration);
        assertThat(labelUpdate).isEqualTo(expectedLabelUpdate);
    }
}