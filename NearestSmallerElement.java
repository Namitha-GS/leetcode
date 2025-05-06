public class NearestSmallerElement {

	public static void main(String[] args) {
		int[] arr = {5, 7, 9, 6, 7, 4, 5, 1, 3, 7};
		int[] nse = findNSE(arr);
		System.out.println(Arrays.toString(nse));
	}
	
	private static int[] findNSE(int[] arr) {
		int n = arr.length;
		int[] nse = new int[n];
		Stack<Integer> s = new Stack<>();
		for(int i=0; i<n; i++) {
			
			while(!s.isEmpty() && s.peek() >= arr[i]) {
				s.pop();
			}
			
			nse[i] = s.isEmpty()? -1 : s.peek();
			s.push(arr[i]);
		}
		return nse;
	}
	
}
