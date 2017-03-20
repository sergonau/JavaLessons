package com.company.Lesson01;

public class Test02 {

    public static void main(String[] args) {

        Women women1 = new Women("Sara", 44);
        Cat cat1 = new Cat("Tomas", 3, women1);
        Dog dog1 = new Dog("Bill", 6, women1);

        System.out.println("Cat: " + cat1.name + " " + cat1.age + " Owner: " + cat1.owner.name);
        System.out.println("Dog: " + dog1.name + " " + dog1.age + " Owner: " + dog1.owner.name);


    }

    static class Women {

        String name;
        int age;

        public Women(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    static class Cat {

        String name;
        int age;
        Women owner;

        public Cat(String name, int age, Women owner) {
            this.name = name;
            this.age = age;
            this.owner = owner;
        }
    }

    static class Dog {

        String name;
        int age;
        Women owner;

        public Dog(String name, int age, Women owner) {
            this.name = name;
            this.age = age;
            this.owner = owner;
        }
    }

}
