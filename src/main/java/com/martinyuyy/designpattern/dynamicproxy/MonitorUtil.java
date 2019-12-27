package com.martinyuyy.designpattern.dynamicproxy;

/**
 * 公共逻辑处理方法
 * <br>
 * created date 2019/12/27 17:22
 *
 * @author maxiaowei
 */

public class MonitorUtil {

    private static ThreadLocal<Long> threadLocal = new ThreadLocal();

    public static void start() {
        threadLocal.set(System.currentTimeMillis());
    }

    public static void finish(String method) {
        long finishTime = System.currentTimeMillis();
        System.out.println("执行" + method + " 方法用时: " + (finishTime - threadLocal.get()) + "ms");
    }
}
