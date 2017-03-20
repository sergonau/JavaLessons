package Lesson024.Test001;

import java.util.Date;

public class Clock extends Thread {

    String cityName;
    int hours;
    int minutes;
    int seconds;

    public Clock(String cityName, int hours, int minutes, int seconds) {
        this.cityName = cityName;
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        start();
    }

    void printTime() throws InterruptedException {
        sleep(1000);
        seconds++;

        if (seconds == 60) {
            seconds = 0;
            minutes++;
        }

        if (minutes == 60) {
            minutes = 0;
            hours++;
        }

        if (hours == 24) {
            hours = 0;
        }

        if (hours == 0 && minutes == 0 && seconds == 0) {
            System.out.println("В г." + cityName + " сейчас полночь");
        } else System.out.println("В г." + cityName + " сейчас " + hours + ":" + minutes + ":" + seconds);


    }

    @Override
    public void run() {
        while (!Test0001.isStopped) {
            try {
                printTime();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
