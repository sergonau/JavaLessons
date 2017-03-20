package Lesson020_Thread.Test02;

import java.util.ArrayList;
import java.util.List;

/* Horse Racing

1. Создать класс Horse, унаследовать его от Thread
1.1 В классе Horse создать приватную переменную isFinished, подумать какой тип у этой переменной
1.2 Создать геттер для переменной isFinished
1.3 Создать конструктор с параметром String name, передавать этот параметр в конструктор суперкласса
1.4 Переопределить метод run(), добавить в него следующий код:
- запустить цикл на 1000 иттераций, когда будет достигнута последняя иттерация выводить на экран строку:
getName() + " has finished the race!"
- присвоить параметру isFinished значение true, у объекта, который запустил нить;
2. В выполняющем класе создать переменную int countHorses = 10;
3. В выполняющем классе создать метод List<Horse> prepareHorsesAndStart(), который должен:
- создавать список из лошадей, с размером, который указан в переменной countHorses
- добавлять в список объекты лошадей, в качестве имени отправлять "Horse_" + number, где number строка от 01 до countHorses + 1
- после того, как список заполнен, запускать нить для каждого объекта в списке
- возвращать список лошадей
4. Создать метод calculateHorsesFinished. Он должен:
- посчитать количество финишировавших лошадей и возвратить его. Используй метод isFinished().
- если лошадь еще не пришла к финишу (!isFinished()), то:
4.1. Вывести в консоль "Waiting for " + horse.getName().
4.2. Подождать, пока она завершит гонку. Подумай, какой метод нужно использовать для этого.

*/
public class Test02 {

    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses = prepareHorsesAndStart();
       while (calculateHorsesFinished(horses) != countHorses ){}

    }

    static int countHorses = 10;

    static List<Horse> prepareHorsesAndStart(){

        List<Horse> list = new ArrayList<>();

        for (int i = 1; i < countHorses+1; i++) {
            if(i<10){
            list.add(new Horse("Horse_" + "0" + i));
            } else list.add(new Horse("Horse_" + i));
        }

        for (int i = 0; i < countHorses; i++) {
            list.get(i).start();
        }
        return list;
    }

    static int calculateHorsesFinished(List<Horse> list) throws InterruptedException {
        int n = 0;

        for (int i = 0; i < countHorses; i++) {
            if (list.get(i).isFinished()) {
                n++;
            } else {
                System.out.println("Waiting for " + list.get(i).getName());
                list.get(i).join();
            }
        }
        return n;
    }
}
