package com.company.Lesson03;

/* Один большой массив и два маленьких
1. Создать массив на 10 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 5 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test06 {

    public static void main(String[] args) throws IOException {

        int[] massiv = new int[10];
        int[] massiv1 = new int[5];
        int[] massiv2 = new int[5];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < massiv.length; i++) {

            System.out.println("Enter number");
            massiv[i] = Integer.parseInt(reader.readLine());

        }

        for (int i = 0; i < 5; i++) {

            massiv1[i] = massiv[i];
            massiv2[i] = massiv[i+5];
            System.out.println(massiv2[i]);

        }

    }

}
