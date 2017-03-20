package com.company.Lesson03;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test12 {
    public static void main(String[] args) throws IOException {

        List<Integer> integers = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            System.out.println("Enter num");
            String a = reader.readLine();

            if (a.isEmpty()) break;

              int x = Integer.parseInt(a);
            integers.add(x);
        }

        for (int i = 0; i < integers.size();) {

            if (integers.get(i) > 5) integers.remove(i);
            else i++;

        }

        for (Integer integer : integers) {

            System.out.println(integer);

        }

    }
}
