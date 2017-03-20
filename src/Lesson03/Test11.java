package com.company.Lesson03;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test11 {
    public static void main(String[] args) throws IOException {

        List<Integer> list = new ArrayList();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            String str = reader.readLine();

            if(str.isEmpty()) break;

            int x = Integer.parseInt(str);
            if(x%2 != 0) {
                list.add(0, x);
            } else list.add(x);

        }

        for (Integer integer : list) {

            System.out.print(integer + " ");

        }

    }
}
