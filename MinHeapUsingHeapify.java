public class MinHeapUsingHeapify {
	
	private static void buildHeap(int[] arr,int size) {
		for(int i=(size/2)-1; i>=0; i--) {
			heapify(arr, i, size);
		}
	}
	
	private static void heapify(int[] arr, int index, int size) {
		int left = 2 * index +1;
		int right = left +1;
		
		int min = index;
		
		if(left < size && arr[left] < arr[min]) {
			min = left;
		}
		if(right < size && arr[right] < arr[min]) {
			min = right;
		}
		if(min != index) {
			int temp = arr[min];
			arr[min] = arr[index];
			arr[index] = temp;
			
			heapify(arr, min, size);
		}
	}

	public static void main(String[] args) {
		int[] arr = {80, 30, 60, 10, 20, 40, 50};
	
		buildHeap(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}

}
