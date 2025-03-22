class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens) {
            // get Last digit from String s & 
            // check whether the Character is Digit or Not
            
            char c = s.charAt(s.length()-1);
            if(Character.isDigit(c)) {
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