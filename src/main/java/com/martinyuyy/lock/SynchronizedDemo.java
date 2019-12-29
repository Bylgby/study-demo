package com.martinyuyy.lock;

/**
 * synchronized 修饰静态成员，锁住的是当前类， 修饰普通成员，锁住的是当前对象，两者没有必然联系，
 * 所以当前类被锁住时， 调用一个对象的普通方法不会被阻塞。
 * <br>
 * created date 2019/12/19 11:43
 *
 * @author maxiaowei
 */

public class SynchronizedDemo {

    public static synchronized void test1() {
        System.out.println("lock class");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("lock class");
    }

    public synchronized void test2() {
        System.out.println("lock Object2");
        try {
            test3();
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("lock Object2");
    }

    public synchronized void test3() {
        System.out.println("lock Object3");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("lock Object3");
    }
}
