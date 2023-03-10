package com.alok;

import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {

        String[] colors = new String[5];

        colors[0] = "purple";
        colors[1] = "blue";

        System.out.println(Arrays.toString(colors));

        System.out.println(colors.length);
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);

        colors[2] = "yellow";

        System.out.println(Arrays.toString(colors));

//        int[] numbers = new int[2];
//        numbers[0] = 100;
//        numbers[1] = 200;

        int[] number = {100, 200};

        for(int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        for(int i = colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);
        }

        for(String val : colors) {
            System.out.println(val);
        }

        Arrays.stream(colors).forEach(System.out::println);
    }
}
