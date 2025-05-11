class Solution {

    private static void dfs(int node, int[][] arr, boolean[] visited) {
        visited[node] = true;

        // find the neighboring nodes whether its visited
        for(int i=0; i<arr.length; i++) {
            if(arr[node][i] == 1 && !visited[i]) {
                dfs(i, arr, visited);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int provinceCnt = 0;
        boolean[] visited = new boolean[n];
        // check what all nodes are not yet visited
        for(int i=0; i<n; i++) {
            if(!visited[i]) {
                provinceCnt++;
                dfs(i, isConnected, visited);
            }
        }
        return provinceCnt;
    }
}