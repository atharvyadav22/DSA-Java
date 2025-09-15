package BinaryTrees.BinaryTreeModalClass;

public class TreeNode {
    public TreeNode left, right;
    public int val;

    public TreeNode() {}

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(TreeNode left, TreeNode right, int val) {
        this.left = left;
        this.right = right;
        this.val = val;
    }
}


