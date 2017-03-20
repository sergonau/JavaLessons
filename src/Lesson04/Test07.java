package com.company.Lesson04;

/* Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).

Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное – утраивается.
Программа выводит содержимое нового списка на экран.
Пример ввода:
Кот
Коты
Я
Пример вывода:
Кот Кот Кот
Коты Коты
Я Я Я
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test07 {

    public static void main(String[] args) throws IOException {

        List<String> strings = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            String s = reader.readLine();
            if(s.isEmpty()) break;
            strings.add(s);
        }

        List<String> strings1 = new ArrayList<>();

        for (int i = 0; i < strings.size(); i++) {

            String x = strings.get(i);
            if(x.length() %2 == 0) strings1.add(x + " " + x);
            if(x.length() %3 == 0) strings1.add(x + " " + x + " " + x);

        }


        strings1.forEach(System.out::println);
    }

}
