package com.martinyuyy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 测试实体
 * <br>
 * created date 2019/12/24 15:35
 *
 * @author maxiaowei
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personal implements Comparable{

    private String name;

    private String gander;

    private Integer age;


    @Override
    public int compareTo(Object o) {
        if (o == null) {
            throw new NullPointerException("args is null");
        }
        if (o instanceof Personal) {
            return this.getAge().compareTo(((Personal) o).getAge());
        }
        throw new ClassCastException("not of the same type");
    }
}
