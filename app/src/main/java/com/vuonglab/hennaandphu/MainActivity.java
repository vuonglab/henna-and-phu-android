package com.vuonglab.hennaandphu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView duration = findViewById(R.id.marriedDuration);

        String marriedDuration = getMarriedDuration();

        duration.setText(marriedDuration);
    }

    private String getMarriedDuration() {
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

        String marriedDuration = years + " years " +
            months + " months " +
            days + " days " +
            hours + " hours " +
            minutes + " minutes " +
            seconds + " seconds";

        return marriedDuration;
    }
}