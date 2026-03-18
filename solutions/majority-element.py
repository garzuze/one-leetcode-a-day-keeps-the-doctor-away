from typing import List


class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        target = len(nums) // 2
        count = {}

        for n in nums:
            count[n] = count.get(n, 0) + 1
            if count[n] > target:
                return n
