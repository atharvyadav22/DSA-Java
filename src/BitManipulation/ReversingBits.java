package BitManipulation;

//Problem No-190 https://leetcode.com/problems/reverse-bits/submissions/1509528441/
public class ReversingBits {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            result |= (n & 1);
            n >>= 1;
        }
        return result;
    }
}
