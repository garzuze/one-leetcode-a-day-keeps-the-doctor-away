from typing import List


class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        curr_sum = 0

        for i in range(0, len(nums), 2):
            curr_sum += nums[i]

        return curr_sum
