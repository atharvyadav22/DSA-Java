package Arrays.TwoPointer;

//Problem No-125 https://leetcode.com/problems/valid-palindrome/description/?envType=problem-list-v2&envId=two-pointers
public class Palindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
