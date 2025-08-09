class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
		for(char c : tasks) {
			freq[c-'A']++;
		}
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		for(int i=0; i<26; i++) {
			if(freq[i] > 0) {
				pq.offer(freq[i]);
			}
		}

		int time = 0;
		while(!pq.isEmpty()) {
			int cnt = n+1;
			int taskCnt = 0;
			List<Integer> list = new ArrayList<>();
			while(cnt > 0 && !pq.isEmpty()) {
				int a = pq.poll();
				if(a > 1) {
					list.add(a-1);
				}
				taskCnt++;
				cnt--;
			}
			list.forEach(pq::offer);
			time += pq.isEmpty()? taskCnt : n+1;
		}
        return time;
    }
}