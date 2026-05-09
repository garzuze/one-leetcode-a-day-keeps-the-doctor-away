from typing import List


class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        count = {}
        result = 0
        
        for n in nums:
            count[n] = count.get(n, 0) + 1
        
        for n, c in count.items():
            if c == 1:
                result += n
            
        return result
