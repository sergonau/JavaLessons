package com.company.Lesson03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Test07 {

    public static void main(String[] args) throws IOException {


        List<String> list1 = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maxLength = list1.get(0).length();
        for (int i = 0; i < 5; i++) {

            list1.add(reader.readLine());
            if(maxLength <= list1.get(i).length()){

                maxLength = list1.get(i).length();

            }

        }

        for (int i = 0; i < 5; i++) {

            if(maxLength == list1.get(i).length()) {

                System.out.println(list1.get(i));

            }

        }

    }
}
