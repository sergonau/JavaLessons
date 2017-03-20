package Lesson019_Threads.Test02;

import java.util.Date;
import java.util.SortedMap;

/**
 * Created by admin on 03.01.17.
 */
public class Violin implements MusicalInstrument{

    private String musicianl;

    public Violin(String musicianl) {
        this.musicianl = musicianl;
    }

    @Override
    public Date startPlaying() {
        Date date = new Date();
        return date;
    }

    @Override
    public Date stopPlaying() {
        Date date = new Date();
        return date;
    }

    @Override
    public void run() {

        Date date1 = startPlaying();

        try {
            Test_Thread_07.sleepNSeconds(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Date date2 = stopPlaying();

        System.out.println("Playing " + (date2.getTime() - date1.getTime()) + " ms");


    }
}
