package Lesson019_Threads;

/* Вывод стек-трейса

1. Создать таск - класс public static SpecialThread - на основании интерфейса Runnable
2. SpecialThread должен выводить в консоль свой стек-трейс.
*/

public class Test_Thread_06 {
    public static void main(String[] args) {
        Thread thread = new Thread(new SpecialThread());
        thread.start();
    }

    public static class SpecialThread implements Runnable {

        @Override
        public void run() {
            for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
                System.out.println(element);
            }
        }
    }

}
