class Solution {
    public int[] sortedSquares(int[] nums) {

        // find the greater value and add it to output array from end index
        // so i=array.length-1;
        
        int left=0, right=nums.length-1, i=nums.length-1;
        int value = 0;
        int[] output = new int[nums.length];
        while(left <= right) {
            if((nums[left] * nums[left]) >= (nums[right] * nums[right])) {
                value = nums[left] * nums[left];
                left++;
            }
            else {
                value = nums[right] * nums[right];
                right--;
            }
            output[i] = value;
            i--;
        }
        return output;
    }
}