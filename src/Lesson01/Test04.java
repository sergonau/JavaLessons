package com.company.Lesson01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by admin on 01.10.16.
 */
public class Test04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a = reader.readLine();
        System.out.println("Text is " + a);


        int c = Integer.parseInt(reader.readLine());
        System.out.println("Number is " + c*c);


    }
}
