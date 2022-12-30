package com.learn.design.patterns.behavior.observer;

/**
 * @Classname com.learn.design.patterns.behavior.observer.Observerable
 * @Description 抽象被观察者接口
 * @Date 2020/8/3 0003
 * @Author jingjing.zhang
 */
public interface Observerable {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
