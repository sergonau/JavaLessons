package Lesson021_Recll;

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
public class Test02 {
    public static void main(String[] args) {

    }

    static String[] firstArrayWithStrings(String s) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        while (true) {
            String str = reader.readLine();
            if (str.isEmpty()){
                break;
            }
            list.add(str);
        }
        String[] strings = list.toArray(new String[list.size()]);
        return strings;
    }
    
    static void sort(String[] strings){
        // TODO: 14.01.17  
    }
    
    static boolean isGreaterThen(String a, String b){
        return a.compareTo(b) > 0;
    }
    
    static boolean isNumber(String str){
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
    
//    static String[] arrayWithOnlyDigits(String[] strings){
//        
//        String[] onlyStr;
//        int[]  
//        
//        for (int i = 0; i < strings.length; i++) {
//            for (int j = 0; j < strings[i].length(); j++) {
//                if(isNumber(strings[i])){
//                    strings[i]
//                }
//                
//            }
//        }
//    }
//    
//    public static boolean isNumber(String s){
//        if(s.length() == 0) return false;
//
//        char[] chr = s.toCharArray();
//        for (int i = 0; i < chr.length; i++) {
//            char c = chr[i];
//            if((i != 0 && c == '-') || (!Character.isDigit(c) && c != '-')){
//                return false;
//            }
//        }
//        return true;
//    }
}
