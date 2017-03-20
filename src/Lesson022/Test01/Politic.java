package Lesson022.Test01;

/**
 * Created by admin on 21.01.17.
 */
public class Politic extends Thread {
    private volatile int countSounds;

    public Politic(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        while(countSounds < Test01.totalCountSpeeches * Test01.soundsInOneSpeech){
            countSounds++;
        }
    }

     int getCountSpeaches(){
        return countSounds / Test01.soundsInOneSpeech;
    }

    @Override
    public String toString() {
        return String.format("%s сказал речь %d раз", getName(), getCountSpeaches());
    }
}
