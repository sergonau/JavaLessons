package Lesson10;

/*
Создать интерфейс Drink и класс AlcoholicBeer

В интерфейсе Drink создай метод isAlcoholic();
Добавь к классу AlcoholicBeer интерфейс Drink и реализуй все нереализованные методы.
Метод  toString в классе AlcoholicBeer должен выводить на экран "Напиток алкогольный", если isAlcoholic() возвращает true,
иначе вывести на экран надпись "Напиток безалкогольный".
*/
public class Test05 {

    public static void main(String[] args) {

        Drink pivo = new AlcoholicBeer();

        System.out.println(pivo);
    }

    public interface Drink{

        boolean isAlcoholic();

    }

    public static class AlcoholicBeer implements Drink{

        @Override
        public boolean isAlcoholic() {
            return true;
        }

        @Override
        public String toString() {
            if (isAlcoholic())
            return "Напиток алкогольный";
            else return "Напиток безалкогольный";
        }
    }


}
