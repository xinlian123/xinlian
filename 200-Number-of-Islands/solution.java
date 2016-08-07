public class Solution {
    public int m,n;
    public int numIslands(char[][] grid) {
        m = grid.length;
        n= grid[0].length;
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0; j<n;j++){
                if(grid[i][j]!='1')
                continue;
                ans++;
                dfs(grid,i,j);
            }
        }return ans;
    }
    public void dfs(char[][] grid,int i, int j){
        if(i<0||i>=m||j<0||j>=n)
        return;
        if(grid[i][j]=='1'){
            grid[i][j]='2';
            dfs(grid,i,j-1);
            dfs(grid,i,j+1);
            dfs(grid,i-1,j);
            dfs(grid,i+1,j);
        }
    }
}