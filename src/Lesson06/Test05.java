package Lesson06;

import java.util.Date;

public class Test05 {

    public static void main(String[] args) {

        Date yearStartDate = new Date();

        yearStartDate.setHours(0);
        yearStartDate.setMonth(0);
        yearStartDate.setDate(1);
        yearStartDate.setSeconds(0);
        yearStartDate.setMinutes(0);

        System.out.println(yearStartDate);

        Date currentDate = new Date();
        long currentTimeMs = currentDate.getTime();
        long yearStartDateMs = yearStartDate.getTime();
        long difference = currentTimeMs-yearStartDateMs;
        long ms = 60*60*24*1000;
        System.out.println(difference/ms);

    }

}