class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums) {
            map.put(n, map.getOrDefault(n,0)+1);
        }
        List<Integer>[] bucket = new List[nums.length + 1];
        for(Integer key : map.keySet()) {
            int freq = map.get(key);
            if(bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int[] res = new int[k];
        int cnt = 0;
        for(int i=bucket.length-1; i>=0; i--) {
            if(bucket[i] != null) {
                for(int j=0; j<bucket[i].size() && cnt < k; j++) {
                    res[cnt] = bucket[i].get(j);
                    cnt++;
                }
            }
        }
        return res;
    }

/*
    public int[] topKFrequentUsingHeap(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums) {
            map.put(n, map.getOrDefault(n,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));
        for(int n : map.keySet()) {
            pq.add(n);
            if(pq.size() > k){
                pq.poll();
            }
        }
        int[] res = new int[k];
        for(int i=0; i<k; i++){
            res[i] = pq.poll();
        }
        return res;
    }
*/
    
}