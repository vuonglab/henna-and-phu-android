package com.vuonglab.hennaandphu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private Timer timer;

    private Handler handler = new Handler();

    private TextView yearsCount, monthsCount, daysCount;
    private TextView hoursCount, minutesCount, secondsCount;

    private TextView yearsLabel, monthsLabel, daysLabel;
    private TextView hoursLabel, minutesLabel, secondsLabel;

    private class Duration {
        public long Years = -1;
        public long Months = -1;
        public long Days = -1;
        public long Hours = -1;
        public long Minutes = -1;
        public long Seconds = -1;
    }

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

    final Runnable runnable = new Runnable() {
        public void run() {
            Duration marriedDuration = getMarriedDuration();

            if (marriedDuration.Years != previousMarriedDuration.Years) {
                yearsCount.setText("" + marriedDuration.Years);
                yearsLabel.setText(marriedDuration.Years > 1 ? "years" : "year");

                if (marriedDuration.Years == 0) {
                    yearsCount.setEnabled(false);
                    yearsLabel.setEnabled(false);
                } else if (marriedDuration.Years == 1) {
                    yearsCount.setEnabled(true);
                    yearsLabel.setEnabled(true);
                }

                Log.d(TAG, "Years updated");
            }

            if (marriedDuration.Months != previousMarriedDuration.Months) {
                monthsCount.setText("" + marriedDuration.Months);
                monthsLabel.setText(marriedDuration.Months > 1 ? "months" : "month");

                if (marriedDuration.Months == 0) {
                    monthsCount.setEnabled(false);
                    monthsLabel.setEnabled(false);
                } else if (marriedDuration.Months == 1) {
                    monthsCount.setEnabled(true);
                    monthsLabel.setEnabled(true);
                }

                Log.d(TAG, "Months updated");
            }

            if (marriedDuration.Days != previousMarriedDuration.Days) {
                daysCount.setText("" + marriedDuration.Days);
                daysLabel.setText(marriedDuration.Days > 1 ? "days" : "day");

                if (marriedDuration.Days == 0) {
                    daysCount.setEnabled(false);
                    daysLabel.setEnabled(false);
                } else if (marriedDuration.Days == 1) {
                    daysCount.setEnabled(true);
                    daysLabel.setEnabled(true);
                }

                Log.d(TAG, "Days updated");
            }

            if (marriedDuration.Hours != previousMarriedDuration.Hours) {
                hoursCount.setText("" + marriedDuration.Hours);
                hoursLabel.setText(marriedDuration.Hours > 1 ? "hours" : "hour");

                if (marriedDuration.Hours == 0) {
                    hoursCount.setEnabled(false);
                    hoursLabel.setEnabled(false);
                } else if (marriedDuration.Hours == 1) {
                    hoursCount.setEnabled(true);
                    hoursLabel.setEnabled(true);
                }

                Log.d(TAG, "Hours updated");
            }

            if (marriedDuration.Minutes != previousMarriedDuration.Minutes) {
                minutesCount.setText("" + marriedDuration.Minutes);
                minutesLabel.setText(marriedDuration.Minutes > 1 ? "minutes" : "minute");

                if (marriedDuration.Minutes == 0) {
                    minutesCount.setEnabled(false);
                    minutesLabel.setEnabled(false);
                } else if (marriedDuration.Minutes == 1) {
                    minutesCount.setEnabled(true);
                    minutesLabel.setEnabled(true);
                }

                Log.d(TAG, "Minutes updated");
            }

            if (marriedDuration.Seconds != previousMarriedDuration.Seconds) {
                secondsCount.setText("" + marriedDuration.Seconds);
                secondsLabel.setText(marriedDuration.Seconds > 1 ? "seconds" : "second");

                if (marriedDuration.Seconds == 0) {
                    secondsCount.setEnabled(false);
                    secondsLabel.setEnabled(false);
                } else if (marriedDuration.Seconds == 1) {
                    secondsCount.setEnabled(true);
                    secondsLabel.setEnabled(true);
                }

                Log.d(TAG, "Seconds updated");
            }

            previousMarriedDuration = marriedDuration;

            Log.d(TAG, "Timer running...");
        }
    };

    private Duration getMarriedDuration() {
        // Credit: https://stackoverflow.com/questions/25747499/java-8-calculate-difference-between-two-localdatetime
        LocalDateTime weddingDateTime = LocalDateTime.of(2015, Month.MARCH, 14, 9, 26, 53);
        LocalDateTime now = LocalDateTime.now();

        LocalDateTime tempDateTime = LocalDateTime.from( weddingDateTime );

        long years = tempDateTime.until( now, ChronoUnit.YEARS );
        tempDateTime = tempDateTime.plusYears( years );

        long months = tempDateTime.until( now, ChronoUnit.MONTHS );
        tempDateTime = tempDateTime.plusMonths( months );

        long days = tempDateTime.until( now, ChronoUnit.DAYS );
        tempDateTime = tempDateTime.plusDays( days );

        long hours = tempDateTime.until( now, ChronoUnit.HOURS );
        tempDateTime = tempDateTime.plusHours( hours );

        long minutes = tempDateTime.until( now, ChronoUnit.MINUTES );
        tempDateTime = tempDateTime.plusMinutes( minutes );

        long seconds = tempDateTime.until( now, ChronoUnit.SECONDS );

        Duration marriedDuration = new Duration();
        marriedDuration.Years = years;
        marriedDuration.Months = months;
        marriedDuration.Days = days;
        marriedDuration.Hours = hours;
        marriedDuration.Minutes = minutes;
        marriedDuration.Seconds = seconds;

        return marriedDuration;
    }
}