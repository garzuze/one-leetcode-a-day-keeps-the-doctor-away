from typing import List


class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        nums_set = set(nums)
        nums_range = len(nums)
        final = []

        for i in range(1, nums_range + 1):
            if i not in nums_set:
                final.append(i)

        return final
