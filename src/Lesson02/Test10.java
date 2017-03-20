package com.company.Lesson02;

/**
 * Created by admin on 03.10.16.
 */
public class Test10 {
    public static void main(String[] args) {
        DoubleInteger e = doubleInt();
        System.out.println(e.a + " " + e.b);

    }

    public static DoubleInteger doubleInt(){
        int a = 5;
        double b = 6.5;
        return new DoubleInteger(a, b);
    }

    static class DoubleInteger {

        int a;
        double b;

        public DoubleInteger(int a, double b) {
            this.a = a;
            this.b = b;
        }
    }

}
