from typing import List


class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        diffs = {}
        nums.sort()

        for i in range(len(nums)):
            left = i + 1
            right = len(nums) - 1

            while left < right:
                curr_sum = nums[i] + nums[left] + nums[right]
                diffs[abs(curr_sum - target)] = curr_sum
                if curr_sum > target:
                    right -= 1
                elif curr_sum < target:
                    left += 1
                else:
                    return curr_sum

        return diffs[min(diffs.keys())]
