from typing import List


class Solution:
    def generateMatrix(self, n: int) -> List[List[int]]:
        result = [[0 for _ in range(n)] for _ in range(n)]
        x, y = 0, 0
        dx, dy = 1, 0

        for i in range(n * n):
            result[y][x] = i + 1
            if (not 0 <= x + dx < n or
                not 0 <= y + dy < n or
                result[y + dy][x + dx] != 0):
                dx, dy = -dy, dx
            x += dx
            y += dy

        return result
