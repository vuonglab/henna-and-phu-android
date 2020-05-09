package com.vuonglab.hennaandphu;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class DateTimeLabelUpdateTests {
    @Rule
    public ActivityScenarioRule<MainActivity> rule
            = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void labelYearToYears() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateYearsLabel(UIUpdateOptimizations.LabelUpdate.SHOW_SINGULAR));
        onView(withId(R.id.yearsLabel)).check(matches(withText(R.string.year)));

        scenario.onActivity(activity -> activity.updateYearsLabel(UIUpdateOptimizations.LabelUpdate.SHOW_PLURAL));
        onView(withId(R.id.yearsLabel)).check(matches(withText(R.string.years)));
    }

    @Test
    public void labelYearNoChange() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateYearsLabel(UIUpdateOptimizations.LabelUpdate.SHOW_SINGULAR));
        onView(withId(R.id.yearsLabel)).check(matches(withText(R.string.year)));

        scenario.onActivity(activity -> activity.updateYearsLabel(UIUpdateOptimizations.LabelUpdate.NOT_NEEDED));
        onView(withId(R.id.yearsLabel)).check(matches(withText(R.string.year)));
    }

    @Test
    public void labelYearsToYear() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateYearsLabel(UIUpdateOptimizations.LabelUpdate.SHOW_PLURAL));
        onView(withId(R.id.yearsLabel)).check(matches(withText(R.string.years)));

        scenario.onActivity(activity -> activity.updateYearsLabel(UIUpdateOptimizations.LabelUpdate.SHOW_SINGULAR));
        onView(withId(R.id.yearsLabel)).check(matches(withText(R.string.year)));
    }

    @Test
    public void labelYearsNoChange() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateYearsLabel(UIUpdateOptimizations.LabelUpdate.SHOW_PLURAL));
        onView(withId(R.id.yearsLabel)).check(matches(withText(R.string.years)));

        scenario.onActivity(activity -> activity.updateYearsLabel(UIUpdateOptimizations.LabelUpdate.NOT_NEEDED));
        onView(withId(R.id.yearsLabel)).check(matches(withText(R.string.years)));
    }
}