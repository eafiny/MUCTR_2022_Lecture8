package ru.muctr;

import java.util.*;
import java.util.function.Predicate;

/**
 * @author Evgenia Skichko
 */
public class List_Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 1, 5, 6, 7, 20, 40, 50, 50, 80));
        list.add(5);
        list.add(1);
        list.add(2);
        System.out.println(list);

        //********* Заменить элемент в списке *******************************
        list.set(1, 5);
        System.out.println(list);

        //********* Удалить элемент из списка ******************************
        System.out.println("Из списка удален элемент " + list.remove(0));
        System.out.println(list);
//        list.remove((Integer) 7);

        //********* Нельзя удалять элементы коллекции в цикле foreach !!!
//        for (Integer i: list) {
//            if (i == 5) list.remove(i);
//        }

        //********* Чтобы удалить несколько элементов, можно
        //********* 1. Использовать итератор:
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next() == 5) iterator.remove();
        }

        //********* 2. Использовать метод removeAll() **********
        list.removeAll(Arrays.asList(50,40));

        //******** 3. Использовать метод removeIf() ************
        list.removeIf(integer -> integer < 5);

        //******** Заменить все элементы коллекции *************
        list.replaceAll(x -> x * 10);
        System.out.println(list);

        //******** Создать список из массива ******************
        Integer[] intArray = new Integer[]{1,2,3,4};
        List<Integer> intList = Arrays.asList(intArray);
//        intList.add(6);
        intArray[0] = 10;
        System.out.println(intList);

        List<Integer> intList1 = new ArrayList<>();
        Collections.addAll(intList1, intArray);
        intList1.add(6);

        //******** Создать список заданной ёмкости ************
        List<Integer> list1000 = new ArrayList<>(1000);

    }
}
