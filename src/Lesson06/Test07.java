package Lesson06;

/* Измерить сколько времени занимает 10 тысяч вставок для каждого списка
Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getTimeMsOfInsert  должен вернуть время его исполнения в миллисекундах.
*/

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Test07 {

    public static void main(String[] args) {
        System.out.println(getTimeMsOfInsert(new ArrayList()));
        System.out.println(getTimeMsOfInsert(new LinkedList()));
    }

    public static void insert10000(List list) {

        for (int i = 0; i < 10_000_000; i++) {
            list.add(new Object());
        }
    }

    public static long getTimeMsOfInsert(List list){
        Date date = new Date();
        insert10000(list);
        Date date1 = new Date();

        return date1.getTime()-date.getTime();

    }

}
