class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        
        int min_diff = Integer.MAX_VALUE;
        for(int i=1; i<arr.length; i++) {
            int min = arr[i] - arr[i-1];
            min_diff = Math.min(min, min_diff);
        }

        for(int i=1; i<arr.length; i++) {
            if(arr[i] - arr[i-1] == min_diff) {
                list.add(Arrays.asList(arr[i-1], arr[i]));
                // add arr[i-1] first and then arr[i], to maintain [a,b] such that a < b
            }
        }
       return list; 
    }
}