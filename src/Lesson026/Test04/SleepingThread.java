package Lesson026.Test04;

public class SleepingThread extends Thread {

    int countDownIndex;

    @Override
    public String toString() {

            return "#" + getName() + ": " + countDownIndex;
    }
}