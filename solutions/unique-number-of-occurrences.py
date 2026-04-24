from typing import List


class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        count = {}
        for n in arr:
            count[n] = count.get(n, 0) + 1
        
        seen = set()
        for c in count.values():
            if c in seen:
                return False
            seen.add(c)
        
        return True
        
