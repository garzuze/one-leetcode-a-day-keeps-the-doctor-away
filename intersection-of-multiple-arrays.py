from typing import List


# Beats 100.00% 👏
class Solution:
    def intersection(self, nums: List[List[int]]) -> List[int]:
        if len(nums) == 0:
            return []

        if len(nums) < 2:
            return sorted(nums[0])

        diff = set(nums[0])
        for num_list in nums[1:]:
            diff = diff.intersection(set(num_list))

        return sorted(list(diff))
