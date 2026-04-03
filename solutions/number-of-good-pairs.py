from typing import List



class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        seen = {}
        count = 0

        for n in nums:
            if n in seen:
                count += seen.get(n)
            seen[n] = seen.get(n, 0) + 1
        
        return count