package Lesson022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by admin on 21.01.17.
 */
public class Test0002 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter number");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(factorial(Integer.parseInt(reader.readLine())));

    }

    static Integer factorial(int a){
        if(a == 0) return 1;
        return a * factorial(a - 1);
    }
}
