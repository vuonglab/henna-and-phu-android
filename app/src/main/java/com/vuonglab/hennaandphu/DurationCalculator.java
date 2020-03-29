package com.vuonglab.hennaandphu;

import android.util.Log;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

class DurationCalculator {
    private static final String TAG = "DurationCalculator";

    static Duration getMarriedDuration(ZonedDateTime nowWithTimeZone) {
        // Credit: https://stackoverflow.com/questions/25747499/java-8-calculate-difference-between-two-localdatetime
        ZonedDateTime weddingDateTimeInPhoenixWithTimeZone = ZonedDateTime.of(2015, 3, 14, 9, 26, 53, 0, ZoneId.of("America/Phoenix"));
        LocalDateTime weddingDateTimeInPhoenix = weddingDateTimeInPhoenixWithTimeZone.toLocalDateTime();

        ZonedDateTime nowInPhoenixWithTimeZone = nowWithTimeZone.withZoneSameInstant(ZoneId.of("America/Phoenix"));
        LocalDateTime nowInPhoenix = nowInPhoenixWithTimeZone.toLocalDateTime();

        /*
        Log.d(TAG, "   Wedding date-time in Phoenix (with timezone): " + weddingDateTimeInPhoenixWithTimeZone.toString());
        Log.d(TAG, "Wedding date-time in Phoenix (without timezone): " + weddingDateTimeInPhoenix.toString());

        Log.d(TAG, "       Current date-time, local (with timezone): " + nowWithTimeZone.toString());

        Log.d(TAG, "   Current date-time in Phoenix (with timezone): " + nowInPhoenixWithTimeZone.toString());
        Log.d(TAG, "Current date-time in Phoenix (without timezone): " + nowInPhoenix.toString());
        */

        LocalDateTime tempDateTime = LocalDateTime.from( weddingDateTimeInPhoenix );

        long years = tempDateTime.until( nowInPhoenix, ChronoUnit.YEARS );
        tempDateTime = tempDateTime.plusYears( years );

        long months = tempDateTime.until( nowInPhoenix, ChronoUnit.MONTHS );
        tempDateTime = tempDateTime.plusMonths( months );

        long days = tempDateTime.until( nowInPhoenix, ChronoUnit.DAYS );
        tempDateTime = tempDateTime.plusDays( days );

        long hours = tempDateTime.until( nowInPhoenix, ChronoUnit.HOURS );
        tempDateTime = tempDateTime.plusHours( hours );

        long minutes = tempDateTime.until( nowInPhoenix, ChronoUnit.MINUTES );
        tempDateTime = tempDateTime.plusMinutes( minutes );

        long seconds = tempDateTime.until( nowInPhoenix, ChronoUnit.SECONDS );

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
