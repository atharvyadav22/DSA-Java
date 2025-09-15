package BinarySearchTree;

import BinaryTrees.BinaryTreeModalClass.TreeNode;

//Problem No- 108 https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/?envType=problem-list-v2&envId=binary-search-tree
public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {

        int start = 0;
        int end = nums.length-1;

        return helper(nums, start, end);
    }

    TreeNode helper(int[] arr, int start, int end){

        if(start > end) return null;

        int mid = (start + end) / 2;

        TreeNode node = new TreeNode( arr[mid]);
        node.left = helper(arr, start, mid-1);
        node.right = helper(arr, mid+1, end);

        return node;
    }
}
