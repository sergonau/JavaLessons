package Lesson015.Test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by admin on 10.12.16.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("Enter key");
            String s = reader.readLine();
            if (s.equals("cartoon") || s.equals("thriller") || s.equals("soapOpera")) {
                Movie movie = MovieFactory.getMovie(s);
                System.out.println(movie.getClass().getSimpleName() + movie.getGenre());
            } else break;

        }

    }

}
