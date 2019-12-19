package com.martinyuyy.thread;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.Callable;

/**
 * 有返回值的线程 demo
 * <br>
 * created date 2019/12/19 14:41
 *
 * @author maxiaowei
 */

public class CallableDemo implements Callable {


    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " Start. Time = " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        String time = processCommand();
        System.out.println(Thread.currentThread().getName() + " End. Time = " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        return time;
    }

    private String processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
