package Lesson016.Test02;

/**
 * Created by admin on 17.12.16.
 */
public class Finger extends BodyPart {
    boolean isFoot;

    @Override
    public Object containsBones() {
        return super.containsBones().equals("Yes") && !isFoot ? "Yes" : "No";
    }

    public Finger(String name, boolean isFoot) {
        super(name);
        this.isFoot = isFoot;
    }
}
