package Lesson027.Test03;

public class CountUpRunnable implements Runnable {

    private int countIndexUp = 1;
    private Thread t;

    public CountUpRunnable(String name) throws InterruptedException {
        this.t = new Thread(this, name);
        t.start();
        t.join();
    }

    // TODO: 11.02.17


    @Override
    public void run() {

        while (countIndexUp <= Test003.number) {


            System.out.println(toString());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            countIndexUp++;
        }

    }

    @Override
    public String toString() {
        return t.getName() + ": " + countIndexUp;
    }
}
