package com.martinyuyy.designpattern;

/**
 * 双重校验锁实现对象单例（线程安全）
 *
 * 关于指令重排以及volatile关键字可以查看  https://blog.csdn.net/blueheart20/article/details/52117761
 * <br>
 * created date 2019/12/19 9:49
 *
 * @author martinyuyy
 */

public class SingletonDemo {

    //step1 单例模式下，构造方法必须是私有的
    private SingletonDemo(){

    }

    // step2 提供一个供外部访问的实例, 使用volatile 关键字修饰，禁止JVM的指令重排，保证在多线程情况下也能正常运行
    private volatile static SingletonDemo uniqueInstance;

    public static SingletonDemo getUniqueInstance() {
        // 先判断对象有没有被实例过， 没被实例才能进入
        if (uniqueInstance == null) {
            // 类对象加锁
            synchronized (SingletonDemo.class) {
                if (uniqueInstance == null) {
                    // 这段代码分三步执行
                    //1.为 uniqueInstance 分配内存空间
                    //2.初始化 uniqueInstance
                    //3.将 uniqueInstance 指向分配的内存地址
                    //但是由于 JVM 具有指令重排的特性，执行顺序有可能变成 1->3->2。
                    //指令重排在单线程环境下不会出现问题，但是在多线程环境下会导致一个线程获得还没有初始化的实例。
                    // 例如，线程 T1 执行了 1 和 3，此时 T2 调用 getUniqueInstance() 后发现 uniqueInstance 不为空
                    // 因此返回 uniqueInstance，但此时 uniqueInstance 还未被初始化。
                    uniqueInstance = new SingletonDemo();
                }
            }
        }
        return uniqueInstance;
    }
}
