package SlidingWindow;

import java.util.Arrays;

//Problem No-1984 https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/description/?envType=problem-list-v2&envId=sorting
public class MinDiffBtwnHighAndLow {
    public int minimumDifference(int[] nums, int k) {

        if(k > nums.length) return -1;
        else if(k == 1) return 0;

        Arrays.sort(nums);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i <= nums.length - k; i++) {
            int diff = nums[i + k - 1] - nums[i];
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }
}
