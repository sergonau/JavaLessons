package Lesson011.Test01;

/* Погода

1. Создать интерфейс Weather с методом getWeatherType().
2. Создать интерфейс WeatherType с перечнем погодных условий.
3. В классе Today реализовать интерфейс Weather.
4. В классе Today создать переменную String type;
5. Подумай, как связан параметр String type с методом getWeatherType().
6. Переопределить метод toString() в классе Today, что бы он выводил на экран надпись %s for today, где %s - тип погоды
*/

public class Test001 {

    public static void main(String[] args) {
        System.out.println(new Today(WeatherType.FROZEN));
    }

    public static class Today implements Weather {

        private String type;

        public Today(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return String.format("%s for today ", getWeatherType());
        }

        @Override
        public String getWeatherType() {
            return type;
        }
    }
}