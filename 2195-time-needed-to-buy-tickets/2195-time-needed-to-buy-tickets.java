class Solution {
    /*
    * without using Queue
    */
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        for(int i=0; i<tickets.length; i++) {
            if(i <= k) {
                time += Math.min(tickets[k], tickets[i]);
            }
            else {
                time += Math.min(tickets[k]-1, tickets[i]);
            }
        }
        return time;
    }

    /*
    * using Queue
    */
    // public int timeRequiredToBuy(int[] tickets, int k) {
    //     Queue<Integer> q = new LinkedList<>();
    //     for(int i=0; i<tickets.length; i++) {
    //         q.add(i);
    //     }
    //     int time = 0;
    //     while(!q.isEmpty()) {
    //         int id = q.poll();
    //         time++;
    //         tickets[id]--;
    //         if(id == k && tickets[id] == 0) {
    //             return time;
    //         }
    //         if(tickets[id] != 0) {
    //             q.add(id);
    //         }
    //     }
    //     return time;
    // }
}