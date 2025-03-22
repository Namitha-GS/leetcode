class Solution {
    public boolean isValid(String s) {
        // if string length is Even, then its valid parentheses
        // else its invalid, so return false
        if(s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for(char c : arr) {
            if(c == '{') {
                stack.push('}');
            } 
            else if(c == '[') {
                stack.push(']');
            }
            else if(c == '(') {
                stack.push(')');
            }
            else {
                if(stack.isEmpty() || c != stack.pop()) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}