package com.martinyuyy.lambda;

import com.martinyuyy.pojo.Personal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 比较器
 * <br>
 * created date 2019/12/24 15:46
 *
 * @author maxiaowei
 */

public class ComparatorDemo {

    public static void main(String[] args) {
        System.out.println("排序前：");
        List<Personal> personals = getPersonal();
        personals.forEach(item -> System.out.println(item.getName()));
        // 因为Personal 类已经实现了Comparable 接口，重写了比较方法，所以可以直接比较使用此API
        Collections.sort(personals);

        System.out.println("排序后：");
        personals.forEach(item -> System.out.println(item.getName()));

        System.out.println("lambda 排序后：");
        personals.sort(((o1, o2) -> o1.getName().compareTo(o2.getName())));
        personals.forEach(item -> System.out.println(item.getName()));
    }

    private static List<Personal> getPersonal() {
        List<Personal> result = new ArrayList<Personal>();

        result.add(new Personal("mkyong", "boy", 33));
        result.add(new Personal("alvin", "girl", 20));
        result.add(new Personal("jason", "boy", 10));
        result.add(new Personal("iris", "girl", 55));

        return result;
    }
}
