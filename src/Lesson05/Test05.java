package Lesson05;

/* Коллекция HashMap из котов

Есть класс Cat с полем имя (name, String).
Создать коллекцию HashMap<String, Cat>.
Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
Вывести результат на экран, каждый элемент с новой строки.
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test05 {

    public static void main(String[] args) {

        String[] cats = new String[]{
                "васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        Map<String, Cat> map = addCatsToMap(cats);

        Iterator<Map.Entry<String, Cat>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Cat> pair = iterator.next();
            String key = pair.getKey();
            Cat value = pair.getValue();
            System.out.println(key + " - " + value);

        }
    }

    static Map addCatsToMap(String[] cat){

        Map<String, Cat> catmap = new HashMap<>();

        for (int i = 0; i < cat.length; i++) {

            catmap.put(cat[i], new Cat(cat[i]));
        } return catmap;
    }



    static class Cat {

        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }

    }

}
