package ru.muctr.PECS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Evgenia Skichko
 */
public class PECS_Demo {

    public static void main(String[] args) {
        List<DomesticAnimal> animals = new ArrayList<>(Arrays.asList(
                new Cat("Barsik", 5),
                new Cat("Pushok", 1),
                new Dog("Reks"),
                new Dog("Druzhok")
        ));

        List<Cat> cats = new ArrayList<>(Arrays.asList(
                new Cat("Barsik", 5),
                new Cat("Pushok", 1)
        ));

        List<Animal> animals1 = new ArrayList<>(Arrays.asList(
                new Cat("Barsik", 5),
                new Cat("Pushok", 1),
                new Dog("Reks"),
                new Dog("Druzhok")
        ));

        acceptList_extends(cats);
        acceptList_super(animals1);
    }

    private static void acceptList_super(List<? super DomesticAnimal> animals) {
        Dog dog = (Dog)animals.get(0);
        animals.add(new Cat("Barsik", 10));
    }

    private static void acceptList_extends(List<? extends DomesticAnimal> animals) {
        animals.get(0);
//        animals.add(new Cat("Barsik", 10));
    }
}
