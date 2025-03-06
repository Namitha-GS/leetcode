class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int l=0, maxlen=0;
        //l=left and r=right
        for(int r=0; r<s.length(); r++) {
            if(map.containsKey(s.charAt(r)) && map.get(s.charAt(r))>=l) {
                l = map.get(s.charAt(r))+1;
            }
            int length = r-l+1;
            maxlen = Math.max(length, maxlen);
            map.put(s.charAt(r), r); 
        }
        return maxlen;
    }
}