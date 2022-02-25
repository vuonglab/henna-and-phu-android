package com.vuonglab.hennaandphu

import androidx.test.filters.LargeTest
import androidx.test.espresso.Espresso
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.CoreMatchers
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class DateTimeStateUpdateTests {
    @get:Rule
    val rule = activityScenarioRule<MainActivity>()

    // <editor-fold desc="Years enabled/disabled tests">
    @Test
    fun yearsDisabledToEnabled() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateYearsState(StateUpdate.SHOW_DISABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.yearsCount))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
        Espresso.onView(ViewMatchers.withId(R.id.yearsLabel))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))

        scenario.onActivity { activity: MainActivity -> activity.updateYearsState(StateUpdate.SHOW_ENABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.yearsCount))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
        Espresso.onView(ViewMatchers.withId(R.id.yearsLabel))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
    }

    @Test
    fun yearsDisabledNoChange() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateYearsState(StateUpdate.SHOW_DISABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.yearsCount))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
        Espresso.onView(ViewMatchers.withId(R.id.yearsLabel))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))

        scenario.onActivity { activity: MainActivity -> activity.updateYearsState(StateUpdate.NOT_NEEDED) }
        Espresso.onView(ViewMatchers.withId(R.id.yearsCount))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
        Espresso.onView(ViewMatchers.withId(R.id.yearsLabel))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
    }

    @Test
    fun yearsEnabledToDisabled() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateYearsState(StateUpdate.SHOW_ENABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.yearsCount))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
        Espresso.onView(ViewMatchers.withId(R.id.yearsLabel))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))

        scenario.onActivity { activity: MainActivity -> activity.updateYearsState(StateUpdate.SHOW_DISABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.yearsCount))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
        Espresso.onView(ViewMatchers.withId(R.id.yearsLabel))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
    }

    @Test
    fun yearsEnabledNoChange() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateYearsState(StateUpdate.SHOW_ENABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.yearsCount))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
        Espresso.onView(ViewMatchers.withId(R.id.yearsLabel))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))

        scenario.onActivity { activity: MainActivity -> activity.updateYearsState(StateUpdate.NOT_NEEDED) }
        Espresso.onView(ViewMatchers.withId(R.id.yearsCount))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
        Espresso.onView(ViewMatchers.withId(R.id.yearsLabel))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
    }

    // </editor-fold>
    // <editor-fold desc="Months enabled/disabled tests">
    @Test
    fun monthsDisabledToEnabled() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateMonthsState(StateUpdate.SHOW_DISABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.monthsCount))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
        Espresso.onView(ViewMatchers.withId(R.id.monthsLabel))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))

        scenario.onActivity { activity: MainActivity -> activity.updateMonthsState(StateUpdate.SHOW_ENABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.monthsCount))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
        Espresso.onView(ViewMatchers.withId(R.id.monthsLabel))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
    }

    @Test
    fun monthsDisabledNoChange() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateMonthsState(StateUpdate.SHOW_DISABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.monthsCount))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
        Espresso.onView(ViewMatchers.withId(R.id.monthsLabel))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))

        scenario.onActivity { activity: MainActivity -> activity.updateMonthsState(StateUpdate.NOT_NEEDED) }
        Espresso.onView(ViewMatchers.withId(R.id.monthsCount))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
        Espresso.onView(ViewMatchers.withId(R.id.monthsLabel))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
    }

    @Test
    fun monthsEnabledToDisabled() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateMonthsState(StateUpdate.SHOW_ENABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.monthsCount))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
        Espresso.onView(ViewMatchers.withId(R.id.monthsLabel))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))

        scenario.onActivity { activity: MainActivity -> activity.updateMonthsState(StateUpdate.SHOW_DISABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.monthsCount))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
        Espresso.onView(ViewMatchers.withId(R.id.monthsLabel))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
    }

    @Test
    fun monthsEnabledNoChange() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateMonthsState(StateUpdate.SHOW_ENABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.monthsCount))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
        Espresso.onView(ViewMatchers.withId(R.id.monthsLabel))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))

        scenario.onActivity { activity: MainActivity -> activity.updateMonthsState(StateUpdate.NOT_NEEDED) }
        Espresso.onView(ViewMatchers.withId(R.id.monthsCount))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
        Espresso.onView(ViewMatchers.withId(R.id.monthsLabel))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
    }

    // </editor-fold>
    // <editor-fold desc="Days enabled/disabled tests">
    @Test
    fun daysDisabledToEnabled() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateDaysState(StateUpdate.SHOW_DISABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.daysCount))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
        Espresso.onView(ViewMatchers.withId(R.id.daysLabel))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))

        scenario.onActivity { activity: MainActivity -> activity.updateDaysState(StateUpdate.SHOW_ENABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.daysCount))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
        Espresso.onView(ViewMatchers.withId(R.id.daysLabel))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
    }

    @Test
    fun daysDisabledNoChange() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateDaysState(StateUpdate.SHOW_DISABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.daysCount))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
        Espresso.onView(ViewMatchers.withId(R.id.daysLabel))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))

        scenario.onActivity { activity: MainActivity -> activity.updateDaysState(StateUpdate.NOT_NEEDED) }
        Espresso.onView(ViewMatchers.withId(R.id.daysCount))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
        Espresso.onView(ViewMatchers.withId(R.id.daysLabel))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
    }

    @Test
    fun daysEnabledToDisabled() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateDaysState(StateUpdate.SHOW_ENABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.daysCount))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
        Espresso.onView(ViewMatchers.withId(R.id.daysLabel))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))

        scenario.onActivity { activity: MainActivity -> activity.updateDaysState(StateUpdate.SHOW_DISABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.daysCount))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
        Espresso.onView(ViewMatchers.withId(R.id.daysLabel))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
    }

    @Test
    fun daysEnabledNoChange() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateDaysState(StateUpdate.SHOW_ENABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.daysCount))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
        Espresso.onView(ViewMatchers.withId(R.id.daysLabel))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))

        scenario.onActivity { activity: MainActivity -> activity.updateDaysState(StateUpdate.NOT_NEEDED) }
        Espresso.onView(ViewMatchers.withId(R.id.daysCount))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
        Espresso.onView(ViewMatchers.withId(R.id.daysLabel))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
    }

    // </editor-fold>
    // <editor-fold desc="Hours enabled/disabled tests">
    @Test
    fun hoursDisabledToEnabled() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateHoursState(StateUpdate.SHOW_DISABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.hoursCount))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
        Espresso.onView(ViewMatchers.withId(R.id.hoursLabel))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))

        scenario.onActivity { activity: MainActivity -> activity.updateHoursState(StateUpdate.SHOW_ENABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.hoursCount))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
        Espresso.onView(ViewMatchers.withId(R.id.hoursLabel))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
    }

    @Test
    fun hoursDisabledNoChange() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateHoursState(StateUpdate.SHOW_DISABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.hoursCount))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
        Espresso.onView(ViewMatchers.withId(R.id.hoursLabel))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))

        scenario.onActivity { activity: MainActivity -> activity.updateHoursState(StateUpdate.NOT_NEEDED) }
        Espresso.onView(ViewMatchers.withId(R.id.hoursCount))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
        Espresso.onView(ViewMatchers.withId(R.id.hoursLabel))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
    }

    @Test
    fun hoursEnabledToDisabled() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateHoursState(StateUpdate.SHOW_ENABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.hoursCount))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
        Espresso.onView(ViewMatchers.withId(R.id.hoursLabel))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))

        scenario.onActivity { activity: MainActivity -> activity.updateHoursState(StateUpdate.SHOW_DISABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.hoursCount))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
        Espresso.onView(ViewMatchers.withId(R.id.hoursLabel))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
    }

    @Test
    fun hoursEnabledNoChange() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateHoursState(StateUpdate.SHOW_ENABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.hoursCount))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
        Espresso.onView(ViewMatchers.withId(R.id.hoursLabel))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))

        scenario.onActivity { activity: MainActivity -> activity.updateHoursState(StateUpdate.NOT_NEEDED) }
        Espresso.onView(ViewMatchers.withId(R.id.hoursCount))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
        Espresso.onView(ViewMatchers.withId(R.id.hoursLabel))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
    }

    // </editor-fold>
    // <editor-fold desc="Minutes enabled/disabled tests">
    @Test
    fun minutesDisabledToEnabled() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateMinutesState(StateUpdate.SHOW_DISABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.minutesCount))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
        Espresso.onView(ViewMatchers.withId(R.id.minutesLabel))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))

        scenario.onActivity { activity: MainActivity -> activity.updateMinutesState(StateUpdate.SHOW_ENABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.minutesCount))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
        Espresso.onView(ViewMatchers.withId(R.id.minutesLabel))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
    }

    @Test
    fun minutesDisabledNoChange() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateMinutesState(StateUpdate.SHOW_DISABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.minutesCount))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
        Espresso.onView(ViewMatchers.withId(R.id.minutesLabel))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))

        scenario.onActivity { activity: MainActivity -> activity.updateMinutesState(StateUpdate.NOT_NEEDED) }
        Espresso.onView(ViewMatchers.withId(R.id.minutesCount))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
        Espresso.onView(ViewMatchers.withId(R.id.minutesLabel))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
    }

    @Test
    fun minutesEnabledToDisabled() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateMinutesState(StateUpdate.SHOW_ENABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.minutesCount))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
        Espresso.onView(ViewMatchers.withId(R.id.minutesLabel))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))

        scenario.onActivity { activity: MainActivity -> activity.updateMinutesState(StateUpdate.SHOW_DISABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.minutesCount))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
        Espresso.onView(ViewMatchers.withId(R.id.minutesLabel))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
    }

    @Test
    fun minutesEnabledNoChange() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateMinutesState(StateUpdate.SHOW_ENABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.minutesCount))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
        Espresso.onView(ViewMatchers.withId(R.id.minutesLabel))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))

        scenario.onActivity { activity: MainActivity -> activity.updateMinutesState(StateUpdate.NOT_NEEDED) }
        Espresso.onView(ViewMatchers.withId(R.id.minutesCount))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
        Espresso.onView(ViewMatchers.withId(R.id.minutesLabel))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
    }

    // </editor-fold>
    // <editor-fold desc="Seconds enabled/disabled tests">
    @Test
    fun secondsDisabledToEnabled() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateSecondsState(StateUpdate.SHOW_DISABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.secondsCount))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
        Espresso.onView(ViewMatchers.withId(R.id.secondsLabel))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))

        scenario.onActivity { activity: MainActivity -> activity.updateSecondsState(StateUpdate.SHOW_ENABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.secondsCount))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
        Espresso.onView(ViewMatchers.withId(R.id.secondsLabel))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
    }

    @Test
    fun secondsDisabledNoChange() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateSecondsState(StateUpdate.SHOW_DISABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.secondsCount))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
        Espresso.onView(ViewMatchers.withId(R.id.secondsLabel))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))

        scenario.onActivity { activity: MainActivity -> activity.updateSecondsState(StateUpdate.NOT_NEEDED) }
        Espresso.onView(ViewMatchers.withId(R.id.secondsCount))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
        Espresso.onView(ViewMatchers.withId(R.id.secondsLabel))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
    }

    @Test
    fun secondsEnabledToDisabled() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateSecondsState(StateUpdate.SHOW_ENABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.secondsCount))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
        Espresso.onView(ViewMatchers.withId(R.id.secondsLabel))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))

        scenario.onActivity { activity: MainActivity -> activity.updateSecondsState(StateUpdate.SHOW_DISABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.secondsCount))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
        Espresso.onView(ViewMatchers.withId(R.id.secondsLabel))
            .check(ViewAssertions.matches(CoreMatchers.not(ViewMatchers.isEnabled())))
    }

    @Test
    fun secondsEnabledNoChange() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateSecondsState(StateUpdate.SHOW_ENABLED) }
        Espresso.onView(ViewMatchers.withId(R.id.secondsCount))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
        Espresso.onView(ViewMatchers.withId(R.id.secondsLabel))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))

        scenario.onActivity { activity: MainActivity -> activity.updateSecondsState(StateUpdate.NOT_NEEDED) }
        Espresso.onView(ViewMatchers.withId(R.id.secondsCount))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
        Espresso.onView(ViewMatchers.withId(R.id.secondsLabel))
            .check(ViewAssertions.matches(ViewMatchers.isEnabled()))
    } // </editor-fold>
}