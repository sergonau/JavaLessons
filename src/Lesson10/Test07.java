package Lesson10;

/*
1. Создать интерфейс DBObject и создать в нем метод initializeIdAndName(long id, String name)
2. Создать класс User с параметрами long id, String name; Вынести реализацию метода initializeIdAndName в класс User.
3. initializeIdAndName в классе User должен возвращать тип User.
4. Переопределить метод toString() в классе User, что бы он выводил следующее User has name %s, id = %d
5. Создать класс Matrix и создать в нем 2 объекта используя ранее созданые интерефейс и класс.
6. В методе main вывести на экран объекты.
*/

public class Test07 {

    public static void main(String[] args) {
        System.out.println(Matrix.neo);
        System.out.println(Matrix.triniti);
    }

    public interface DBObject{

        DBObject initializeIdAndName(long id, String name);

    }

    public static class User implements DBObject{

        long id;
        String name;

        @Override
        public User initializeIdAndName(long id, String name) {

            this.id = id;
            this.name = name;

            return this;
        }


        @Override
        public String toString() {
            return String.format("User has name %s, id = %d", name, id);
        }
    }

    public static class Matrix{

       static DBObject neo = new User().initializeIdAndName(1001, "Neo");
       static DBObject triniti = new User().initializeIdAndName(1002, "Triniti");

    }

}
