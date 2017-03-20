package com.company.Lesson02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму.
Если пользователь ввел -1, вывести на экран сумму и завершить программу.
-1 должно учитываться в сумме.
*/
public class Test07 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int k = 0;

        do {

            System.out.println("Enter number to sum with previous");

            a = Integer.parseInt(reader.readLine());

            k=k+a;

            System.out.println(k);


        } while (a != -1);


    }

}
