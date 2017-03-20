package Lesson011.Test02;

/*
1. Создать классы Person, RepkaStory и интерфейс RepkaItem
2. В интерфейсе создать метод String getNamePadezh();
3. Реализовать интерфейс RepkaItem в классе Person.
5. В классе Person создать переменные  String name, String namePadezh;
6. В классе Person реализовать метод pull(Person person), который выводит фразу типа '<name> за <person>'. Пример:
Бабка за Дедку
Дедка за Репку
7. Создать метод tell в классе RepkaStory.
8. С помощью цикла реализовать метод tell, который должен реализовать логику вывода на экран с помощью метода pull(Person person)
9. Выполнить метод main
*/

import java.util.List;

public class RepkaStory {

    static void tell(List<Person> list){
        Person name;
        Person namePadezh;

        for (int i = list.size() - 1; i > 0; i--) {
            name = list.get(i);
            namePadezh = list.get(i-1);
            name.pull(namePadezh);
        }

    }

}
