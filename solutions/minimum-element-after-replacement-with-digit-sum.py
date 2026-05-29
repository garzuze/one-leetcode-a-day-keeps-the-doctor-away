from typing import List


class Solution:
    def minElement(self, nums: List[int]) -> int:
        min_n = float('inf')

        for n in nums:
            sum_n = 0
            while n > 0:
                sum_n += n % 10
                n //= 10

            min_n = min(min_n, sum_n)
        
        return min_n
