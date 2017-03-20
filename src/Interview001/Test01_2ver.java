package Interview001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by admin on 26.11.16.
 */
public class Test01_2ver {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter number 1");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        System.out.println("Enter number 1");
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(reader1.readLine());



        System.out.println(maxDiv(a, b));
        System.out.println();
    }

    private static int maxDiv(int a, int b){
        int c = 0;
        int i = 1;

        while (i <= a && i <= b){
            if((a%i == 0) && (b%i == 0)){
                c = i;
                i++;
            } else {
                i++;
            }
        }
        return c;
    }

}
