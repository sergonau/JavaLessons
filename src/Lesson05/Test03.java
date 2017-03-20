package Lesson05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test03 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("qqq");
        list.add("aaa");
        list.add("zzz");
        list.add("zzz");
        list.add("zzz");
        list.add("zzz");
        list.add("zzz");
        list.add("zzz");
        list.add("zzz111");

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            String x = itr.next();
            System.out.println(x);
        }

    }


}
