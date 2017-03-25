package Lesson035;

import java.util.Arrays;

public class Test02 {

    static String reverseSentence(String sentence) {
        String[] stringArray = sentence.split(" ");
        String result = "";

        for (int i = stringArray.length-1; i >= 0 ; i--) {

            result += stringArray[i] + " ";

        }

        return result.trim();

    }

    public static void main(String[] args) {
        System.out.println(reverseSentence("Reverse the order of words in a given string sentence"));
        
        
    }
}
