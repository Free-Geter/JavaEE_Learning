package com.lesson4;

/**
 * abstract 关键字修饰的类：抽象类
 * 抽象类只能被继承，不能实例化
 *
 * abstract 关键字修饰方法：抽象方法
 * 拥有抽象方法的类必须是抽象类
 * 抽象方法必须被重写后才能使用，抽象方法没有方法体，只有返回值类型，参数列表，以;结尾
 *
 * abstract 不能修饰属性、私有方法、构造器、static方法、final方法
 */
public abstract class abstract_class {

    // 抽象类可以定义构造器，但是不能直接使用
    abstract_class(){

    }

    abstract void test (int a);

    abstract void move ();

    public static void main(String[] args) {
        dog d = new dog();
        d.move();
    }
}

/**
 * 抽象类的子类也可以是抽象类
 */
abstract class bird extends abstract_class{
    abstract void fly();

    @Override
    void move() {
        System.out.printf("鸟的移动方式是飞");
    }
}

class dog extends abstract_class{

    @Override
    void test(int a) {
        System.out.println(a);
    }

    @Override
    void move() {
        System.out.print("狗的移动方式是跑");
    }
}
