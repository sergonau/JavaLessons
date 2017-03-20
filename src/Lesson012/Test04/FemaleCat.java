package Lesson012.Test04;

/**
 * Created by admin on 19.11.16.
 */
public class FemaleCat extends Cat {

    public FemaleCat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Я - милая кошечка по имени " + getName();
    }


}
