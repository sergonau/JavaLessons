package Lesson038;

/*
Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Если файла (который нужно копировать) с указанным именем не существует, то
программа должна вывести надпись «Файл не существует.» и еще раз прочитать имя файла с консоли, а уже потом считывать файл для записи.
*/

import java.io.*;
import java.util.stream.Stream;

public class Test01 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream stream;

        while (true) {


            try {
                System.out.println("Enter first file name");
                stream = new FileInputStream(reader.readLine());
                break;

            } catch (Exception e) {
                System.out.println("Файл не существует");
            }

        }
        System.out.println("Enter second file name");
        String secondFileName = reader.readLine();
        OutputStream stream1 = new FileOutputStream(secondFileName);

        while (stream.available()>0){
            byte temp = (byte) stream.read();
            stream1.write(temp);
        }
    }

}
