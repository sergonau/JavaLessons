package Lesson05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test04 {

    public static void main(String[] args) {

        Map<String, String> map01 = new HashMap<>();

        map01.put("01", "Sergey");
        map01.put("02", "Sergey1");
        map01.put("08888", "Sergey2");
        map01.put("01", "Sergey3");

        Iterator<Map.Entry<String, String>> iterator = map01.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }

        for (Map.Entry<String, String> entry : map01.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " - " + value);
        }
    }
}