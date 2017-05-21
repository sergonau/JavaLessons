package Lesson037;

public class Test02 {
    public static void main(String[] args) {
        System.out.println(C.a);
    }
}
// Static A Static B Static C Non static A a Non static B b Non static C c 15
class A {


    A(){
        System.out.println("a");
    }

    {
        System.out.println("Non static A");
    }

    static {
        System.out.println("Static A");
    }
}

class B extends A{
    int c = 15;

    B(){
        System.out.println("b");
    }

    {
        System.out.println("Non static B");
    }

    static {
        System.out.println("Static B");
    }
}

class C extends B{
    static int a = 10;
    C(){
        System.out.println("c");
    }

    {
        System.out.println("Non static C");
    }

    static {
        System.out.println("Static C");
    }
}
