package com.company.Lesson03;

/* 2 массива
1. Создать массив на 5 строк.
2. Создать массив на 5 чисел.
3. Ввести с клавиатуры 5 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер
ячейки которой совпадает с текущим индексом из массива чисел.
Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test05 {

    public static void main(String[] args) throws IOException {

        String[] strings = new String[5];
        int[] massiv = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < strings.length; i++) {

            strings[i] = reader.readLine();

        }

        for (int i = 0; i < 5; i++) {

            massiv[i] = strings[i].length();

            System.out.println(massiv[i]);
        }

    }
}
