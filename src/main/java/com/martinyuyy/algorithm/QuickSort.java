package com.martinyuyy.algorithm;

/**
 * created date 2020/8/10 9:11
 * 快排
 *
 * @author maxiaowei
 */
public class QuickSort {


    public static void main(String[] args) {

    }


    public static void quickSort(int[] arr, int left, int right) {
        int key = arr[left];

        while (left < right) {
            while (left < right && arr[right] <= key) {
                ++right;
            }
            arr[left] = arr[right];


        }

    }
}
