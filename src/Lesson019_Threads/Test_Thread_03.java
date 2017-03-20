package Lesson019_Threads;

import Lesson08.*;
import Lesson08.Test01;

/**
 * Created by admin on 03.01.17.
 */
public class Test_Thread_03 {
    public static void main(String[] args) {
        Printer printer = new Printer("thread1");
        printer.start();

        Printer printer1 = new Printer("thread2");
        printer1.start();
    }

    public static class Printer extends Thread{

        public Printer(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println("Printer " + getName());
        }
    }
}
