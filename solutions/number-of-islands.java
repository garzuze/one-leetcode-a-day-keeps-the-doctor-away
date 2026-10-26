class Solution {
    private int m, n;
    private final int[] dirs = {-1, 0, 1, 0, -1};

    public int numIslands(char[][] grid) {
        int result = 0;
        m = grid.length;
        n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    result++;
                }
            }
        }

        return result;
    }

    private void dfs(char[][] grid, int i, int j) {
        grid[i][j] = '0';

        for (int d = 0; d < dirs.length - 1; d++) {
            int l = i + dirs[d];
            int c = j + dirs[d + 1];

            if (l >= 0 && l < m && c >= 0 && c < n && grid[l][c] == '1') {
                dfs(grid, l, c);
            }
        }
    }
}
