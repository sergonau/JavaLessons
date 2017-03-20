package Lesson06;


import java.util.Date;

public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        Date today = new Date();
        System.out.println("Today is " + today);
        Thread.sleep(3000);
        long ms = today.getTime();
        System.out.println(ms);
        int hours = today.getHours();
        int mins = today.getMinutes();

    }
}
