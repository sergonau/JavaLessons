package Lesson025.Test00005;

public class RacingClock extends Thread {

    @Override
    public void run() {
        while (true) {
            for (int i = Test00005.countSeconds; i > 0; i--) {
                System.out.print(i + " ");
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                }

                if(i>3){

                }
            }
            try {
                sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("Марш!!!!!!!");
        }
    }
}
