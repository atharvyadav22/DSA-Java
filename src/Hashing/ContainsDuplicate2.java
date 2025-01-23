package Hashing;

import java.util.HashMap;

//Problem No-219 https://leetcode.com/problems/contains-duplicate-ii/description/
public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0; i < nums.length; i++){

            if(map.containsKey(nums[i]) && Math.abs(map.get(nums[i]) - i) <= k){
                return true;
            }
            map.put(nums[i], i);
        }

        return false;
    }
}
