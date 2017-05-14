package Pattern;

import java.util.Date;

public class Factory {
    public static void main(String[] args) {
        WatchMaker maker = new RomanWatchMaker();
        maker.createWatch().showTime();
    }
}

interface Watch {
    void showTime();
}

class DigitalWatch implements Watch {
    public void showTime() {
        System.out.println(new Date());
    }
}

class RomanWatch implements Watch {

    public void showTime() {
        System.out.println("VII-XV");
    }
}

interface WatchMaker{
    Watch createWatch();
}

class DigitalWatchMaker implements WatchMaker{

    public Watch createWatch() {
        return new DigitalWatch();
    }
}

class RomanWatchMaker implements WatchMaker{

    public Watch createWatch() {
        return new RomanWatch();
    }
}

