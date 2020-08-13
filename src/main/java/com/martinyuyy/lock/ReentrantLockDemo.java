package com.martinyuyy.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLock
 * <br>
 * created date 2019/12/29 15:56
 *
 * @author maxiaowei
 */

public class ReentrantLockDemo {

    // 非公平锁

    // 公平锁
    private static Lock fairLock = new ReentrantLock(true);


    public static void main(String[] args) {
        new Thread(() -> {
            lockMethod();
        }).start();
    }

    public static void lockMethod() {
        Lock unfairLock = new ReentrantLock(false);
        try {
            // 创建 Condition
            unfairLock.lock();
            Condition condition = unfairLock.newCondition();
            System.out.println("开始wait");
            //通过创建Condition对象来使线程wait，必须先执行lock.lock方法获得锁
            condition.await();
            //signal方法唤醒
            condition.signal();
            System.out.println("唤醒");
            for (int i = 0; i < 5; i++) {
                System.out.println("ThreadName=" + Thread.currentThread().getName() + (" " + (i + 1)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 释放锁
            unfairLock.unlock();
        }
    }
}
