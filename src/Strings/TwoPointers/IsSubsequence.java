package Strings.TwoPointers;

//Problem No- 392 https://leetcode.com/problems/is-subsequence/
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {

        int p1 = 0;

        for(int i =0; i< t.length(); i++){

            if(p1< s.length() && s.charAt(p1) == t.charAt(i)){
                p1++;
            }
        }

        return p1 == s.length();
    }
}
