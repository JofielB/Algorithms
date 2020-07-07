public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        int islands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j <grid[0].length ; j++) {
                if(grid[i][j]=='1'){
                    islands ++;
                    destroyIsland(grid, i,j);
                }
            }
        }
        return islands;
    }

    private void destroyIsland(char[][] island, int i, int j){
        if( i<0 || i>=island.length || j<0 || j>=island[0].length || island[i][j]=='0') return;
        island[i][j] = '0';
        destroyIsland(island, i, j-1);//Left
        destroyIsland(island, i, j+1);//Right
        destroyIsland(island, i+1, j);//Up
        destroyIsland(island, i-1, j);//Down
    }
}
