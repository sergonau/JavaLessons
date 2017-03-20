package Lesson023.Test01;

public class Cat extends Thread {
    Kitten kitten = new Kitten("Котенок 1, мама - " + getName());
    Kitten kitten1 = new Kitten("Котенок 2, мама - " + getName());

    public Cat (String name){
        super(name);
        start();
    }

    void initAllKitten() throws InterruptedException {
        kitten.start();
        kitten.join();
        kitten1.start();
        kitten1.join();
    }

    @Override
    public void run() {
        System.out.println(getName() + " родила 2 котенка");

        try {
            initAllKitten();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + ": Все котята в корзинке. " + getName() + " собрала их назад");
    }
}
