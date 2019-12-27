package com.martinyuyy.designpattern.dynamicproxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 委托类
 * <br>
 * created date 2019/12/27 17:16
 *
 * @author maxiaowei
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SoftwareEngineer implements Person {

    private String name;


    @Override
    public void goWorking(String name, String dst) {
        System.out.println("name ="+name+" ， 去 "+dst +" 工作");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
