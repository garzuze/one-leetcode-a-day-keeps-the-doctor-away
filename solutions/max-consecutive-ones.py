from typing import List

class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        current = 0
        result = 0

        for n in nums:
            if n:
                current += 1
                if current > result:
                    result = current
            else:
                current = 0
        
        return result

s = Solution()

print(s.findMaxConsecutiveOnes([1,1,0,1,1,1]))