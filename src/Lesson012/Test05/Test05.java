package Lesson012.Test05;

/* Куриная фабрика
Написать Фабрику(Factory) по производству кур(Hen)

1. Создать класс Hen
1.1. Сделать его абстрактным
1.2. Добавить в класс абстрактный метод  int getCountOfEggsPerMonth()
1.3. Добавить в класс метод String getDescription(), который возвращает строку "Я курица."

2. Создать класс RussianHen, который наследуется от Hen
3. Создать класс UkrainianHen, который наследуется от Hen
4. Создать класс MoldovanHen, который наследуется от Hen
5. Создать класс BelarusianHen, который наследуется от Hen

6. В каждом из четырех последних классов написать свою реализацию метода getCountOfEggsPerMonth.
Методы должны возвращать количество яиц в месяц от данного типа куриц.

7. В каждом из четырех последних классов написать свою реализацию метода getDescription.
Методы должны возвращать строку вида:
<getDescription() родительского класса>  + <" Моя страна - Sssss. Я несу N яиц в месяц.">
где Sssss - название страны
где N - количество яиц в месяц

8. В выполняющем классе создать класс HenFactory и реализовать в нём метод getHen,
 который возвращает соответствующую стране породу кур.
 Список стран вынести в отдельный интерфейс Country.
9. Все созданные вами классы должны быть в отдельных файлах
*/

public class Test05 {

    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.UA);
        hen.getCountOfEggsPerMonth();
        System.out.println(hen.getDescription());
    }

    static class HenFactory{

        static Hen getHen(String country){

            Hen hen = null;

            if(country.equals(Country.BE)){
                hen = new BelarusianHen();
            } else if (country.equals(Country.UA)){
                hen = new UkrainianHen();
            } else if (country.equals(Country.MO)) {
                hen = new MoldovanHen();
            } else if (country.equals(Country.RU)){
                hen = new RussianHen();
            }
            return hen;
        }

    }
}
