package com.learn.design.patterns.creation.singleton.lazy;

import java.util.Objects;

/**
 * 懒汉式
 */
public class Lazy4Singleton {
    private static Lazy4Singleton INSTANCE = null;
    private Lazy4Singleton(){}

    public static synchronized Lazy4Singleton getINSTANCE(){
        if (Objects.isNull(INSTANCE)){
            System.out.println("INSTANCE is null");
            INSTANCE = new Lazy4Singleton();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        Lazy4Singleton lazy4Singleton1 = Lazy4Singleton.getINSTANCE();
        Lazy4Singleton lazy4Singleton2 = Lazy4Singleton.getINSTANCE();

       boolean result = lazy4Singleton1 == lazy4Singleton2;
        System.out.println(result);
    }
}
