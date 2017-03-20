package Lesson06;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Test08 {

    public static void main(String[] args) {
        System.out.println(getTimeMsOfGet(fill(new ArrayList())));
        System.out.println(getTimeMsOfGet(fill(new LinkedList())));
    }

    private static List fill(List list){
        for (int i = 0; i < 10_000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static void get10000(List list){

        for (int i = 0; i < list.size()*2; i++) {
            list.get(list.size()/2);
        }

    }

    public static long getTimeMsOfGet(List list){

        Date date = new Date();
        get10000(list);
        Date date1 = new Date();

        return date1.getTime()-date.getTime();
    }

}