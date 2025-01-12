package Strings.Hashing;

import java.util.HashMap;

//Problem No-242 https://leetcode.com/problems/valid-anagram/description/
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c: t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) - 1);
        }

        for(int i: map.values()){
            if(i != 0){
                return false;
            }
        }

        return true;

    }
}
