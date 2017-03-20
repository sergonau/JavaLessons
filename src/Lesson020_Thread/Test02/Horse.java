package Lesson020_Thread.Test02;

/**
 * Created by admin on 07.01.17.
 */
public class Horse extends Thread {

    private boolean isFinished;

    public boolean isFinished() {
        return isFinished;
    }

    public Horse(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            if(i == 999){
                System.out.println(getName() + " has finished the race!");
                isFinished = true;
            }
        }
    }
}
