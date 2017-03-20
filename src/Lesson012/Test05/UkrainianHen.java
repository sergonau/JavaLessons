package Lesson012.Test05;

/**
 * Created by admin on 19.11.16.
 */
public class UkrainianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 10;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна" + Country.UA + " Я несу" + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
