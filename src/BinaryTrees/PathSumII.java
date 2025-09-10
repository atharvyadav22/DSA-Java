package BinaryTrees;

import BinaryTrees.BinaryTreeModalClass.TreeNode;

import java.util.ArrayList;
import java.util.List;

//Problem No- 113 https://leetcode.com/problems/path-sum-ii/description/?envType=problem-list-v2&envId=binary-tree
public class PathSumII {

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> ans = new ArrayList<>();
        dfs(root, targetSum, new ArrayList<>(), ans);
        return ans;

    }

    void dfs(TreeNode root, int targetSum, List<Integer> path, List<List<Integer>> ans) {
        if (root == null)
            return;

        path.add(root.val);

        if (root.left == null && root.right == null && targetSum == root.val) {
            ans.add(new ArrayList<>(path));
        } else {
            dfs(root.left, targetSum - root.val, path, ans);
            dfs(root.right, targetSum - root.val, path, ans);
        }

        path.remove(path.size() - 1);
    }
}
