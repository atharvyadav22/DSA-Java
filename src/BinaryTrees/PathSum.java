package BinaryTrees;

import BinaryTrees.BinaryTreeModalClass.TreeNode;

//Problem No- 112 https://leetcode.com/problems/path-sum/description/?envType=problem-list-v2&envId=binary-tree
public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {

        if(root == null) return false;

        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        int newTarget = targetSum - root.val;

        return hasPathSum(root.left, newTarget) || hasPathSum(root.right, newTarget);

    }
}
