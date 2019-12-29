package com.martinyuyy.lock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读写锁
 * <br>
 * created date 2019/12/29 16:24
 *
 * @author maxiaowei
 */

public class ReadWriteLockDemo {

    public static void main(String[] args) {
        ReadWriteLock readLock = new ReentrantReadWriteLock();
        // 读锁
        readLock.readLock();

        // 写锁
        readLock.writeLock();
    }
}
