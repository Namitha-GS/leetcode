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
    public int min_diff = Integer.MAX_VALUE;
    public int prev = -1;
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return min_diff;
    }
    public void inorder(TreeNode root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        if(prev != -1) {
            min_diff = Math.min(min_diff, Math.abs(root.val - prev));
        }
        prev = root.val;
        inorder(root.right);
    }
}