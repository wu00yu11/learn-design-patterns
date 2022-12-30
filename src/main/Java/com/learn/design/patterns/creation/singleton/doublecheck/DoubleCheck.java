package com.learn.design.patterns.creation.singleton.doublecheck;

import com.learn.design.patterns.creation.singleton.lazy.Lazy4Singleton;

import java.util.Objects;

/**
 * 双检锁模式
 */
public class DoubleCheck {
    private static volatile DoubleCheck INSTANCE;
    private DoubleCheck(){}

    private static DoubleCheck getINSTANCE(){
        if (Objects.isNull(INSTANCE)){
            synchronized (DoubleCheck.class){
                if (Objects.isNull(INSTANCE)){
                    INSTANCE = new DoubleCheck();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        DoubleCheck lazy4Singleton1 = DoubleCheck.getINSTANCE();
        DoubleCheck lazy4Singleton2 = DoubleCheck.getINSTANCE();

        boolean result = lazy4Singleton1 == lazy4Singleton2;
        System.out.println(result);
    }
}
