class Solution {
    public int longestMountain(int[] arr) {
        int maxLength = 0;
        for(int i=1; i<=arr.length-2; i++) {
            if((arr[i] > arr[i-1]) && (arr[i] > arr[i+1])) {
                int left = i;
                int right = i;

                // elements before peak element should be decreasing
                while(left > 0 && (arr[left-1] < arr[left])) {
                    left--;
                }

                // elements after peak element should be again decreasing
                while(right < arr.length-1 && (arr[right] > arr[right+1])) {
                    right++;
                }
                int currentLength = right-left+1;
                maxLength = Math.max(currentLength, maxLength);
            }
        }
        return maxLength;
    }
}