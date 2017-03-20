package com.company.Lesson01;

/**
 * Created by admin on 01.10.16.
 */
public class Test01 {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Tom", 4, 77);
        Cat cat2 = new Cat("Joseph", 5, 95);

        System.out.println(cat1.name + " " + cat1.age + " " + cat1.power);
        System.out.println(cat2);


        if(cat1.fight(cat2)){
            System.out.println("Winner is " + cat1.name);
        } else System.out.println("Winner is " + cat2.name);


    }

    static class Cat {

        String name;
        int age;
        int power;


        public Cat(String name, int age, int power) {
            this.name = name;
            this.age = age;
            this.power = power;
        }

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", power=" + power +
                    '}';
        }

        boolean fight (Cat anotherCat){

            return this.power > anotherCat.power;

        }

    }

}