package com.Lesson.lesson6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Map 中通过 key-value对来存储信息，
 * Map 中key不允许重复
 * HashMap 是线程不安全的
 */
public class java_Map { }


class my_HashMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("age",10);
        map.put("sex",1);
        System.out.println(map);

        System.out.println(map.get("age"));

        map.remove("sex");

        System.out.println(map);

        System.out.println(map.size());

        System.out.println(map.containsKey("name"));
        System.out.println(map.containsValue(1));

        // 遍历map
        // 方法一
        Set<String> keys = map.keySet();
        for (String key :
                keys) {
            System.out.println("key : " + key + ", value : " + map.get(key));
        }

        // 方法二
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> en :
                entries) {
            System.out.println("key : " + en.getKey() + ", value : " + en.getValue());
        }
    }
}

/**
 * 和TreeSet 类似，可以使用自然排序或者自定义排序
 * 自然排序：按照Key值来排序
 * 如果Key是String类型，就是用字典序排序，1.数字 -> 2.字母
 */
class my_TreeMap {
    public static void main(String[] args) {
        Map<Integer,String> tree_map = new TreeMap<Integer,String>();
        tree_map.put(4,"name");
        tree_map.put(1,"age");

        System.out.println(tree_map);
    }
}