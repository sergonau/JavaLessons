package Lesson023.Test03;

/*  (Секундомер)

1. В выполняющем классе создать статическую переменную isStopped, присвоить ей значение false
2. Создать класс Stopwatch, унаследовать его от Thread
3. Создать класс Runner

4. В классе Stopwatch:
- создать приватную переменную Runner owner;
- создать приватную переменную int stepNumber;
- создать конструктор и инициализировать в нём переменную owner;
- создать метод doSeveralSteps, пока что без реализации;
- создать метод run(), он должен:
  -- пока переменная isStopped равняется false выполнять метод doSeveralSteps;
  -- отлавливать все checked исключения.

5. В классе Runner создать параметры name, speed, stopwatch - подумать, какой тип данный у каждого параметра
5.1 Создать конструктор для инициализация всех параметров класса Runner
5.2 Сделать переменный name, speed приватными, создать для них геттеры
5.3 Метод getSpeed() в классе Runner показывает, сколько шагов в секунду делает бегун.
5.4 Создать метод start(), он должен запускать нить stopwatch

6. Реализовать метод doSeveralSteps:
- увеличивать счетчик шага на один
- записывать скорость бегуна в новую переменную
- отправлять нить в сон на 1000 / speed1 мс
- выводить на экран надпись owner.getName() + " делает шаг №" + stepNumber + "!"

7. В выполняющем методе создать два объекта Runner
8. Вызвать метод start у каждого объекта
9. Отправить гланую нить в сон на 2 секунды
10. Поменять значение переменной isStopped на true
11. Отправить главную нить в сон на одну секунду
Нужно, чтобы бегун действительно делал заданное количество шагов в секунду.
Если Иванов делает 4 шага в секунду, то за 2 секунды он сделает 8 шагов.
Если Петров делает 2 шага в секунду, то за 2 секунды он сделает 4 шага.
*/

public class Test01 {

    static boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Runner runner = new Runner("Nick", 20);
        Runner runner1 = new Runner("Mike", 33);
        runner.start();
        runner1.start();
        Thread.sleep(2_000);
        isStopped = true;
        Thread.sleep(1_000);

        if(runner.stopwatch.getStepNumber() > runner1.stopwatch.getStepNumber()){
            System.out.println(runner.getName() + " is winner");
        } else System.out.println(runner1.getName() + " is winner");

    }
}
