package Lesson028.Test002;

public class Gamer extends Thread {

    private int rating;


    public Gamer(int rating, String name) {
        super(name);
        this.rating = rating;
    }

    @Override
    public void run() {

        while (!OnlineGame.isWinnerFound) {
            try {
                for (int i = 0; i < OnlineGame.steps.size(); i++) {
                    System.out.println(getName() + ": " + OnlineGame.steps.get(i));

                    sleep(1000 / rating);


                    if (i == 3) {
                        System.out.println(getName() + " is WINNER!!!");
                        OnlineGame.isWinnerFound = true;
                    }
                }
            } catch (InterruptedException e) {
                System.out.println(getName() + " was lost!!!");
            }
        }
    }

    //    @Override
//    public String toString() {
//        return "Gamer{" +
//                "rating=" + rating +
//                '}';
//    }
}
