package Arrays;

import java.util.HashSet;
import java.util.Set;

//Problem No-128 https://leetcode.com/problems/longest-consecutive-sequence/description/
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }

        int max = 0;
        for (int i : set) {
            if (!set.contains(i - 1)) {
                int curr = i;
                int count = 1;
                while (set.contains(curr + 1)) {
                    curr++;
                    count++;
                }
                max = Math.max(max, count);
            }
        }

        return max;
    }
}
