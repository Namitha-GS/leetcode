class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<tickets.length; i++) {
            q.add(i);
        }
        int time = 0;
        while(!q.isEmpty()) {
            int id = q.poll();
            time++;
            tickets[id]--;
            if(id == k && tickets[id] == 0) {
                return time;
            }
            if(tickets[id] != 0) {
                q.add(id);
            }
        }
        return time;
        
    }
}