package ru.muctr;

import ru.muctr.PECS.Cat;

import java.util.Comparator;

/**
 * @author Evgenia Skichko
 */
public class CatComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getAge() - o2.getAge();
    }
}
