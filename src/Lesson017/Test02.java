package Lesson017;

/* Разные методы для разных типов

0. Создать метод print и перегрузить его для разных типов:
- print( Double value ), должен выводит на экран надпись "Это тип Double, значение " + value
- print( String value ), должен выводит на экран надпись "Это тип String, значение " + value
- print( short value ), должен выводит на экран надпись "Это тип short, значение " + value
- print( Integer value ), должен выводит на экран надпись "Это тип Integer, значение " + value
1. Считать с консоли данные, пока не введено слово "exit".

2. Для каждого значения, кроме "exit", вызвать метод print. Если значение:
2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test02 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String val = null;


        while (true) {

            try {

                 val = reader.readLine();

                if ("exit".equals(val)) break;

                if (val.contains(".")) {
                    print(Double.parseDouble(val));
                } else if (Integer.parseInt(val) < 128 && Integer.parseInt(val) > 0) {
                    print(Short.parseShort(val));
                } else if (Integer.parseInt(val) >= 128){
                    print(Integer.parseInt(val));
                }
            } catch (NumberFormatException e) {
                print(val);
            }
        }

    }

    public static void print(int a) {
        System.out.println("Это тип Integer, значение " + a);
    }

    public static void print(String a) {
        System.out.println("Это тип String, значение " + a);
    }

    public static void print(double a) {
        System.out.println("Это тип Double, значение " + a);
    }

    public static void print(short a) {
        System.out.println("Это тип short, значение " + a);
    }
}