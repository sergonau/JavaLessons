package Pattern;

public class Delegate {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        waiter.setCook(new Pizza());
        waiter.dish();

        waiter.setCook(new Pasta());
        waiter.dish();
        
        waiter.setCook(new Soup());
        waiter.dish();
        
        
    }


    interface Cook {

        void cooking();
    }

    static class Soup implements Cook {

        public void cooking() {
            System.out.println("Готовим суп");

        }
    }

    static class Pasta implements Cook {

        public void cooking() {
            System.out.println("готовим пасту");

        }
    }

    static class Pizza implements Cook {

        public void cooking() {
            System.out.println("готовим пиццу");

        }
    }

    static class Waiter {
        Cook cook;

        public void setCook(Cook cook) {
            this.cook = cook;
        }

        void dish(){
            cook.cooking();
        }
    }
}

class Y {
    public Y() { System.out.print("Y"); }
}
class Z {
    public Z() { System.out.print("Z"); }
}
class X extends Z {
    private Y m_objY;

    public void setM_objY(Y m_objY) {
        this.m_objY = m_objY;
    }

    public X() { System.out.print("X"); }

    public static void main(String[] args) {
        X x = new X();
        X x1 = new X();

        Y y = new Y();

        x1.setM_objY(y);
        x.setM_objY(y);
    }
}

class Main{

    public static void main(String...args){
        System.out.println(C.a);

    }

}
class A{
    static{
        System.out.println("static A1");
    }
    A(){
        System.out.println("A");
    }
}
class B extends A{

    static{
        System.out.println("static B1");
    }
    {
        System.out.println("non static C2222222");
    }
    {
        System.out.println("non static C2222222");
    }
    {
        System.out.println("non static C222222");
    }
    {
        System.out.println("non static C22222");
    }
    B(){
        System.out.println("B");
    }
}
class C extends B{
    static int a = 5;
    static{
        System.out.println("static C1");
    }
    {
        System.out.println("non static C1");
    }
    C(){
        this("Hello");
        System.out.println("C1");
    }
    C(String str){
        System.out.println("C2");
    }
    {
        System.out.println("non static C2");
    }
}