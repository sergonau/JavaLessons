package Lesson020_Thread;

import Lesson019_Threads.Test_Thread_03;

/**
 * Created by admin on 07.01.17.
 */
public class Test001 {
    public static void main(String[] args) throws InterruptedException {
        Test_Thread_03.Printer printer1 = new Test_Thread_03.Printer("name1");
        printer1.start();
        printer1.join();
    }
}
