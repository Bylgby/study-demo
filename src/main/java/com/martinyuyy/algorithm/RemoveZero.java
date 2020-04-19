package com.martinyuyy.algorithm;

import java.util.Arrays;

/**
 * created date 2020/4/19 19:04
 * 给定一个数组，要求删除为0的元素，并把元素按原来的位置补到删除的位置上
 *
 * @author maxiaowei
 */
public class RemoveZero {


    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 0, 4, 6};
        remove4(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void remove(int[] arr) {
        // 双指针解法，一个指针用来遍历数组，另一个指针记录删除元素的位置

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] != 0 ) {
                arr[j] = arr[i];
                if ( i != j ) {
                    arr[i] = 0;
                }
                j++;
            }
        }
    }

    public static void remove1(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] != 0 ) {
                arr[j++] = arr[i];
            }
        }

        for (int i = j; i < arr.length; i++) {
            arr[i] = 0;
        }

    }

    public static void remove2(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                if (i != j) {
                    arr[i] = 0;
                }
                j++;
            }
        }
    }

    public static void remove3(int[] arr){
        int j =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                if (i != j) {
                    arr[i] = 0;
                }
                j++;
            }
        }
    }

    public static void remove4(int[] arr){
        int j =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
    }
}
