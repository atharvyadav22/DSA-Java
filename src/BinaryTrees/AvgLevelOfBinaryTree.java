package BinaryTrees;

import BinaryTrees.BinaryTreeModalClass.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Problem No- 673 https://leetcode.com/problems/average-of-levels-in-binary-tree/description/
public class AvgLevelOfBinaryTree {

        public List<Double> averageOfLevels(TreeNode root) {

            List<Double> result = new ArrayList<>();
            if (root == null) {
                return result;
            }


            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                int size = queue.size();
                double sum = 0.0;

                for (int i = 0; i < size; i++) {
                    TreeNode curr = queue.poll();
                    sum += curr.val;

                    if (curr.left != null) queue.add(curr.left);
                    if (curr.right != null) queue.add(curr.right);
                }

                result.add(sum / size);
            }

            return result;
        }

}
