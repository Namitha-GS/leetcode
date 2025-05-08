class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int maxarea = 0;
        int[] nsr = new int[n];
        int[] nsl = new int[n];
        Stack<Integer> s = new Stack<>();

        // to find NSE right
        for(int i=arr.length-1; i>=0; i--) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // to find NSE left
        s = new Stack<>();
        for(int i=0; i<arr.length; i++) {
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if(s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // to find area
        for(int i=0; i<arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int area = height * width;
            maxarea = Math.max(area, maxarea);
        }
        return maxarea;
    }
}