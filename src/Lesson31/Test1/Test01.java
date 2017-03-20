package Lesson31.Test1;

/* Только по-очереди!

1. Создать нить Read3Strings унаследовавшись от Thread.
2. В методе run реализовать чтение с консоли трех строк.
3. Три подряд введенных строки должны считываться в одной нити и объединяться в одну строку через пробел.
4. В методе main создать 2 нити, запустить каждую, вывести результат для каждой нити.

Пример:
Входные данные
a
b
c
d
e
f
Выходные данные:
a b c
d e f
*/

public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        Read3Strings read3Strings = new Read3Strings();
        read3Strings.start();
        read3Strings.join();

        Read3Strings read3Strings1 = new Read3Strings();
        read3Strings1.start();
        read3Strings1.join();

        System.out.println(read3Strings);
        System.out.println(read3Strings1);

    }
}
