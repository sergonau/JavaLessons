package Lesson017.Test03;

/**
 * Created by admin on 24.12.16.
 */
public class Moon implements Planet {

    private static Moon moon = null;
    private Moon() {
    }

    public static Moon getINSTANCE(){
        if(moon == null){
            moon = new Moon();
        }
        return moon;
    }

}
