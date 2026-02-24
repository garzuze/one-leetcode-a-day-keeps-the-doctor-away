from typing import List


class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        result = []
        nums.sort()

        def backtrack(start: int, sub_set: List[int]):
            result.append(list(sub_set))

            for i in range(start, len(nums)):
                if i > start and nums[i - 1] == nums[i]:
                    continue
                sub_set.append(nums[i])
                backtrack(i + 1, sub_set)
                sub_set.pop()

        backtrack(0, [])
        return result
