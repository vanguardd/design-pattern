package com.hit.strategy;

/**
 * author:Charies Gavin
 * date:2017/9/17,19:54
 * https:github.com/guobinhit
 * description:策略模式（抽象类 Duck 的具体实现类）
 */
public class MallarDuck extends Duck {
    /**
     * 通过无参的构造器，对行为进行初始化
     */
    public MallarDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void fly() {

    }

    @Override
    public void quack() {

    }

    @Override
    public void display() {
        System.out.println("I'm a really Mallard Duck!");
    }
}
