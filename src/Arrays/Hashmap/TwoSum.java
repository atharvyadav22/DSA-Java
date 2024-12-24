package Arrays.Hashmap;

import java.util.HashMap;

//Problem No-1 https://leetcode.com/problems/two-sum/?envType=problem-list-v2&envId=array
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap();

        for (int i=0; i<nums.length; i++){
            int complement = target - nums[i];

            if (map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No Solution");
    }

}
