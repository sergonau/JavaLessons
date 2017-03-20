package Lesson012.Test04;

/**
 * Created by admin on 19.11.16.
 */
public class Cat {

    private String name;

    public String getName() {
        return name;
    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Я уличный кот " + getName();
    }
}
