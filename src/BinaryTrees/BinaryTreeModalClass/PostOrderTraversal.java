package BinaryTrees.BinaryTreeModalClass;

import java.util.ArrayList;
import java.util.List;

//Problem No- 145 https://leetcode.com/problems/binary-tree-postorder-traversal/description/?envType=problem-list-v2&envId=binary-tree
public class PostOrderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;
    }

    public void helper(TreeNode root, List<Integer> list) {
        if (root == null) return;

        helper(root.left, list);
        helper(root.right, list);
        list.add(root.val);

    }
}
