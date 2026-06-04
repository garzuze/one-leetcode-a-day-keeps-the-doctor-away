from typing import List


class Solution:
    def maxEqualRowsAfterFlips(self, matrix: List[List[int]]) -> int:
        count = {}
        
        for row in matrix:
            pattern = ""
            for i in range(len(row)):
                if i > 0 and row[i - 1] != row[i]:
                    pattern += "|*"
                else:
                    pattern += "*"
            count[pattern] = count.get(pattern, 0) + 1
        
        return max(count.values())
