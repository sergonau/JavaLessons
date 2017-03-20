package Lesson012.Test05;

/**
 * Created by admin on 19.11.16.
 */
public class RussianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 2;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна" + Country.RU + " Я несу" + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
