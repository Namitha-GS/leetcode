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
 
 /*
  * Using Recursion, using DFS
  */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}

/*
* Without Recursion, using BFS
*/
// class Solution {
//     public int maxDepth(TreeNode root) {
//         if(root == null) {
//             return 0;
//         }
//         Queue<TreeNode> q = new LinkedList<>();
//         q.offer(root);
//         int depth = 1;
//         while(!q.isEmpty()) {
//             int n = q.size();
//             for(int i=0; i<n; i++) {
//                 TreeNode current = q.poll();
//                 if(current.left != null) {
//                     q.offer(current.left);
//                 }
//                 if(current.right != null) {
//                     q.offer(current.right);
//                 }
//             }
//             depth++;
//         }
//         return depth-1;
//     }
// }