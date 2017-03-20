package Lesson015.Test02;

/**
 * Created by admin on 10.12.16.
 */
public abstract class Money {

    private double amount;

    public double getAmount() {
        return amount;
    }

    public Money(double amount) {
        this.amount = amount;
    }

    abstract String getCurrencyName();

}
