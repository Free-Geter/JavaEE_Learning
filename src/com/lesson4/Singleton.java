package com.lesson4;

/**
 * 如果new 一个对象需要很多时间或空间，就可以使用单例设计模型，显示实例对象的创建
 */

public class Singleton {

    private Singleton(){}

    /* 饿汉式单例模式
    private static Singleton s1 = new Singleton();

    public static Singleton getInstance(){
        return s1;
    }
     */

    /* 懒汉式单例模式，存在线程安全问题
    private static Singleton s1 = null;
    public static Singleton getInstance(){
        if (s1 == null)
            s1 = new Singleton();
        return s1;
    }
     */
}
