from typing import List


class Solution:
    def longestBalanced(self, nums: List[int]) -> int:
        longest = 0
        for i in range(len(nums)):
            even = set()
            odd = set()
            for j in range(i, len(nums)):
                if nums[j] % 2 == 0:
                    even.add(nums[j])
                else:
                    odd.add(nums[j])

                if len(even) == len(odd):
                    longest = max(longest, j + 1 - i)

        return longest
