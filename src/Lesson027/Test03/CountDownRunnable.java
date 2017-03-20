package Lesson027.Test03;

public class CountDownRunnable implements Runnable {

    private int countIndexDown = Test003.number;
    private Thread t;

    public CountDownRunnable(String name) {
        this.t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run() {

        while (countIndexDown >=1) {
            System.out.println(toString());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            countIndexDown--;
        }

    }

    @Override
    public String toString() {
        return t.getName() + ": " + countIndexDown;
    }
}
