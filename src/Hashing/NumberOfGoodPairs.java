package Hashing;

import java.util.HashMap;

//Problem No-1512 https://leetcode.com/problems/number-of-good-pairs/description/
public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;

        for(int i : nums){

            if(map.containsKey(i)){
                count += map.get(i);
            }
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        return count;
    }
}
