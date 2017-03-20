package Lesson028.Test001;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReaderThread extends Thread {

    public ReaderThread() {
        start();
    }

    List<String> list = new ArrayList<>();

    @Override
    public void run() {

        while (!isInterrupted()){
            try {
                list.add(Test01.reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }

            Test01.countReadStrings++;
        }
    }

    @Override
    public String toString() {
        return "ReaderThread{" +
                "list=" + list +
                '}';
    }
}
