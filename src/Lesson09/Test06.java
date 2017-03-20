package Lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Конвертер дат

Ввести с клавиатуры дату в формате «08/18/2016»
Вывести на экран эту дату в виде «AUG 18, 2016».
Воспользоваться объектом Date и SimpleDateFormat.
*/
public class Test06 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter date ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Date date = new Date(reader.readLine());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM dd, yy");
        System.out.println(simpleDateFormat.format(date).toUpperCase());
    }

    private static DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(){
        @Override
        public String[] getMonths() {
            return new String[]{"","",""};
        }
    };
}
