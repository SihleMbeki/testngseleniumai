package com.example.datemodule;

import java.time.LocalDate;

public final class DateUtils {
    private DateUtils() {
    }

    public static String getCurrentDate() {
        return LocalDate.now().toString();
    }
}
