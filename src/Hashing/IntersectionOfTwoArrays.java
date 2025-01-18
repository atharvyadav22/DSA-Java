package Hashing;

import java.util.HashSet;

//Problem No-349 https://leetcode.com/problems/intersection-of-two-arrays/
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();

        for (int i : nums1) {
            set.add(i);
        }

        for (int i : nums2) {
            if (set.contains(i)) {
                set1.add(i);
            }
        }

        int[] result = new int[set1.size()];
        int index = 0;
        for (int num : set1) {
            result[index++] = num;
        }

        return result;

    }
}
