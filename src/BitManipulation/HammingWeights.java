package BitManipulation;

//Problem No-191 https://leetcode.com/problems/number-of-1-bits/description/
public class HammingWeights {
    public int hammingWeight(int n) {
        int count = 0;

        while (n > 0) {
            n = n & (n - 1);
            count++;
        }

        return count;
    }
}
