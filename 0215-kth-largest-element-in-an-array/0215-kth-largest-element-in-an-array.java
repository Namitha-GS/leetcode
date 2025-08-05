class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int n : nums) {
            pq.add(n);
        }
        for(int i=1; i<=k-1; i++) {
            pq.poll();
        }
        return pq.peek();
    }

    public int findKthLargest1(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<k; i++) {
            pq.add(nums[i]);
        }
        for(int i=k; i<nums.length; i++) {
            if(pq.peek() < nums[i]) {
                pq.poll();
                pq.add(nums[i]);
            }
        }
        return pq.peek();
    }
}