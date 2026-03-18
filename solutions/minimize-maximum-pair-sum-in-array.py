from typing import List


class Solution:
    def minPairSum(self, nums: List[int]) -> int:
        nums.sort()
        max_pair = float('-inf')

        for i in range(len(nums) // 2):
            max_pair = max(max_pair, nums[i] + nums[-1 -i])

        return max_pair