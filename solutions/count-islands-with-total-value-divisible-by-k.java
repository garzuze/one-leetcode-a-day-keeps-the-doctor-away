class Solution {
    private int m, n;
    private final int[] dirs = {-1, 0, 1, 0, -1};

    public int countIslands(int[][] grid, int k) {
        int result = 0;
        m = grid.length;
        n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0 && dfs(grid, i, j) % k == 0) {
                    result++;
                }
            }
        }

        return result;
    }

    private long dfs(int[][] grid, int i, int j) {
        long sum = grid[i][j];
        grid[i][j] = 0;

        for (int d = 0; d < dirs.length - 1; d++) {
            int l = i + dirs[d];
            int c = j + dirs[d + 1];

            if (l >= 0 && l < m && c >= 0 && c < n && grid[l][c] > 0) {
                sum += dfs(grid, l, c);
            }
        }

        return sum;
    }
}
