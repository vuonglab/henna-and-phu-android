package com.vuonglab.hennaandphu;

class Duration {
    long Years = -1;
    long Months = -1;
    long Days = -1;
    long Hours = -1;
    long Minutes = -1;
    long Seconds = -1;

    Duration() {}

    Duration(long years, long months, long days, long hours, long minutes, long seconds)
    {
        Years = years;
        Months = months;
        Days = days;
        Hours = hours;
        Minutes = minutes;
        Seconds = seconds;
    }
}