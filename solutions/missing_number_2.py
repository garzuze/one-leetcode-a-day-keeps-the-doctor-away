from typing import List

class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        res = len(nums)

        for i in range(len(nums)):
            res += i - nums[i]
        return res
    
s = Solution()
print(s.missingNumber([3,0,1]))