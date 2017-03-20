package Lesson019_Threads.Test02;

import java.util.Date;

/**
 * Created by admin on 03.01.17.
 */
public interface MusicalInstrument extends Runnable {

    Date startPlaying();
    Date stopPlaying();
}
