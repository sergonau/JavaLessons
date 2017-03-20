package Lesson033;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01 {

    public static void main(String[] args) {

    }

    String stringReformatting(String s, int k) {

        String str = "";

        List<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == '-'){
                list.remove(i);
            }
        }

        for (int i = list.size()-1-k; i >=0 ; i-=k) {

            list.add(i, '-');
        }

        for (int i = 0; i < list.size(); i++) {

            str+=list.get(i);

        }

        return str;
    }

    // TODO: 18.03.17 изучить StringBuilder

    }