package com.martinyuyy.designpattern.staticproxy;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 静态代理的代理类
 * <br>
 * created date 2019/12/27 16:54
 *
 * @author maxiaowei
 */

@Data
@AllArgsConstructor
public class LionProxy implements Cat{

    private Lion lion;


    @Override
    public void eat(String food) {
        System.out.println("proxy lion!");
        lion.eat(food);
    }

    @Override
    public void run(int step) {
        System.out.println("proxy lion!");
        lion.run(step);
    }
}
