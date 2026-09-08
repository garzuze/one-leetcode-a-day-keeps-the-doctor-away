class Solution {
    public int maxSum(int[][] grid) {
        int result = 0;
        int col = grid[0].length;
        int lin = grid.length;

        for (int i = 0; i < lin - 2; i++) {
            for (int j = 0; j < col - 2; j++) {
                int top = grid[i][j] + grid[i][j + 1] + grid[i][j + 2];
                int mid = grid[i + 1][j + 1];
                int bottom = grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2];

                int curr = top + mid + bottom;
                result = Math.max(result, curr);
            }
        }

        return result;
    }
}
