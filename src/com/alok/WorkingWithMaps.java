package com.alok;

import java.time.Period;
import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<Integer, Person> mp = new HashMap<>();
        mp.put(1, new Person("alok"));
        mp.put(2, new Person("Alex"));
        mp.put(3, new Person("deelon"));
        System.out.println(mp);
        mp.put(3, new Person("deelon-1"));

        System.out.println(mp.keySet());
        System.out.println(mp.values());

        mp.forEach((key, val)->{
            System.out.println(key + ", " + val);
        });

    }
    record Person(String name){}
}
