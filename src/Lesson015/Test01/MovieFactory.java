package Lesson015.Test01;

/**
 * Created by admin on 10.12.16.
 */
public class MovieFactory {

    public static Movie getMovie(String key){
        Movie movie = null;

        if (key.equals("cartoon")){
            movie = new Cartoon();
        } else if (key.equals("thriller")){
            movie = new Thriller();
        } else if (key.equals("soapOpera")){
            movie = new SoapOpera();
        }

        return movie;

    }
}
