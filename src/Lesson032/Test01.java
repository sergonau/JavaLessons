package Lesson032;

import java.util.Arrays;

public class Test01 {

    public static void main(String[] args) {


        System.out.println(missingNumber(new int[]{3, 2, 1}));

    }

    static int missingNumber(int[] arr) {
//        Arrays.sort(arr);
//        int x = 0;
//        for (int i : arr) {
//            if(i != x){
//                break;
//            }
//            x++;
//        }
        int n = arr.length;
        int sum = ((n+1)*n)/2;
        for (int i : arr) {
            sum -= i;
        }
        return sum;
    }
}
