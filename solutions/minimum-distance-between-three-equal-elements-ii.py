from typing import List



class Solution:
    def minimumDistance(self, nums: List[int]) -> int:
        result = float('inf')
        occur = {}

        for i in range(len(nums)):
            if nums[i] not in occur:
                occur[nums[i]] = []
            occur[nums[i]].append(i)
        
        for idx in occur.values():
            if len(idx) < 3:
                continue
            
            for j in range(len(idx) - 2):
                operation = 2 * (idx[j+2] - idx[j])
                result = min(result, operation)

        return result if result != float('inf') else -1
