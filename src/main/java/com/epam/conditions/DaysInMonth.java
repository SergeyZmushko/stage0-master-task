package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year > 0 && month >= 1 && month <= 12){
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                System.out.print("31\n");
            else if ((month == 2) && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
                System.out.print("29\n");
            } else if (month == 2) {
                System.out.print("28\n");
            } else
                System.out.println("30\n");
        }else {
            System.out.println("invalid date\n");
        }
    }
}
