package Lesson014.Test04;

/* Computer

1. Создай интерфейс CompItem.
2. Добавь в него метод String getName().
3. Создай классы Keyboard, Mouse, Monitor, которые реализуют интерфейс CompItem.
4. Метод getName() должен возвращать имя класса, например, для класса Keyboard будет "Keyboard".
5. Создай класс Computer.
6. В класс Computer добавь приватное поле типа Keyboard.
7. В класс Computer добавь приватное поле типа Mouse.
8. В класс Computer добавь приватное поле типа Monitor.
9. Создай конструктор в классе Computer используя комбинацию клавиш Alt+Insert внутри класса
(команда Constructor).
10 Внутри конструктора инициализируйте все три поля (переменных) класса
11. Создай геттеры для полей класса Computer (в классе используй комбинацию клавиш Alt+Insert
и выбери команду Getter).
12. В Solution создать метод boolean isWork(CompItem item), который выводит на экран getName()
название устройства, которое приходит в параметрах.
    И возвращает true, если getName() не равен null и строка, которую возвращает getName больше
    4 символов.
13. В методе main создать объект Computer и проверить наличие всех частей.

*/
public class Solution {

   static boolean isWork(CompItem item) {
        System.out.println(item.getName());
        return item.getName() != null && item.getName().length() > 4;
    }

    public static void main(String[] args) {

        Computer comp = new Computer();

        if (isWork(comp.getKeyboard()) &&
                isWork(comp.getMonitor()) &&
                isWork(comp.getMouse())){
            System.out.println("WORK!]");
        }

    }

}
