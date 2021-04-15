package com.lesson6;

import javax.crypto.ExemptionMechanism;
import javax.crypto.ExemptionMechanismException;

public class Exception {

    static String[] test = {"hello","why"};
    static Exception e = null;
    private int h = 0;

    public static void main(String[] args) {
        try {
            System.out.println(test[2]);
            System.out.println(e.h);
            System.out.println(1/e.h);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.printf("数组越界");
        }catch (NullPointerException e1){
            System.out.printf("空指针异常");
        }catch (ArithmeticException e2){
            System.out.printf("数学运算错误");
        }finally {
            System.out.printf("=========");
        }
        System.out.printf("程序执行完毕");
    }
}
