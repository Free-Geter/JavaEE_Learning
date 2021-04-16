package com.Lesson.lesson4;

/**
 * 包装类对基本数据类型进行了装饰，有了更多的成员方法,
 * 主要用来实现基本数据类型和字符串之间的转换
 *
 * 可以通过包装类的parseXXX 静态方法实现字符串到指定数据类型的转换
 * 使用String.valueOf()方法可以实现基本数据类型转换为字符串
 */
public class wrapper {
    private String test;

    wrapper(String test){
        this.test = test;
    }

    @Override
    public String toString() {
        return "wrapper{" +
                "test='" + test + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Integer i = 1;
        Integer j = Integer.valueOf("123");
        int value_i = i.intValue();
        // 编译时不报错，但是无法运行
        // Integer test = Integer.valueOf("abc");


        // JDK1.5之后支持自动装箱和拆箱
        Boolean b = false;          // 自动装箱
        boolean b1 = b;             // 自动拆箱

        int i0 = Integer.parseInt("123");
        float f0 = Float.parseFloat("0.15");
        boolean b0 = Boolean.parseBoolean("false");

        String istr = String.valueOf(i0);
        String fstr = String.valueOf(f0);
        String bstr = String.valueOf(b0);

        wrapper w = new wrapper("hello");
        System.out.println(w);              // 打印一个对象时，会默认调用该对象的toString方法
    }
}
