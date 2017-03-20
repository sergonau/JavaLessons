package com.company.Lesson04;


import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Test01 {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        Collections.addAll(list1, 5, 6, -5, 25, 56, 76);
        Collections.addAll(list2, 4, 6, 5, 254, 56, 176);

        list3.addAll(list1);
        list3.addAll(list2);

        list3.forEach(System.out::println);

        list3.forEach(System.out::println);



    }

}
