package com.learn.design.patterns.creation.singleton._enum;

/**
 * 单例模式
 */
public enum Enum4Singleton {
    INSTANCE;

    public static void main(String[] args) {
        Enum4Singleton enum4Singleton1 = Enum4Singleton.INSTANCE;
        Enum4Singleton enum4Singleton2 = Enum4Singleton.INSTANCE;
         boolean result = enum4Singleton1 == enum4Singleton2;
        System.out.println(result);
    }
}
