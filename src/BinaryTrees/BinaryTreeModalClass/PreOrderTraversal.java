package BinaryTrees.BinaryTreeModalClass;

import java.util.ArrayList;
import java.util.List;

//Problem No- 144 https://leetcode.com/problems/binary-tree-preorder-traversal/description/?envType=problem-list-v2&envId=binary-tree
public class PreOrderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;
    }

    public void helper(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        list.add(root.val);
        helper(root.left, list);
        helper(root.right, list);
    }
}
