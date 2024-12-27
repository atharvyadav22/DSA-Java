package Arrays.Hashmap;

import java.util.HashSet;

//Problem No-217 https://leetcode.com/problems/contains-duplicate/description/
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
