class Solution {
    private int m, n;
    private final int[] dirs = {-1, 0, 1, 0, -1};

    public int countSubIslands(int[][] grid1, int[][] grid2) {
        m = grid2.length;
        n = grid2[0].length;
        int result = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid2[i][j] == 1&& grid1[i][j] == 1 && dfs(grid1, grid2, i, j)) {
                    result++;
                }
            }
        }

        return result;
    }

    private boolean dfs(int[][] grid1, int[][] grid2, int i, int j) {
        grid2[i][j] = 0;
        boolean finalRes = true;

        for (int d = 0; d < dirs.length - 1; d++) {
            int l = i + dirs[d];
            int c = j + dirs[d + 1];

            if (l >= 0 && l < m && c >= 0 && c < n && grid2[l][c] == 1) {
                if (grid1[l][c] == 1) {
                    boolean res = dfs(grid1, grid2, l, c); 
                    if (!res) {
                        finalRes = false;
                    }
                } else {
                    finalRes = false;
                }
            }
        }

        return finalRes;
    }
}
