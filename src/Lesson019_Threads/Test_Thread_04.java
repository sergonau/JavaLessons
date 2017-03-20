package Lesson019_Threads;

/* My first thread

Создать public static class TestThread - нить с помощью интерфейса Runnable.
TestThread должен выводить в консоль "My first thread".
*/
public class Test_Thread_04{

    public static void main(String[] args) {

        TestThread testThread = new TestThread();
        Thread thread = new Thread(testThread);
        thread.start();

    }

    public static class TestThread implements Runnable{

        @Override
        public void run() {
            System.out.println("My first thread");
        }
    }
}
