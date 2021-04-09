package com.lesson5;

/**
 * 内部类的作用：
 * 主要用来解决Java不能多重继承的问题
 */
public class inner_class {
    int a;
    protected int b;
    private int c;

    /**
     *  内部类可以使用final、static修饰
     *  和外部类不同，内部类可以声明为private或protect
     *  内部类可以声明为abstract，被其他内部类继承
     *  一个类可以有多个被内部类
     */
    class A{
        int a;
        void setFields(int a,int b,int c){
            inner_class.this.a = a;
            inner_class.this.b = b;
            inner_class.this.c = c;
        }
        void setInfo(int i){
            this.a = i;
        }
    }

    abstract class B{}

    class C extends B{}

    /**
     * 如果外部类想使用内部类的方法，需要new一个内部类的对象，通过这个对象调用方法
     */
    public void setInfo(){
        new A().setFields(1,2,3);
        System.out.println(this.a);
        System.out.println(this.b);
        System.out.println(this.c);
    }

    public static void main(String[] args) {
        new inner_class().setInfo();
    }
}


