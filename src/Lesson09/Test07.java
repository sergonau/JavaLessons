package Lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Задача по алгоритмам

Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:

Вишня
1
Боб
3
Яблоко
2
0
Арбуз

Пример вывода:

Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/
public class Test07 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        while(true){
            String s = reader.readLine();
            if(s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String s : array) {
            System.out.println(s);
        }
    }

    public static void sort(String[] arr){



    }

    public static boolean isGreaterThen(String a, String b){



        return a.compareTo(b)>0;
    }

    public static boolean isNumber(String str){

        try
        {
            int d = Integer.parseInt(str);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }

}
