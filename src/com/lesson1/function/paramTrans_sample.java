package com.lesson1.function;

/**
 * 前提知识：
 * 栈内存中保存：基本数据类型、对象的引用（指针）
 * 堆内存中保存：所有的对象
 * 方法内存中保存：所有的class和static变量
 *
 * 方法的参数传递的总结：
 * 如果方法的形参是基本数据类型。那么实参向形参传递数据只能通过”值传递“方式，形参得到的是地址不同的，类型、值相同的副本
 * 如果方法的形参是实际的对象。那么实参向形参传递的值是对象在堆内存中的地址，形参得到的依旧是一个地址不同，类型、值相同的副本，值就是引用对象在对内存的地址
 * 所以通过传递实际对象，本质上是传递了一个对象的引用（指针），直接对堆内存中的内容进行修改，而实参和形参在栈内存中所占存储单元虽然不同，但是都指向堆内存中的同一块内存，所以可以实现同步修改
 */
public class paramTrans_sample {
    public int anInt;


    public static void int_swap(int a){
        a = 6;
        System.out.println("swap函数中a的值为" + a);
    }

    public static void object_swap(paramTrans_sample ps){
        ps.anInt = 6;
        System.out.println("swap函数中aInt的值为" + ps.anInt);
    }

    public void object_swap(){
        this.anInt = 100;
        System.out.println("通过this指针调用，aInt的值为" + anInt);
    }

    public static void main(String[] args) {
        int a = 0;
        int_swap(a);
        System.out.println("mian函数中a的值为" + a);

        paramTrans_sample ps = new paramTrans_sample();
        object_swap(ps);
        System.out.println("mian函数中aInt的值为" + ps.anInt);

        ps.object_swap();
        System.out.println("mian函数中通过this指针修改后，aInt的值为" + ps.anInt);
    }
}
