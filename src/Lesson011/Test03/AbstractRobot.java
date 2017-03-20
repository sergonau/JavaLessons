package Lesson011.Test03;

/**
 * Created by admin on 12.11.16.
 */
public abstract class AbstractRobot implements Defensable, Attackable {

    private String name;
    private static int hitCount;

    public AbstractRobot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public BodyPart attack() {

        hitCount = (int) (Math.random()*3 + 1);
        BodyPart attacketBodyPart = null;

        if (hitCount == 1){

            attacketBodyPart = BodyPart.BODY;

        } else if (hitCount == 2){

            attacketBodyPart = BodyPart.ARM;

        } else if (hitCount == 3){

            attacketBodyPart = BodyPart.HEAD;

        } else if (hitCount == 4){

            attacketBodyPart = BodyPart.LEG;

        }

        return attacketBodyPart;
    }

    @Override
    public BodyPart defense() {
        hitCount = (int) (Math.random()*3 + 1);
        BodyPart defencedBodyPart = null;

        if (hitCount == 1){

            defencedBodyPart = BodyPart.BODY;

        } else if (hitCount == 2){

            defencedBodyPart = BodyPart.ARM;

        } else if (hitCount == 3){

            defencedBodyPart = BodyPart.HEAD;

        } else if (hitCount == 4){

            defencedBodyPart = BodyPart.LEG;

        }

        return defencedBodyPart;
    }
}
