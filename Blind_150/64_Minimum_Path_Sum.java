class Solution {
    public int minPathSum(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] res = new int[rows+1][cols+1];

        for(int i=0; i<res.length; i++){
            for(int j=0; j<res[0].length; j++){
                res[i][j] = Integer.MAX_VALUE;
            }
        }

        res[rows-1][cols] = 0;

        for(int i=rows-1; i>=0; i--){
            for(int j=cols-1; j>=0; j--){
                res[i][j] = grid[i][j] + Math.min(res[i][j+1], res[i+1][j]);
            }
        }
        return res[0][0];
    }
}

//Time complexity: O(n.m)
//Space complexity: O(n.m)
