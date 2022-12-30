package com.learn.design.patterns.creation.singleton.hungry;

/**
 * 饿汉式,类加载时就进行初始化
 */
public class Hungry4Singleton {
    private static final Hungry4Singleton INSTANCE = new Hungry4Singleton();
    private Hungry4Singleton(){ }

    public static Hungry4Singleton getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        Hungry4Singleton instance1 = Hungry4Singleton.getInstance();
        Hungry4Singleton instance2 = Hungry4Singleton.getInstance();
        boolean equals = instance1 == instance2;
        System.out.println(equals);
    }
}
