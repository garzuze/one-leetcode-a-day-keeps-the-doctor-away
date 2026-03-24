from typing import List


class Solution:
    def numSubarraysWithSum(self, nums: List[int], goal: int) -> int:
        start = 0
        prefix_zeros = 0
        current_sum = 0
        count = 0

        for end in range(len(nums)):
            current_sum += nums[end]

            while start < end and (nums[start] == 0 or current_sum > goal):
                if nums[start] == 0:
                    prefix_zeros += 1
                elif nums[start] == 1:
                    prefix_zeros = 0

                current_sum -= nums[start]
                start += 1

            if current_sum == goal:
                count += 1 + prefix_zeros

        return count
