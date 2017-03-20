package Lesson019_Threads;

/* My second thread

1. Создать public static класс TestThread унаследовавшись от класса Thread.
2. Создать статик блок внутри TestThread, который выводит в консоль "it's static block inside TestThread".
3. Метод run должен выводить в консоль "it's run method".
*/
public class Test_Thread_05 {

    public static void main(String[] args) {

        TestThread111 testThread111 = new TestThread111();
        testThread111.start();

    }

    public static class TestThread111 extends Thread{

        public TestThread111() {
        }

        static {
            System.out.println("it's static block inside TestThread");
        }

        @Override
        public void run() {
            System.out.println("it's run method");
        }
    }

}
