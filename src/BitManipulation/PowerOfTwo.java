package BitManipulation;

//Problem No-231 https://leetcode.com/problems/power-of-two/?envType=problem-list-v2&envId=bit-manipulation
public class PowerOfTwo {

    public static boolean isPowerOfTwo(int n) {

        return (n & (n - 1)) == 0;

    }
}
