package Lsson034;

public class Test01 {
    int a;
    String b;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Test01 test01 = (Test01) o;

        if (a != test01.a) return false;
        return b != null ? b.equals(test01.b) : test01.b == null;

    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + (b != null ? b.hashCode() : 0);
        return result;
    }
}
class A {
    public A(String s) {
        System.out.print("A");
    }
}
class B extends A {
    public B(String s) {
        super("r");
        System.out.print(s);
    }

    public static void main(String[] args) {
        new B("AB");
    }
}
