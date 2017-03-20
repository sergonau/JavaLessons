package Lesson10;

public class Test06 {

    public static void main(String[] args) {
        print(new Beer());
        print(new Cola());
    }

    public interface Drink{

        boolean isAlcoholic();

    }

    public static class Cola implements Drink{

        @Override
        public boolean isAlcoholic() {
            return false;
        }
    }

    public static class Beer implements Drink{
        @Override
        public boolean isAlcoholic() {
            return true;
        }
    }

    public static void print(Drink drink){

        if (drink.isAlcoholic()) System.out.println(drink.getClass().getSimpleName() + " — напиток алкогольный");
        else System.out.println(drink.getClass().getSimpleName() + " — напиток безалкогольный");

    }

}