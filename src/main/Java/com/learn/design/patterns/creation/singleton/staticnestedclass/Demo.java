package com.learn.design.patterns.creation.singleton.staticnestedclass;

/**
 * 静态内部类方式
 */
public class Demo {
    private static class SingletOnHolder{
        private static final Demo INSTANCE = new Demo();
    }
    private Demo(){}
    public static Demo getINSTANCE(){
        return SingletOnHolder.INSTANCE;
    }

    public static void main(String[] args) {
        Demo instance1 = Demo.getINSTANCE();
        Demo instance2 = Demo.getINSTANCE();
        System.out.println(instance1 == instance2);
    }
}
