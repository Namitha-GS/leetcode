class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] nge = new int[nums.length];
        Stack<Integer> s = new Stack<>();
        int n=nums.length;
        for(int i=2*n-1; i>=0; i--) {
            int cur = nums[i%n];
            while(!s.isEmpty() && s.peek()<=cur) {
                s.pop();
            }
            if(i < n){
                nge[i] = s.isEmpty()?-1:s.peek();
            }
            s.push(cur);
        }
        return nge;
    }
}