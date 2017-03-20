package Lesson013;
/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test01 {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter number 1");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        System.out.println("Enter number 1");
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(reader1.readLine());



        System.out.println(maxDiv(a, b));


    }

    public static int maxDiv(int a, int b) {

        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        for (int i = 1; i <= a; i++) {

            if (a % i == 0) {

                list.add(i);

            }

        }

        for (int i = 1; i <= b; i++) {

            if (b % i == 0) {

                list1.add(i);

            }

        }


        int i = 1;
        int j = 1;

        while (list.size()>i && list1.size()>j) {



            if (list.get(list.size() - i) == list1.get(list1.size() - j)) {
                return list.get(list.size() - i);
            } else if (list.get(list.size() - i) > list1.get(list1.size() - j)) {
                i++;
            } else j++;

        } return list.get(list.size() - i);
    }
}
