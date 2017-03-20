package Lesson018.Test01;

/* Файл в статическом блоке

1. Инициализируйте константу Constants.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
2. В статическом блоке считайте из файла с именем Constants.FILE_NAME все строки и добавьте их по-отдельности в List lines.
3. Отловите все исключения, которые могут возникнуть в программе.
3. Закройте поток ввода методом close().
4. В выполняющем методе выводите на экран все значения списка lines.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test01 {
    static List<String> lines = new ArrayList<>();

    static {
        while (true) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                Constants.FILE_NAME = reader.readLine();
                String s;
                BufferedReader readerFile = new BufferedReader(new FileReader(Constants.FILE_NAME));
                while ((s = readerFile.readLine()) != null) {
                    lines.add(s);
                }
                readerFile.close();
                break;
            } catch (FileNotFoundException e) {
                System.err.println("Error! Please enter rout to Your file: ");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        lines.forEach(System.out::println);
    }
}