package com.martinyuyy.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 *  两数之和
 * 给定一个数组、目标值， 要求找出数组内相加为目标值的下标
 *  int[] arr = [2, 4, 7];
 *  int target = 9;
 *   返回  [0, 2]
 *
 * <br>
 * created date 2019/12/20 10:03
 *
 * @author maxiaowei
 */

public class TwoSumDemo {

    public static void main(String[] args) {
        int[] nums = {2, 2, 9};
        int target = 11;
        twoSum(nums, target);

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
