package Lesson019_Threads;

/**
 * Created by admin on 03.01.17.
 */
public class Test_Thread_01 {
    public static void main(String[] args) {
        Printer printer1 = new Printer("Printer1");
        Thread thread1 = new Thread(printer1);
        thread1.start();

        Printer printer2 = new Printer("Printer2");
        Thread thread2 = new Thread(printer2);
        thread2.start();
    }

    public static class Printer implements Runnable{
        String name;
        public Printer(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println("Im printer " + name);
        }
    }
}
