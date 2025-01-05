package Arrays.Hashing;

import java.util.HashMap;

//Problem No-560 https://leetcode.com/problems/subarray-sum-equals-k/description/?envType=problem-list-v2&envId=array
public class SubArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {

        int prefixSum = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int num : nums) {
            prefixSum += num;

            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

}