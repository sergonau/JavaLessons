package Lesson08;

/* Задача по алгоритмам

Задача: Введи с клавиатуры 6 слов и выведи их в алфавитном порядке.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test05 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter string");

        String[] s = new String[6];

        for (int i = 0; i < 6; i++) {

            s[i] = reader.readLine();

        }

        sort(s);

        for (int i = 0; i < s.length; i++) {


            System.out.println(s[i]);
        }

    }

    static void sort(String[] str) {


        for (int i = 0; i < str.length - 1; ) { // d a k

            if (isGreaterThen(str[i], str[i + 1])) {

                String temp = str[i];
                str[i] = str[i + 1];
                str[i + 1] = temp;
                if(i>0) i--;

            } else {
                i++;
            }


        }
    }


    public static boolean isGreaterThen(String a, String b){
        return a.compareTo(b) > 0; // вернет true, если а больше б
    }

}
