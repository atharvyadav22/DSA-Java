package Strings.Hashing;

import java.util.HashSet;

//Problem No-409 https://leetcode.com/problems/longest-palindrome/description/
public class LongestPalindrome {

    public static int longestPalindrome(String s) {

        HashSet<Character> set = new HashSet<>();
        int count = 0;

        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                count += 2;
                set.remove(c);
            } else {
                set.add(c);
            }
        }

        if (!set.isEmpty()) {
            count += 1;
        }

        return count;
    }
}



