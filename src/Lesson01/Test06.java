package com.company.Lesson01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test06 {

    public static void main(String[] args) throws IOException {
        convert();

    }

    public static double currency(double usd) {
        return usd*26.1;
    }

    public static void convert() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter USD sum ");
        System.out.println("Your hruvna sum: " + currency(Double.parseDouble(reader.readLine())));
    }
}
