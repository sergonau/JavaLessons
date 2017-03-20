package Interview001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Interview001 {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter number");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int limit = Integer.parseInt(reader.readLine());

        System.out.println(factorial(limit));

    }

    private static int factorial(int a){
        if (a == 0){
            return 1;
        }
        return a * factorial(a-1);

    }

}