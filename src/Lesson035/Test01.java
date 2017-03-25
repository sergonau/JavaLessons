package Lesson035;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

    String amendTheSentence(String s) {

        String result = "" + 5;

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)){

               c = Character.toLowerCase(c);
                result += " " +  c;

            } else result += c;
        }
        return result.trim();

    }

}
