package Lesson08;

import java.util.Date;

/* Работа с датой

1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true,
если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/
public class Test02 {

    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 11 2016"));
    }

    static boolean isDateOdd(String date){

//        Date date1 = new Date(date);
//        if(date1.getDate()%2 != 0) return true;
//        else return false;

        return new Date(date).getDate() % 2 != 0;
    }

}
