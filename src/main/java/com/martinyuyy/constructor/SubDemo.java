package com.martinyuyy.constructor;

/**
 * 子类
 * <br>
 * created date 2019/12/29 14:51
 *
 * @author maxiaowei
 */

public class SubDemo extends SuperDemo {


    public SubDemo(){
        System.out.println("sub init.");
    }


    public static void main(String[] args) {
        SuperDemo superDemo = new SubDemo();

        System.out.println(superDemo.age);
        System.out.println(SubDemo.age);
    }
}
