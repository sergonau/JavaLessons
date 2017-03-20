package com.company.Lesson03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 10 строчек в начало списка
1. Создай список строк в методе main.
2. Добавь в него 5 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Test08 {

    public static void main(String[] args) throws IOException {

        List<String> list01 = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        list01.add("rewgfewfew");
        for (int i = 0; i < 5; i++) {
            list01.set(0, reader.readLine());
        }

        list01.forEach(System.out::println);

    }

}
