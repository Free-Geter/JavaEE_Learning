package com.Lesson.lesson6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 */
public class My_Collections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("1");
        list.add("a");

        System.out.println("Original" + list);
        java.util.Collections.reverse(list);
        System.out.println("反向:" + list);

        Collections.shuffle(list);
        System.out.println("随机排序" + list);

        Collections.sort(list);
        System.out.println("升序排列" + list);

        Collections.swap(list,0,3);
        System.out.println("调换第0个元素和第3个元素的位置" + list);

        System.out.println("自然排序的最大值 " + Collections.max(list));
        System.out.println("自然排序的最小值 " + Collections.min(list));

        System.out.println("a出现的次数 " + Collections.frequency(list,"a"));

        Collections.replaceAll(list,"a","aa");
        System.out.println("替换掉原来所有的a " + list);

        List<Student> student_list = new ArrayList<Student>();
        student_list.add(new Student(11,"a"));
        student_list.add(new Student(12,"b"));
        student_list.add(new Student(16,"c"));

        // 指定排序方法
        // 排序函数，可以直接传入一个匿名对象
        Collections.sort(student_list,new Student());
        for (Student stu :
                student_list) {
            System.out.println("age " + stu.age + ", name " + stu.name);
        }

        // 指定排序方法，输出最大最小值
        System.out.println("年纪最小的学生 " + Collections.max(student_list,new Student()).name);
        System.out.println("年纪最大的学生 " + Collections.min(student_list,new Student()).name);
    }
}

class Student implements Comparator<Student> {

    int age;
    String name;

    Student(){}

    Student(int age,String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.age,o2.age);
    }
}
