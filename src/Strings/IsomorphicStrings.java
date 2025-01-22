package Strings;

//Problem No-205 https://leetcode.com/problems/isomorphic-strings/description/
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (map1[sChar] == 0 && map2[tChar] == 0) {
                map1[sChar] = tChar;
                map2[tChar] = sChar;
            } else if (map1[sChar] != tChar || map2[tChar] != sChar) {
                return false;
            }
        }

        return true;
    }
}
