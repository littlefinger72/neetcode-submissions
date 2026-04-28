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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.offer(root);
        while(!nodeQueue.isEmpty()) {
            int n=-1;
            for(int i=nodeQueue.size(); i>0; i--) {
                TreeNode node = nodeQueue.poll();
                if(node != null) {
                    n = node.val;
                    nodeQueue.offer(node.left);
                    nodeQueue.offer(node.right);
                }
            }
            if (n!= -1) {
                res.add(new Integer(n));
            }
            
        }
        return res;
    }
}
