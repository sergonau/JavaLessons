package Lesson10;

import java.util.Date;
import java.util.Objects;

/* Или «Корова», или «Кит», или «Собака», или «Неизвестное животное»

Написать метод, который определяет, объект какого класса ему передали,
и возвращает результат – одно значение из: «Корова», «Кит», «Собака», «Неизвестное животное».
*/
public class Test04 {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static class Cow{

    }
    public static class Dog{

    }
    public static class Whale{

    }
    public static class Pig{

    }

    public static String getObjectType(Object obj){
        if(obj instanceof Cow) return "Корова";
        else if (obj instanceof Dog) return "Собака";
        else if (obj instanceof Whale) return "Кит";
        else return "Неизвестное животное";

    }

}
