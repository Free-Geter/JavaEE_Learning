package com.lesson3;

public class polymorphism extends Person{

    private int test;

    @Override
    protected void dispinfo() {
        System.out.println("this is an override of dispinfo");
    }

    public static void main(String[] args) {
        Person P = new Person();

        // 向上转型：父类的引用可以指向子类的实例对象
        // 在编译时，P是Person类型的，所以不能访问polymorphism子类的属性、或者子类中非重写的方法
        P = new polymorphism();

        // 可以使用 instanceof 运算符来检测某个对象是不是指定类的实例对象
        System.out.println(P instanceof Person);
        System.out.println(P instanceof polymorphism);
//        P.test = 10;


        // 在运行时，P指向的是polymorphism子类的实例对象，调用子类方法时，
        // 如果被调用方法是子类对父类方法的重写方法，那么会优先调用子类的方法
        P.dispinfo();


        // 向上转型的应用，在设计函数时，可以把参数定义为父类类型。
        // 可以把子类的实例作为实参（看成特殊的父类对象），传输给方法，
        // 方法在运行时，会根据实参的具体类型，运行不同类的对应方法，实现多态性
    }
}
