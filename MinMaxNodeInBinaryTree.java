public class MinMaxNode {
	
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int val) {
			this.val = val;
			left = right = null;
		}
	}
	
	private static int[] getMinMax(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		while(!q.isEmpty()) {
			TreeNode current = q.poll();
			min = Math.min(min, current.val);
			max = Math.max(max, current.val);
			
			if(current.left != null) {
				q.offer(current.left);
			}
			if(current.right != null) {
				q.offer(current.right);
			}
		}
		return new int[] {min, max};
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(55);
		root.right = new TreeNode(20);
		root.left.left = new TreeNode(13);
		root.left.right = new TreeNode(7);
		root.right.left = new TreeNode(6);
		int[] min_max = getMinMax(root);
		System.out.println("Minimum value: "+min_max[0]);
		System.out.println("Maximum value: "+min_max[1]);
	}

}
