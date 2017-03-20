package Lesson027.Test02;
/* Последовательные выполнения нитей

1. В выполняющем классе создать переменную message = "inside main "
2. В выполняющем классе создать метод sleep(), который отправляет нить в сон на 10 мс
3. Создать класс MyThread, сделать его нитью

3.1 В классе MyThread:
- создать переменную message = "inside MyThread "
- реализовать мтеод run(): выводить 10 раз надпись message + i, i - число от 0 до 9.
После каждого вывода вызывать метод sleep

4. В выполняющем классе создать нить MyThread

5. В выполняющем методе запустить нить
5.1 Выводить 10 раз надпись message + i, i - число от 0 до 9.
6. Сделай так, чтоб программа сначала выводила результат нити, а когда нить завершится - продолжила метод main.
7. Пример выходных данных:
inside MyThread 0
inside MyThread 1
...
inside MyThread 9
inside main 0
inside main 1
...
inside main 9
*/

public class Test002 {

    static String message = "inside main ";

    static void sleep() throws InterruptedException {
        Thread.sleep(10);
    }

    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();
        myThread.start();
        myThread.join();

        for (int j = 0; j <= 9; j++) {
            System.out.println(message + j);
            try {
                Test002.sleep();
            } catch (InterruptedException e) {
            }
        }
    }
}
