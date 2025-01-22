package Strings;

//Problem No-383 https://leetcode.com/problems/ransom-note/description/
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] arr = new int[26];

        for(char c: magazine.toCharArray()){
            arr[c - 'a']++;
        }

        for(char c: ransomNote.toCharArray()){

            if(arr[c - 'a'] == 0){
                return false;
            }

            arr[c - 'a']--;
        }

        return true;
    }
}
