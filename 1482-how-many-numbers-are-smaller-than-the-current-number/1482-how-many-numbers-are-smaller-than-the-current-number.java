class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] bucket = new int[101];
        int n = nums.length;

        // increment count of array element 8 at bucket[8]
        for(int i=0; i<n; i++){
            bucket[nums[i]] = bucket[nums[i]] + 1;
        }

        // find cumulative sum 
        // (to get count of elements smaller than current element)
        // iterate bucket array from 1 to 100
        for(int i=1; i<=100; i++){
            bucket[i] = bucket[i] + bucket[i-1];
        }

        // return array, so create result array
        int[] result = new int[n];
        for(int i=0; i<n; i++){
            if(nums[i] == 0) { // if array element is 0, then make result also 0
                result[i] = 0;
            }
            else {
                result[i] = bucket[nums[i] - 1];
            }
        }
        return result;
    }
}