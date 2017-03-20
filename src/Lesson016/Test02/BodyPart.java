package Lesson016.Test02;

/**
 * Created by admin on 17.12.16.
 */
public class BodyPart implements Alive {

    String name;

    @Override
    public Object containsBones() {
        return "Yes";
    }

    public BodyPart(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return containsBones().equals("Yes") ? name + " содержит кости" : name + " не содержит кости";
    }
}