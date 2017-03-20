package Lesson10;

/*
Создать 2 класса Сow и Whale.

В классе Cow создать метод getName(), который возвращает строку "Я - корова".
Унаследовать Whale от Cow
Переопределить метод getName в классе Whale(Кит), чтобы программа выдавала:
Я не корова, Я - кит.
*/

public class Test02 {

    public static void main(String[] args) {
        Cow cow = new Whale();
        System.out.println(cow.getName());
    }

    public static class Cow{

        public String getName() {
            return "Я - корова";
        }
    }

    public static class Whale extends Cow{

        @Override
        public String getName() {
            return "Я не корова, Я - кит!";
        }
    }

}
