package Lesson029;

abstract class Test0001 {
    static int a = 8;

    public Test0001() {
        show();
    }

    abstract void show();
}

class B extends Test0001 {

    public B() {
        super();
    }

    static int a = 90;

    void show() {
        System.out.println("" + a);
    }

    public static void main(String args[]) {
        new B();
    }
}