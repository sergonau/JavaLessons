package Lesson022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 21.01.17.
 */
public class Test0001 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        System.out.println(nod(a,b));

    }

    static Integer nod(int a, int b) {
//        if (a <=b && b % a == 0 ) {
//            return a;
//        }
//
//        List<Integer> list = new ArrayList<>();
//        List<Integer> list1 = new ArrayList<>();
//
//        for (int i = 1; i <= a; i++) {
//            if (a % i == 0) {
//                list.add(i);
//            }
//        }
//
//        for (int i = 1; i <= b; i++) {
//            if (b % i == 0) {
//                list1.add(i);
//            }
//        }

//        if (a<b) {
//            for (int i = 1; i < list.size(); i++) {
//                for (int j = 1; j < list1.size(); j++) {
//                    if (list.get(list.size() - i).equals(list1.get(list1.size() - j))) {
//                        return list.get(list.size()-i);
//                    }
//                }
//            }
//        } else {
//            for (int i = 1; i < list1.size(); i++) {
//                for (int j = 1; j < list.size(); j++) {
//                    if (list1.get(list1.size() - i).equals(list.get(list.size() - j))) {
//                        return list1.get(list1.size() - i);
//                    }
//                }
//            }
//        }

        int i = 1;
        int c = 1;

        while (i <= a && i <= b){
            if(a % i == 0 && b % i == 0){
                c = i;
                i++;
            }else{
                i++;
            }
        }

        return c;
    }
}
