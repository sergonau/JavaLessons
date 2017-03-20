package Lesson027.Test01;

public class GenerateThread extends Thread {

    public GenerateThread() {
        super(String.valueOf(Test001.countCreatedThreads++));
        start();
    }

    @Override
    public void run() {
        while (Test001.countCreatedThreads <= Test001.count) {
            System.out.println(new GenerateThread());
        }
    }

    @Override
    public String toString() {
        return getName() + " created";
    }
}
