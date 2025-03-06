class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left=0, maxLength=0;
        //r=right
        for(int r=0; r<s.length(); r++) {
            if(map.containsKey(s.charAt(r)) && map.get(s.charAt(r))>=left) {
                left = map.get(s.charAt(r))+1;
            }
            int length = r - left +1;
            maxLength = Math.max(length, maxLength);
            map.put(s.charAt(r), r);
        }
        return maxLength;
    }
}