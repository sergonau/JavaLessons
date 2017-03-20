package Lesson05;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 10 чисел и выводит их в убывающем порядке.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter number");
            array[i] = Integer.parseInt(reader.readLine());
        }

        sortArray(array);
        for (int i : array) {
            System.out.println(i);
        }

    }

    static void sortArray(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j+1] > arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;

                }
            }
        }
    }
}
