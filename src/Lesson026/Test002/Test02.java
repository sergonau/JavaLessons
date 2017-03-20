package Lesson026.Test002;

/* Один для всех, все - для одного

1. В выполняющем классе создать статическую переменную byte countThreads = 3
2. В выполняющем классе создать статический список threads, с размером указанным в переменной countThreads
3. Реализуй метод ourInterruptMethod, чтобы он прерывал все нити из threads.
4. Создать класс Water, который реализует интерфейс Runnable

5. В классе Water:
- создать приватную переменную String commonResource
- создать конструктор и инициализировать в нём параметр commonResource
- реализовать метод run():
 -- создать переменную isCurrentThreadInterrupted - должна равняться значению метода isInterrupted у текущей нити.
 -- создать переменную threadName - должна равняться значению метода getName (реализовано в классе Thread) у текущей нити.
 -- пока нить не прервана, выводить на экран надпись "Объект " + commonResource + ", нить " + threadName
 и отправлять нить в сон на секунду

6. Создать метод void initThreadsAndStart(), который должен:
- заполнять список нитями, с одним и тем же таском Water и именем нити в виде "#" + i
- запускать по-очереди каждую нить

7. В выполняющем методе:
- вызвать метод  initThreadsAndStart();
- пустить нить в сон на 3 секунды
- вызвать метод ourInterruptMethod();
*/

import java.util.ArrayList;
import java.util.List;

public class Test02 {

    static byte countThreads = 3;
    static List<Thread> threads = new ArrayList<>(countThreads);

    static void ourInterruptMethod(){
        for (int i = 0; i < countThreads; i++) {
            threads.get(i).interrupt();
        }
    }

    static void initThreadsAndStart(){

        for (int i = 0; i < countThreads; i++) {
            threads.add(new Thread(new Water("H2O"), "#" + i));
                threads.get(i).start();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        initThreadsAndStart();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

}
