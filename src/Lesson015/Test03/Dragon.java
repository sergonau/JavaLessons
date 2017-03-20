package Lesson015.Test03;

/**
 * Created by admin on 10.12.16.
 */
public class Dragon extends BigAnimal {

    @Override
    protected String getSize() {
        return "Дракон большой, " + super.getSize();
    }
}
