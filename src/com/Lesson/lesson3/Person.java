package com.Lesson.lesson3;

public class Person {
    String name;
    int age;
    int sex;

    protected void dispinfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(sex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
