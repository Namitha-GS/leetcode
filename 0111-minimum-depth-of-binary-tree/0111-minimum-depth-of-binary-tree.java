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
    public int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int depth = 1; // 1 node is already inserted, so depth=1

        while(!q.isEmpty()) {
            int n = q.size();
            for(int i=0; i<n; i++) {
                TreeNode current = q.poll();

                if(current.left == null && current.right == null) {
                    return depth;
                }

                if(current.left != null) {
                    q.offer(current.left);
                }
                if(current.right != null) {
                    q.offer(current.right);
                }
            }
            depth++; // increment depth after each level
        }
        return depth;
    }
}