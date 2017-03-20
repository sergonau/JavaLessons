package com.company.Lesson01;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test05 {

    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first number ");
        int a = Integer.parseInt(reader.readLine());

        System.out.println("Enter second number ");
        int b = Integer.parseInt(reader.readLine());

        System.out.println("Enter third number ");
        int c = Integer.parseInt(reader.readLine());

        if (a > b && a > c) {

            System.out.println("Maximum namder is " + a);

        } else if (b > a && b > c){

            System.out.println("Maximum namder is " + b);

        } else System.out.println("Maximum namder is " + c);

    }
}
