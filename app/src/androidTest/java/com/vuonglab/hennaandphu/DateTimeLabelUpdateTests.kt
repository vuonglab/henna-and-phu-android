package com.vuonglab.hennaandphu

import androidx.test.filters.LargeTest
import androidx.test.espresso.Espresso
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class DateTimeLabelUpdateTests {
    @get:Rule
    val rule = activityScenarioRule<MainActivity>()

    // <editor-fold desc="Years grammatical number tests">
    @Test
    fun labelYearToYears() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateYearsLabel(LabelUpdate.SHOW_SINGULAR) }
        Espresso.onView(ViewMatchers.withId(R.id.yearsLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.year)))

        scenario.onActivity { activity: MainActivity -> activity.updateYearsLabel(LabelUpdate.SHOW_PLURAL) }
        Espresso.onView(ViewMatchers.withId(R.id.yearsLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.years)))
    }

    @Test
    fun labelYearNoChange() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateYearsLabel(LabelUpdate.SHOW_SINGULAR) }
        Espresso.onView(ViewMatchers.withId(R.id.yearsLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.year)))

        scenario.onActivity { activity: MainActivity -> activity.updateYearsLabel(LabelUpdate.NOT_NEEDED) }
        Espresso.onView(ViewMatchers.withId(R.id.yearsLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.year)))
    }

    @Test
    fun labelYearsToYear() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateYearsLabel(LabelUpdate.SHOW_PLURAL) }
        Espresso.onView(ViewMatchers.withId(R.id.yearsLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.years)))

        scenario.onActivity { activity: MainActivity -> activity.updateYearsLabel(LabelUpdate.SHOW_SINGULAR) }
        Espresso.onView(ViewMatchers.withId(R.id.yearsLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.year)))
    }

    @Test
    fun labelYearsNoChange() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateYearsLabel(LabelUpdate.SHOW_PLURAL) }
        Espresso.onView(ViewMatchers.withId(R.id.yearsLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.years)))

        scenario.onActivity { activity: MainActivity -> activity.updateYearsLabel(LabelUpdate.NOT_NEEDED) }
        Espresso.onView(ViewMatchers.withId(R.id.yearsLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.years)))
    }

    // </editor-fold>
    // <editor-fold desc="Months grammatical number tests">
    @Test
    fun labelMonthToMonths() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateMonthsLabel(LabelUpdate.SHOW_SINGULAR) }
        Espresso.onView(ViewMatchers.withId(R.id.monthsLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.month)))

        scenario.onActivity { activity: MainActivity -> activity.updateMonthsLabel(LabelUpdate.SHOW_PLURAL) }
        Espresso.onView(ViewMatchers.withId(R.id.monthsLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.months)))
    }

    @Test
    fun labelMonthNoChange() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateMonthsLabel(LabelUpdate.SHOW_SINGULAR) }
        Espresso.onView(ViewMatchers.withId(R.id.monthsLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.month)))

        scenario.onActivity { activity: MainActivity -> activity.updateMonthsLabel(LabelUpdate.NOT_NEEDED) }
        Espresso.onView(ViewMatchers.withId(R.id.monthsLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.month)))
    }

    @Test
    fun labelMonthsToMonth() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateMonthsLabel(LabelUpdate.SHOW_PLURAL) }
        Espresso.onView(ViewMatchers.withId(R.id.monthsLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.months)))

        scenario.onActivity { activity: MainActivity -> activity.updateMonthsLabel(LabelUpdate.SHOW_SINGULAR) }
        Espresso.onView(ViewMatchers.withId(R.id.monthsLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.month)))
    }

    @Test
    fun labelMonthsNoChange() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateMonthsLabel(LabelUpdate.SHOW_PLURAL) }
        Espresso.onView(ViewMatchers.withId(R.id.monthsLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.months)))

        scenario.onActivity { activity: MainActivity -> activity.updateMonthsLabel(LabelUpdate.NOT_NEEDED) }
        Espresso.onView(ViewMatchers.withId(R.id.monthsLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.months)))
    }

    // </editor-fold>
    // <editor-fold desc="Days grammatical number tests">
    @Test
    fun labelDayToDays() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateDaysLabel(LabelUpdate.SHOW_SINGULAR) }
        Espresso.onView(ViewMatchers.withId(R.id.daysLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.day)))

        scenario.onActivity { activity: MainActivity -> activity.updateDaysLabel(LabelUpdate.SHOW_PLURAL) }
        Espresso.onView(ViewMatchers.withId(R.id.daysLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.days)))
    }

    @Test
    fun labelDayNoChange() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateDaysLabel(LabelUpdate.SHOW_SINGULAR) }
        Espresso.onView(ViewMatchers.withId(R.id.daysLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.day)))

        scenario.onActivity { activity: MainActivity -> activity.updateDaysLabel(LabelUpdate.NOT_NEEDED) }
        Espresso.onView(ViewMatchers.withId(R.id.daysLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.day)))
    }

    @Test
    fun labelDaysToDay() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateDaysLabel(LabelUpdate.SHOW_PLURAL) }
        Espresso.onView(ViewMatchers.withId(R.id.daysLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.days)))

        scenario.onActivity { activity: MainActivity -> activity.updateDaysLabel(LabelUpdate.SHOW_SINGULAR) }
        Espresso.onView(ViewMatchers.withId(R.id.daysLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.day)))
    }

    @Test
    fun labelDaysNoChange() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateDaysLabel(LabelUpdate.SHOW_PLURAL) }
        Espresso.onView(ViewMatchers.withId(R.id.daysLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.days)))

        scenario.onActivity { activity: MainActivity -> activity.updateDaysLabel(LabelUpdate.NOT_NEEDED) }
        Espresso.onView(ViewMatchers.withId(R.id.daysLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.days)))
    }

    // </editor-fold>
    // <editor-fold desc="Hours grammatical number tests">
    @Test
    fun labelHourToHours() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateHoursLabel(LabelUpdate.SHOW_SINGULAR) }
        Espresso.onView(ViewMatchers.withId(R.id.hoursLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.hour)))

        scenario.onActivity { activity: MainActivity -> activity.updateHoursLabel(LabelUpdate.SHOW_PLURAL) }
        Espresso.onView(ViewMatchers.withId(R.id.hoursLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.hours)))
    }

    @Test
    fun labelHourNoChange() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateHoursLabel(LabelUpdate.SHOW_SINGULAR) }
        Espresso.onView(ViewMatchers.withId(R.id.hoursLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.hour)))

        scenario.onActivity { activity: MainActivity -> activity.updateHoursLabel(LabelUpdate.NOT_NEEDED) }
        Espresso.onView(ViewMatchers.withId(R.id.hoursLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.hour)))
    }

    @Test
    fun labelHoursToHour() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateHoursLabel(LabelUpdate.SHOW_PLURAL) }
        Espresso.onView(ViewMatchers.withId(R.id.hoursLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.hours)))

        scenario.onActivity { activity: MainActivity -> activity.updateHoursLabel(LabelUpdate.SHOW_SINGULAR) }
        Espresso.onView(ViewMatchers.withId(R.id.hoursLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.hour)))
    }

    @Test
    fun labelHoursNoChange() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateHoursLabel(LabelUpdate.SHOW_PLURAL) }
        Espresso.onView(ViewMatchers.withId(R.id.hoursLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.hours)))

        scenario.onActivity { activity: MainActivity -> activity.updateHoursLabel(LabelUpdate.NOT_NEEDED) }
        Espresso.onView(ViewMatchers.withId(R.id.hoursLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.hours)))
    }

    // </editor-fold>
    // <editor-fold desc="Minutes grammatical number tests">
    @Test
    fun labelMinuteToMinutes() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateMinutesLabel(LabelUpdate.SHOW_SINGULAR) }
        Espresso.onView(ViewMatchers.withId(R.id.minutesLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.minute)))

        scenario.onActivity { activity: MainActivity -> activity.updateMinutesLabel(LabelUpdate.SHOW_PLURAL) }
        Espresso.onView(ViewMatchers.withId(R.id.minutesLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.minutes)))
    }

    @Test
    fun labelMinuteNoChange() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateMinutesLabel(LabelUpdate.SHOW_SINGULAR) }
        Espresso.onView(ViewMatchers.withId(R.id.minutesLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.minute)))

        scenario.onActivity { activity: MainActivity -> activity.updateMinutesLabel(LabelUpdate.NOT_NEEDED) }
        Espresso.onView(ViewMatchers.withId(R.id.minutesLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.minute)))
    }

    @Test
    fun labelMinutesToMinute() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateMinutesLabel(LabelUpdate.SHOW_PLURAL) }
        Espresso.onView(ViewMatchers.withId(R.id.minutesLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.minutes)))

        scenario.onActivity { activity: MainActivity -> activity.updateMinutesLabel(LabelUpdate.SHOW_SINGULAR) }
        Espresso.onView(ViewMatchers.withId(R.id.minutesLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.minute)))
    }

    @Test
    fun labelMinutesNoChange() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateMinutesLabel(LabelUpdate.SHOW_PLURAL) }
        Espresso.onView(ViewMatchers.withId(R.id.minutesLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.minutes)))

        scenario.onActivity { activity: MainActivity -> activity.updateMinutesLabel(LabelUpdate.NOT_NEEDED) }
        Espresso.onView(ViewMatchers.withId(R.id.minutesLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.minutes)))
    }

    // </editor-fold>
    // <editor-fold desc="Seconds grammatical number tests">
    @Test
    fun labelSecondToSeconds() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateSecondsLabel(LabelUpdate.SHOW_SINGULAR) }
        Espresso.onView(ViewMatchers.withId(R.id.secondsLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.second)))

        scenario.onActivity { activity: MainActivity -> activity.updateSecondsLabel(LabelUpdate.SHOW_PLURAL) }
        Espresso.onView(ViewMatchers.withId(R.id.secondsLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.seconds)))
    }

    @Test
    fun labelSecondNoChange() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateSecondsLabel(LabelUpdate.SHOW_SINGULAR) }
        Espresso.onView(ViewMatchers.withId(R.id.secondsLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.second)))

        scenario.onActivity { activity: MainActivity -> activity.updateSecondsLabel(LabelUpdate.NOT_NEEDED) }
        Espresso.onView(ViewMatchers.withId(R.id.secondsLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.second)))
    }

    @Test
    fun labelSecondsToSecond() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateSecondsLabel(LabelUpdate.SHOW_PLURAL) }
        Espresso.onView(ViewMatchers.withId(R.id.secondsLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.seconds)))

        scenario.onActivity { activity: MainActivity -> activity.updateSecondsLabel(LabelUpdate.SHOW_SINGULAR) }
        Espresso.onView(ViewMatchers.withId(R.id.secondsLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.second)))
    }

    @Test
    fun labelSecondsNoChange() {
        val scenario = rule.scenario

        scenario.onActivity { activity: MainActivity -> activity.updateSecondsLabel(LabelUpdate.SHOW_PLURAL) }
        Espresso.onView(ViewMatchers.withId(R.id.secondsLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.seconds)))

        scenario.onActivity { activity: MainActivity -> activity.updateSecondsLabel(LabelUpdate.NOT_NEEDED) }
        Espresso.onView(ViewMatchers.withId(R.id.secondsLabel))
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.seconds)))
    } // </editor-fold>
}