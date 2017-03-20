package Lesson10;

/*
1. Создать класс EnglishTranslator, который наследуется от абстрактного класса Translator.
   В классе Translator создать абстрактный метод getLanguage() и не абстрактный метод
    public String translate(), который возвращает строку "Я переводчик с " + getLanguage();
2. Реализовать все абстрактные методы.
3. Подумай, что должен возвращать метод getLanguage.
4. Программа должна выводить на экран "Я переводчик с английского".
*/
public class Test08 {

    public static void main(String[] args) {

        Translator eng = new EnglishTranslator();
        System.out.println(eng);

        Translator de = new GermanyTranslator();
        System.out.println(de);

    }

    public static abstract class Translator{

        abstract String getLanguage();

        public String translate() {
            return "Я переводчик с " + getLanguage();
        }

        @Override
        public String toString() {
            return translate();
        }
    }

    public static class EnglishTranslator extends Translator{


        @Override
        String getLanguage() {
            return "английского";
        }


    }

    public static class GermanyTranslator extends Translator{


        @Override
        String getLanguage() {
            return "французского";
        }

    }

}
