class Solution {

    public int numIslands(char[][] grid) {
       if(grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int cnt = 0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] == '1') {
                    cnt++;
                    bfs(grid, i, j);
                }
            }
        } 
        return cnt;
    }

    public void bfs(char[][] grid, int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{i,j});
        grid[i][j] = '0';

        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

        while(!q.isEmpty()) {
            int[] cell = q.poll();
            int row = cell[0];
            int col = cell[1];

            for(int[] d : directions) {
                int newrow = row + d[0];
                int newcol = col + d[1];

                if(newrow >=0 && newrow < grid.length
                   && newcol >=0 && newcol <grid[0].length
                   && grid[newrow][newcol] == '1') {
                    q.offer(new int[]{newrow, newcol});
                    grid[newrow][newcol] = '0';
                   }
            }
        }
    }





    public int numIslandsDFS(char[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int cnt = 0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] == '1') {
                    cnt++;
                    dfs(grid, i, j);
                }
            }
        }
        return cnt;
    }

    public void dfs(char[][] grid, int i, int j ) {
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]=='0') {
            return;
        }

        grid[i][j] = '0';
        dfs(grid, i-1, j);
        dfs(grid, i+1, j);
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);
    }
}