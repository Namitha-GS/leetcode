class Solution {
    public boolean isValid(String s) {
        // if string length is Even, then its valid parentheses
        // else its invalid, so return false
        if(s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}