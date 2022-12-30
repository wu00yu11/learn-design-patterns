package com.learn.design.patterns.behavior.observer;

/**
 * @Classname com.learn.design.patterns.behavior.observer.User
 * @Description 观察者实现
 * @Date 2020/8/3 0003
 * @Author jingjing.zhang
 */
public class User implements Observer {
    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }

    private void read() {
        System.out.println(name + " 收到推送消息： " + message);
    }

}
