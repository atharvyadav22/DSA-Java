package Arrays.TwoPointer;

//Problem No-27 https://leetcode.com/problems/remove-element/?envType=problem-list-v2&envId=array
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
