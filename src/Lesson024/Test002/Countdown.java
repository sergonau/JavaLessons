package Lesson024.Test002;

public class Countdown implements Runnable {

    int countFrom;

    public Countdown(int countFrom) {
        this.countFrom = countFrom;
    }

    void printCountdown() throws InterruptedException {


        for (int i = 0; i <= countFrom; i++) {
            Thread.sleep(500);
            System.out.println(Test0001.list.get(countFrom-i));
            if (i == countFrom) countFrom = 0;

        }
    }

    @Override
    public void run() {

        while (countFrom > 0) {
            try {
                printCountdown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

//            if (countFrom == 1) break;
//            countFrom--;
        }
    }
}
