package Lesson012;

import java.io.*;

/* Запись в файл

1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/
public class Test003 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        OutputStream outputStream = new FileOutputStream(reader.readLine());

        while (true){

            String s = reader.readLine();

            if (s.equals("exit")) {
                outputStream.write(s.getBytes());
                break;
            } else outputStream.write((s + "\n").getBytes());

        }

    }

}
