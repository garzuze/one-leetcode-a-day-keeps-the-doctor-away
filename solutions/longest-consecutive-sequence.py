from typing import List

class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0

        seen = set(nums)
        longuest = 0
        for num in seen:
            if (num - 1) not in seen:
                curr = 1
                desired = num + 1
                while desired in seen:
                    curr += 1
                    desired += 1
                longuest = max(longuest, curr)
        
        return longuest