package Lesson023.Test03;

public class Stopwatch extends Thread {
    private Runner owner;
    private int stepNumber;

    public Stopwatch(Runner owner) {
        this.owner = owner;
    }

    void doSeveralSteps() throws InterruptedException {

        stepNumber++;
        int newSpeed = owner.getSpeed();
        Thread.sleep(1000/newSpeed);
        System.out.println(owner.getName() + " делает шаг №" + stepNumber + "!");

    }

    @Override
    public void run() {

        try {
            while (!Test01.isStopped) {
                doSeveralSteps();
            }
        } catch (Exception e){
            System.err.println("Error!");
        }
    }

    public int getStepNumber() {
        return stepNumber;
    }
}
