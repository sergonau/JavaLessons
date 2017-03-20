package Lesson023.Test02;

public class Clock extends Thread {
    public Clock() throws InterruptedException {
        setPriority(MAX_PRIORITY);
        start();
    }
    void printTikTak() throws InterruptedException {
        sleep(500);
        System.out.println("Tik");
        sleep(500);
        System.out.println("Tak");
    }

    @Override
    public void run() {
        while(!Test01.isStopped){
            try {
                printTikTak();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
