package com.vuonglab.hennaandphu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;

import java.time.ZonedDateTime;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private Timer timer;

    private final Handler handler = new Handler();

    private TextView yearsCount, monthsCount, daysCount;
    private TextView hoursCount, minutesCount, secondsCount;

    private TextView yearsLabel, monthsLabel, daysLabel;
    private TextView hoursLabel, minutesLabel, secondsLabel;

    private Duration previousMarriedDuration = new Duration(-1, -1, -1,
            -1, -1, -1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yearsCount = findViewById(R.id.yearsCount);
        monthsCount = findViewById(R.id.monthsCount);
        daysCount = findViewById(R.id.daysCount);

        hoursCount = findViewById(R.id.hoursCount);
        minutesCount = findViewById(R.id.minutesCount);
        secondsCount = findViewById(R.id.secondsCount);

        yearsLabel = findViewById(R.id.yearsLabel);
        monthsLabel = findViewById(R.id.monthsLabel);
        daysLabel = findViewById(R.id.daysLabel);

        hoursLabel = findViewById(R.id.hoursLabel);
        minutesLabel = findViewById(R.id.minutesLabel);
        secondsLabel = findViewById(R.id.secondsLabel);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() { handler.postDelayed(runnable, 0); }
        }, 0, 1000);

        Log.d(TAG, "Created timer.");
    }

    @Override
    protected void onStop() {
        // override fun onStop() {
        super.onStop();
        timer.cancel();

        Log.d(TAG, "Canceled timer.");
    }

    @Override
    protected void onRestart() {
        // override fun onResume() {
        super.onRestart();

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() { handler.postDelayed(runnable, 0); }
        }, 0, 1000);

        Log.d(TAG, "Restarted timer.");
    }

    private final Runnable runnable = new Runnable() {
        public void run() {
            Duration marriedDuration = DurationCalculatorKt.getMarriedDuration(ZonedDateTime.now());

            if (marriedDuration.getYears() != previousMarriedDuration.getYears()) {
                yearsCount.setText(String.valueOf(marriedDuration.getYears()));

                LabelUpdate yearsLabelUpdate = UIUpdateOptimizationsKt.getLabelUpdate(marriedDuration.getYears(), previousMarriedDuration.getYears());
                updateYearsLabel(yearsLabelUpdate);

                StateUpdate yearsStateUpdate = UIUpdateOptimizationsKt.getStateUpdate(marriedDuration.getYears(), previousMarriedDuration.getYears());
                updateYearsState(yearsStateUpdate);
            }

            if (marriedDuration.getMonths() != previousMarriedDuration.getMonths()) {
                monthsCount.setText(String.valueOf(marriedDuration.getMonths()));

                LabelUpdate monthsLabelUpdate = UIUpdateOptimizationsKt.getLabelUpdate(marriedDuration.getMonths(), previousMarriedDuration.getMonths());
                updateMonthsLabel(monthsLabelUpdate);

                StateUpdate monthsStateUpdate = UIUpdateOptimizationsKt.getStateUpdate(marriedDuration.getMonths(), previousMarriedDuration.getMonths());
                updateMonthsState(monthsStateUpdate);
            }

            if (marriedDuration.getDays() != previousMarriedDuration.getDays()) {
                daysCount.setText(String.valueOf(marriedDuration.getDays()));

                LabelUpdate daysLabelUpdate = UIUpdateOptimizationsKt.getLabelUpdate(marriedDuration.getDays(), previousMarriedDuration.getDays());
                updateDaysLabel(daysLabelUpdate);

                StateUpdate daysStateUpdate = UIUpdateOptimizationsKt.getStateUpdate(marriedDuration.getDays(), previousMarriedDuration.getDays());
                updateDaysState(daysStateUpdate);
            }

            if (marriedDuration.getHours() != previousMarriedDuration.getHours()) {
                hoursCount.setText(String.valueOf(marriedDuration.getHours()));

                LabelUpdate hoursLabelUpdate = UIUpdateOptimizationsKt.getLabelUpdate(marriedDuration.getHours(), previousMarriedDuration.getHours());
                updateHoursLabel(hoursLabelUpdate);

                StateUpdate hoursStateUpdate = UIUpdateOptimizationsKt.getStateUpdate(marriedDuration.getHours(), previousMarriedDuration.getHours());
                updateHoursState(hoursStateUpdate);
            }

            if (marriedDuration.getMinutes() != previousMarriedDuration.getMinutes()) {
                minutesCount.setText(String.valueOf(marriedDuration.getMinutes()));

                LabelUpdate minutesLabelUpdate = UIUpdateOptimizationsKt.getLabelUpdate(marriedDuration.getMinutes(), previousMarriedDuration.getMinutes());
                updateMinutesLabel(minutesLabelUpdate);

                StateUpdate minutesStateUpdate = UIUpdateOptimizationsKt.getStateUpdate(marriedDuration.getMinutes(), previousMarriedDuration.getMinutes());
                updateMinutesState(minutesStateUpdate);
            }

            if (marriedDuration.getSeconds() != previousMarriedDuration.getSeconds()) {
                secondsCount.setText(String.valueOf(marriedDuration.getSeconds()));

                LabelUpdate secondsLabelUpdate = UIUpdateOptimizationsKt.getLabelUpdate(marriedDuration.getSeconds(), previousMarriedDuration.getSeconds());
                updateSecondsLabel(secondsLabelUpdate);

                StateUpdate secondsStateUpdate = UIUpdateOptimizationsKt.getStateUpdate(marriedDuration.getSeconds(), previousMarriedDuration.getSeconds());
                updateSecondsState(secondsStateUpdate);
            }

            previousMarriedDuration = marriedDuration;
        }
    };

    void updateYearsLabel(LabelUpdate yearsLabelUpdate) {
        if (yearsLabelUpdate == LabelUpdate.SHOW_SINGULAR)
            yearsLabel.setText(R.string.year);
        else if (yearsLabelUpdate == LabelUpdate.SHOW_PLURAL)
            yearsLabel.setText(R.string.years);
    }

    void updateYearsState(StateUpdate yearsStateUpdate) {
        if (yearsStateUpdate == StateUpdate.SHOW_DISABLED) {
            yearsCount.setEnabled(false);
            yearsLabel.setEnabled(false);
        } else if (yearsStateUpdate == StateUpdate.SHOW_ENABLED) {
            yearsCount.setEnabled(true);
            yearsLabel.setEnabled(true);
        }
    }

    void updateMonthsLabel(LabelUpdate monthsLabelUpdate) {
        if (monthsLabelUpdate == LabelUpdate.SHOW_SINGULAR)
            monthsLabel.setText(R.string.month);
        else if (monthsLabelUpdate == LabelUpdate.SHOW_PLURAL)
            monthsLabel.setText(R.string.months);
    }

    void updateMonthsState(StateUpdate monthsStateUpdate) {
        if (monthsStateUpdate == StateUpdate.SHOW_DISABLED) {
            monthsCount.setEnabled(false);
            monthsLabel.setEnabled(false);
        } else if (monthsStateUpdate == StateUpdate.SHOW_ENABLED) {
            monthsCount.setEnabled(true);
            monthsLabel.setEnabled(true);
        }
    }

    void updateDaysLabel(LabelUpdate daysLabelUpdate) {
        if (daysLabelUpdate == LabelUpdate.SHOW_SINGULAR)
            daysLabel.setText(R.string.day);
        else if (daysLabelUpdate == LabelUpdate.SHOW_PLURAL)
            daysLabel.setText(R.string.days);
    }

    void updateDaysState(StateUpdate daysStateUpdate) {
        if (daysStateUpdate == StateUpdate.SHOW_DISABLED) {
            daysCount.setEnabled(false);
            daysLabel.setEnabled(false);
        } else if (daysStateUpdate == StateUpdate.SHOW_ENABLED) {
            daysCount.setEnabled(true);
            daysLabel.setEnabled(true);
        }
    }

    void updateHoursLabel(LabelUpdate hoursLabelUpdate) {
        if (hoursLabelUpdate == LabelUpdate.SHOW_SINGULAR)
            hoursLabel.setText(R.string.hour);
        else if (hoursLabelUpdate == LabelUpdate.SHOW_PLURAL)
            hoursLabel.setText(R.string.hours);
    }

    void updateHoursState(StateUpdate hoursStateUpdate) {
        if (hoursStateUpdate == StateUpdate.SHOW_DISABLED) {
            hoursCount.setEnabled(false);
            hoursLabel.setEnabled(false);
        } else if (hoursStateUpdate == StateUpdate.SHOW_ENABLED) {
            hoursCount.setEnabled(true);
            hoursLabel.setEnabled(true);
        }
    }

    void updateMinutesLabel(LabelUpdate minutesLabelUpdate) {
        if (minutesLabelUpdate == LabelUpdate.SHOW_SINGULAR)
            minutesLabel.setText(R.string.minute);
        else if (minutesLabelUpdate == LabelUpdate.SHOW_PLURAL)
            minutesLabel.setText(R.string.minutes);
    }

    void updateMinutesState(StateUpdate minutesStateUpdate) {
        if (minutesStateUpdate == StateUpdate.SHOW_DISABLED) {
            minutesCount.setEnabled(false);
            minutesLabel.setEnabled(false);
        } else if (minutesStateUpdate == StateUpdate.SHOW_ENABLED) {
            minutesCount.setEnabled(true);
            minutesLabel.setEnabled(true);
        }
    }

    void updateSecondsLabel(LabelUpdate secondsLabelUpdate) {
        if (secondsLabelUpdate == LabelUpdate.SHOW_SINGULAR)
            secondsLabel.setText(R.string.second);
        else if (secondsLabelUpdate == LabelUpdate.SHOW_PLURAL)
            secondsLabel.setText(R.string.seconds);
    }

    void updateSecondsState(StateUpdate secondsStateUpdate) {
        if (secondsStateUpdate == StateUpdate.SHOW_DISABLED) {
            secondsCount.setEnabled(false);
            secondsLabel.setEnabled(false);
        } else if (secondsStateUpdate == StateUpdate.SHOW_ENABLED) {
            secondsCount.setEnabled(true);
            secondsLabel.setEnabled(true);
        }
    }
}