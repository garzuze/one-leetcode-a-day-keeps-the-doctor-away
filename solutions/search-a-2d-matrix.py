from typing import List


class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        flat = []

        for row in matrix:
            for number in row:
                flat.append(number)

        left = 0
        right = len(flat) - 1

        while left <= right:
            middle = (right + left) // 2

            if flat[middle] == target:
                return True

            if flat[middle] < target:
                left = middle + 1
            else:
                right = middle - 1

        return False
