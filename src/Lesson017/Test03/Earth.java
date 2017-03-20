package Lesson017.Test03;

/**
 * Created by admin on 24.12.16.
 */
public class Earth implements Planet {

    private static Earth earth = null;
    private Earth() {
    }

    public static Earth getINSTANCE(){
        if(earth == null){
            earth = new Earth();
        }
        return earth;
    }



}
