package com.lc.lyuye.array;

import java.util.*;

public class aaa_twosum {


    public static int[] solution2(int[] nums, int target) {

        if (nums == null || nums.length < 2) return null;
        int [] res = new int [2];
        Map <Integer, Integer> hash = new HashMap<Integer, Integer>(); 
        //HashSet is not enough for index
        for (int i = 0; i < nums.length; i++){
            if (hash.containsKey(target - nums[i])){
                res[1] = i;
                res[0] = hash.get(target - nums[i]);
            }
            hash.put(nums[i], i);
        }

        return res;
    }
    // n^2
    public static int[] solution1(int[] nums, int target) {
        int res[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }

            }
        }
        return null;
    }

    public static void test(){
        int nums[] = {2,7,11,15};
        System.out.println(solution2(nums, 26)[0] + " " + solution2(nums, 26)[1]);

    }
}
