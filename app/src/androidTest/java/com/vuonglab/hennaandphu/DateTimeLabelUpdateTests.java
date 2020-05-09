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

import com.vuonglab.hennaandphu.UIUpdateOptimizations.LabelUpdate;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class DateTimeLabelUpdateTests {
    @Rule
    public ActivityScenarioRule<MainActivity> rule
            = new ActivityScenarioRule<>(MainActivity.class);

    // <editor-fold desc="Years grammatical number tests">
    @Test
    public void labelYearToYears() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateYearsLabel(LabelUpdate.SHOW_SINGULAR));
        onView(withId(R.id.yearsLabel)).check(matches(withText(R.string.year)));

        scenario.onActivity(activity -> activity.updateYearsLabel(LabelUpdate.SHOW_PLURAL));
        onView(withId(R.id.yearsLabel)).check(matches(withText(R.string.years)));
    }

    @Test
    public void labelYearNoChange() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateYearsLabel(LabelUpdate.SHOW_SINGULAR));
        onView(withId(R.id.yearsLabel)).check(matches(withText(R.string.year)));

        scenario.onActivity(activity -> activity.updateYearsLabel(LabelUpdate.NOT_NEEDED));
        onView(withId(R.id.yearsLabel)).check(matches(withText(R.string.year)));
    }

    @Test
    public void labelYearsToYear() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateYearsLabel(LabelUpdate.SHOW_PLURAL));
        onView(withId(R.id.yearsLabel)).check(matches(withText(R.string.years)));

        scenario.onActivity(activity -> activity.updateYearsLabel(LabelUpdate.SHOW_SINGULAR));
        onView(withId(R.id.yearsLabel)).check(matches(withText(R.string.year)));
    }

    @Test
    public void labelYearsNoChange() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateYearsLabel(LabelUpdate.SHOW_PLURAL));
        onView(withId(R.id.yearsLabel)).check(matches(withText(R.string.years)));

        scenario.onActivity(activity -> activity.updateYearsLabel(LabelUpdate.NOT_NEEDED));
        onView(withId(R.id.yearsLabel)).check(matches(withText(R.string.years)));
    }
    // </editor-fold>

    // <editor-fold desc="Months grammatical number tests">
    @Test
    public void labelMonthToMonths() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateMonthsLabel(LabelUpdate.SHOW_SINGULAR));
        onView(withId(R.id.monthsLabel)).check(matches(withText(R.string.month)));

        scenario.onActivity(activity -> activity.updateMonthsLabel(LabelUpdate.SHOW_PLURAL));
        onView(withId(R.id.monthsLabel)).check(matches(withText(R.string.months)));
    }

    @Test
    public void labelMonthNoChange() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateMonthsLabel(LabelUpdate.SHOW_SINGULAR));
        onView(withId(R.id.monthsLabel)).check(matches(withText(R.string.month)));

        scenario.onActivity(activity -> activity.updateMonthsLabel(LabelUpdate.NOT_NEEDED));
        onView(withId(R.id.monthsLabel)).check(matches(withText(R.string.month)));
    }

    @Test
    public void labelMonthsToMonth() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateMonthsLabel(LabelUpdate.SHOW_PLURAL));
        onView(withId(R.id.monthsLabel)).check(matches(withText(R.string.months)));

        scenario.onActivity(activity -> activity.updateMonthsLabel(LabelUpdate.SHOW_SINGULAR));
        onView(withId(R.id.monthsLabel)).check(matches(withText(R.string.month)));
    }

    @Test
    public void labelMonthsNoChange() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateMonthsLabel(LabelUpdate.SHOW_PLURAL));
        onView(withId(R.id.monthsLabel)).check(matches(withText(R.string.months)));

        scenario.onActivity(activity -> activity.updateMonthsLabel(LabelUpdate.NOT_NEEDED));
        onView(withId(R.id.monthsLabel)).check(matches(withText(R.string.months)));
    }
    // </editor-fold>

    // <editor-fold desc="Days grammatical number tests">
    @Test
    public void labelDayToDays() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateDaysLabel(LabelUpdate.SHOW_SINGULAR));
        onView(withId(R.id.daysLabel)).check(matches(withText(R.string.day)));

        scenario.onActivity(activity -> activity.updateDaysLabel(LabelUpdate.SHOW_PLURAL));
        onView(withId(R.id.daysLabel)).check(matches(withText(R.string.days)));
    }

    @Test
    public void labelDayNoChange() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateDaysLabel(LabelUpdate.SHOW_SINGULAR));
        onView(withId(R.id.daysLabel)).check(matches(withText(R.string.day)));

        scenario.onActivity(activity -> activity.updateDaysLabel(LabelUpdate.NOT_NEEDED));
        onView(withId(R.id.daysLabel)).check(matches(withText(R.string.day)));
    }

    @Test
    public void labelDaysToDay() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateDaysLabel(LabelUpdate.SHOW_PLURAL));
        onView(withId(R.id.daysLabel)).check(matches(withText(R.string.days)));

        scenario.onActivity(activity -> activity.updateDaysLabel(LabelUpdate.SHOW_SINGULAR));
        onView(withId(R.id.daysLabel)).check(matches(withText(R.string.day)));
    }

    @Test
    public void labelDaysNoChange() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateDaysLabel(LabelUpdate.SHOW_PLURAL));
        onView(withId(R.id.daysLabel)).check(matches(withText(R.string.days)));

        scenario.onActivity(activity -> activity.updateDaysLabel(LabelUpdate.NOT_NEEDED));
        onView(withId(R.id.daysLabel)).check(matches(withText(R.string.days)));
    }
    // </editor-fold>

    // <editor-fold desc="Hours grammatical number tests">
    @Test
    public void labelHourToHours() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateHoursLabel(LabelUpdate.SHOW_SINGULAR));
        onView(withId(R.id.hoursLabel)).check(matches(withText(R.string.hour)));

        scenario.onActivity(activity -> activity.updateHoursLabel(LabelUpdate.SHOW_PLURAL));
        onView(withId(R.id.hoursLabel)).check(matches(withText(R.string.hours)));
    }

    @Test
    public void labelHourNoChange() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateHoursLabel(LabelUpdate.SHOW_SINGULAR));
        onView(withId(R.id.hoursLabel)).check(matches(withText(R.string.hour)));

        scenario.onActivity(activity -> activity.updateHoursLabel(LabelUpdate.NOT_NEEDED));
        onView(withId(R.id.hoursLabel)).check(matches(withText(R.string.hour)));
    }

    @Test
    public void labelHoursToHour() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateHoursLabel(LabelUpdate.SHOW_PLURAL));
        onView(withId(R.id.hoursLabel)).check(matches(withText(R.string.hours)));

        scenario.onActivity(activity -> activity.updateHoursLabel(LabelUpdate.SHOW_SINGULAR));
        onView(withId(R.id.hoursLabel)).check(matches(withText(R.string.hour)));
    }

    @Test
    public void labelHoursNoChange() {
        ActivityScenario<MainActivity> scenario = rule.getScenario();

        scenario.onActivity(activity -> activity.updateHoursLabel(LabelUpdate.SHOW_PLURAL));
        onView(withId(R.id.hoursLabel)).check(matches(withText(R.string.hours)));

        scenario.onActivity(activity -> activity.updateHoursLabel(LabelUpdate.NOT_NEEDED));
        onView(withId(R.id.hoursLabel)).check(matches(withText(R.string.hours)));
    }
    // </editor-fold>
}