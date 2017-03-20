package Lesson06;

import java.util.Date;

public class Test04 {

    public static void main(String[] args) {

        Date date = new Date();

        int x = date.getHours();
        int y = date.getMinutes();
        int z = date.getSeconds();

        System.out.println("Current time: " + x + ":" + y + ":" + z);
    }
}