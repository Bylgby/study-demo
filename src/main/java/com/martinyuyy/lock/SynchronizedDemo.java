package com.martinyuyy.lock;

/**
 * <br>
 * created date 2019/12/19 11:43
 *
 * @author maxiaowei
 */

public class SynchronizedDemo {



    public synchronized void test1() {
        System.out.println("lock class");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("lock class");
    }

    public synchronized void test2() {
        System.out.println("lock Object");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("lock Object");
    }
}
