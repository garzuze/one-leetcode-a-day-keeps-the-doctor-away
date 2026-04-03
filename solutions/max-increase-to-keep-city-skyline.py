from typing import List


class Solution:
    def maxIncreaseKeepingSkyline(self, grid: List[List[int]]) -> int:
        c_max = [0] * len(grid)
        l_max = [0] * len(grid)
        total_sum = 0

        for i, line in enumerate(grid):
            l_max[i] = max(line)
            col = []
            for j in range(len(grid)):
                col.append(grid[j][i])
            c_max[i] = max(col)

        for i in range(len(grid)):
            for j in range(len(grid)):
                total_sum += min(c_max[j], l_max[i]) - grid[i][j]

        return total_sum
