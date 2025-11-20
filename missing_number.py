from typing import List

class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        range_elements = set([i for i in range(len(nums) + 1)])

        for n in nums:
            if n in range_elements:
                range_elements.remove(n)
            
        return range_elements.pop()