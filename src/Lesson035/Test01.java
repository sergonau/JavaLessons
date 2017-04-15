package Lesson035;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

    //    String amendTheSentence(String s) {
//
//        String result = "" + 5;
//
//        for (char c : s.toCharArray()) {
//            if (Character.isUpperCase(c)) {
//
//                c = Character.toLowerCase(c);
//                result += " " + c;
//
//            } else result += c;
//        }
//        return result.trim();
//
//    }
//}
//    class Test {
//
//         interface I {
//            void a(Number n);
////            void a(Double n);
//        }
//
//        static class A implements I {
//
//            public void a(Number n) {
//                System.out.println("number");
//            }
//
//            public void a(Double n) {
//                System.out.println("double");
//            }
//        }
//
//        public static void main(String[] args) {
//
//            I i = new A();
//            Double d = new Double(12d);
//            i.a(d);
//        }
//    }
//
//class B {
//    private B() {
//        System.out.print("1");
//    }
//
//    protected B(String str) {
//        System.out.print("2");
//    }
//}
//
//class A extends B {
//    public A() {
//        this("smth");
//    }
//
//    public A(String str) {
//        super();
//    }
//
//    public static void main(String[] args) {
//        A a = new A();
//    }
//}
//
//class Test3 <X extends Object> {
//
//    private X x;
//
//    public Test3(X x) {
//        this.x = x;
//    }
//
//    public double getDouble() {
//        return ((Double) x).doubleValue();
//    }
    public static void main(String args[]) {

        tripletSum(15, new int[]{14, 1, 2, 3, 8, 15, 3});

//        Test3<Integer> a = new Test3<Integer>(new Integer(1));
//        System.out.print(a.getDouble());
    }

    static boolean tripletSum(int x, int[] a) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }

        int c = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i != j) c = x - a[i] - a[j];
                if (c != a[i] && c != a[j] && list.contains(c))
                    return true;
            }

        }

        return false;


    }

}