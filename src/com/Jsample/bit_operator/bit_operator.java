package com.Jsample.bit_operator;

public class bit_operator {
    public static void main(String[] args){
        int i = -3;
        // 正数右移，空位补0，负数补1
        System.out.println(i<<2);
        System.out.println(i>>2);
        // 无符号右移
        System.out.println(i>>>2);

        // 对二进制位按位进行与、或、异或运算
        System.out.println(12|5);
        System.out.println(12&5);
        System.out.println(12^5);

        // 计算反码
        System.out.println(~12);

        
    }
}