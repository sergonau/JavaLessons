package Lesson025.Test00001;

public class Plane extends Thread {

    volatile boolean isAlreadyTakenOff = false;

    public Plane(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        while (!isAlreadyTakenOff){

            if(Test01.RUNWAY.getThread() == null) {
                Test01.RUNWAY.setThread(this);
                System.out.println(getName() + " взлетает");


                try {
                    Test01.takingOff();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(getName() + " уже в небе");
                isAlreadyTakenOff = true;
                Test01.RUNWAY.setThread(null);
            }
            else if(!Test01.RUNWAY.getThread().equals(this)) {
                System.out.println(getName() + " ожидает");
                try {
                    Test01.waiting();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
