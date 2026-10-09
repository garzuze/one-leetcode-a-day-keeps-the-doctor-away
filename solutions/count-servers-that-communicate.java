class Solution {
    public int countServers(int[][] grid) {
        int[] countR = new int[grid.length];
        int[] countC = new int[grid[0].length];
        int servers = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    servers++;
                    countR[i]++;
                    countC[j]++;
                }
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    if (countR[i] == 1 && countC[j] == 1) {
                        servers--;
                    }
                }
            }
        }

        return servers;
    }
}
