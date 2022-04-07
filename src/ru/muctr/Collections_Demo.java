package ru.muctr;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Evgenia Skichko
 */
public class Collections_Demo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(25, 8, 58, 100, 45, 67, 2, 89, 65, 65, 65);
        System.out.println("Перед сортировкой: " + list);

        Collections.sort(list);
        System.out.println("После сортировки: " + list);

        Collections.reverse(list);
        System.out.println("После обратной сортировки: " + list);

        Collections.fill(list, 100);
        System.out.println("Метод fill(): " + list);
        list = Arrays.asList(25, 8, 58, 100, 45, 67, 2, 89, 65, 65, 65);

        Collections.shuffle(list);
        System.out.println("Рандомное распределение элементов " + list);

        System.out.println("Наибольшее число в коллекции " + Collections.max(list));
        System.out.println("Наименьшее число в коллекции " + Collections.min(list));

        System.out.println("Нет одинаковых элементов в двух коллекциях? " + Collections.disjoint(list, Arrays.asList(5,6,7,8)));
    }
}
