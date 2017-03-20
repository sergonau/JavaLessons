package com.company.Lesson02;


import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Test010 {

    static Map<Integer, BigInteger> cache = new HashMap<>();


    public static void main(String[] args) {
        System.out.println(factorial(150));
    }


    public static BigInteger factorial(int n){
        BigInteger res;

        if(n == 0) return BigInteger.ONE;
        if((res = cache.get(n)) != null) return res;
        res = BigInteger.valueOf(n).multiply(factorial(n-1));
        cache.put(n, res);
        return res;

    }
}
