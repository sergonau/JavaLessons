package Lesson08;

/* Пять наибольших чисел

Создать массив на 10 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test03 {
    public static void main(String[] args) throws IOException {

        int[] a = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < a.length; i++) {

            a[i] = Integer.parseInt(reader.readLine());

        }

        sortArray(a);

        for (int i = 0; i < 5; i++) {

            System.out.println(a[i]);
        }

    }

    static void sortArray(int[] a){

        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if (a[j] < a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

    }
}
