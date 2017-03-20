package Lesson012.Test05;

/**
 * Created by admin on 19.11.16.
 */
public class MoldovanHen extends Hen {


    @Override
    int getCountOfEggsPerMonth() {
        return 6;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна" + Country.MO + " Я несу" + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
