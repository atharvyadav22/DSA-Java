package Strings.Hashing;

import java.util.HashMap;

//Problem No-1189 https://leetcode.com/problems/maximum-number-of-balloons/description/
public class MaximumNoBalloons {
    public int maxNumberOfBalloons(String text) {

        HashMap<Character, Integer> count = new HashMap<>();
        for (char c : text.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        int b = count.getOrDefault('b', 0);
        int a = count.getOrDefault('a', 0);
        int l = count.getOrDefault('l', 0) / 2;
        int o = count.getOrDefault('o', 0) / 2 ;
        int n = count.getOrDefault('n', 0);


        return Math.min(Math.min(Math.min(b, a), l), Math.min(o, n));
    }
}
