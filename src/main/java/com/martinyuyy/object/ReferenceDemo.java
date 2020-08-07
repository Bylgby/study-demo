package com.martinyuyy.object;

import com.martinyuyy.pojo.Personal;

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * 强引用、软引用、弱引用、虚引用
 * created date 2020/6/10 18:09
 *
 * @author maxiaowei
 */
public class ReferenceDemo {


    public static void main(String[] args) {
        weakReference();
    }


    // 强引用
    // new一个对象，此时为强引用，强引用的对象永远不会被回收，除非 personal=null
    // 因为p1 引用了personal, 所以不会被回收
    private static void strongReference() {
        Personal personal = new Personal();
        Personal personal1 = personal;
        personal = null;
        System.gc();
        System.out.println(personal);
        System.out.println(personal1);
    }

    // 软引用
    // gc回收时，如果内存充足不会被回收，否则被回收
    private static void softReference() {
        Personal p = new Personal();
        SoftReference<Personal> p1 = new SoftReference<>(p);
        p = null;
        System.out.println(p);
        System.out.println(p1.get());

        byte[] bytes = new byte[10 * 1024 * 1024];
        System.out.println(p);
        System.out.println(p1.get());
    }

    // 弱引用，每次gc都会回收
    private static void weakReference() {
        Personal p = new Personal();
        WeakReference<Personal> p1 = new WeakReference<>(p);

        System.out.println(p);
        System.out.println(p1.get());

        p = null;
        System.gc();
        System.out.println(p);
        System.out.println(p1.get());
    }

    // 虚引用，无法访问对象
    private static void phantomReference() {
        Personal personal = new Personal();

    }
}
