package com.martinyuyy.designpattern.staticproxy;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 静态代理的委托类
 * <br>
 * created date 2019/12/27 16:53
 *
 * @author maxiaowei
 */
@AllArgsConstructor
@Data
public class Lion implements Cat {

    private String food;

    private Integer step;


    @Override
    public void eat(String food) {
        System.out.println("Lion eat " + food);
    }

    @Override
    public void run(int step) {
        System.out.println("Lion run " + step);
    }
}
