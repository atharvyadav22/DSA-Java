package BinaryTrees;

import BinaryTrees.BinaryTreeModalClass.TreeNode;
import java.util.ArrayList;
import java.util.List;

//Problem No-
public class PostOrderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;
    }


    public void helper(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        helper(root.left, list);
        list.add(root.val);
        helper(root.right, list);
    }
}
