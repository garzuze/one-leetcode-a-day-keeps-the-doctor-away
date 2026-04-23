from typing import List


class Solution:
    def restoreString(self, s: str, indices: List[int]) -> str:
        order = {}
        for i in range(len(indices)):
            order[indices[i]] = s[i]
        
        result = ""

        for i in range(len(indices)):
            result += order[i]
        
        return result
