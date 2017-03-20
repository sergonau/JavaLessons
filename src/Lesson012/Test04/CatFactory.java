package Lesson012.Test04;

/**
 * Created by admin on 19.11.16.
 */
public class CatFactory {

    static Cat getCatByKey(String name, String type) {
        Cat cat = null;
        if (type.equals("cur")) {
            cat = new Cat(name);
        } else if (type.equals("male")) {
            cat = new MaleCat(name);
        } else if (type.equals("female")) {
            cat = new FemaleCat(name);
        }
        return cat;
    }
}