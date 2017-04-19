package Lesson036;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
//    static int[] nextLarger(int[] a) {
//
//        int[] newMassiv = new int[a.length];
//
//        for (int i = 0; i < a.length; i++) {
//            for (int j = i; j < a.length; j++) {
//                if (a[j] > a[i]) {
//                    newMassiv[i] = (a[j]);
//                    break;
//                } else newMassiv[i] = -1;
//
//            }
//        }
//
//        return newMassiv;
//    }

    static int[] nextLarger(int[] a) {
        int[] s = new int[a.length];
        int S = 0;
        for (int i = a.length-1; i >=0 ; --i) {
            while (S > 0 && a[i] > s[S-1]) S--;
            int t = S>0 ? s[S-1] : -1;
            // TODO: 17.04.17  
            s[S++] = a[i];
            a[i] = t;
        }
        return a;
    }

    public static void main(String[] args) {

        int[] b = nextLarger(new int[]{6, 7, 3, 8, 9, 5, 5, 1});

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
            System.out.println();
        }
    }
}