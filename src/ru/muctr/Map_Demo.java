package ru.muctr;

import java.util.*;

/**
 * @author Evgenia Skichko
 */
public class Map_Demo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Vera", 1);
        map.put("Nina", 2);
        map.put("Nikolay", 3);
        System.out.println(map);

        System.out.println(map.getOrDefault("Andrey", 0));

        for (var m: map.entrySet()) {
            if(m.getKey().equals("Nina")) System.out.println(m.getValue());
        }
    }
}
