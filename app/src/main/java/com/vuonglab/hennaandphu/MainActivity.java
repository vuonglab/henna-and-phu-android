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
        public long Years;
        public long Months;
        public long Days;
        public long Hours;
        public long Minutes;
        public long Seconds;
    }

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

            yearsCount.setText("" + marriedDuration.Years);
            yearsCount.setEnabled(marriedDuration.Years > 0);
            yearsLabel.setText(marriedDuration.Years > 1 ? "years" : "year");
            yearsLabel.setEnabled(marriedDuration.Years > 0);

            monthsCount.setText("" + marriedDuration.Months);
            monthsCount.setEnabled(marriedDuration.Months > 0);
            monthsLabel.setText(marriedDuration.Months > 1 ? "months" : "month");
            monthsLabel.setEnabled(marriedDuration.Months > 0);

            daysCount.setText("" + marriedDuration.Days);
            daysCount.setEnabled(marriedDuration.Days > 0);
            daysLabel.setText(marriedDuration.Days > 1 ? "days" : "day");
            daysLabel.setEnabled(marriedDuration.Days > 0);

            hoursCount.setText("" + marriedDuration.Hours);
            hoursCount.setEnabled(marriedDuration.Hours > 0);
            hoursLabel.setText(marriedDuration.Hours > 1 ? "hours" : "hour");
            hoursLabel.setEnabled(marriedDuration.Hours > 0);

            minutesCount.setText("" + marriedDuration.Minutes);
            minutesCount.setEnabled(marriedDuration.Minutes > 0);
            minutesLabel.setText(marriedDuration.Minutes > 1 ? "minutes" : "minute");
            minutesLabel.setEnabled(marriedDuration.Minutes > 0);

            secondsCount.setText("" + marriedDuration.Seconds);
            secondsCount.setEnabled(marriedDuration.Seconds > 0);
            secondsLabel.setText(marriedDuration.Seconds > 1 ? "seconds" : "second");
            secondsLabel.setEnabled(marriedDuration.Seconds > 0);

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