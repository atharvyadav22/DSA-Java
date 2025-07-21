package Logical;

//Problem No-326 https://leetcode.com/problems/power-of-three/description/
public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        if(n <= 0) return false;
        while(n != 1) {
            if(n%3 != 0)
                return false;
            n /= 3;
        }
        return true;
    }

}
