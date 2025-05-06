public class NextGreaterElement1 {

	public static void main(String[] args) {
		int[] arr = {4, 12, 5, 3, 1, 2, 5, 3, 1, 2, 4, 6};
		int[] nge = findNGE(arr);
		System.out.println(Arrays.toString(nge));
	}
	
	private static int[] findNGE(int[] arr) {
		int n=arr.length;
		int[] nge = new int[n];
		Stack<Integer> stack = new Stack<>();
		for(int i=n-1; i>=0; i--) {
			while(!stack.isEmpty() && stack.peek() <= arr[i]) {
				stack.pop();
			}
			
			if(stack.isEmpty()) {
				nge[i] = -1;
			} else {	
				nge[i] = stack.peek();
			}
			
			stack.push(arr[i]);
		}
		return nge;
	}

}
