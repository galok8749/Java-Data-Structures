package com.alok;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {

//        List colors = new ArrayList();
//        colors.add("blue");
//        colors.add("purple");
//        colors.add(1);
//        colors.add(new Object());

        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("purple");
        System.out.println(colors.size());
        System.out.println(colors.contains("blue"));
        System.out.println(colors.contains("pink"));
        System.out.println(colors);

        for(String color : colors) {
            System.out.println(color);
        }

        for(int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        List<String> colorUnmodifiable = List.of(
                "blue",
                "yellow"
        );
    }
}
