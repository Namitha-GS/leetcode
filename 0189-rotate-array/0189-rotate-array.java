class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // to handle cases where k >= n
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
    }

    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int t = arr[start];
            arr[start] = arr[end];
            arr[end] = t;
            start++;
            end--;
        }
    }
}