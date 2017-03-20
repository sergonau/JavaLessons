package Lesson05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by admin on 15.10.16.
 */
public class Test02 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("test1");
        set.add("test2");
        set.add("test3");
        set.add("test3");

        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("-------------");

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String text = iterator.next();
            System.out.println(text);
        }
    }
}
