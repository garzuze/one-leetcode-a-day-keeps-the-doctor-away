from typing import List


class Solution:
    def getMinDistance(self, nums: List[int], target: int, start: int) -> int:
        diffs = float('inf')
        
        for i in range(len(nums)):
            if nums[i] == target:
                diffs = min(diffs, abs(i - start))
        
        return diffs
