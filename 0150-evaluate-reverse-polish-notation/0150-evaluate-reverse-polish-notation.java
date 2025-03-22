class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens) {

            if(!s.equals("+") && !s.equals("*") && !s.equals("-") && !s.equals("/")) {
                stack.push(Integer.parseInt(s));
            }
            else {
                int op2 = stack.pop();
                int op1 = stack.pop();
                if(s.equals("+")) {
                    stack.push(op1 + op2);
                }
                else if(s.equals("-")) {
                    stack.push(op1 - op2);
                }
                else if(s.equals("*")) {
                    stack.push(op1 * op2);
                }
                else if(s.equals("/")) {
                    stack.push((int)(op1 / op2));
                }
            }

        }
        return stack.pop();
    }
}