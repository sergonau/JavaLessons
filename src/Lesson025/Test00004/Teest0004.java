package Lesson025.Test00004;

/* Считаем секунды

1. Создать класс Stopwatch, унаследовать его от Thread.
2. В выполняющем классе ввести с клавиатуры строку
3. Напиши реализацию метода run в нити Stopwatch (секундомер).
4. Stopwatch должен посчитать количество секунд, которое прошло от создания нити до ввода строки.
5. Выведи количество секунд в консоль.
*/

import Lesson023.Test03.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teest0004 {

    public static int seconds = 0;

    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        System.out.println("Введите что-то с клавиатуры");
            if (reader.readLine() != null){
                stopwatch.interrupt();
        }

        System.out.println("Прошло " + seconds + " секунд");
    }

}
