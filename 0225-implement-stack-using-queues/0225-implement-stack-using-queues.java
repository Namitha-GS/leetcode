class MyStack {
    
    // By using Single Queue
    Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
        for(int i=0; i<q.size()-1; i++) {
            q.add(q.remove());
        }
    }
    
    public int pop() {
       return q.remove();
    }
    
    public int top() {
       return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/*
* By using 2 Queues
*/
//  class MyStack {
//     Queue<Integer> q1;
//     Queue<Integer> q2;

//     public MyStack() {
//         q1 = new LinkedList<>();
//         q2 = new LinkedList<>();
//     }
    
//     public void push(int x) {
//         while(q1.size() > 0) {
//             q2.add(q1.remove());
//         }
//         q1.add(x);
//         while(q2.size() > 0) {
//             q1.add(q2.remove());
//         }
//     }
    
//     public int pop() {
//         return q1.remove();
//     }
    
//     public int top() {
//        return q1.peek(); 
//     }
    
//     public boolean empty() {
//         return q1.isEmpty();
//     }
// }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */