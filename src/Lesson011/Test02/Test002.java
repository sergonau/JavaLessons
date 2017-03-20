package Lesson011.Test02;

import java.util.ArrayList;
import java.util.List;

/*

1. Создать классы Person, RepkaStory и интерфейс RepkaItem
2. Создать метод String getNamePadezh();
3. Реализовать интерфейс RepkaItem в классе Person.
5. В классе Person создать переменные  String name, String namePadezh;
6. В классе Person реализовать метод pull(Person person), который выводит фразу типа '<name> за <person>'. Пример:
Бабка за Дедку
Дедка за Репку
7. Создать метод tell в классе RepkaStory.
8. С помощью цикла реализовать метод tell, который должен реализовать логику вывода на экран с помощью метода pull(Person person)
9. Выполнить метод main
*/
public class Test002 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Репка", "Репку"));
        list.add(new Person("Дедка", "Дедку"));
        list.add(new Person("Бабка", "Бабку"));
        list.add(new Person("Внучка", "Внучку"));
        RepkaStory.tell(list);
    }
}
