from typing import List


# Beats 100% de primeira kkkkkkkkkkkk top top top top
class Solution:
    def maxSum(self, nums: List[int]) -> int:
        nums_set = set(nums)
        result = []
        for number in nums_set:
            if number > 0:
                result.append(number)

        if len(result) == 0:
            result.append(max(nums_set))

        return sum(result)
