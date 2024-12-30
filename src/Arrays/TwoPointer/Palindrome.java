package Arrays.TwoPointer;

//Problem No-125 https://leetcode.com/problems/valid-palindrome/description/?envType=problem-list-v2&envId=two-pointers
public class Palindrome {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int l = 0;
        int r = n - 1;

        while (l <= r) {
            char lc = s.charAt(l);
            char rc = s.charAt(r);

            if (lc >= 'A' && lc <= 'Z') lc = (char) (lc + 32);
            if (rc >= 'A' && rc <= 'Z') rc = (char) (rc + 32);

            if (!((lc >= 'a' && lc <= 'z') || (lc >= '0' && lc <= '9'))) l++;
            else if (!((rc >= 'a' && rc <= 'z') || (rc >= '0' && rc <= '9'))) r--;
            else {
                if (lc != rc) return false;
                l++;
                r--;
            }
        }

        return true;
    }
}
