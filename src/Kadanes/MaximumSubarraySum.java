package Kadanes;

//Problem No-53 https://leetcode.com/problems/maximum-subarray/description/
public class MaximumSubarraySum {

    public static int maxSubArray(int[] nums) {

        int maxSum = nums[0];
        int currSum = nums[0];

        int c = 0;

        Integer.toString(c);

        for (int i = 1; i < nums.length; i++) {

            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;
    }
}

