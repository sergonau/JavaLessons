package Lesson011.Test03;

/**
 * Created by admin on 12.11.16.
 */
public final class BodyPart {
    private String bodyString;

    final static BodyPart LEG = new BodyPart("нога");
    final static BodyPart ARM = new BodyPart("рука");
    final static BodyPart BODY = new BodyPart("грудь");
    final static BodyPart HEAD = new BodyPart("голова");

    public BodyPart(String bodyString) {
        this.bodyString = bodyString;
    }

    @Override
    public String toString() {
        return bodyString;
    }
}
