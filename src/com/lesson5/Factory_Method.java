package com.lesson5;

public class Factory_Method {
    public static void main(String[] args) {
        BMW b3 = new BMW3_Factory().productBMW();
        BMW b5 = new BMW5_Factory().productBMW();

        b3.showinfo();
        b5.showinfo();
    }
}

/**
 * 定义产品接口
 */
interface BMW{
    //产品信息
    void showinfo();
}

class BMW3 implements BMW{

    @Override
    public void showinfo() {
        System.out.println("宝马3系汽车");
    }
}

class BMW5 implements BMW{

    @Override
    public void showinfo() {
        System.out.println("宝马5系汽车");
    }
}

/**
 * 定义工厂接口
 */
interface BMW_Factory{
    BMW productBMW();
}

class BMW3_Factory implements BMW_Factory{

    @Override
    public BMW productBMW() {
        System.out.println("生产BMW3系汽车");
        return new BMW3();
    }
}

class BMW5_Factory implements BMW_Factory{

    @Override
    public BMW productBMW() {
        System.out.println("生产BMW5系汽车");
        return new BMW3();
    }
}
