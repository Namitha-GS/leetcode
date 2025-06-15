public class DeleteMaxElementFromBinaryHeap {
	
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
	
	public static void swap(int[] arr, int i, int j) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}

	public static void main(String[] args) {
		int[] arr = {80, 30, 60, 10, 20, 40, 50};
		int size = arr.length;
		swap(arr, 0, size-1);
		
		size = size-1;
		
		heapify(arr, 0, size);
		System.out.println(Arrays.toString(arr));
	}
	

}
