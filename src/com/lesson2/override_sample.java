package com.lesson2;


/**
 * 重写的方法必须和原方法有着相同的参数列表和返回值类型
 * 重写方法不能使用比原方法更加严格的访问修饰符
 * 重写方法和原方法同时为static 或 非static
 *
 * 重载 重写 的区别：
 * 重载：一个类有多个同名的方法
 * 重写：子类可以覆盖父类的方法，重新定义
 */
public class override_sample extends extends_sample{

    override_sample(String name, int sex, int age) {
        super(name, sex, age);
    }

    @Override
    public void setSchool(String school) {
//        super.setSchool(school);
        System.out.println("this is a sample for overriding");
    }

    public static void main(String[] args) {
        override_sample override_sample = new override_sample("name",1,1);
        override_sample.setSchool("test");
    }
}
