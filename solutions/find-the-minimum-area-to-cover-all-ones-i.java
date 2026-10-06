class Solution {
    public int minimumArea(int[][] grid) {
        int minLine = Integer.MAX_VALUE;
        int minCol = Integer.MAX_VALUE;
        int maxLine = Integer.MIN_VALUE;
        int maxCol = Integer.MIN_VALUE;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    maxCol = Math.max(maxCol, j);
                    maxLine = Math.max(maxLine, i);

                    minCol = Math.min(minCol, j);
                    minLine = Math.min(minLine, i);
                }
            }
        }

        return (maxLine - minLine + 1) * (maxCol - minCol + 1);
    }
}
