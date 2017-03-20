package Lesson025.Test00004;

public class Stopwatch extends Thread {

    Thread current = Thread.currentThread();

    @Override
    public void run() {
        while (true) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
            }
            Teest0004.seconds++;
        }

    }
}
