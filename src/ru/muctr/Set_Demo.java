package ru.muctr;

import ru.muctr.PECS.Cat;
import ru.muctr.PECS.Dog;

import java.util.*;

/**
 * @author Evgenia Skichko
 */
public class Set_Demo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(8);
        set.add(4);
        set.add(5);
        System.out.println(set);

        // Для того чтобы объекты класса Cat можно было корректно добавлять в set,
        // в классе Cat должны быть переопределены методы equals() и hashCode()
        Cat cat1 = new Cat("Barsik", 5);
        Cat cat2 = new Cat("Pushok", 1);
        Cat cat3 = new Cat("Barsik", 5);
        Cat cat4 = new Cat("Murka", 2);
        Set<Cat> catSet = new HashSet<>();
        catSet.add(cat1);
        catSet.add(cat2);
        catSet.add(cat3);
        catSet.add(cat4);
        System.out.println(catSet);

        //Чтобы сохдать сортированное множество объектов класса Cat,
        //он должен имплементировать интерфейс Comparable<>
        SortedSet<Cat> treeSet = new TreeSet<>(Arrays.asList(cat1, cat2, cat3, cat4));

        System.out.println(treeSet);

        //Если объекты в TreeSet должны быть отсортированы не по основному правилу,
        //нужно передать компаратор в конструктор TreeSet
        SortedSet<Cat> treeSetSortedByAge = new TreeSet<>(new CatComparator());
        for (Cat cat: Arrays.asList(cat1, cat2, cat3, cat4)) {
            treeSetSortedByAge.add(cat);
        }
        System.out.println(treeSetSortedByAge);
    }
}
