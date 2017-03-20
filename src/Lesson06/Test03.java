package Lesson06;


import java.util.Date;

public class Test03 {

    public static void main(String[] args) throws InterruptedException {

        Date startDate = new Date();
        long ms = startDate.getTime() + 5000;
        Date endDate = new Date(ms);

        Thread.sleep(3000);

        Date currentDate = new Date();
        if(currentDate.after(endDate)){
            System.out.println("Game over! End time!");
        } else {
            System.out.println("You win!");
        }
    }

}
