package Lesson012;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader readerFile = new BufferedReader(new FileReader(fileName));
        List<Integer> list = new ArrayList<>();

        String s = null;

        while((s = readerFile.readLine()) != null){
            int number = Integer.parseInt(s);
            if(number % 2 == 0){
                list.add(number);
            }
        }

        Collections.sort(list);

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
