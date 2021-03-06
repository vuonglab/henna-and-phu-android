package com.vuonglab.hennaandphu;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isEnabled;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import static org.hamcrest.CoreMatchers.not;

import com.vuonglab.hennaandphu.UIUpdateOptimizations.StateUpdate;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class DateTimeStateUpdateTests {
    @Rule
    public ActivityScenarioRule<MainActivity> rule
            = new ActivityScenarioRule<>(MainActivity.class);

    // <editor-fold desc="Years enabled/disabled tests">
    @Test
    public void yearsDisabledToEnabled() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateYearsState(StateUpdate.SHOW_DISABLED));
        onView(withId(R.id.yearsCount)).check(matches(not(isEnabled())));
        onView(withId(R.id.yearsLabel)).check(matches(not(isEnabled())));

        scenario.onActivity(activity -> activity.updateYearsState(StateUpdate.SHOW_ENABLED));
        onView(withId(R.id.yearsCount)).check(matches(isEnabled()));
        onView(withId(R.id.yearsLabel)).check(matches(isEnabled()));
    }

    @Test
    public void yearsDisabledNoChange() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateYearsState(StateUpdate.SHOW_DISABLED));
        onView(withId(R.id.yearsCount)).check(matches(not(isEnabled())));
        onView(withId(R.id.yearsLabel)).check(matches(not(isEnabled())));

        scenario.onActivity(activity -> activity.updateYearsState(StateUpdate.NOT_NEEDED));
        onView(withId(R.id.yearsCount)).check(matches(not(isEnabled())));
        onView(withId(R.id.yearsLabel)).check(matches(not(isEnabled())));
    }

    @Test
    public void yearsEnabledToDisabled() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateYearsState(StateUpdate.SHOW_ENABLED));
        onView(withId(R.id.yearsCount)).check(matches(isEnabled()));
        onView(withId(R.id.yearsLabel)).check(matches(isEnabled()));

        scenario.onActivity(activity -> activity.updateYearsState(StateUpdate.SHOW_DISABLED));
        onView(withId(R.id.yearsCount)).check(matches(not(isEnabled())));
        onView(withId(R.id.yearsLabel)).check(matches(not(isEnabled())));
    }

    @Test
    public void yearsEnabledNoChange() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateYearsState(StateUpdate.SHOW_ENABLED));
        onView(withId(R.id.yearsCount)).check(matches(isEnabled()));
        onView(withId(R.id.yearsLabel)).check(matches(isEnabled()));

        scenario.onActivity(activity -> activity.updateYearsState(StateUpdate.NOT_NEEDED));
        onView(withId(R.id.yearsCount)).check(matches(isEnabled()));
        onView(withId(R.id.yearsLabel)).check(matches(isEnabled()));
    }
    // </editor-fold>

    // <editor-fold desc="Months enabled/disabled tests">
    @Test
    public void monthsDisabledToEnabled() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateMonthsState(StateUpdate.SHOW_DISABLED));
        onView(withId(R.id.monthsCount)).check(matches(not(isEnabled())));
        onView(withId(R.id.monthsLabel)).check(matches(not(isEnabled())));

        scenario.onActivity(activity -> activity.updateMonthsState(StateUpdate.SHOW_ENABLED));
        onView(withId(R.id.monthsCount)).check(matches(isEnabled()));
        onView(withId(R.id.monthsLabel)).check(matches(isEnabled()));
    }

    @Test
    public void monthsDisabledNoChange() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateMonthsState(StateUpdate.SHOW_DISABLED));
        onView(withId(R.id.monthsCount)).check(matches(not(isEnabled())));
        onView(withId(R.id.monthsLabel)).check(matches(not(isEnabled())));

        scenario.onActivity(activity -> activity.updateMonthsState(StateUpdate.NOT_NEEDED));
        onView(withId(R.id.monthsCount)).check(matches(not(isEnabled())));
        onView(withId(R.id.monthsLabel)).check(matches(not(isEnabled())));
    }

    @Test
    public void monthsEnabledToDisabled() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateMonthsState(StateUpdate.SHOW_ENABLED));
        onView(withId(R.id.monthsCount)).check(matches(isEnabled()));
        onView(withId(R.id.monthsLabel)).check(matches(isEnabled()));

        scenario.onActivity(activity -> activity.updateMonthsState(StateUpdate.SHOW_DISABLED));
        onView(withId(R.id.monthsCount)).check(matches(not(isEnabled())));
        onView(withId(R.id.monthsLabel)).check(matches(not(isEnabled())));
    }

    @Test
    public void monthsEnabledNoChange() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateMonthsState(StateUpdate.SHOW_ENABLED));
        onView(withId(R.id.monthsCount)).check(matches(isEnabled()));
        onView(withId(R.id.monthsLabel)).check(matches(isEnabled()));

        scenario.onActivity(activity -> activity.updateMonthsState(StateUpdate.NOT_NEEDED));
        onView(withId(R.id.monthsCount)).check(matches(isEnabled()));
        onView(withId(R.id.monthsLabel)).check(matches(isEnabled()));
    }
    // </editor-fold>

    // <editor-fold desc="Days enabled/disabled tests">
    @Test
    public void daysDisabledToEnabled() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateDaysState(StateUpdate.SHOW_DISABLED));
        onView(withId(R.id.daysCount)).check(matches(not(isEnabled())));
        onView(withId(R.id.daysLabel)).check(matches(not(isEnabled())));

        scenario.onActivity(activity -> activity.updateDaysState(StateUpdate.SHOW_ENABLED));
        onView(withId(R.id.daysCount)).check(matches(isEnabled()));
        onView(withId(R.id.daysLabel)).check(matches(isEnabled()));
    }

    @Test
    public void daysDisabledNoChange() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateDaysState(StateUpdate.SHOW_DISABLED));
        onView(withId(R.id.daysCount)).check(matches(not(isEnabled())));
        onView(withId(R.id.daysLabel)).check(matches(not(isEnabled())));

        scenario.onActivity(activity -> activity.updateDaysState(StateUpdate.NOT_NEEDED));
        onView(withId(R.id.daysCount)).check(matches(not(isEnabled())));
        onView(withId(R.id.daysLabel)).check(matches(not(isEnabled())));
    }

    @Test
    public void daysEnabledToDisabled() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateDaysState(StateUpdate.SHOW_ENABLED));
        onView(withId(R.id.daysCount)).check(matches(isEnabled()));
        onView(withId(R.id.daysLabel)).check(matches(isEnabled()));

        scenario.onActivity(activity -> activity.updateDaysState(StateUpdate.SHOW_DISABLED));
        onView(withId(R.id.daysCount)).check(matches(not(isEnabled())));
        onView(withId(R.id.daysLabel)).check(matches(not(isEnabled())));
    }

    @Test
    public void daysEnabledNoChange() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateDaysState(StateUpdate.SHOW_ENABLED));
        onView(withId(R.id.daysCount)).check(matches(isEnabled()));
        onView(withId(R.id.daysLabel)).check(matches(isEnabled()));

        scenario.onActivity(activity -> activity.updateDaysState(StateUpdate.NOT_NEEDED));
        onView(withId(R.id.daysCount)).check(matches(isEnabled()));
        onView(withId(R.id.daysLabel)).check(matches(isEnabled()));
    }
    // </editor-fold>

    // <editor-fold desc="Hours enabled/disabled tests">
    @Test
    public void hoursDisabledToEnabled() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateHoursState(StateUpdate.SHOW_DISABLED));
        onView(withId(R.id.hoursCount)).check(matches(not(isEnabled())));
        onView(withId(R.id.hoursLabel)).check(matches(not(isEnabled())));

        scenario.onActivity(activity -> activity.updateHoursState(StateUpdate.SHOW_ENABLED));
        onView(withId(R.id.hoursCount)).check(matches(isEnabled()));
        onView(withId(R.id.hoursLabel)).check(matches(isEnabled()));
    }

    @Test
    public void hoursDisabledNoChange() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateHoursState(StateUpdate.SHOW_DISABLED));
        onView(withId(R.id.hoursCount)).check(matches(not(isEnabled())));
        onView(withId(R.id.hoursLabel)).check(matches(not(isEnabled())));

        scenario.onActivity(activity -> activity.updateHoursState(StateUpdate.NOT_NEEDED));
        onView(withId(R.id.hoursCount)).check(matches(not(isEnabled())));
        onView(withId(R.id.hoursLabel)).check(matches(not(isEnabled())));
    }

    @Test
    public void hoursEnabledToDisabled() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateHoursState(StateUpdate.SHOW_ENABLED));
        onView(withId(R.id.hoursCount)).check(matches(isEnabled()));
        onView(withId(R.id.hoursLabel)).check(matches(isEnabled()));

        scenario.onActivity(activity -> activity.updateHoursState(StateUpdate.SHOW_DISABLED));
        onView(withId(R.id.hoursCount)).check(matches(not(isEnabled())));
        onView(withId(R.id.hoursLabel)).check(matches(not(isEnabled())));
    }

    @Test
    public void hoursEnabledNoChange() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateHoursState(StateUpdate.SHOW_ENABLED));
        onView(withId(R.id.hoursCount)).check(matches(isEnabled()));
        onView(withId(R.id.hoursLabel)).check(matches(isEnabled()));

        scenario.onActivity(activity -> activity.updateHoursState(StateUpdate.NOT_NEEDED));
        onView(withId(R.id.hoursCount)).check(matches(isEnabled()));
        onView(withId(R.id.hoursLabel)).check(matches(isEnabled()));
    }
    // </editor-fold>

    // <editor-fold desc="Minutes enabled/disabled tests">
    @Test
    public void minutesDisabledToEnabled() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateMinutesState(StateUpdate.SHOW_DISABLED));
        onView(withId(R.id.minutesCount)).check(matches(not(isEnabled())));
        onView(withId(R.id.minutesLabel)).check(matches(not(isEnabled())));

        scenario.onActivity(activity -> activity.updateMinutesState(StateUpdate.SHOW_ENABLED));
        onView(withId(R.id.minutesCount)).check(matches(isEnabled()));
        onView(withId(R.id.minutesLabel)).check(matches(isEnabled()));
    }

    @Test
    public void minutesDisabledNoChange() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateMinutesState(StateUpdate.SHOW_DISABLED));
        onView(withId(R.id.minutesCount)).check(matches(not(isEnabled())));
        onView(withId(R.id.minutesLabel)).check(matches(not(isEnabled())));

        scenario.onActivity(activity -> activity.updateMinutesState(StateUpdate.NOT_NEEDED));
        onView(withId(R.id.minutesCount)).check(matches(not(isEnabled())));
        onView(withId(R.id.minutesLabel)).check(matches(not(isEnabled())));
    }

    @Test
    public void minutesEnabledToDisabled() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateMinutesState(StateUpdate.SHOW_ENABLED));
        onView(withId(R.id.minutesCount)).check(matches(isEnabled()));
        onView(withId(R.id.minutesLabel)).check(matches(isEnabled()));

        scenario.onActivity(activity -> activity.updateMinutesState(StateUpdate.SHOW_DISABLED));
        onView(withId(R.id.minutesCount)).check(matches(not(isEnabled())));
        onView(withId(R.id.minutesLabel)).check(matches(not(isEnabled())));
    }

    @Test
    public void minutesEnabledNoChange() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateMinutesState(StateUpdate.SHOW_ENABLED));
        onView(withId(R.id.minutesCount)).check(matches(isEnabled()));
        onView(withId(R.id.minutesLabel)).check(matches(isEnabled()));

        scenario.onActivity(activity -> activity.updateMinutesState(StateUpdate.NOT_NEEDED));
        onView(withId(R.id.minutesCount)).check(matches(isEnabled()));
        onView(withId(R.id.minutesLabel)).check(matches(isEnabled()));
    }
    // </editor-fold>

    // <editor-fold desc="Seconds enabled/disabled tests">
    @Test
    public void secondsDisabledToEnabled() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateSecondsState(StateUpdate.SHOW_DISABLED));
        onView(withId(R.id.secondsCount)).check(matches(not(isEnabled())));
        onView(withId(R.id.secondsLabel)).check(matches(not(isEnabled())));

        scenario.onActivity(activity -> activity.updateSecondsState(StateUpdate.SHOW_ENABLED));
        onView(withId(R.id.secondsCount)).check(matches(isEnabled()));
        onView(withId(R.id.secondsLabel)).check(matches(isEnabled()));
    }

    @Test
    public void secondsDisabledNoChange() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateSecondsState(StateUpdate.SHOW_DISABLED));
        onView(withId(R.id.secondsCount)).check(matches(not(isEnabled())));
        onView(withId(R.id.secondsLabel)).check(matches(not(isEnabled())));

        scenario.onActivity(activity -> activity.updateSecondsState(StateUpdate.NOT_NEEDED));
        onView(withId(R.id.secondsCount)).check(matches(not(isEnabled())));
        onView(withId(R.id.secondsLabel)).check(matches(not(isEnabled())));
    }

    @Test
    public void secondsEnabledToDisabled() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateSecondsState(StateUpdate.SHOW_ENABLED));
        onView(withId(R.id.secondsCount)).check(matches(isEnabled()));
        onView(withId(R.id.secondsLabel)).check(matches(isEnabled()));

        scenario.onActivity(activity -> activity.updateSecondsState(StateUpdate.SHOW_DISABLED));
        onView(withId(R.id.secondsCount)).check(matches(not(isEnabled())));
        onView(withId(R.id.secondsLabel)).check(matches(not(isEnabled())));
    }

    @Test
    public void secondsEnabledNoChange() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateSecondsState(StateUpdate.SHOW_ENABLED));
        onView(withId(R.id.secondsCount)).check(matches(isEnabled()));
        onView(withId(R.id.secondsLabel)).check(matches(isEnabled()));

        scenario.onActivity(activity -> activity.updateSecondsState(StateUpdate.NOT_NEEDED));
        onView(withId(R.id.secondsCount)).check(matches(isEnabled()));
        onView(withId(R.id.secondsLabel)).check(matches(isEnabled()));
    }
    // </editor-fold>
}