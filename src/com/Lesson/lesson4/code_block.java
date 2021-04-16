package com.Lesson.lesson4;


import com.Lesson.lesson3.Person;

/**
 * 程序的执行顺序：
 * 1.静态代码块（只执行一次）：常用作静态变量的初始化
 * 2.非静态代码块（每次new 对象都执行）
 * 3.构造器
 */
public class code_block {
    public static void main(String[] args) {
        // 创建匿名内部类，相当于创建了一个Person类的匿名子类
        // 该类没有类名，也就没有构造函数，所以需要代码块来替代完成构造
        Person p = new Person(){
            {
                super.setAge(10);
                super.setName("cl");
                super.setSex(1);
            }
            @Override
            protected void dispinfo() {
                System.out.println("在匿名类内调用dispInfo");
            }
        };
    }
    static {
        System.out.printf("调用静态代码块");
    }
    {
        System.out.printf("调用非静态代码块");
    }
}
