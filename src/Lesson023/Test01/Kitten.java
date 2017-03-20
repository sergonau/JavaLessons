package Lesson023.Test01;

import Lesson020_Thread.*;

public class Kitten extends Thread{

    public Kitten(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + ", вылез из корзинки");
        Test001.investigateWorld();
    }
}

