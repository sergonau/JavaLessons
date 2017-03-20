package Lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

/* Гласные и согласные буквы

Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/
public class Test02 {

        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter text");
            String str = reader.readLine();
            char[] chr = str.toCharArray();
            String vov = "";
            String unvov = "";

            for (int i = 0; i < chr.length; i++) {

                if(isVovel(chr[i]) && chr[i] != ' '){

                    vov = vov+chr[i] + " ";

                } else if (!isVovel(chr[i]) && chr[i] != ' '){

                    unvov = unvov + chr[i] + " ";

                }

            }

            System.out.println(vov);

            System.out.println(unvov);


    }

    static boolean isVovel(char chr) {

        chr = Character.toLowerCase(chr);
        for (char vowel : vowels) {
            if(chr == vowel) {
                return true;
            }
        }
        return false;
    }
        public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

}
