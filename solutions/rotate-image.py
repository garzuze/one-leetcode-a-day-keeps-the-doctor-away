from typing import List


class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        top = 0
        bottom = len(matrix) - 1

        while top < bottom:
            for i in range(len(matrix)):
                matrix[top][i], matrix[bottom][i] = matrix[bottom][i], matrix[top][i]
            top += 1
            bottom -= 1
        
        for j in range(len(matrix)):
            for k in range(j + 1, len(matrix)):
                matrix[j][k], matrix[k][j] = matrix[k][j], matrix[j][k]
        
