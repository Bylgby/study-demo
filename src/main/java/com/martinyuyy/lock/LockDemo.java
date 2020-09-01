package com.martinyuyy.lock;

/**
 * created date 2020/9/1 11:29
 * <p>
 *
 * @author martinyuyy
 */
public class LockDemo {


    public static void main(String[] args) {
        new Thread(LockDemo::test1).start();
        new Thread(() -> new LockDemo().test3()).start();
    }


    public synchronized static void test1() {
        try {
            System.out.println("test1 lock class.");
            Thread thread = Thread.currentThread();
            System.out.println("thread: " + thread.getName());
            Thread.sleep(5000);
            test2();
            System.out.println("test1 unlock class.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private synchronized static void test2() {
        System.out.println("test2 lock class.");

        System.out.println("test2 unlock class.");

    }

    public synchronized void test3() {
        try {
            System.out.println("test3 lock class.");
            Thread thread = Thread.currentThread();
            System.out.println("thread: " + thread.getName());
            Thread.sleep(2000);
            test4();
            System.out.println("test3 unlock class.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private synchronized void test4() {
        System.out.println("test4 lock class.");

        System.out.println("test4 unlock class.");

    }
}
