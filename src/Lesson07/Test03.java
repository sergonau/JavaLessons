package Lesson07;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом

Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/
public class Test03 {

    public static void main(String[] args) {
        Map<String, Date> map = createMap();
        removeAllSummerBirthdayPeople(map);
        System.out.println(map);
    }

    static Map<String, Date> createMap(){

        Map<String, Date> map = new HashMap<>();

        map.put("Artem", new Date("JUNE 1 1980"));
        map.put("Em", new Date("JULY 22 1986"));
        map.put("Ar", new Date("MARCH 4 1990"));
        map.put("Tem", new Date("JANUARY 27 1960"));
        map.put("Max", new Date("APRIL 19 1999"));
        map.put("Igor", new Date("AUGUST 25 1977"));

        return map;
    }

    static void removeAllSummerBirthdayPeople(Map<String, Date> map){

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){

           int month = iterator.next().getValue().getMonth() + 1;
            if (month >= 6 && month <=8) iterator.remove();

        }

    }

}