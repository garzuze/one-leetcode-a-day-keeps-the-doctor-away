from typing import List


class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        seen = set()
        expected = set([i for i in range(1, len(nums) + 1)])

        for num in nums:
            if num in seen:
                return [num, expected.difference(nums).pop()]

            seen.add(num)
