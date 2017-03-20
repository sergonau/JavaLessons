package Lesson025;

public class TestTest {

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread t = new Thread(clock);
        t.start();
        Thread.sleep(5000);
        clock.cancel();
    }

    public static class Clock implements Runnable
    {
        public static boolean isCancel = false; // isInterrupted

        public void cancel(){ // interrupt
            this.isCancel = true;
        }

        @Override
        public void run() {
            while (!isCancel){ // !isInterrupted()
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Tik");

            }
        }
    }
}
