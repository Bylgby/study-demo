package com.martinyuyy.algorithm;

import java.util.Arrays;

/**
 * created date 2020/4/19 19:35
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 * @author maxiaowei
 */
public class RemoveRepeatElement {

    public static void main(String[] args) {
        int[] arr= new int[]{0,1,2,2,3,3,4};
        System.out.println(remove2(arr));
        System.out.println(Arrays.toString(arr));
    }


    public static int remove(int[] arr) {
        // 双指针解法
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if ( arr[j] != arr[i] ) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j+1;
    }

    public static int remove1(int[] arr){
        int j = 0,i=1;
        while(i < arr.length){
            if (arr[i] == arr[j]) {
                i++;
            }else{
                j++;
                arr[j] = arr[i];
                i++;
            }
        }
        return j+1;

    }


    public static int remove2(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[j] != arr[i]) {
                j++;
                arr[j] = arr[i];
            }
        }

        return j+1;
    }
}
