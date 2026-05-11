from typing import List


class Solution:
    def separateDigits(self, nums: List[int]) -> List[int]:
        result = []
        
        for n in reversed(nums):
            while n > 0:
                result.append(n % 10)
                n //= 10
            
        result.reverse()

        return result
