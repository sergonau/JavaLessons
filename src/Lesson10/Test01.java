package Lesson10;

/* Инкапсуляция для классов Cat и Dog

Скрыть все внутренние переменные класса Cat и Dog.

Также скрыть все методы, кроме тех, с помощью которых эти классы взаимодействуют друг с другом.

*/

public class Test01 {


    public static void main(String[] args) {

        Cat cat = new Cat("Barsik", 10);
        Dog dog = new Dog("Naida", 15);

        if (cat.isCatFirst(dog)) System.out.println("Cat win!");
        else System.out.println("Dog win");

    }

    static class Cat{

        private String name;
        private int speed;

        public Cat(String name, int speed) {
            this.name = name;
            this.speed = speed;
        }

        public String getName() {
            return name;
        }

        public int getSpeed() {
            return speed;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public boolean isCatFirst(Dog dog){

            return dog.getSpeed()<this.speed;
        }
    }
    static class Dog{

        private String name;
        private int speed;

        public Dog(String name, int speed) {
            this.name = name;
            this.speed = speed;
        }

        public String getName() {
            return name;
        }

        public int getSpeed() {
            return speed;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public boolean isDogFirst(Cat cat){
            return cat.getSpeed()<this.speed;
        }

    }

}