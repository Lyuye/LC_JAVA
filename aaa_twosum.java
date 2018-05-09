package com.lc.lyuye;
public class aaa_twosum {
    public static int[] twoSum(int[] nums, int target) {
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
        System.out.println(twoSum(nums, 26)[0] + " " + twoSum(nums, 26)[1]);

    }
}
