from typing import List


class Solution:
    def countDistinctIntegers(self, nums: List[int]) -> int:
        nums_copy = list(nums)

        for n in nums:
            sum_n = 0
            base = 0
            while n > 0:
                sum_n *= 10
                base = n % 10
                n //= 10
                sum_n += base
            nums_copy.append(sum_n)
        
        return len(set(nums_copy))
