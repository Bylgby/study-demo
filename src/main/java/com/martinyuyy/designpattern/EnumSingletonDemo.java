package com.martinyuyy.designpattern;

/**
 * created date 2020/8/20 17:19
 * <p>
 * 枚举实现单例模式
 *
 * @author martinyuyy
 */
public class EnumSingletonDemo {

    private EnumSingletonDemo() {

    }

    static enum EnumSingleton {

        INSTANCE;

        private EnumSingletonDemo instance;

        private EnumSingleton() {
            instance = new EnumSingletonDemo();
        }

        public EnumSingletonDemo getInstance() {
            return instance;
        }
    }

    public static EnumSingletonDemo getInstance(){
        return EnumSingleton.INSTANCE.getInstance();
    }

    public static void main(String[] args) {
        EnumSingletonDemo enumSingletonDemo = EnumSingletonDemo.getInstance();
        EnumSingletonDemo enumSingletonDemo1 = EnumSingletonDemo.getInstance();
        System.out.println(enumSingletonDemo == enumSingletonDemo1);
    }
}
