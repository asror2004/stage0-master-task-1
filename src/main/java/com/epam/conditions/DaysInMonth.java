package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year < 0 || month < 0) {
            System.out.println("invalid date");
        }

        LocalDate localDate = LocalDate.of(year, month, 1);
        System.out.println("Leap year");

        System.out.println("localDate.getDayOfMonth() = " + localDate.getDayOfMonth());
    }

}
