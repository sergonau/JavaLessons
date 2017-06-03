package Lesson038;

public class Test02 {

    public static void main(String[] args) {

        long a = 0;

        for (int i = 0; i <= 10_000_000; i++) {
            a=a+i;
        }

        System.out.println(a);
        
    }


}