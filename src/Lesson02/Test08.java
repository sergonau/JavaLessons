package com.company.Lesson02;

/*
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test08 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first number");
        int i = Integer.parseInt(reader.readLine());

        System.out.println("Enter second number");
        int j = Integer.parseInt(reader.readLine());

        System.out.println("Enter third number");
        int k = Integer.parseInt(reader.readLine());


        if(i <= j && i >= k) {

            System.out.println(i);

        } else if (j >= i && j <= k ) {

            System.out.println(j);

        } else System.out.println(k);

    }

}
