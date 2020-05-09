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
}