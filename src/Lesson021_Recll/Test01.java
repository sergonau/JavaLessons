package Lesson021_Recll;

/* Удалить людей, имеющих одинаковые имена

Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test01 {
    public static void main(String[] args) {

        fillNameIntoMap();

        Map<String, String> map = new HashMap<>(fillNameIntoMap());
        map = deleteDublicatesFromMap(map);

        System.out.println(map);

    }

    static Map fillNameIntoMap() {

        Map<String, String> map = new HashMap<>();

        System.out.println();

        map.put("Rooney", "Leo");
        map.put("Lloris", "Hugo");
        map.put("Messi", "Leo");
        map.put("Ronaldo", "Cristiano");
        map.put("Maldini", "Paolo");
        map.put("Indzaghi", "Pipo");
        map.put("Del Piero", "Alesandro");
        map.put("Balotelli", "Mario");
        map.put("Gotze", "Mario");
        map.put("Gomez", "Mario");

        return map;
    }

    static Map deleteDublicatesFromMap(Map<String, String> map){
//        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        Map<String, String> map1 = new HashMap<>();

        for (Map.Entry<String, String> s : map.entrySet()) {
            int count = 0;
            for (String s1 : map.values()) {
                if (s.getValue().equals(s1)){
                   count++;
                }

            }

            if (count == 1){
                map1.put(s.getKey(), s.getValue());
            }
        }
        return map1;
    }

}
