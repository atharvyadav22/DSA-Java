package BinarySearchTree;

import BinaryTrees.BinaryTreeModalClass.TreeNode;

//Problem No- 700 https://leetcode.com/problems/search-in-a-binary-search-tree/description/?envType=problem-list-v2&envId=binary-search-tree
public class SearchInBST {
    public TreeNode searchBST(TreeNode root, int val) {

        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        } else if (root.val > val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }
}
