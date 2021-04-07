package com.lesson1.array;

import java.util.Arrays;


public class Array {
    private static int[] TestArray = {2,3,5,7,11,13,17,19};

    public static void main(String[] args) {
        System.out.println(TestArray.hashCode());
        int[] array1 = new int[10];
        for (int i = 0; i < TestArray.length; i++) {
            array1[i] = TestArray[i];
        }
        System.out.println(array1.hashCode());
        System.out.println(Arrays.toString(TestArray));
        System.out.println(Arrays.toString(array1));
    }
}
