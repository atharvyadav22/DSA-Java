package Arrays.XOR;

//Problem No-268 https://leetcode.com/problems/missing-number/description/?envType=problem-list-v2&envId=array
public class MissingNumber {
    public int missingNumber(int[] nums) {

        int xor1 = 0;
        int xor2 = 0;

        for (int i = 1; i <= nums.length; i++) {
            xor1 ^= i;
        }

        for (int num : nums) {
            xor2 ^= num;
        }

        return xor1 ^ xor2;
    }
}
