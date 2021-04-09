package com.lesson5;

/**
 * 会唱歌、做饭的老师
 */
public class Person {
    int age;
    String name;

    Person(int age,String name){
        this.name = name;
        this.age = age;
    }
}

interface cooking{
    void cook();
}

interface singing{
    void sing();
}

class Teacher extends Person implements cooking,singing{

    Teacher(int age, String name) {
        super(age, name);
    }

    @Override
    public void cook() {
        System.out.println("a teacher who can cook");
    }

    @Override
    public void sing() {
        System.out.println("a teacher who can sing");
    }
}

class Test{
    public static void main(String[] args) {
        Teacher teacher = new Teacher(21,"chenliang");

        // 接口也可以实现多态性
        cooking c = new Teacher(10,"test");
        c.cook();
    }
}
