package com.company.Lesson03;

/* Максимальное среди массива на 10 чисел
1. В методе initializeArray():
1.1. Создайте массив на 10 чисел
1.2. Считайте с консоли 10 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test04 {

    public static void main(String[] args) throws IOException {
        int[] array = initializeArray();
        int maxNumber = max(array);
        System.out.println("Max = " + maxNumber);
    }


    private static int[] initializeArray() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {

            System.out.println("Enter number");
            a[i] = Integer.parseInt(reader.readLine());

        }

            return a;
    }

    private static int max(int[] x) {

        int max = x[0];

        for (int i = 1; i < x.length; i++) {

            if (x[i] > max) {

                max = x[i];

            }

        }
        return max;
    }




}
