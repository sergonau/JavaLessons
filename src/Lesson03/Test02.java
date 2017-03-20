package com.company.Lesson03;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test02 {

    public static void main(String[] args) throws IOException {

        int[] a = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 9; i >=5; i--){

            System.out.println("Enter");

            a[i] = Integer.parseInt(reader.readLine());

            System.out.println(a[i]);

        }

    }

}
