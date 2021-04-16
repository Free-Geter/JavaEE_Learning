package com.Lesson.lesson6;

public class My_Exception extends java.lang.Exception {
    My_Exception (String msg) {
        super(msg);
    }
}


class test {
    void test1(int i) throws My_Exception {
        if (i > 0 && i < 100);
        else
            throw new My_Exception("数据不在 0 - 100 之间");
    }

    public static void main(String[] args) {
        test t = new test();
        try {
            t.test1(200);
        } catch (My_Exception e) {
            e.printStackTrace();
        }
    }
}