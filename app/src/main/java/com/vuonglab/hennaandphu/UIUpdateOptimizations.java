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

    static LabelUpdate GetLabelUpdate(long currentDuration, long previousDuration) {
        boolean currentPlural = currentDuration >= 2;
        if (previousDuration < 0)
            return currentPlural ? LabelUpdate.SHOW_PLURAL : LabelUpdate.SHOW_SINGULAR;

        boolean previousPlural = previousDuration >= 2;
        if (previousPlural == currentPlural)
            return LabelUpdate.NOT_NEEDED;

        return currentPlural ? LabelUpdate.SHOW_PLURAL : LabelUpdate.SHOW_SINGULAR;
    }

    static StateUpdate GetStateUpdate(long currentsDuration, long previoussDuration) {
        boolean currentsEnabled = currentsDuration >= 1;
        if (previoussDuration < 0)
            return currentsEnabled ? StateUpdate.SHOW_ENABLED : StateUpdate.SHOW_DISABLED;

        boolean previoussEnabled = previoussDuration >= 1;
        if (previoussEnabled == currentsEnabled)
            return StateUpdate.NOT_NEEDED;

        return currentsEnabled ? StateUpdate.SHOW_ENABLED : StateUpdate.SHOW_DISABLED;
    }

    //<editor-fold desc="Days label and state">
    static StateUpdate GetDaysStateUpdate(long currentDaysDuration, long previousDaysDuration) {
        boolean currentDaysEnabled = currentDaysDuration >= 1;
        if (previousDaysDuration < 0)
            return currentDaysEnabled ? StateUpdate.SHOW_ENABLED : StateUpdate.SHOW_DISABLED;

        boolean previousDaysEnabled = previousDaysDuration >= 1;
        if (previousDaysEnabled == currentDaysEnabled)
            return StateUpdate.NOT_NEEDED;

        return currentDaysEnabled ? StateUpdate.SHOW_ENABLED : StateUpdate.SHOW_DISABLED;
    }
    //</editor-fold>

    //<editor-fold desc="Hours label and state">
    static StateUpdate GetHoursStateUpdate(long currentHoursDuration, long previousHoursDuration) {
        boolean currentHoursEnabled = currentHoursDuration >= 1;
        if (previousHoursDuration < 0)
            return currentHoursEnabled ? StateUpdate.SHOW_ENABLED : StateUpdate.SHOW_DISABLED;

        boolean previousHoursEnabled = previousHoursDuration >= 1;
        if (previousHoursEnabled == currentHoursEnabled)
            return StateUpdate.NOT_NEEDED;

        return currentHoursEnabled ? StateUpdate.SHOW_ENABLED : StateUpdate.SHOW_DISABLED;
    }
    //</editor-fold>

    //<editor-fold desc="Minutes label and state">
    static StateUpdate GetMinutesStateUpdate(long currentMinutesDuration, long previousMinutesDuration) {
        boolean currentMinutesEnabled = currentMinutesDuration >= 1;
        if (previousMinutesDuration < 0)
            return currentMinutesEnabled ? StateUpdate.SHOW_ENABLED : StateUpdate.SHOW_DISABLED;

        boolean previousMinutesEnabled = previousMinutesDuration >= 1;
        if (previousMinutesEnabled == currentMinutesEnabled)
            return StateUpdate.NOT_NEEDED;

        return currentMinutesEnabled ? StateUpdate.SHOW_ENABLED : StateUpdate.SHOW_DISABLED;
    }
    //</editor-fold>

    //<editor-fold desc="Seconds label and state">
    static StateUpdate GetSecondsStateUpdate(long currentSecondsDuration, long previousSecondsDuration) {
        boolean currentSecondsEnabled = currentSecondsDuration >= 1;
        if (previousSecondsDuration < 0)
            return currentSecondsEnabled ? StateUpdate.SHOW_ENABLED : StateUpdate.SHOW_DISABLED;

        boolean previousSecondsEnabled = previousSecondsDuration >= 1;
        if (previousSecondsEnabled == currentSecondsEnabled)
            return StateUpdate.NOT_NEEDED;

        return currentSecondsEnabled ? StateUpdate.SHOW_ENABLED : StateUpdate.SHOW_DISABLED;
    }
    //</editor-fold>
}