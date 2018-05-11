package com.lc.lyuye.array;
import java.util.*;

public class abh_LongestConsecutiveSub {

    // HashSet
    public static int solution3 (int[] nums){

        Set myset = new HashSet<>();
        int res = 0;
        for (int i : nums){
            myset.add(i);
        }
        for (int i : nums){
            int left = i - 1;
            int right = i + 1;
            int count = 1; // count is not 0
            while (myset.contains(left)){
                count++;
                left--;
                myset.remove(left);
            }
            while (myset.contains(right)){
                count++;
                right++;
                myset.remove(right);
            }
            res = Math.max(res, count);   
        }
        return res;
    }

    // HashMap
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

    // Sort for fun
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