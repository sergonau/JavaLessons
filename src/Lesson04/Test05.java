package com.company.Lesson04;

/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test05 {

    public static void main(String[] args) throws IOException {


        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter word");
            list.add(reader.readLine());

        }

        list = doubleValues(list);
        System.out.println(list);

    }

    static List<String> doubleValues(List<String> fixedList) {

        List<String> strings = new ArrayList<>();

        for (String s : fixedList) {

            strings.add(s);
            strings.add(s);

        }
            return strings;
    }
}
