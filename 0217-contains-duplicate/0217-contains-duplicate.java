class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Set Approach
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            if(set.contains(n)){
                return true;
            }
            set.add(n);
        }
        return false;
    }
}