package Lesson020_Thread.Test01;

import Lesson020_Thread.Test001;

/**
 * Created by admin on 07.01.17.
 */
public class PrintListThread extends Thread {

    public PrintListThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        Test01.printList(Test01.getList(20), getName());
    }
}