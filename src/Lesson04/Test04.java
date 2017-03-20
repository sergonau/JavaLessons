package com.company.Lesson04;

/* Буква «р» и буква «л»

1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:

лира
лоза
Выходные данные:
лира
лоза
лоза
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test04 {

    public static void main(String[] args) throws IOException {

        List<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter word");
            strings.add(reader.readLine());

        }
        strings = fix(strings);

        for (String s : strings) {
            System.out.println(s);
        }


    }

    static List<String> fix(List<String> fixingList) {

        List<String> result = new ArrayList<>();

        for (String s : fixingList) {
            if (s.contains("р") && s.contains("л")) result.add(s);
            else if (s.contains("р")) {}
            else if (s.contains("л")) {
                result.add(s);
                result.add(s);
            } else result.add(s);
        }
            return result;
    }

}
