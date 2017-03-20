package Lesson08;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* Множество всех животных

1. Внутри класса Test0_1 создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/
public class Test01 {

    public static void main(String[] args) {

        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();
        Set<Object> pets = join(cats, dogs);

        removeCats(pets, cats);
        System.out.println(pets);

    }

    static Set<Cat> createCats(){

        Set<Cat> cats = new HashSet<>();

        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        return cats;
    }

    static Set<Dog> createDogs(){

        Set<Dog> dogs = new HashSet<>();

        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());

        return dogs;
    }

    static Set<Object> join(Set<Cat> cats, Set<Dog> dogs){

        Set<Object> pet = new HashSet<>();
        pet.addAll(cats);
        pet.addAll(dogs);
        return pet;
    }

    static void removeCats(Set<Object> pet, Set<Cat> cat){
        pet.removeAll(cat);
    }


    public static class Cat {}

    public static class Dog {}


}
