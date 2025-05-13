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
        if(root == null) {
            return new LinkedList<>();
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        List<List<Integer>> l1 = new LinkedList<>();

        while(!q.isEmpty()) {
            List<Integer> list = new LinkedList<>();
            int n=q.size();
            for(int i=0; i<n; i++) {
                TreeNode current = q.poll();
                list.add(current.val);

                if(current.left != null) {
                    q.offer(current.left);
                }
                if(current.right != null) {
                    q.offer(current.right);
                }
            }
            l1.add(list);
        }
        return l1;
    }
}