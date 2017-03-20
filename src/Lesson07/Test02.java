package Lesson07;

/* Одинаковые имя и фамилия

Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

import java.util.HashMap;
import java.util.Map;

public class Test02 {

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        System.out.println(getCountTheSameFirstName(map, "Simn"));
        System.out.println(getCountTheSameLastName(map, "Sim"));
    }

    static Map<String, String> createMap(){

        Map<String, String> map = new HashMap<>();

        map.put("Sim", "Simn");
        map.put("Simn", "Tomn");
        map.put("Simn", "Arbusn");
        map.put("Baby", "Simn");
        map.put("Art", "Simn");
        map.put("Sim", "Dogn");
        map.put("Eat", "Eatn");
        map.put("Food", "Foodn");
        map.put("Gevey", "Geveyn");
        map.put("Hugs", "Hugsn");


        return map;
    }

    static int getCountTheSameFirstName(Map<String, String> map, String name){

        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {

            String value = pair.getValue();
            if(value.equals(name)) count++;
        }
            return count;
    }

    static int getCountTheSameLastName(Map<String, String> map, String lastName){

        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {

            String value = pair.getKey();
            if(value.equals(lastName)) count++;
        }
            return count;
    }

}
