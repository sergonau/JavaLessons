package Lesson07;

import java.util.ArrayList;
import java.util.List;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).

Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/
public class Test01 {

    public static void main(String[] args) {

        Human gmother = new Human("Лариса", false, 66, null, null);
        Human gmother1 = new Human("Ия", false, 86, null, null);
        Human gfother = new Human("Олег", true, 76, null, null);
        Human gfother1 = new Human("Cерг", true, 56, null, null);
        Human father = new Human("Игорь", true, 40, gfother1, gmother1);
        Human mother = new Human("Оля", false, 36, gfother, gmother);
        Human child = new Human("Ира", false, 26, father, mother);
        Human child1 = new Human("Лена", false, 28, father, mother);
        Human child2 = new Human("Катя", false, 22, father, mother);

        List<Human> family = new ArrayList<>();

        family.add(gmother);
        family.add(gmother1);
        family.add(gfother);
        family.add(gfother1);
        family.add(father);
        family.add(mother);
        family.add(child);
        family.add(child1);
        family.add(child2);

        family.forEach(System.out::println);

    }

    public static class Human {

        String name;
        boolean sex;
        int age;
        Human father;
        Human mather;

        public Human(String name, boolean sex, int age, Human father, Human mather) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mather = mather;
        }

        @Override
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if(this.father != null) text += ", отец: " + this.father.name;
            if(this.mather != null) text += ", отец: " + this.mather.name;

            return text;
        }
    }

}