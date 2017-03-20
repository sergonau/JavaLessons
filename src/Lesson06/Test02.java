package Lesson06;

import java.util.Date;

public class Test02 {

    public static void main(String[] args) throws InterruptedException {

        Date todayDate = new Date();
        Thread.sleep(3000);
        Date endDate = new Date();
        long msDelay = endDate.getTime() - todayDate.getTime();

        System.out.println(msDelay);
    }

}
