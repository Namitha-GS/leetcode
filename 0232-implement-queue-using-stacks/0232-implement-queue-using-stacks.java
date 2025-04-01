class MyQueue {

    Stack<Integer> in_stack;
    Stack<Integer> out_stack;

    public MyQueue() {
        in_stack = new Stack<>();
        out_stack = new Stack<>();
    }
    
    public void push(int z) {
        in_stack.push(z);
    }
    
    public int pop() {
        if(out_stack.isEmpty()) {
            while(!in_stack.isEmpty()) {
                out_stack.push(in_stack.pop());
            }
        }
        return out_stack.pop();
    }
    
    public int peek() {
        if(out_stack.isEmpty()) {
            while(!in_stack.isEmpty()) {
                out_stack.push(in_stack.pop());
            }
        }
        return out_stack.peek();
    }
    
    public boolean empty() {
        return in_stack.isEmpty() && out_stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */