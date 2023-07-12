package com.epam.conditions;
import java.util.Calendar;
public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year < 0 || month < 0 || month > 12) {
            System.out.println("invalid date");
        }
        Calendar calendar = Calendar.getInstance();
      
        calendar.set(year, month, 1);
        int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println(maxDay);

    }

}
