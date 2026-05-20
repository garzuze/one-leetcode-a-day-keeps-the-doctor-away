from typing import List


class Solution:
    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        n = len(grid)
        nums = set([i for i in range(1, (n ** 2) + 1)])
        seen = set()
        a = 0

        for g in grid:
            for num in g:
                if num in nums and num not in seen:
                    nums.remove(num)
                    seen.add(num)
                elif num not in nums and num in seen:
                    a = num
        
        return [a, nums.pop()]
