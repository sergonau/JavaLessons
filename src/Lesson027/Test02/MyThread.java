package Lesson027.Test02;

public class MyThread extends Thread {

    String message = "inside MyThread ";

    @Override
    public void run() {
        for (int i = 0; i <= 9; i++) {
            System.out.println(message + i);
            try {
                Test002.sleep();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
