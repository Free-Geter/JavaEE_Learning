package com.lesson3;

/**
 * 对于基本数据类型，== 运算符可以比较两个变量是否相同
 * 而对于引用类型，== 运算符只有在两个引用指向同一个对象时，才返回true
 * 同时，使用 == 运算符时，两端的数据类型要兼容（相同或者可以相互转换）
 *
 *  equals 函数只能比较引用类型的变量，比较两个引用是否指向同一个对象
 *  ！！！！注意！！！！！
 *  在String File Data 以及包装类中，对equals 方法进行了重写，
 *  这时比较的是两个引用所指对象的类型和内容是否相同，而 == 运算符比较的是两个对象的地址是否相同
 *  在其他类中，== 运算符和equals 函数都是比较两个对象的地址
 */
public class equals {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        /**
         * String 对象的创建：
         * 首先，Java 的堆内存中有一个常量字符串池
         * 如果用常量给String 类型的引用赋值，那么两个引用会指向同一片内存空间
         * 如果使用new String 调用String 对象的构造函数：那么会首先在堆内存创建指定的常量，再创建一个String对象赋给引用
         */
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");
        System.out.printf("s1 s2 比较\n");
        System.out.println(s1.equals(s2));  // true
        System.out.println(s1 == s2);       // true
        System.out.printf("s3 s4 比较\n");
        System.out.println(s3.equals(s4));  // true
        System.out.println(s3 == s4);       // false

//        System.out.println(p1.equals(p2));  // 输出false
//        System.out.println(p1 == p2);   // 输出false

//        p2 = p1;
//        System.out.println(p1.equals(p2));  //输出true
//        System.out.println(p2 == p1);   //输出true

    }
}
