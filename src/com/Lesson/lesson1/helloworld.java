package com.Lesson.lesson1;
// Java的包机制，相当于创建了一个新的文件夹，每个'文件夹'拥有一个独立的命名空间

/**
 * @author CL
 */
public class helloworld {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};

        // 使用var类型，加强型for循环遍历数组
        for (var x : numbers)
            System.out.println(x);

        System.out.println(max(10,20.0));

        System.out.println(max(1,2,3,4,5,6));
    }

    // 不同类型的参数的顺序不同，也能构成方法的重载
    public static double max (int a,double b){
        return a>b?a:b;
    }

    public static double max(double b, int a){
        return a>b?a:b;
    }

    // Java中也有可变长参数，功能类似Python中的可变参数，定义时必须定义在方法的参数列表的最后
    // 其内核和Python'可变参数'也类似，是创建一个数组来存储所有的参数

    public static  int max(int... numbers){
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > result)
                result = numbers[i];
        }
        return result;
    }
}
