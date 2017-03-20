package Lesson09;

import java.io.*;

/*
Задача: Программа вводит два имени файла. И копирует первый файл на место заданное вторым именем.

/Users/admin/CoursesVOROV/src/Lesson09/1.txt

*/
public class Test04 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter file name 1");
        String file1 = reader.readLine();
        System.out.println("Enter file name 2");
        String file2 = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(file1);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);

        int count = 0;
        while (fileInputStream.available()>0){
            int data = fileInputStream.read();
            fileOutputStream.write(data);
            count++;
        }
        System.out.println("Copies byte " + count);
    }
}