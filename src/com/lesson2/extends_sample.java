package com.lesson2;

/**
 * if 子类中的构造函数会默认调用父类中的无参构造函数
 * else if 父类中没有无参构造函数，子类必须通过this、super语句显式地调用本类或父类地构造函数，且必须放在构造函数都第一行
 * else 编译出错
 */
public class extends_sample extends javaBean_sample{
    private String school;

    extends_sample(String name, int sex, int age) {
        super(name, sex, age);
    }

    extends_sample(String name, int sex,int age,int salary ){
        this(name, sex, age);
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    void printinfo(){
        System.out.println(this.getSex());
        System.out.println(this.getAge());
        System.out.println(this.getName());
        System.out.println(this.getSchool());
    }

}
