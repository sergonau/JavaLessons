package Lesson09;

/* Мама Мыла Раму. Теперь с большой буквы

Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter text");
        String str = reader.readLine();
        char[] chr = str.toCharArray();

        chr[0] = Character.toUpperCase(chr[0]);
        for (int i = 0; i < chr.length - 1; i++) {


            if(chr[i] == ' '){

                chr[i+1] = Character.toUpperCase(chr[i+1]);

            }

        }

        System.out.println(chr);

    }

}
