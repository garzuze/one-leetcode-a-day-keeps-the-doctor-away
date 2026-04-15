from typing import List


class Solution:
    def minDeletionSize(self, strs: List[str]) -> int:
        check = []
        
        for i in range(len(strs[1])):
            temp = []
            for j in range(len(strs)):
                temp.append(strs[j][i])
            check.append(temp)

        count = 0
        for col in check:
            if sorted(col) != col:
                count += 1

        return count

