package Lesson017.Test03;

/**
 * Created by admin on 24.12.16.
 */
public class Sun implements Planet{

    private static Sun sun = null;
    private Sun() {
    }

    public static Sun getInstance(){
        if(sun == null){
            sun = new Sun();
        } return sun;
    }


}
