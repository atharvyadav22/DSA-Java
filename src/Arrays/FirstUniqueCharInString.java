package Arrays;

//Problem No-387 https://leetcode.com/problems/first-unique-character-in-a-string/description/?envType=problem-list-v2&envId=queue
public class FirstUniqueCharInString {

    public int firstUniqueChar(String s) {
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
