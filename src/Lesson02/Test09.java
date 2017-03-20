package com.company.Lesson02;

public class Test09 {

    public static void main(String[] args) {
        int n = 11;
        for (int i = 0; i <= n; i++) {
            System.out.println(fibon(i) + " ");
        }


    }


    public static int fibon(int index){

        if (index <= 0){

            return 0;

        } else if (index == 1) {

            return 1;

        } else if (index == 2) {

            return 1;

        } else {
            return fibon(index - 1) + fibon(index - 2);
        }

    }

}
