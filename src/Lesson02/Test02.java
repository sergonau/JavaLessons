package com.company.Lesson02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * /* Хорошего не бывает много
 * Ввести с клавиатуры строку и число N.
 * Вывести на экран строку N раз используя цикл while.
 * Пример ввода:
 * абв
 * 2
 * Пример вывода:
 * абв
 * абв
 */

public class Test02 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter string");
        String k = reader.readLine();

        System.out.println("Enter number");
        int n = Integer.parseInt(reader.readLine());

        int i = 0;
        while (i <= n) {

            System.out.println(k);

            i++;

        }


    }

}
