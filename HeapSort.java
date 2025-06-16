public class HeapSort {
	
	public static void heapify(int[] arr, int index, int size) {
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
		int[] arr = {80,60,10,30,50,20,70,90};
		buildHeap(arr, arr.length);
		heapSort(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void buildHeap(int[] arr, int n) {
		for(int i=(n/2)-1; i>=0; i--) {
			heapify(arr, i, n);
		}
	}
	
	public static void heapSort(int[] arr, int size) {
		while(size > 0) {
			int t = arr[0];
			arr[0] = arr[size-1];
			arr[size-1] = t;
			
			size--;
			
			heapify(arr, 0, size);
		}
	}
	
}
