/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int goodNodes(TreeNode root) {
        int count = 0;
        return countGoodNodes(root, root.val);
        //return count;
    }

    public int countGoodNodes(TreeNode node, int maxVal) {
        if (node == null)
            return 0;
        int res = 0;
        if (node.val >= maxVal) {
            res++;
        }
        res += countGoodNodes(node.left, Math.max(maxVal, node.val));
        res += countGoodNodes(node.right,  Math.max(maxVal, node.val));
        return res;
    }
}
