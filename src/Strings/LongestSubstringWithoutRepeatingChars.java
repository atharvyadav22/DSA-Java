package Strings;

import java.util.HashSet;
import java.util.Set;

//Problem No- 3 https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class LongestSubstringWithoutRepeatingChars {
    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int maxlen = 0;
        Set<Character> set = new HashSet<>();

        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);

            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            maxlen = Math.max(maxlen, right - left + 1);
        }

        return maxlen;
    }
}
