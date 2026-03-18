from typing import List


class Solution:
    def islandPerimeter(self, grid: List[List[int]]) -> int:
        rows = len(grid)
        columns = len(grid[0])
        perimeter = 0

        for i in range(rows):
            for j in range(columns):
                if grid[i][j]:
                    perimeter += 4
                    if j and grid[i][j - 1]:
                        perimeter -= 2
                    if i and grid[i - 1][j]:
                        perimeter -= 2

        return perimeter
