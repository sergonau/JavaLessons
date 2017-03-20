package com.company.Lesson01;

/**
 * Created by admin on 01.10.16.
 */
public class Test03 {
    public static void main(String[] args) {
        int a = 5; // 8
        int b = 8; // 2
        int c = 2; // 5
        System.out.println(a + " " + b + " " + c);

        int temp = a;
        a = b;
        b = c;
        c = temp;

        System.out.printf("%d %d %d", a, b, c);
    }
}
