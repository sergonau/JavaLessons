package Lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by admin on 29.10.16.
 */
public class Test04 {
    public static void main(String[] args) throws IOException {

        Integer[] a = new Integer[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < a.length; i++) {

            a[i] = Integer.parseInt(reader.readLine());

        }

        sort(a);

        for (int i = 0; i < 5; i++) {

            System.out.println(a[i]);
        }

    }

    static void sort(Integer[] a){
        Arrays.sort(a, Collections.reverseOrder());
    }
}
