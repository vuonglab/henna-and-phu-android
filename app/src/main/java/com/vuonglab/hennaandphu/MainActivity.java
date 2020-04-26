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

    private Duration previousMarriedDuration = new Duration();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
        super.onStop();
        timer.cancel();

        Log.d(TAG, "Canceled timer.");
    }

    @Override
    protected void onRestart() {
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
            Duration marriedDuration = DurationCalculator.getMarriedDuration(ZonedDateTime.now());

            if (marriedDuration.Years != previousMarriedDuration.Years) {
                yearsCount.setText(String.valueOf(marriedDuration.Years));

                long expectedYears = previousMarriedDuration.Years + 1;
                boolean updateSkipped = (expectedYears != marriedDuration.Years || previousMarriedDuration.Years < 0);

                if (marriedDuration.Years == 0 || marriedDuration.Years == 1)
                    yearsLabel.setText(R.string.year);
                else if (marriedDuration.Years == 2 || updateSkipped)
                    yearsLabel.setText(R.string.years);

                if (marriedDuration.Years == 0) {
                    yearsCount.setEnabled(false);
                    yearsLabel.setEnabled(false);
                } else if (marriedDuration.Years == 1 || updateSkipped) {
                    yearsCount.setEnabled(true);
                    yearsLabel.setEnabled(true);
                }

                Log.d(TAG, "Years updated" + (updateSkipped ? "!" : ""));
            }

            if (marriedDuration.Months != previousMarriedDuration.Months) {
                monthsCount.setText(String.valueOf(marriedDuration.Months));

                long expectedMonths = (previousMarriedDuration.Months == 11 ? 0 : previousMarriedDuration.Months+1);
                boolean updateSkipped = (expectedMonths != marriedDuration.Months || previousMarriedDuration.Months < 0);

                if (marriedDuration.Months == 0 || marriedDuration.Months == 1)
                    monthsLabel.setText(R.string.month);
                else if (marriedDuration.Months == 2 || updateSkipped)
                    monthsLabel.setText(R.string.months);

                if (marriedDuration.Months == 0) {
                    monthsCount.setEnabled(false);
                    monthsLabel.setEnabled(false);
                } else if (marriedDuration.Months == 1 || updateSkipped) {
                    monthsCount.setEnabled(true);
                    monthsLabel.setEnabled(true);
                }

                Log.d(TAG, "Months updated" + (updateSkipped ? "!" : ""));
            }

            if (marriedDuration.Days != previousMarriedDuration.Days) {
                daysCount.setText(String.valueOf(marriedDuration.Days));

                boolean updateSkipped = true;
                if (previousMarriedDuration.Days <= 26) {
                    long expectedDays = previousMarriedDuration.Days + 1;
                    updateSkipped = (expectedDays != marriedDuration.Days || previousMarriedDuration.Days < 0);
                }

                if (marriedDuration.Days == 0 || marriedDuration.Days == 1)
                    daysLabel.setText(R.string.day);
                else if (marriedDuration.Days == 2 || updateSkipped)
                    daysLabel.setText(R.string.days);

                if (marriedDuration.Days == 0) {
                    daysCount.setEnabled(false);
                    daysLabel.setEnabled(false);
                } else if (marriedDuration.Days == 1 || updateSkipped) {
                    daysCount.setEnabled(true);
                    daysLabel.setEnabled(true);
                }

                Log.d(TAG, "Days updated" + (updateSkipped ? "!" : ""));
            }

            if (marriedDuration.Hours != previousMarriedDuration.Hours) {
                hoursCount.setText(String.valueOf(marriedDuration.Hours));

                long expectedHours = (previousMarriedDuration.Hours == 23 ? 0 : previousMarriedDuration.Hours+1);
                boolean updateSkipped = (expectedHours != marriedDuration.Hours || previousMarriedDuration.Hours < 0);

                if (marriedDuration.Hours == 0 || marriedDuration.Hours == 1)
                    hoursLabel.setText(R.string.hour);
                else if (marriedDuration.Hours == 2 || updateSkipped)
                    hoursLabel.setText(R.string.hours);

                if (marriedDuration.Hours == 0) {
                    hoursCount.setEnabled(false);
                    hoursLabel.setEnabled(false);
                } else if (marriedDuration.Hours == 1 || updateSkipped) {
                    hoursCount.setEnabled(true);
                    hoursLabel.setEnabled(true);
                }

                Log.d(TAG, "Hours updated" + (updateSkipped ? "!" : ""));
            }

            if (marriedDuration.Minutes != previousMarriedDuration.Minutes) {
                minutesCount.setText(String.valueOf(marriedDuration.Minutes));

                long expectedMinutes = (previousMarriedDuration.Minutes == 59 ? 0 : previousMarriedDuration.Minutes+1);
                boolean updateSkipped = (expectedMinutes != marriedDuration.Minutes || previousMarriedDuration.Minutes < 0);

                if (marriedDuration.Minutes == 0 || marriedDuration.Minutes == 1)
                    minutesLabel.setText(R.string.minute);
                else if (marriedDuration.Minutes == 2 || updateSkipped)
                    minutesLabel.setText(R.string.minutes);

                if (marriedDuration.Minutes == 0) {
                    minutesCount.setEnabled(false);
                    minutesLabel.setEnabled(false);
                } else if (marriedDuration.Minutes == 1 || updateSkipped) {
                    minutesCount.setEnabled(true);
                    minutesLabel.setEnabled(true);
                }

                Log.d(TAG, "Minutes updated" + (updateSkipped ? "!" : ""));
            }

            if (marriedDuration.Seconds != previousMarriedDuration.Seconds) {
                secondsCount.setText(String.valueOf(marriedDuration.Seconds));

                UIUpdateOptimizations.LabelUpdate secondsLabelUpdate = UIUpdateOptimizations.GetSecondsLabelUpdate(marriedDuration.Seconds, previousMarriedDuration.Seconds);
                if (secondsLabelUpdate == UIUpdateOptimizations.LabelUpdate.SHOW_SINGULAR)
                    secondsLabel.setText(R.string.second);
                else if (secondsLabelUpdate == UIUpdateOptimizations.LabelUpdate.SHOW_PLURAL)
                    secondsLabel.setText(R.string.seconds);

                UIUpdateOptimizations.StateUpdate secondsStateUpdate = UIUpdateOptimizations.GetSecondsStateUpdate(marriedDuration.Seconds, previousMarriedDuration.Seconds);
                if (secondsStateUpdate == UIUpdateOptimizations.StateUpdate.SHOW_DISABLED) {
                    secondsCount.setEnabled(false);
                    secondsLabel.setEnabled(false);
                } else if (secondsStateUpdate == UIUpdateOptimizations.StateUpdate.SHOW_ENABLED) {
                    secondsCount.setEnabled(true);
                    secondsLabel.setEnabled(true);
                }
            }

            previousMarriedDuration = marriedDuration;
        }
    };
}