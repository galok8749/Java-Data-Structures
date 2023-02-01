package com.alok;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {

        Queue<String> person = new LinkedList<>();
        person.add("Alex");
        person.add("Roop");
        person.add("Kurian");

        System.out.println(person.size());
        System.out.println(person.peek());
        System.out.println(person.poll());
        System.out.println(person.size());
        System.out.println(person.peek());
    }
}
