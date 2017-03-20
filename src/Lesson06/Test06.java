package Lesson06;
/* Провести 10 тысяч вставок, удалений
Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.DataFormatException;

public class Test06 {

    public static void main(String[] args) {

        List list = new ArrayList();
        List list1 = new LinkedList();



        insert10000(list);
        insert10000(list1);

        get10000(list);
        get10000(list1);

        set10000(list);
        set10000(list1);

        remove10000(list);
        remove10000(list1);

    }

    public static void insert10000(List list){

        for (int i = 0; i < 10_000; i++) {
            list.add(new Object());
        }

    }

    public static void get10000(List list){

        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }

    }

    public static void set10000(List list){

        for (int i = 0; i < list.size(); i++) {
            list.set(i, new Object());
        }

    }

    public static void remove10000(List list){

        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }

    }

}