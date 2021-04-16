package com.Lesson.lesson4;

/**
 * 工具类：常常由静态方法组成，方便其他方法调用，减少冗余代码
 *
 * static 修饰的成员的特点：
 * 随着类的加载而加载，优先于对象存在
 * 修饰的成员被所有对象共享
 * 在static 方法内不能使用this、super
 */
public class Utils {
    public static boolean isEmpty(String s){
        boolean flag = true;
        if (!(s==null) && !(s==""))
            flag = false;
        return flag;
    }
}
