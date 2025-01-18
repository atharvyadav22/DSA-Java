package TwoPointer;

//Problem No-26 https://leetcode.com/problems/remove-duplicates-from-sorted-array/?envType=problem-list-v2&envId=array
public class RemoveDuplicatesSortedArray {

    public int removeDuplicates(int[] nums) {

        int k = 0;

        for(int i=0; i<nums.length;i++){

            if(nums[k] != nums[i]){
                k++;
                nums[k] = nums[i];
            }
        }

        return k+1;
    }
}
