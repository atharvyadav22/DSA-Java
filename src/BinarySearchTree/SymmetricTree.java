package BinarySearchTree;

import BinaryTrees.BinaryTreeModalClass.TreeNode;

//Problem No- 101 https://leetcode.com/problems/symmetric-tree/description/?envType=problem-list-v2&envId=depth-first-search
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {

        if (root == null) return true;

        return helper(root.left, root.right);

    }

    boolean helper(TreeNode n1, TreeNode n2) {

        if (n1 == null && n2 == null) return true;

        if (n1 == null || n2 == null) return false;

        if (n1.val != n2.val) return false;

        return helper(n1.left, n2.right) && helper(n1.right, n2.left);
    }
}
    

