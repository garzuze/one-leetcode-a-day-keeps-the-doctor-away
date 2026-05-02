from typing import List
from heapq import heappush, heappop

class Solution:
    def diagonalSort(self, mat: List[List[int]]) -> List[List[int]]:
        diag_map = {}

        for row in range(len(mat)):
            for col in range(len(mat[0])):
                if (row - col) not in diag_map:
                    diag_map[row - col] = []
                heappush(diag_map[row - col], mat[row][col])
        
        for row in range(len(mat)):
            for col in range(len(mat[0])):
                mat[row][col] = heappop(diag_map[row - col])
        
        return mat
