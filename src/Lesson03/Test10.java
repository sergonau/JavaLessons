package com.company.Lesson03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 06.10.16.
 */
public class Test10 {
    public static void main(String[] args) throws IOException {

        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){

            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(Integer.parseInt(s));
            
        }

        list.forEach(System.out::println);

    }
}
