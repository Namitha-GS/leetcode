class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        String res = "";
        // To avoid extra space at end, 
        // iterate till index=1 and at end blindly append 0th index
        for(int i=arr.length-1; i>0; i--){
            res += arr[i]+" ";
        }
        return res + arr[0];
    }
}