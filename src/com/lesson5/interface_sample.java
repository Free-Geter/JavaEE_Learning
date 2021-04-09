package com.lesson5;

/**
 * 抽象类是对食物的抽象，其中既有属性也有方法。需要对一类事物进行抽象时，使用抽象类
 * 接口是对方法的抽象，其中只有方法和常量。当需要对动作进行抽象时，使用接口，需要这一方法的类，直接实现该接口即可
 *
 * 因为Java不支持多重继承，而有时候有需要通过多重继承的功能，这时候可以使用接口来实现
 * 一个Java 类可以实现多个接口，从而达到类似多重继承的效果
 *
 * 如果要给父类添加方法，可以使用一个包含新方法的接口，子类如果需要可以直接实现接口，
 * 而不是直接修改父类，这样会很大程度上影响子类
 *
 * 接口中的成员变量默认使用public static final 修饰
 * 接口中的成员方法默认使用public abstract 修饰
 * 接口没有构造器
 * 接口采用多重继承的机制
 */
interface interface_sample {

//    public static final int ID = 1;
    int ID = 1;

//    public abstract void start();
    void start();

//    public abstract void run();
    public void run();

//    public abstract void stop();
    void stop();

}

interface interface_sample2 extends interface_sample{
    void in_2();
}


/**
 * 一个类可以实现多个接口，每个接口之间使用 "," 分隔
 * 如果一个类没有实现接口的所有方法，需要定义为抽象类
 */
class Test_imp implements interface_sample,interface_sample2{

    @Override
    public void start() {

    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void in_2() {

    }


}


/**
 * 如果一个类既继承父类，又实现接口，需要先继承，再实现接口
 */
class Test_imp2 extends Test_imp implements interface_sample{

}
