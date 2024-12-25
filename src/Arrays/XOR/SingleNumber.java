package Arrays.XOR;

//Problem No-136 https://leetcode.com/problems/single-number/?envType=problem-list-v2&envId=array
public class SingleNumber {
    public int singleNumber(int[] nums) {

        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;

    }
}
