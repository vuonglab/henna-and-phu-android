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

    //<editor-fold desc="Years label and state">
    static StateUpdate GetYearsStateUpdate(long currentYearsDuration, long previousYearsDuration) {
        boolean currentYearsEnabled = currentYearsDuration >= 1;
        if (previousYearsDuration < 0)
            return currentYearsEnabled ? StateUpdate.SHOW_ENABLED : StateUpdate.SHOW_DISABLED;

        boolean previousYearsEnabled = previousYearsDuration >= 1;
        if (previousYearsEnabled == currentYearsEnabled)
            return StateUpdate.NOT_NEEDED;

        return currentYearsEnabled ? StateUpdate.SHOW_ENABLED : StateUpdate.SHOW_DISABLED;
    }
    //</editor-fold>

    //<editor-fold desc="Months label and state">
    static StateUpdate GetMonthsStateUpdate(long currentMonthsDuration, long previousMonthsDuration) {
        boolean currentMonthsEnabled = currentMonthsDuration >= 1;
        if (previousMonthsDuration < 0)
            return currentMonthsEnabled ? StateUpdate.SHOW_ENABLED : StateUpdate.SHOW_DISABLED;

        boolean previousMonthsEnabled = previousMonthsDuration >= 1;
        if (previousMonthsEnabled == currentMonthsEnabled)
            return StateUpdate.NOT_NEEDED;

        return currentMonthsEnabled ? StateUpdate.SHOW_ENABLED : StateUpdate.SHOW_DISABLED;
    }
    //</editor-fold>

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
    static LabelUpdate GetSecondsLabelUpdate(long currentSecondsDuration, long previousSecondsDuration) {
        boolean currentSecondsPlural = currentSecondsDuration >= 2;
        if (previousSecondsDuration < 0)
            return currentSecondsPlural ? LabelUpdate.SHOW_PLURAL : LabelUpdate.SHOW_SINGULAR;

        boolean previousSecondsPlural = previousSecondsDuration >= 2;
        if (previousSecondsPlural == currentSecondsPlural)
            return LabelUpdate.NOT_NEEDED;

        return currentSecondsPlural ? LabelUpdate.SHOW_PLURAL : LabelUpdate.SHOW_SINGULAR;
    }

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