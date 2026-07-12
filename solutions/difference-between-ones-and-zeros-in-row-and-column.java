class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int numRows = grid.length;
        int numCols = grid[0].length;

        int[] rowDiff = new int[numRows];
        int[] colDiff = new int[numCols];
        int[][] result = new int[numRows][numCols];


        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                rowDiff[i] += grid[i][j];
                colDiff[j] += grid[i][j];
            }
        }

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                result[i][j] = 2 * (rowDiff[i] + colDiff[j]) - numRows - numCols;
            }
        }

        return result;

    }
}
