package Lesson038;
/*
Посчитайте сумму чисел на на промежутке от 1 до 1000 включительно.
Потом посчитайте целую часть от деления этой суммы на число 1234,
а так же остаток от деления. Выведите в консоль true если сумма
остатка от деления больше и false в другом случае. В данном упражнении
нельзя использовать if/else конструкцию даже если вы с ней знакомы :)
Выполняйте упражнения в main методе. Название класса SumAndDivision
*/

public abstract class Test03 {

    public static void main(String[] args) {
        long a = 0;
        long b = 0;
        long c = 0;
        boolean e = false;
        for (int i = 0; i < 1000; i++) {
            a=a+i;
        }
        b = a/1234;
        c = a%1234;

        System.out.println(c>b?"true":"false");
    }

//    abstract void m1();
//
//    void m2(){
//
//    }

}


//interface B{
//    String y = "999";
//
//    abstract void m3();
//
//    default void m4(){
//        System.out.println("Ok");
//    }
//}
//
//class C implements B{
//    @Override
//    public void m3() {
//
//    }
//}