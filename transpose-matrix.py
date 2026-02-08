from typing import List


class Solution:
    def transpose(self, matrix: List[List[int]]) -> List[List[int]]:
        result = []

        for i in range(len(matrix[0])):
            line = []
            for j in range(len(matrix)):
                line.append(matrix[j][i])
            result.append(line)

        return result
