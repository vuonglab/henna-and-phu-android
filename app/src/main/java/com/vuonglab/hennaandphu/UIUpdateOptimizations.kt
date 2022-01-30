package com.vuonglab.hennaandphu

fun getLabelUpdate(currentDuration: Long, previousDuration: Long): LabelUpdate {
    val currentPlural = currentDuration >= 2
    if (previousDuration < 0) return if (currentPlural) LabelUpdate.SHOW_PLURAL else LabelUpdate.SHOW_SINGULAR
    val previousPlural = previousDuration >= 2
    if (previousPlural == currentPlural) return LabelUpdate.NOT_NEEDED
    return if (currentPlural) LabelUpdate.SHOW_PLURAL else LabelUpdate.SHOW_SINGULAR
}

fun getStateUpdate(currentsDuration: Long, previousDuration: Long): StateUpdate {
    val currentsEnabled = currentsDuration >= 1
    if (previousDuration < 0) return if (currentsEnabled) StateUpdate.SHOW_ENABLED else StateUpdate.SHOW_DISABLED
    val previousEnabled = previousDuration >= 1
    if (previousEnabled == currentsEnabled) return StateUpdate.NOT_NEEDED
    return if (currentsEnabled) StateUpdate.SHOW_ENABLED else StateUpdate.SHOW_DISABLED
}

enum class LabelUpdate {
    NOT_NEEDED, SHOW_SINGULAR, SHOW_PLURAL
}

enum class StateUpdate {
    NOT_NEEDED, SHOW_DISABLED, SHOW_ENABLED
}