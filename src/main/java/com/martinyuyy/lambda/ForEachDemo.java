package com.martinyuyy.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * forEach
 * <br>
 * created date 2019/12/24 14:54
 *
 * @author maxiaowei
 */

public class ForEachDemo {

    public static void main(String[] args) {
        mapForEach();
        listForEach();
    }


    public static void mapForEach() {
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);

        items.forEach( (k, v) -> System.out.println("item: key =" + k + ",value=" + v) );
    }

    public static void listForEach() {
        List items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");
        items.add("F");

        items.forEach( item -> System.out.println("item: " + item) );

        items.forEach(System.out::println);
    }

}
