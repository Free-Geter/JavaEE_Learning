package com.Lesson.lesson6;

import java.util.*;

/**
 * Java 的集合只能存储对象，如果存入的是基本数据类型，会自动转换为对应的Java引用类型
 * 集合存放的还是多个对象的引用，对象本身仍然放在堆内存中
 * 集合可以存放不同类型，不限数量的数据类型
 *
 * Java 集合的种类：
 * Set：无序，不可重复
 * List：有序，可重复
 * Map：具有映射关系的集合
 */
public class java_Set { }

/**
 * HashSet：
 * 元素的存储位置由HashCode 决定,所以不能保证元素的顺序
 * 不可重复：指的是两个对象的HashCode 是否相同，不论equals方法返回什么
 * 不是线程安全的
 * 集合元素可以为null
 *
 *
 * 如果想让集合只能存储一种类型的数据，那么可以为集合设定泛型
 * Set<String> set = new HashSet<String>();
 *
 * Set<Object> set = new HashSet<Object>();  ===  Set my_set = new HashSet();
 */
class my_HashSet {

    public static void main(String[] args) {
        Set<Object> my_set = new HashSet<Object>();
        // 添加元素
        my_set.add(1);
        my_set.add(1);
        my_set.add('a');
        System.out.println(my_set);

        // 删除元素
        my_set.remove(1);
        System.out.println(my_set);

        // 判断是否包含元素
        System.out.println(my_set.contains('a'));

        // 清空集合
        my_set.clear();
        System.out.println(my_set);

        // 使用迭代器遍历集合
        my_set.add('a');
        my_set.add('b');
        my_set.add('c');
        my_set.add('d');
        Iterator<Object> it = my_set.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        // for each 迭代集合
        for (Object obj :
                my_set) {
            System.out.println(obj);
        }

        // 查看集合大小
        System.out.println(my_set.size());
    }
}

/**
 * TreeSet 实现了SortSet 接口，所以可以保证元素处于排序状态
 * 支持两种排序方式：自然排序（Default）、自定义排序
 *
 * 注意：
 * TreeSet中只能存放相同类型的数据，否则可能产生数据转换异常
 */
class my_TreeSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();

        // TreeSet的自然排序，按照元素的值进行排序
        set.add(1);
        set.add(5);
        set.add(2);
        System.out.println(set);

        set.remove(2);
        System.out.println(set.contains(1));

        Iterator<Integer> it = set.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        set.clear();

        for (Object o :
                set) {
            System.out.println(o);
        }


        //  error : class java.lang.Integer cannot be cast to class java.lang.String
//        TreeSet set1 = new TreeSet();
//        set1.add(1);
//        set1.add("hello");
//        System.out.println(set1);

    }
}

class Person implements Comparator<Person> {

    private int age;
    private String name;

    Person () {}

    Person (int age,String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.age > o2.age)
            return 1;
        else if (o1.age < o2.age)
            return -1;
        else
            return 0;
    }

    /**
     * 使用Set 存储自定义数据类型时，括号内要写对应的new Object()
     */
    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<Person>(new Person());
        set.add(new Person(10, "a"));
        set.add(new Person(9, "b"));
        set.add(new Person(17,"c"));

        for (Person p :
                set) {
            System.out.println(p.age + "\t" + p.name);
        }
    }
}
