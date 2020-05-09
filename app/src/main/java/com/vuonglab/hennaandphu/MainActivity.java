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

                UIUpdateOptimizations.LabelUpdate yearsLabelUpdate = UIUpdateOptimizations.GetLabelUpdate(marriedDuration.Years, previousMarriedDuration.Years);
                updateYearsLabel(yearsLabelUpdate);

                UIUpdateOptimizations.StateUpdate yearsStateUpdate = UIUpdateOptimizations.GetStateUpdate(marriedDuration.Years, previousMarriedDuration.Years);
                updateYearsState(yearsStateUpdate);
            }

            if (marriedDuration.Months != previousMarriedDuration.Months) {
                monthsCount.setText(String.valueOf(marriedDuration.Months));

                UIUpdateOptimizations.LabelUpdate monthsLabelUpdate = UIUpdateOptimizations.GetLabelUpdate(marriedDuration.Months, previousMarriedDuration.Months);
                if (monthsLabelUpdate == UIUpdateOptimizations.LabelUpdate.SHOW_SINGULAR)
                    monthsLabel.setText(R.string.month);
                else if (monthsLabelUpdate == UIUpdateOptimizations.LabelUpdate.SHOW_PLURAL)
                    monthsLabel.setText(R.string.months);

                UIUpdateOptimizations.StateUpdate monthsStateUpdate = UIUpdateOptimizations.GetStateUpdate(marriedDuration.Months, previousMarriedDuration.Months);
                if (monthsStateUpdate == UIUpdateOptimizations.StateUpdate.SHOW_DISABLED) {
                    monthsCount.setEnabled(false);
                    monthsLabel.setEnabled(false);
                } else if (monthsStateUpdate == UIUpdateOptimizations.StateUpdate.SHOW_ENABLED) {
                    monthsCount.setEnabled(true);
                    monthsLabel.setEnabled(true);
                }
            }

            if (marriedDuration.Days != previousMarriedDuration.Days) {
                daysCount.setText(String.valueOf(marriedDuration.Days));

                UIUpdateOptimizations.LabelUpdate daysLabelUpdate = UIUpdateOptimizations.GetLabelUpdate(marriedDuration.Days, previousMarriedDuration.Days);
                if (daysLabelUpdate == UIUpdateOptimizations.LabelUpdate.SHOW_SINGULAR)
                    daysLabel.setText(R.string.day);
                else if (daysLabelUpdate == UIUpdateOptimizations.LabelUpdate.SHOW_PLURAL)
                    daysLabel.setText(R.string.days);

                UIUpdateOptimizations.StateUpdate daysStateUpdate = UIUpdateOptimizations.GetStateUpdate(marriedDuration.Days, previousMarriedDuration.Days);
                if (daysStateUpdate == UIUpdateOptimizations.StateUpdate.SHOW_DISABLED) {
                    daysCount.setEnabled(false);
                    daysLabel.setEnabled(false);
                } else if (daysStateUpdate == UIUpdateOptimizations.StateUpdate.SHOW_ENABLED) {
                    daysCount.setEnabled(true);
                    daysLabel.setEnabled(true);
                }
            }

            if (marriedDuration.Hours != previousMarriedDuration.Hours) {
                hoursCount.setText(String.valueOf(marriedDuration.Hours));

                UIUpdateOptimizations.LabelUpdate hoursLabelUpdate = UIUpdateOptimizations.GetLabelUpdate(marriedDuration.Hours, previousMarriedDuration.Hours);
                if (hoursLabelUpdate == UIUpdateOptimizations.LabelUpdate.SHOW_SINGULAR)
                    hoursLabel.setText(R.string.hour);
                else if (hoursLabelUpdate == UIUpdateOptimizations.LabelUpdate.SHOW_PLURAL)
                    hoursLabel.setText(R.string.hours);

                UIUpdateOptimizations.StateUpdate hoursStateUpdate = UIUpdateOptimizations.GetStateUpdate(marriedDuration.Hours, previousMarriedDuration.Hours);
                if (hoursStateUpdate == UIUpdateOptimizations.StateUpdate.SHOW_DISABLED) {
                    hoursCount.setEnabled(false);
                    hoursLabel.setEnabled(false);
                } else if (hoursStateUpdate == UIUpdateOptimizations.StateUpdate.SHOW_ENABLED) {
                    hoursCount.setEnabled(true);
                    hoursLabel.setEnabled(true);
                }
            }

            if (marriedDuration.Minutes != previousMarriedDuration.Minutes) {
                minutesCount.setText(String.valueOf(marriedDuration.Minutes));

                UIUpdateOptimizations.LabelUpdate minutesLabelUpdate = UIUpdateOptimizations.GetLabelUpdate(marriedDuration.Minutes, previousMarriedDuration.Minutes);
                if (minutesLabelUpdate == UIUpdateOptimizations.LabelUpdate.SHOW_SINGULAR)
                    minutesLabel.setText(R.string.minute);
                else if (minutesLabelUpdate == UIUpdateOptimizations.LabelUpdate.SHOW_PLURAL)
                    minutesLabel.setText(R.string.minutes);

                UIUpdateOptimizations.StateUpdate minutesStateUpdate = UIUpdateOptimizations.GetStateUpdate(marriedDuration.Minutes, previousMarriedDuration.Minutes);
                if (minutesStateUpdate == UIUpdateOptimizations.StateUpdate.SHOW_DISABLED) {
                    minutesCount.setEnabled(false);
                    minutesLabel.setEnabled(false);
                } else if (minutesStateUpdate == UIUpdateOptimizations.StateUpdate.SHOW_ENABLED) {
                    minutesCount.setEnabled(true);
                    minutesLabel.setEnabled(true);
                }
            }

            if (marriedDuration.Seconds != previousMarriedDuration.Seconds) {
                secondsCount.setText(String.valueOf(marriedDuration.Seconds));

                UIUpdateOptimizations.LabelUpdate secondsLabelUpdate = UIUpdateOptimizations.GetLabelUpdate(marriedDuration.Seconds, previousMarriedDuration.Seconds);
                if (secondsLabelUpdate == UIUpdateOptimizations.LabelUpdate.SHOW_SINGULAR)
                    secondsLabel.setText(R.string.second);
                else if (secondsLabelUpdate == UIUpdateOptimizations.LabelUpdate.SHOW_PLURAL)
                    secondsLabel.setText(R.string.seconds);

                UIUpdateOptimizations.StateUpdate secondsStateUpdate = UIUpdateOptimizations.GetStateUpdate(marriedDuration.Seconds, previousMarriedDuration.Seconds);
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

    void updateYearsLabel(UIUpdateOptimizations.LabelUpdate yearsLabelUpdate) {
        if (yearsLabelUpdate == UIUpdateOptimizations.LabelUpdate.SHOW_SINGULAR)
            yearsLabel.setText(R.string.year);
        else if (yearsLabelUpdate == UIUpdateOptimizations.LabelUpdate.SHOW_PLURAL)
            yearsLabel.setText(R.string.years);
    }

    void updateYearsState(UIUpdateOptimizations.StateUpdate yearsStateUpdate) {
        if (yearsStateUpdate == UIUpdateOptimizations.StateUpdate.SHOW_DISABLED) {
            yearsCount.setEnabled(false);
            yearsLabel.setEnabled(false);
        } else if (yearsStateUpdate == UIUpdateOptimizations.StateUpdate.SHOW_ENABLED) {
            yearsCount.setEnabled(true);
            yearsLabel.setEnabled(true);
        }
    }
}