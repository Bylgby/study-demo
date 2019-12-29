package com.martinyuyy.lock;

import java.util.concurrent.Semaphore;

/**
 * Semaphore是一种基于计数的信号量。它可以设定一个阈值，基于此，多个线程竞争获取许可信号，做完自己的申请后归还，
 * 超过阈值后，线程申请许可信号将会被阻塞。
 * <br>
 * created date 2019/12/29 16:16
 *
 * @author maxiaowei
 */

public class SemaphoreDemo {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);

        try {
            // 申请许可
            semaphore.acquire();
            // 业务逻辑

        } catch (Exception e) {

        } finally {
            // 释放许可
            semaphore.release();
        }
    }
}
