package Lesson06;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 10 различных чисел. createSet
Удалить из множества все числа больше 10. removeAllNumberMoreThen10
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test09 {

    public static void main(String[] args) throws IOException {

        Set<Integer> set = createSet();
        set = removeAllNumberMoreThen10(set);
        System.out.println(set);
    }

    public static Set<Integer> createSet() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(Integer.parseInt(reader.readLine()));
        }
        return set;
    }

    public static Set<Integer> removeAllNumberMoreThen10(Set<Integer> set){

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()){

            if (iterator.next() > 10){

                iterator.remove();

            }

        }
        return set;
    }

}
