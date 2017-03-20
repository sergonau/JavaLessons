package com.company.Lesson04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3,
потом тот, который для x%2, потом последний.
*/
public class Test02 {

    public static void main(String[] args) throws IOException {

        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {

            System.out.println("Enter digit");
            list.add(Integer.parseInt(reader.readLine()));

        }

        System.out.println(list);
        System.out.println();

        for (int i = 0; i < list.size(); i++) {

            if(list.get(i) %3 == 0) list1.add(list.get(i));
            if(list.get(i) %2 == 0) list2.add(list.get(i));
            if(list.get(i) %2 != 0 && list.get(i) %3 !=0) list3.add(list.get(i));

        }

//        for (Integer x : list) {
//            if(x%3 == 0) list1.add(x);
//            if(x%2 == 0) list2.add(x);
//            if(x % 2 != 0 && x % 3 !=0) list3.add(x);
//        }

        printList(list1);
        printList(list2);
        printList(list3);

    }

    static void printList(List<Integer> listToPrint) {
        System.out.println(listToPrint);
    }


}
