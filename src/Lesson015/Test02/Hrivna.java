package Lesson015.Test02;

/**
 * Created by admin on 10.12.16.
 */
public class Hrivna extends Money {
    public Hrivna(double amount) {
        super(amount);
    }

    @Override
    String getCurrencyName() {
        return "HRN";
    }
}
