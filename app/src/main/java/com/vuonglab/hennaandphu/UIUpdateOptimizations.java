package com.vuonglab.hennaandphu;

class UIUpdateOptimizations {
    public enum LabelUpdate {
        NOT_NEEDED,
        SHOW_SINGULAR,
        SHOW_PLURAL
    }

    public enum StateUpdate {
        NOT_NEEDED,
        SHOW_DISABLED,
        SHOW_ENABLED
    }

    //<editor-fold desc="Minutes label and state">
    static LabelUpdate GetMinutesLabelUpdate(long currentMinutesDuration, long previousMinutesDuration) {
        boolean updateSkipped = wasMinutesUpdateSkipped(currentMinutesDuration, previousMinutesDuration);

        LabelUpdate labelUpdate = LabelUpdate.NOT_NEEDED;
        if (currentMinutesDuration == 0 || currentMinutesDuration == 1)
            labelUpdate = LabelUpdate.SHOW_SINGULAR;
        else if (currentMinutesDuration == 2 || updateSkipped)
            labelUpdate = LabelUpdate.SHOW_PLURAL;

        return labelUpdate;
    }

    static StateUpdate GetMinutesStateUpdate(long currentMinutesDuration, long previousMinutesDuration) {
        boolean updateSkipped = wasMinutesUpdateSkipped(currentMinutesDuration, previousMinutesDuration);

        StateUpdate stateUpdate = StateUpdate.NOT_NEEDED;
        if (currentMinutesDuration == 0) {
            stateUpdate = StateUpdate.SHOW_DISABLED;
        } else if (currentMinutesDuration == 1 || updateSkipped) {
            stateUpdate = StateUpdate.SHOW_ENABLED;
        }

        return stateUpdate;
    }

    private static boolean wasMinutesUpdateSkipped(long currentMinutesDuration, long previousMinutesDuration) {
        long expectedMinutes = (previousMinutesDuration == 59 ? 0 : previousMinutesDuration+1);
        return (expectedMinutes != currentMinutesDuration || previousMinutesDuration < 0);
    }
    //</editor-fold>

    //<editor-fold desc="Seconds label and state">
    static LabelUpdate GetSecondsLabelUpdate(long currentSecondsDuration, long previousSecondsDuration) {
        boolean updateSkipped = wasSecondsUpdateSkipped(currentSecondsDuration, previousSecondsDuration);

        LabelUpdate labelUpdate = LabelUpdate.NOT_NEEDED;
        if (currentSecondsDuration == 0 || currentSecondsDuration == 1)
            labelUpdate = LabelUpdate.SHOW_SINGULAR;
        else if (currentSecondsDuration == 2 || updateSkipped)
            labelUpdate = LabelUpdate.SHOW_PLURAL;

        return labelUpdate;
    }

    static StateUpdate GetSecondsStateUpdate(long currentSecondsDuration, long previousSecondsDuration) {
        boolean updateSkipped = wasSecondsUpdateSkipped(currentSecondsDuration, previousSecondsDuration);

        StateUpdate stateUpdate = StateUpdate.NOT_NEEDED;
        if (currentSecondsDuration == 0) {
            stateUpdate = StateUpdate.SHOW_DISABLED;
        } else if (currentSecondsDuration == 1 || updateSkipped) {
            stateUpdate = StateUpdate.SHOW_ENABLED;
        }

        return stateUpdate;
    }

    private static boolean wasSecondsUpdateSkipped(long currentSecondsDuration, long previousSecondsDuration) {
        long expectedSeconds = (previousSecondsDuration == 59 ? 0 : previousSecondsDuration+1);
        return (expectedSeconds != currentSecondsDuration || previousSecondsDuration < 0);
    }
    //</editor-fold>
}