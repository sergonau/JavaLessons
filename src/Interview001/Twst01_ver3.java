package Interview001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 26.11.16.
 */
public class Twst01_ver3 {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter number");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int limit = Integer.parseInt(reader.readLine());

        System.out.println(factorial(limit));
    }

   static Map<Integer, BigInteger> cache = new HashMap<>();

    public static BigInteger factorial(int a){
        System.out.print("");
        BigInteger res;

        if(a == 0) return BigInteger.ONE;

        if((res = cache.get(a)) != null) return res;
        res = BigInteger.valueOf(a).multiply(factorial(a - 1));
        cache.put(a, res);
        return res;
    }

}
