package Greedy;

import java.util.Arrays;

//Problem No-561 https://leetcode.com/problems/array-partition/description/?envType=problem-list-v2&envId=greedy
public class ArrayPartition {
    public int arrayPairSum(int[] nums) {

        Arrays.sort(nums);

        int sum = 0;

        for(int i = 0; i < nums.length; i +=2){

            sum += nums[i];
        }

        return sum;

    }
}
