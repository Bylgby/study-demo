package com.martinyuyy.atomic;

import com.martinyuyy.pojo.Personal;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 可将对象的所有操作转换为原子操作
 * <br>
 * created date 2019/12/29 16:20
 *
 * @author maxiaowei
 */

public class AtomicReferenceDemo {

    public static void main(String[] args) {
        AtomicReference<Personal> atomicReference = new AtomicReference<>();

        atomicReference.set(new Personal("JOY", "BOY", 1));
    }
}
