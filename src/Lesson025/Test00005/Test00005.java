package Lesson025.Test00005;

/* Отсчет на гонках

1. В выполняющем классе создать статическую переменную int countSeconds, присвоить ей значение 3
2. Создать класс RacingClock, унаследовать его от Thread
3. Реализуй логику метода run так, чтобы каждую секунду через пробел
выдавался отсчет начиная с countSeconds до 1, а потом слово [Марш!] (см примеры).
4. Если нить работает 3.5 секунды или более, прерви ее методом interrupt и внутри нити выведи в консоль слово [Прервано!].
Пример для countSeconds=4 : [4 3 2 1 Прервано!]
5. Если нить работает менее 3.5 секунд, она должна завершиться сама.
Пример для countSeconds=3 : [3 2 1 Марш!]
*/

public class Test00005 {
    protected static int countSeconds = 3;
}
