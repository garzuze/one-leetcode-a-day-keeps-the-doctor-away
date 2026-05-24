from typing import List


class Solution:
    def findMaxK(self, nums: List[int]) -> int:
        nums_set = set(nums)
        nums.sort()

        for n in reversed(nums):
            if -n in nums_set:
                return n

        return -1
