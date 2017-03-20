package Lesson011.Test02;

/**
 * Created by admin on 12.11.16.
 */
public class Person implements RepkaItem{

    String name;
    String namePadezh;

    public Person(String name, String namePadezh) {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    void pull(Person person) {
        System.out.println(this.name + " за " + person.getNamePadezh());
    }

    @Override
    public String getNamePadezh() {
        return namePadezh;
    }
}
