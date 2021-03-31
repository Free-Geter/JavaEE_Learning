package com.Jsample;

/**
 * @author cl
 * class 的修饰符只能是public 或者 default：
 * 一个Java 文件中只能声明一个class为public，其他的都只能是defalut
 * public：在任何地方都可以调用
 * default：只能在同一个包内调用
 */
public class Person {
    //属性：成员变量
    //类的成员变量都有默认值，可以先生成，不需要初始化
    String name;            //默认值为null
    int age;                //默认值为0


    //行为：方法，函数
    /**
     * 类的构造函数
     * 默认构造函数的修饰符： 与class的修饰符保持一致
     */
    Person(){
//        this();       不允许这么些：1.不允许自己调用自己。2.和Person(String,int)构成了循环调用
    }

    Person(String name, int age) {
        this();             // 相当于调用Person()
        this.name = name;
        this.age = age;
    }

    /**
     * 方法的修饰符：
     *  private：被修饰对象只能在类内使用
     *  default：被修饰对象在类内，同一个包内都可以直接使用
     *  protected：被修饰对象在类内，同一个包内，子类中都可以使用
     *  public：可以在任何地方使用
     */
    public void showName() {
        System.out.println("姓名：" + name);
    }

    /**
     * 获取年龄
     *
     * @return int类型的年龄数值
     */
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // 使用匿名对象调用成员方法，可以不需要对该对象命名，所以称之为“匿名对象”
        new Person("chenliang",15).showName();
    }
}