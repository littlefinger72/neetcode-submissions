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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> nodeQ = new LinkedList<>();
        nodeQ.offer(root);
        while(!nodeQ.isEmpty()) {
            int qsize = nodeQ.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0; i<qsize; i++) {
                TreeNode curr = nodeQ.poll();
                level.add(curr.val);
                if (curr.left != null) {
                    nodeQ.offer(curr.left);
                }
                if (curr.right != null) {
                    nodeQ.offer(curr.right);
                }
                
                
            }
            res.add(level);
        }
        return res;
    }
}
