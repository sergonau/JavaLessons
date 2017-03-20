package Lesson015.Test01;

/* MovieFactory

1. Добавить абстрактный класс Movie с абстрактным методом String getGenre().
2. Добавить классы SoapOpera, Cartoon, Thriller и унаследовать их от Movie и реализовать метод String getGenre():
- в классе SoapOpera метод getGenre() должен вернуть строку "Genre is drama";
- в классе Cartoon метод getGenre() должен вернуть строку "Genre is comedy";
- в классе Thriller метод getGenre() должен вернуть строку "Genre is horror";
3. Создать класс MovieFactory с методом getMovie(String key)
4. Добавить в MovieFactory.getMovie получение объекта Cartoon для ключа "cartoon".
5. Добавить в MovieFactory.getMovie получение объекта SoapOpera для ключа "soapOpera".
6. Добавить в MovieFactory.getMovie получение объекта Thriller для ключа "thriller".

7. Считать с консоли несколько ключей (строк).
7.1. Ввод заканчивается, как только вводится строка не совпадающая с одной из: "cartoon", "thriller", "soapOpera".
8. В классе Main создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1. Получить объект используя MovieFactory.getMovie и присвоить его переменной movie.
8.2. Вывести на экран movie.getClass().getSimpleName() + movie.getGenre();.
*/
public class Solution01 {
}
