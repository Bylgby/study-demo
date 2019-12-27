package com.martinyuyy.designpattern.staticproxy;

/**
 * 静态代理使用方法
 *
 * 静态代理： 三要素  公共接口，代理类，委托类， 代理类持有委托类的实例， 通过代理类去调用具体的实例方法， 从而达到在
 * 调用具体方法实现时， 处理一些公共逻辑的作用。
 * <br>
 * created date 2019/12/27 16:56
 *
 * @author maxiaowei
 */

public class StaticProxyDemo {

    public static void main(String[] args) {

        Lion lion = new Lion("猪肉", 10);

        Cat proxy = new LionProxy(lion);

        proxy.eat(lion.getFood());
        proxy.run(lion.getStep());


    }
}
