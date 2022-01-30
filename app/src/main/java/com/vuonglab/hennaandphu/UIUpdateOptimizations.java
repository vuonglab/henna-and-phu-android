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

    static LabelUpdate getLabelUpdate(long currentDuration, long previousDuration) {
        boolean currentPlural = currentDuration >= 2;
        if (previousDuration < 0)
            return currentPlural ? LabelUpdate.SHOW_PLURAL : LabelUpdate.SHOW_SINGULAR;

        boolean previousPlural = previousDuration >= 2;
        if (previousPlural == currentPlural)
            return LabelUpdate.NOT_NEEDED;

        return currentPlural ? LabelUpdate.SHOW_PLURAL : LabelUpdate.SHOW_SINGULAR;
    }

    static StateUpdate getStateUpdate(long currentsDuration, long previousDuration) {
        boolean currentsEnabled = currentsDuration >= 1;
        if (previousDuration < 0)
            return currentsEnabled ? StateUpdate.SHOW_ENABLED : StateUpdate.SHOW_DISABLED;

        boolean previousEnabled = previousDuration >= 1;
        if (previousEnabled == currentsEnabled)
            return StateUpdate.NOT_NEEDED;

        return currentsEnabled ? StateUpdate.SHOW_ENABLED : StateUpdate.SHOW_DISABLED;
    }
}