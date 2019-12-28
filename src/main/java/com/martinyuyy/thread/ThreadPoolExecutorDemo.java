package com.martinyuyy.thread;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.martinyuyy.lock.SynchronizedDemo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 线程池创建 demo
 * <br>
 * created date 2019/12/19 15:46
 *
 * @author maxiaowei
 */

public class ThreadPoolExecutorDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder()
                .setNameFormat("demo-pool-%d").build();

        ExecutorService executorService = new ThreadPoolExecutor(5, 200,
                30000, TimeUnit.SECONDS,
                new LinkedBlockingQueue<Runnable>(1024), namedThreadFactory, new ThreadPoolExecutor.CallerRunsPolicy());

//        for (int i = 0; i < 5; i++) {
//            CallableDemo callableDemo = new CallableDemo();
//            Future submit = executorService.submit(callableDemo);
//            // 实现Callable接口创建的线程， 会有返回值， 调用get()方法会返回，执行结果， 调用该方法时会阻塞当前线程直到返回。
//            System.out.println(submit.get());
//        }

        SynchronizedDemo demo = new SynchronizedDemo();

        executorService.execute(() -> SynchronizedDemo.test1());
        executorService.execute(() -> demo.test2());

    }
}
