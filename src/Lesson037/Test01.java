package Lesson037;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.

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
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test01 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        fillMap(map);
        System.out.println(removeDublicates(map));


    }

//    static removeDublicates

    static void fillMap(Map map){
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
    }

    static Map removeDublicates(Map<String, String> map){

        Map<String, String> map1 = new HashMap<>();

        for (Map.Entry<String, String> s : map.entrySet()) {
            int coount = 0;
            for (String s1 : map.values()) {
                if(s1.equals(s.getValue())){
                    coount++;
                }
            }

            if (coount==1) {
                map1.put(s.getKey(), s.getValue());
            }
        }

        return map1;
    }

}
