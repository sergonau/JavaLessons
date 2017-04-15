package Lesson036;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
    static int[] nextLarger(int[] a) {

        int tmp = 0;
        int x = 0;

        List<Integer> list = new ArrayList<>();

        int[] newMassiv = new int[a.length];

        int k;

        for (int i = 0; i < a.length; i++) {

            k = 0;

            for (int j = 0; j < a.length; j++) {
                if (k==0 && j!=0)list.add(-1);
                if (a[j] > a[i]) {
                    list.add(a[j]);
                    k++;
                    continue;
                }

                // TODO: 07.04.17  
            }
        }

        for (int i = 0; i < a.length; i++) {
            newMassiv[i] = list.get(i);
        }

        return newMassiv;
    }

    public static void main(String[] args) {

        int[] b = nextLarger(new int[]{6, 7, 3, 8});

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
            System.out.println();
        }
    }
}