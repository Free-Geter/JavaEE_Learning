package com.Jsample.Scanner;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("next 输出");
        if(scanner.hasNext())
            // next方法只从缓冲区读入第一个空白字符前的内容（不含空白字符）
            System.out.println(scanner.next());

        //清空缓冲区
        scanner.nextLine();

        System.out.println("nextline 输出");
        if (scanner.hasNext())
            // nextline直接读入一整行，不受空白字符影响
            System.out.println(scanner.nextLine());

        System.out.println("int 数据输入测试");
        if (scanner.hasNextInt())
            System.out.println(scanner.nextInt());
        else System.out.println("输入错误 ");

        // 记得使用完Scanner以后关闭对象节省内存
        scanner.close();
    }
}
