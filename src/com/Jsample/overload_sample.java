package com.Jsample;

public class overload_sample {
    // 方法的重载需要方法的参数类型、参数的数量、参数的顺序不同
    // 返回值类型不同不能构成重载
    public int add(int a ,int b){
        return a + b;
    }

    public double add(int x,double y){
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(new overload_sample().add(1,2));

    }
}
