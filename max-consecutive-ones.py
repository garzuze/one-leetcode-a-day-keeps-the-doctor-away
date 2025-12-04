from typing import List

class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        ocurrences = [0] * len(nums)
        k = 0
        for n in nums:
            if n == 0:
                k += 1
            else:
                ocurrences[k] += 1
        return max(ocurrences)
    

s = Solution()

print(s.findMaxConsecutiveOnes([1,1,0,1,1,1]))