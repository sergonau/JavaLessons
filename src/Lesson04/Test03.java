package com.company.Lesson04;


/* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test03 {

    public static void main(String[] args) throws IOException {

        List<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter word ");
            strings.add(reader.readLine());

        }

        strings.remove(2);

        for (int i = strings.size()-1; i >= 0; i--) {

            System.out.println(strings.get(i));

        }

        for (int i = 0; i < strings.size(); i++) {

            System.out.println(strings.get(strings.size()-1-i));

        }

    }
}
