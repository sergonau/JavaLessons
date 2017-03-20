package Lesson015.Test02;

/**
 * Created by admin on 10.12.16.
 */
public class USD extends Money {
    public USD(double amount) {
        super(amount);
    }

    @Override
    String getCurrencyName() {
        return "USD";
    }


}
