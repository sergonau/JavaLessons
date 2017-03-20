package Lesson017;

/* Статики 2

1. В статическом блоке считайте две переменные с консоли number1 и number2 с типом int.
2. Не забыть про IOException, который надо обработать в блоке catch.
3. Закрыть поток ввода методом close().
4. Создать метод min(int a, int b), который должен вернуть минимальное значение между number1 и number2.
5. Создать статическую, неизменяемую переменную MIN и присвоить ей значение, которое возвращает метод min.
6. В выполняющем методе вывести значение переменной MIN.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01 {

    static int number1;
    static int number2;

    static {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {

            System.out.println("Enter number 1");
            number1 = Integer.parseInt(reader.readLine());
            System.out.println("Enter number 2");
            number2 = Integer.parseInt(reader.readLine());
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static final int MIN= min(number1, number2);;

    public static void main(String[] args) {

        System.out.println("Result: " + MIN);


    }

    private static int min(int a, int b){
        return a > b ? b : a;
    }

}
