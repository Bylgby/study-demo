package com.martinyuyy.designpattern.dynamicproxy;

/**
 * 动态代理公共接口
 * <br>
 * created date 2019/12/27 17:03
 *
 * @author maxiaowei
 */

public interface Person {

    void goWorking(String name, String dst);
    /**
     * 获取名称
     * @return
     */
    String getName( );
    /**
     * 设置名称
     * @param name
     */
    void setName(String name);
}
