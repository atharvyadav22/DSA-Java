package BinarySearch;

//Problem No-35 https://leetcode.com/problems/search-insert-position/?envType=problem-list-v2&envId=array
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return low;

    }
}
