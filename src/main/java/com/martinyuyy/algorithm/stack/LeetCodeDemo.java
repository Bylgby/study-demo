package com.martinyuyy.algorithm.stack;


import java.util.Stack;

/**
 * 括号匹配
 * 判断一个字符串是不是有效的括号字符串，即 左右括号是否匹配
 * created date 2020/1/26 12:30
 *
 * @author maxiaowei
 */
public class LeetCodeDemo {


    public static void main(String[] args) {
        System.out.println(isValid("(){}[["));
    }

    public static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char topStr = stack.pop();
                if (c == ')' && topStr != '(') {
                    return false;
                }else if (c == ']' && topStr != '[') {
                    return false;
                }else if (c == '}' && topStr != '{') {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
