package Lesson023.Test03;

public class Runner {

    private String name;
    private int speed;
    Stopwatch stopwatch ;

    public Runner(String name, int speed) {
        this.name = name;
        this.speed = speed;
        this.stopwatch = new Stopwatch(this);
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    void start (){
        stopwatch.start();
    }
}
