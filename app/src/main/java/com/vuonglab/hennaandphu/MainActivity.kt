package com.vuonglab.hennaandphu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.vuonglab.hennaandphu.databinding.ActivityMainBinding
import java.time.ZonedDateTime

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var handler: Handler

    private var previousMarriedDuration = Duration(
        -1, -1, -1,
        -1, -1, -1
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        handler = Handler(Looper.getMainLooper())
    }

    override fun onPause() {
        super.onPause()
        handler.removeCallbacks(updateDurationTask)
    }

    override fun onResume() {
        super.onResume()
        handler.post(updateDurationTask)
    }

    private val updateDurationTask = object : Runnable {
        override fun run() {
            handler.postDelayed(this, 1000)

            val marriedDuration = getMarriedDuration(ZonedDateTime.now())

            binding.apply {
                if (marriedDuration.Years != previousMarriedDuration.Years) {
                    yearsCount.text = marriedDuration.Years.toString()
                    val yearsLabelUpdate =
                        getLabelUpdate(marriedDuration.Years, previousMarriedDuration.Years)
                    updateYearsLabel(yearsLabelUpdate)
                    val yearsStateUpdate =
                        getStateUpdate(marriedDuration.Years, previousMarriedDuration.Years)
                    updateYearsState(yearsStateUpdate)
                }
                if (marriedDuration.Months != previousMarriedDuration.Months) {
                    monthsCount.text = marriedDuration.Months.toString()
                    val monthsLabelUpdate =
                        getLabelUpdate(marriedDuration.Months, previousMarriedDuration.Months)
                    updateMonthsLabel(monthsLabelUpdate)
                    val monthsStateUpdate =
                        getStateUpdate(marriedDuration.Months, previousMarriedDuration.Months)
                    updateMonthsState(monthsStateUpdate)
                }
                if (marriedDuration.Days != previousMarriedDuration.Days) {
                    daysCount.text = marriedDuration.Days.toString()
                    val daysLabelUpdate =
                        getLabelUpdate(marriedDuration.Days, previousMarriedDuration.Days)
                    updateDaysLabel(daysLabelUpdate)
                    val daysStateUpdate =
                        getStateUpdate(marriedDuration.Days, previousMarriedDuration.Days)
                    updateDaysState(daysStateUpdate)
                }
                if (marriedDuration.Hours != previousMarriedDuration.Hours) {
                    hoursCount.text = marriedDuration.Hours.toString()
                    val hoursLabelUpdate =
                        getLabelUpdate(marriedDuration.Hours, previousMarriedDuration.Hours)
                    updateHoursLabel(hoursLabelUpdate)
                    val hoursStateUpdate =
                        getStateUpdate(marriedDuration.Hours, previousMarriedDuration.Hours)
                    updateHoursState(hoursStateUpdate)
                }
                if (marriedDuration.Minutes != previousMarriedDuration.Minutes) {
                    minutesCount.text = marriedDuration.Minutes.toString()
                    val minutesLabelUpdate =
                        getLabelUpdate(marriedDuration.Minutes, previousMarriedDuration.Minutes)
                    updateMinutesLabel(minutesLabelUpdate)
                    val minutesStateUpdate =
                        getStateUpdate(marriedDuration.Minutes, previousMarriedDuration.Minutes)
                    updateMinutesState(minutesStateUpdate)
                }
                if (marriedDuration.Seconds != previousMarriedDuration.Seconds) {
                    secondsCount.text = marriedDuration.Seconds.toString()
                    val secondsLabelUpdate =
                        getLabelUpdate(marriedDuration.Seconds, previousMarriedDuration.Seconds)
                    updateSecondsLabel(secondsLabelUpdate)
                    val secondsStateUpdate =
                        getStateUpdate(marriedDuration.Seconds, previousMarriedDuration.Seconds)
                    updateSecondsState(secondsStateUpdate)
                }
            }

            previousMarriedDuration = marriedDuration
        }
    }

    fun updateYearsLabel(yearsLabelUpdate: LabelUpdate) {
        binding.apply {
            if (yearsLabelUpdate === LabelUpdate.SHOW_SINGULAR)
                yearsLabel.setText(R.string.year)
            else if (yearsLabelUpdate === LabelUpdate.SHOW_PLURAL)
                yearsLabel.setText(R.string.years)
        }
    }

    fun updateYearsState(yearsStateUpdate: StateUpdate) {
        binding.apply {
            if (yearsStateUpdate === StateUpdate.SHOW_DISABLED) {
                yearsCount.isEnabled = false
                yearsLabel.isEnabled = false
            } else if (yearsStateUpdate === StateUpdate.SHOW_ENABLED) {
                yearsCount.isEnabled = true
                yearsLabel.isEnabled = true
            }
        }
    }

    fun updateMonthsLabel(monthsLabelUpdate: LabelUpdate) {
        binding.apply {
            if (monthsLabelUpdate === LabelUpdate.SHOW_SINGULAR)
                monthsLabel.setText(R.string.month)
            else if (monthsLabelUpdate === LabelUpdate.SHOW_PLURAL)
                monthsLabel.setText(R.string.months)
        }
    }

    fun updateMonthsState(monthsStateUpdate: StateUpdate) {
        binding.apply {
            if (monthsStateUpdate === StateUpdate.SHOW_DISABLED) {
                monthsCount.isEnabled = false
                monthsLabel.isEnabled = false
            } else if (monthsStateUpdate === StateUpdate.SHOW_ENABLED) {
                monthsCount.isEnabled = true
                monthsLabel.isEnabled = true
            }
        }
    }

    fun updateDaysLabel(daysLabelUpdate: LabelUpdate) {
        binding.apply {
            if (daysLabelUpdate === LabelUpdate.SHOW_SINGULAR)
                daysLabel.setText(R.string.day)
            else if (daysLabelUpdate === LabelUpdate.SHOW_PLURAL)
                daysLabel.setText(R.string.days)
        }
    }

    fun updateDaysState(daysStateUpdate: StateUpdate) {
        binding.apply {
            if (daysStateUpdate === StateUpdate.SHOW_DISABLED) {
                daysCount.isEnabled = false
                daysLabel.isEnabled = false
            } else if (daysStateUpdate === StateUpdate.SHOW_ENABLED) {
                daysCount.isEnabled = true
                daysLabel.isEnabled = true
            }
        }
    }

    fun updateHoursLabel(hoursLabelUpdate: LabelUpdate) {
        binding.apply {
            if (hoursLabelUpdate === LabelUpdate.SHOW_SINGULAR)
                hoursLabel.setText(R.string.hour)
            else if (hoursLabelUpdate === LabelUpdate.SHOW_PLURAL)
                hoursLabel.setText(R.string.hours)
        }
    }

    fun updateHoursState(hoursStateUpdate: StateUpdate) {
        binding.apply {
            if (hoursStateUpdate === StateUpdate.SHOW_DISABLED) {
                hoursCount.isEnabled = false
                hoursLabel.isEnabled = false
            } else if (hoursStateUpdate === StateUpdate.SHOW_ENABLED) {
                hoursCount.isEnabled = true
                hoursLabel.isEnabled = true
            }
        }
    }

    fun updateMinutesLabel(minutesLabelUpdate: LabelUpdate) {
        binding.apply {
            if (minutesLabelUpdate === LabelUpdate.SHOW_SINGULAR)
                minutesLabel.setText(R.string.minute)
            else if (minutesLabelUpdate === LabelUpdate.SHOW_PLURAL)
                minutesLabel.setText(R.string.minutes)
        }
    }

    fun updateMinutesState(minutesStateUpdate: StateUpdate) {
        binding.apply {
            if (minutesStateUpdate === StateUpdate.SHOW_DISABLED) {
                minutesCount.isEnabled = false
                minutesLabel.isEnabled = false
            } else if (minutesStateUpdate === StateUpdate.SHOW_ENABLED) {
                minutesCount.isEnabled = true
                minutesLabel.isEnabled = true
            }
        }
    }

    fun updateSecondsLabel(secondsLabelUpdate: LabelUpdate) {
        binding.apply {
            if (secondsLabelUpdate === LabelUpdate.SHOW_SINGULAR)
                secondsLabel.setText(R.string.second)
            else if (secondsLabelUpdate === LabelUpdate.SHOW_PLURAL)
                secondsLabel.setText(R.string.seconds)
        }
    }

    fun updateSecondsState(secondsStateUpdate: StateUpdate) {
        binding.apply {
            if (secondsStateUpdate === StateUpdate.SHOW_DISABLED) {
                secondsCount.isEnabled = false
                secondsLabel.isEnabled = false
            } else if (secondsStateUpdate === StateUpdate.SHOW_ENABLED) {
                secondsCount.isEnabled = true
                secondsLabel.isEnabled = true
            }
        }
    }
}