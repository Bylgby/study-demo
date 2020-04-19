package com.martinyuyy.algorithm;

import java.math.BigInteger;

/**
 * 二进制位运算，
 * << 1 表示左移，相当于把数左移一位，然后补0，结果为原数的2倍
 * >>> 1 表示右移，相当于把数右移一位，然后补0，结果为原数的1/2 整数商， 逻辑右移1位，左边补0即可。
 * >> 算术右移，算术右移时保持符号位不变，除符号位之外的右移一位并补符号位1。补的1仍然在符号位之后。
 * 所以， 如果是负数，使用逻辑右移的结果就不是除以2了， 而算术右移就是
 *
 * 位的 “或”  “与” 运算
 *  | 逻辑或运算，意思是参与运算的位中只要有一个位是1，那么最终的结果就是1。
 *  & 逻辑与运算，意思是参与运算的位中只有都为1时，结果才是1
 *  ^ 位的“异或”
 * 逻辑“异或”和“或”有所不同，它具有排异性，也就是说如果参与操作的位相同，那么最终结果就为0（假），否则为 1（真）。
 * created date 2020/1/16 15:50
 *
 * @author maxiaowei
 */
public class BinaryDemo {

    public static void main(String[] args) {
        int a = 53;
        int b = 35;
        int m = 1;

        System.out.println(String.format("整数%d的二进制向左移%d位的结果是%d", a , m, leftShift(a, m)));

        System.out.println(String.format("整数%d的二进制向右移%d位的结果是%d", a , m, rightShift(a, m)));



        System.out.println(String.format("数字%d(%s)和数字%d(%s)的按位‘或’结果是%d(%s)",
                a, decimalToBinary(a), b, decimalToBinary(b), BinaryDemo.or(a, b), decimalToBinary(BinaryDemo.or(a, b)))); //获取十进制数53和35的按位“或”

        System.out.println(String.format("数字%d(%s)和数字%d(%s)的按位‘与’结果是%d(%s)",
                a, decimalToBinary(a), b, decimalToBinary(b), BinaryDemo.and(a, b), decimalToBinary(BinaryDemo.and(a, b))));  //获取十进制数53和35的按位“与”

        System.out.println(String.format("数字%d(%s)和数字%d(%s)的按位‘异或’结果是%d(%s)",
                a, decimalToBinary(a), b, decimalToBinary(b), BinaryDemo.xor(a, b), decimalToBinary(BinaryDemo.xor(a, b))));  //获取十进制数53和35的按位“异或”

        int[] arr = {1,3,2,3,2};


        int res = 0;

        res = 1^3^2^3^2;
        System.out.println(res);
        res = 0;
        for (int i = 0; i < arr.length; i++) {
            res ^= arr[i];
        }

        System.out.println(res);
    }

    /**
     *  十进制转换为二进制
     * @param a
     * @return
     */
    private static String decimalToBinary(int a) {
        BigInteger bi = new BigInteger(String.valueOf(a)); //转换成BigInteger类型，默认是十进制
        return bi.toString(2);
    }

    /**
     *  二进制转换为十进制
     * @param binaryStr
     * @return
     */
    private static int binaryToDecimal(String binaryStr) {
        BigInteger bi = new BigInteger(binaryStr, 2); //转换为BigInteger类型，参数2指定的是二进制
        return Integer.parseInt(bi.toString()); //默认转换成十进制
    }

    /**
     *  二进制按位左移
     * @param num
     * @param m
     * @return
     */
    public static int leftShift(int num, int m) {
        return num << m;
    }

    /**
     *  二进制按位算术右移
     * @param num
     * @param m
     * @return
     */
    public static int rightShift(int num, int m) {
        return num >> m;
    }

    /**
     *  二进制按位或运算
     * @param num
     * @param num1
     * @return
     */
    public static int or(int num, int num1) {
        return num | num1;
    }

    /**
     *  二进制按位与运算
     * @param num
     * @param num1
     * @return
     */
    public static int and(int num, int num1) {
        return num & num1;
    }

    /**
     *  二进制按位异或运算
     * @param num
     * @param num1
     * @return
     */
    public static int xor(int num, int num1) {
        return num ^ num1;
    }
}
