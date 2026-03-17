from typing import List


class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        num_range = [0] * (len(nums) + 1)
        result = []

        for n in nums:
            num_range[n] += 1
            if num_range[n] == 2:
                result.append(n)

        return result
