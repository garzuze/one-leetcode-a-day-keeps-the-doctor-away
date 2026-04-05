from typing import List


class Solution:
    def sortMatrix(self, grid: List[List[int]]) -> List[List[int]]:
        for i in range(len(grid)):
            temp = []

            for j in range(len(grid) - i):
                temp.append(grid[i + j][j])

            temp.sort(reverse=True)

            for k in range(len(grid) - i):
                grid[i + k][k] = temp[k]
        
        for i in range(1, len(grid)):
            temp = []

            for j in range(len(grid) - i):
                temp.append(grid[j][j + i])
            
            temp.sort()

            for k in range(len(grid) - i):
                grid[k][k + i] = temp[k]

        return grid

