package com.company.Lesson03;

public class Test03 {

    public static void main(String[] args) {

        int[] list = {6, 5, -1, -99, 65, 43, -1000};

        int x = list[0];

        for (int i = 0; i < list.length; i++) {



            if (list[i] < x) {

                x = list[i];

            }



        }

        System.out.println(x);

    }

}
