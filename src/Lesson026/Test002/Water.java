package Lesson026.Test002;

public class Water extends Thread {

    private String commonResource;

    public Water(String commonResource) {
        this.commonResource = commonResource;
    }

    @Override
    public void run() {

        boolean isCurrentThreadInterrupted = isInterrupted();
        String threadName = getName();
        try {
            while (!isCurrentThreadInterrupted) {
                System.out.println("Объект " + commonResource + ", нить " + threadName);
                sleep(1000);
            }
        } catch (InterruptedException e) {

        }
    }
}
