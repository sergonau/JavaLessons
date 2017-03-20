package Lesson31.Test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Read3Strings extends Thread {

    String str1;
    String str2;
    String str;

    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            str = reader.readLine();
            str1 = reader.readLine();
            str2 = reader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return str + " " + str1 + " " + str2;
    }
}
