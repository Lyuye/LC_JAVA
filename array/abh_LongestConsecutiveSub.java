package com.lc.lyuye.array;
import java.util.Arrays;
import java.util.HashMap;
public class abh_LongestConsecutiveSub {



    public static int solution2 (int[] nums){

        HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();
        int res = 0;
        for (int i = 0; i < nums.length; i++){

            int left  = map.containsKey(nums[i] - 1) ? map.get(nums[i] - 1) : 0;
            int right = map.containsKey(nums[i] + 1) ? map.get(nums[i] + 1) : 0;
            int sum = left + right + 1;
            res = Math.max(res, sum);
            map.put(nums[i], sum);
            map.put(nums[i] - left, sum);
            map.put(nums[i] - right, sum);
        }
        
        return res;
    }



    //Sort for fun
    public static int solution1 (int[] nums) {
        Arrays.sort(nums);
        int res = 0, temp = 0;
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i+1] == nums[i] + 1) 
                temp++;
            else {
                res = Math.max(res, temp);
                temp = 0;
            }
        }
        return res + 1;
    }

    public static void main(){
        int nums[] = {2,7,11,15,8,80,16,6};
        System.out.println(solution2(nums));

    }
}