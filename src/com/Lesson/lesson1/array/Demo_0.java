package com.Lesson.lesson1.array;

public class Demo_0 {
    public static void main(String[] args) {
        // 静态初始化
        int[] numbers = {1,2,3,4,5};

        // 动态初始化
        double[] temp = new double[10];

        // for-each 循环遍历数组
        for (var x :
                numbers) {
            System.out.println(x);
        }
    }
}
