package Lesson028.Test002;

import java.util.ArrayList;
import java.util.List;

public class OnlineGame extends Thread {

    static List<String> steps = new ArrayList<>();
    static volatile boolean isWinnerFound = false;

    static {
        steps.add("Начало игры");
        steps.add("Сбор ресурсов");
        steps.add("Рост экономики");
        steps.add("Убийство врагов");
    }

    Gamer gamer = new Gamer(5, "Robot");
    Gamer gamer1 = new Gamer(1, "Neo");
    Gamer gamer2 = new Gamer(3, "Triniti");

    @Override
    public void run() {
        gamer.start();
        gamer1.start();
        gamer2.start();
        while (!isWinnerFound){}
        gamer.interrupt();
        gamer1.interrupt();
        gamer2.interrupt();

    }

}
