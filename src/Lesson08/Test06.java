package Lesson08;

import java.util.ArrayList;
import java.util.List;

/* Вся семья в сборе

1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/
public class Test06 {

    public static void main(String[] args) {

    }

    static class Human {

        String name;
        boolean sex;
        int age;
        List<Human> child = new ArrayList<>();

        public Human(String name, boolean sex, int age, List<Human> child) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.child = child;
        }

        @Override
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            int a = child.size();
            if(a>0){
                text += ", дети: " + child.get(0).name;
                for (int i = 1; i < a; i++) {
                    Human children = this.child.get(i);
                    text += ", " + children.name;
                }
            }

            return text;
        }
    }

}