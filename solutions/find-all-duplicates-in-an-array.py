from typing import List


class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        result = []

        for i in range(len(nums)):
            abs_val = abs(nums[i])

            if nums[abs_val - 1] < 0:
                result.append(abs_val)
            else:
                nums[abs_val - 1] *= -1

        return result