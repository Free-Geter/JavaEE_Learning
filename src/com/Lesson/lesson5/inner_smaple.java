package com.Lesson.lesson5;

/**
 * inner_sample需要继承A，B两个类，通过内部类来实现
 */
public class inner_smaple {

    public static void main(String[] args) {
        inner_smaple i = new inner_smaple();
        i.test();
    }

    // 调用内部类的方法，实现多重继承
    void test(){
        new inner_A().A();
        new inner_B().B();
    }

    // 通过内部类继承A类的方法
    class inner_A extends A{

        @Override
        void A() {
            System.out.println("内部类inner_A继承A");
        }
    }
    // 通过内部类继承B类的方法
    class inner_B extends B{

        @Override
        void B() {
            System.out.println("内部类inner_B继承B");
        }
    }
}

abstract class A{
    abstract void A();
}

abstract class B{
    abstract void B();
}
