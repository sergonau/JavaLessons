package Lesson015.Test03;

/**
 * Created by admin on 10.12.16.
 */
public class Goose extends SmallAnimal {
    @Override
    public String getSize() {
        return "Гусь маленький, " + super.getSize();
    }


}
