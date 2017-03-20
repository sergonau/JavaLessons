package Lesson012.Test04;

/**
 * Created by admin on 19.11.16.
 */
public class MaleCat extends Cat {

    public MaleCat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Я - солидный кошак по имени " + getName();
    }

}
