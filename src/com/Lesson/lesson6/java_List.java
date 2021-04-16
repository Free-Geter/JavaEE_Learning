package com.Lesson.lesson6;

import java.util.ArrayList;
import java.util.List;

/**
 * 元素有序，允许重复的集合，集合中的每个元素都有对应的顺序索引（0开始）
 * 可以通过顺序索引来访问指定位置的元素
 * 默认按元素的添加顺序来为元素排序
 *
 * ArrayList 是线程不安全的list，Vector 是线程安全的list
 */
public class java_List {
    static List<Character> list = new ArrayList<>();

    public static void main(String[] args) {
        list.add('a');
        list.add('b');
        list.add('a');

        System.out.println(list.get(2));

        // 指定插入位置
        list.add(1,'f');

        System.out.println(list);

        // 获取指定元素在集合中第一次出现的位置索引
        System.out.println(list.indexOf('a'));
        // 最后一次出现的位置索引
        System.out.println(list.lastIndexOf('a'));

        // 修改指定位置的元素值
        list.set(3,'z');

        // 获取子列表（左闭右开）
        System.out.println(list);
        System.out.println(list.subList(1,4));
    }
}
