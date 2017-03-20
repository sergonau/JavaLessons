package Lesson09;

/*
 Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.

Если файла (который нужно копировать) с указанным именем не существует, то
программа должна вывести надпись «Файл не существует.» и еще раз прочитать имя файла с консоли, а уже потом считывать файл для записи.
*/

import java.io.*;

public class Test05 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = null;

        while (true) {
            try {
                System.out.println("Enter text 1");
                String a = reader.readLine();
                fileInputStream = new FileInputStream(a);
                break;
            } catch (Exception e) {
                System.out.println("Файл не существует.");
            }
        }
        System.out.println("Enter text 2");
        String b = reader.readLine();
        FileOutputStream fileOutputStream = new FileOutputStream(b);

        int count = 0;
        while (fileInputStream.available() > 0) {

            int data = fileInputStream.read();
            fileOutputStream.write(data);
            count++;
        }

    }
}
