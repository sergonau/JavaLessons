package Lesson026.Test001;

/* А без interrupt слабо?

1. Создать класс TestThread, который реализует интерфейс Runnable

2. Нить должна выводить надпись Tik, каждые пол секунды

3. Создать метод ourInterruptMethod()

4. Сделать так, чтобы в методе ourInterruptMethod можно было сделать так, чтобы нить TestThread завершилась сама.
Нельзя использовать метод interrupt.

5. В выполняющем классе запустить нить, она должна отработать 3 секунды, а потом прерваться
*/

public class Test01 {

    public static void main(String[] args) throws InterruptedException {
        TestThread testThread = new TestThread();
        Thread t = new Thread(testThread);
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();

    }

    static boolean isCancel = false;

    static void ourInterruptMethod(){
        isCancel = true;
    }

    public static class TestThread implements Runnable {

        @Override
        public void run() {

            while (!isCancel) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Tik");
            }
        }
    }
}
