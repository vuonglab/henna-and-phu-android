package com.vuonglab.hennaandphu;

import com.vuonglab.hennaandphu.UIUpdateOptimizations.LabelUpdate;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;
import static com.vuonglab.hennaandphu.UIUpdateOptimizations.GetLabelUpdate;

public class SecondsLabelUpdateUnitTests {
    @Test
    public void appStartZeroSecond() {
        runTest(-1, 0, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void appStartOneSecond() {
        runTest(-1, 1, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void appStartTwoSeconds() {
        runTest(-1, 2, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void appStartFiftyNineSeconds() {
        runTest(-1, 59, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void zeroToOneSecond() {
        runTest(0, 1, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void zeroToTwoSeconds() {
        runTest(0, 2, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void zeroToFiftyNineSeconds() {
        runTest(0, 59, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void zeroToZeroSecond() {
        runTest(0, 0, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void oneToTwoSeconds() {
        runTest(1, 2, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void oneToFiftyNineSeconds() {
        runTest(1, 59, LabelUpdate.SHOW_PLURAL);
    }

    @Test
    public void oneToZeroSecond() {
        runTest(1, 0, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void oneToOneSecond() {
        runTest(1, 1, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToThreeSeconds() {
        runTest(2, 3, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToFiftyNineSeconds() {
        runTest(2, 59, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void twoToZeroSecond() {
        runTest(2, 0, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void twoToOneSecond() {
        runTest(2, 1, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void twoToTwoSeconds() {
        runTest(2, 2, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void threeToFourSeconds() {
        runTest(3, 4, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void threeToFiftyNineSeconds() {
        runTest(3, 59, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void threeToZeroSecond() {
        runTest(3, 0, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void threeToOneSecond() {
        runTest(3, 1, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void threeToTwoSeconds() {
        runTest(3, 2, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void threeToThreeSeconds() {
        runTest(3, 3, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void fiftyEightToFiftyNineSeconds() {
        runTest(58, 59, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void fiftyEightToZeroSecond() {
        runTest(58, 0, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void fiftyEightToOneSecond() {
        runTest(58, 1, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void fiftyEightToTwoSeconds() {
        runTest(58, 2, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void fiftyEightToFiftyEightSeconds() {
        runTest(58, 58, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void fiftyNineToZeroSecond() {
        runTest(59, 0, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void fiftyNineToOneSecond() {
        runTest(59, 1, LabelUpdate.SHOW_SINGULAR);
    }

    @Test
    public void fiftyNineToTwoSeconds() {
        runTest(59, 2, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void fiftyNineToThreeSeconds() {
        runTest(59, 3, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void fiftyNineToFiftyEightSeconds() {
        runTest(59, 58, LabelUpdate.NOT_NEEDED);
    }

    @Test
    public void fiftyNineToFiftyNineSeconds() {
        runTest(59, 59, LabelUpdate.NOT_NEEDED);
    }

    private void runTest(long previousSecondsDuration, long currentSecondsDuration, LabelUpdate expectedLabelUpdate) {
        LabelUpdate labelUpdate = GetLabelUpdate(currentSecondsDuration, previousSecondsDuration);
        assertThat(labelUpdate).isEqualTo(expectedLabelUpdate);
    }
}