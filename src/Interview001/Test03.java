package Interview001;

import java.awt.geom.Arc2D;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by admin on 26.11.16.
 */
public class Test03 {

    public static void main(String[] args) {
        DoubleInt doubleInt = sum();
        System.out.println(doubleInt.id + doubleInt.dollar);



    }

    public static DoubleInt sum(){
        int a = 5;
        double b = 7.8;
        return new DoubleInt(a, b);
    }

    private static class DoubleInt{

        int id;
        double dollar;


        public DoubleInt(int id, double dollar) {
            this.id = id;
            this.dollar = dollar;
        }
    }

}
