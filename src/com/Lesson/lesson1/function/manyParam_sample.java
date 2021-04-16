package com.Lesson.lesson1.function;

public class manyParam_sample {
    public void printinfo(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    /**
     * 支持输入可变数目个String类型的参数
     * 使用方法上和使用String[] 作参数的使用方法类似
     * printinfo与printinfo1的区别：
     * printinfo1的参数可以为空：printinfo1()
     * printinfo的参数不能为空，至少需要写一个null：printinfo(null)
     * 变长形参一定要放在参数列表的最后
     * @param agrs
     */
    public void printinfo1(String... agrs){
        for (int i = 0; i < agrs.length; i++) {
            System.out.println(agrs[i]);
        }
    }

    public static void main(String[] args) {
        String[] info1 = {"cl","15"};
        String[] info2 = {"武汉","student"};
        manyParam_sample test = new manyParam_sample();
        test.printinfo(info1);
        test.printinfo1(info2);
    }

}
