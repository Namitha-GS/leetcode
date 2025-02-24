class Solution {
    public int missingNumber(int[] nums) {

        // [3,0,1] -> length (n)=3
        // sum = 3*(3+1)/2=6
        // sum of array = 4
        // 6-4=2 -> 2 is the missing number

        int n = nums.length;
        int sum = (n*(n+1))/2;
        int res = Arrays.stream(nums).sum();
        return sum-res;
    }
}