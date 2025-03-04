class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int min_len = Integer.MAX_VALUE;
        int sum = 0;
        for(int right=0; right<nums.length; right++) {
            sum = sum + nums[right];

            while(sum >= target) {
                int min = right-left+1;
                min_len = Math.min(min_len, min);

                sum = sum - nums[left];
                left++;
            }
        }
        return (min_len == Integer.MAX_VALUE)? 0 : min_len;
    }
}