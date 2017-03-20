package Lesson09;

import javax.naming.NameNotFoundException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Метод в try..catch

Вводить с клавиатуры числа. Код по чтению чисел с клавиатуры вынести в отдельный метод readData.
Обернуть все тело (весь код внутри readData, кроме объявления списка, где будут храниться числа и BufferedReader-а)
этого метода в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа,
то метод должен перехватить исключение и вывести на экран все введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.
*/
public class Test03 {
    public static void main(String[] args) {

        readData();

        System.out.println("OKOK");
    }

    static void readData(){
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter text");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       try {


           while (true) {

               String a = reader.readLine();
               if(a.isEmpty()) break;
                list.add(Integer.parseInt(a));

           }
       }
       catch (NumberFormatException e){
           System.out.println(list);
           System.out.println("Ok");
       }
       catch (Exception e){
           System.out.println(list);
       }



    }
}
