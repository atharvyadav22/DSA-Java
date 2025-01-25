package Strings.PrefixSum;

//Problem No-303 https://leetcode.com/problems/range-sum-query-immutable/description/
public class RangeSumQueryImmutable {

    class NumArray {
        private int[] prefixSum;

        public NumArray(int[] nums) {
            // Initialize the prefixSum array
            prefixSum = new int[nums.length];
            prefixSum[0] = nums[0]; // First element is the same as nums[0]

            // Compute the prefix sum
            for (int i = 1; i < nums.length; i++) {
                prefixSum[i] = prefixSum[i - 1] + nums[i];
            }
        }

        public int sumRange(int left, int right) {
            if (left == 0) {
                return prefixSum[right];
            }
            return prefixSum[right] - prefixSum[left - 1];
        }

    }
}