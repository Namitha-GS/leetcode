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
    /*
    * Using DFS
    */
    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    // ==========================================

    /*
    * Using BFS
    */
    // public TreeNode invertTree(TreeNode root) {
       
    //     if(root == null) {
    //         return null;
    //     }
    //     Queue<TreeNode> q = new LinkedList<>();
    //     q.offer(root);

    //     while(!q.isEmpty()) {
    //         TreeNode t = q.poll();

    //         TreeNode cur = t.left;
    //         t.left = t.right;
    //         t.right = cur;

    //         if(t.left != null) {
    //             q.offer(t.left);
    //         }
    //         if(t.right != null) {
    //             q.offer(t.right);
    //         }
    //     }
    //     return root;
    // }
}