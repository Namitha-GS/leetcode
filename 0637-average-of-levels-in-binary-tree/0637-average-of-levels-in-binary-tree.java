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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
		List<Double> list = new ArrayList<>();
		
		while(!q.isEmpty()) {
			Double sum = 0.0;
			int n = q.size();
			
			for(int i=0; i<n; i++) {
				TreeNode current = q.poll();
				sum += current.val;
				
				if(current.left != null) {
					q.offer(current.left);
				}
				
				if(current.right != null) {
					q.offer(current.right);
				}
			}
			
			Double avg = sum / n;
			list.add(avg);
		}
		return list;
    }
}