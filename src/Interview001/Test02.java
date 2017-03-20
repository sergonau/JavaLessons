package Interview001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by admin on 26.11.16.
 */
public class Test02 {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter number");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      int n = Integer.parseInt(reader.readLine());

    }

    private static int fibo(int a) {

        if (a <= 0) return 0;
        else if (a == 1) return 1;
        else if (a == 2) return 1;
        else return fibo(a - 2) + fibo(a - 1);


    }
}
