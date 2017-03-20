package Lesson012.Test05;

/**
 * Created by admin on 19.11.16.
 */
public class BelarusianHen extends Hen {


    @Override
    int getCountOfEggsPerMonth() {
        return 5;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна" + Country.BE + " Я несу" + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
