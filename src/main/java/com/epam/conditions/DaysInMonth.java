package com.epam.conditions;
import java.time.LocalDate;
public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year < 0 || month < 0 || month > 12) {
            System.out.println("invalid date");
        }
        int number = 0;
        LocalDate localDate = LocalDate.of(year, month, 1);
        boolean leapYear = localDate.isLeapYear();

        switch (month){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                number = 31 ;
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                number = 30;
                break;
            case 2 : number = leapYear ? 29 : 28 ;
        }
                System.out.println(number);
    }
}
