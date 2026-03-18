from typing import List

class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        target = len(nums) // 3
        count = {}
        result = set()

        for n in nums:
            count[n] = count.get(n, 0) + 1
            if count[n] > target:
                result.add(n)
        
        return list(result)