package Lesson025;

public class TestTest_Interrupt {

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread t = new Thread(clock);
        t.start();
        Thread.sleep(5000);
        t.interrupt();
    }

    public static class Clock implements Runnable {
        Thread current = Thread.currentThread();

        @Override
        public void run() {
            try {
                while (!current.isInterrupted()) {
                    System.out.println("Tik");
                    Thread.sleep(1000);

                }
            } catch (InterruptedException e) {
                System.out.println("Ok");
            }
        }
    }
}