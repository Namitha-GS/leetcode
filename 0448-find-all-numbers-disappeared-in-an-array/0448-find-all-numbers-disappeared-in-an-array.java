class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int n : nums){
            set.add(n);
        }

        // Iterate from 1 to n and check whether each index is present in Set
        // if not present, then add it into List
        // but here Space complexity = O(n)

        int n = nums.length;
        for(int i=1; i<=n; i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}