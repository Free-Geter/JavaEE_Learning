package com.Lesson.lesson6;

public class Exception {

    static String[] test = {"hello","why"};
    static Exception e = null;
    private int h = 0;

    /**
     * 在try 代码块中的代码，如果出现了异常，那么后面的就不会继续执行了，所以一般只能捕获到一个异常
     * 因为后面的异常代码都不会被执行
     * 子类重写父类的方法时，子类不能抛出比父类更大范围的异常
     */
    // 如果main方法抛出异常，将会抛给JVM，在程序中不能处理
    public static void main(String[] args) throws java.lang.Exception {
        try {

            A a = new A(150);
            System.out.println(a.age);

        }catch (ArrayIndexOutOfBoundsException e) {
            // 获取异常信息
            System.out.println(e.getMessage());
            // 获取异常位置
            e.printStackTrace();
            System.out.print("数组越界");
        }catch (NullPointerException e1){
            System.out.print("空指针异常");
        }catch (ArithmeticException e2){
            System.out.print("数学运算错误");
        } catch (java.lang.Exception e3){
            e3.printStackTrace();
        }finally {
            System.out.print("=========");
        }
        System.out.print("程序执行完毕");
    }
}

class B {
    int i = 0;
    void test() throws NullPointerException {
        B b = null;
        System.out.println(b.i);
    }
}

class A extends B{
    int age;
    // 禁止抛出Exception异常，这个异常比父类的异常的范围更大
//    void test() throws java.lang.Exception {}
    A (int age) throws java.lang.Exception {
        if (age > 0 && age < 130)
            this.age = age;
        else {
            throw new java.lang.Exception("年龄不在0 - 130之间");
        }
    }
}