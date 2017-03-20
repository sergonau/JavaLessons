package Lesson014.Test01;

/* Singleton

Класс является синглтоном (реализует паттерн(шаблон) Singleton), если позволяет
создать всего один объект своего типа.

Реализовать Singleton pattern:
1. Создай класс Singleton в отдельном файле.
2. Добавь в него статический метод getInstance().
3. Метод getInstance должен возвращать один и тот же объект класса Singleton при любом вызове
метода getInstance.
4. Подумай, каким образом можно запретить создание других объектов этого класса.
5. Сделай все конструкторы в классе Singleton приватными (private).

6. В итоге должна быть возможность создать объект (экземпляр класса) ТОЛЬКО используя метод getInstance.
*/

public class Test01 {

    static Test01 test01 = null;

    private Test01() {}

    static Test01 getInstance() {
        if (test01 == null){
            test01 = new Test01();
        }

        return test01;
    }

    public static void main(String[] args) {
        getInstance();
        getInstance();
        getInstance();

    }
}
