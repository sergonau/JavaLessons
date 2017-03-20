package com.company.Lesson04;

/*
Задача:  Программа вводит с клавиатуры данные про котов и выводит их на экран.
Ввод продолжается, пока переменная с именем не пуста. Пример:
Cat name is Barsik, age is 6, weight is 5, tail = 22
Cat name is Murka, age is 8, weight is 7, tail = 20
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test06 {

    public static void main(String[] args) throws IOException {

        List<Cat> cat = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){

            System.out.println("Enter name");
            String name = reader.readLine();
            if (name.isEmpty()) break;

            System.out.println("Enter age");
            int age = Integer.parseInt(reader.readLine());

            System.out.println("Enter weight");
            int weight = Integer.parseInt(reader.readLine());

            System.out.println("Enter tail");
            int tail = Integer.parseInt(reader.readLine());

            Cat cat1 = new Cat(name, age, weight, tail);
            cat.add(cat1);
        }

        System.out.println(cat);

    }

    static class Cat {

        String name;
        int age;
        int weight;
        int tail;

        public Cat(String name, int age, int weight, int tail) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tail = tail;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", weight=" + weight +
                    ", tail=" + tail +
                    '}';
        }
    }
}
