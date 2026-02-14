package Strings;

//Problem No-76 https://leetcode.com/problems/minimum-window-substring/description/
public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {

        if(s.length() < t.length()) return ""; // if t is bigger than s

        int[] arr = new int[128];
        int count = 0;
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int start = 0;

        // Add all t to make its count++ in arr
        for(char c: t.toCharArray()){
            arr[c]++;
        }

        // Two pointer to expand and shrink
        for(int right=0; right < s.length(); right++){

            char c = s.charAt(right);
            if(arr[c] > 0) count++; // tracks t
            arr[c]--; // removes values to help track

            // if t value satisfies required shrink to fin minLen
            while(count == t.length()){
                if(right - left + 1 < minLen){ // Only update if found minimum
                    minLen = right - left + 1; // length
                    start = left; // gives us start pos of minLen index
                }

                char l = s.charAt(left);
                arr[l]++; // re-adds value to help track

                if(arr[l] > 0) count--; // checks if it was t

                left++; // shrink
            }

        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start,minLen + start);
    }
}
