public class MaxHeapUsingHeapify {
	
	private static void buildHeap(int[] arr,int size) {
		for(int i=(size/2)-1; i>=0; i--) {
			heapify(arr, i, size);
		}
	}
	
	private static void heapify(int[] arr, int index, int size) {
		int left = 2 * index +1;
		int right = left +1;
		
		int max = index;
		
		if(left < size && arr[left] > arr[max]) {
			max = left;
		}
		if(right < size && arr[right] > arr[max]) {
			max = right;
		}
		if(max != index) {
			int temp = arr[max];
			arr[max] = arr[index];
			arr[index] = temp;
			
			heapify(arr, max, size);
		}
	}

	public static void main(String[] args) {
		int[] arr = {10, 20, 40, 30, 80, 60, 50};
	
		buildHeap(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}

}
