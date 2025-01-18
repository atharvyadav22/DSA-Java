package Hashing;

import java.util.HashMap;

//Problem No-169 https://leetcode.com/problems/majority-element/
public class MajorityElementOccurringMoreThan {
    public int majorityElement(int[] nums) {
    HashMap<Integer, Integer> countMap = new HashMap<>();
    int n = nums.length;

    for (int num : nums) {
        countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        if (countMap.get(num) > n / 2) {
            return num;
        }
    }
    return -1;
}
}
