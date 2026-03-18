from typing import List


class Solution:
    def __init__(self):
        self.result = []

    def subsets(self, nums: List[int]) -> List[List[int]]:
        self.result = []

        self.backtrack(0, [], nums)

        return self.result

    def backtrack(self, start: int, curr: List[int], nums: List[int]):
        self.result.append(list(curr))

        for i in range(start, len(nums)):
            curr.append(nums[i])
            self.backtrack(i + 1, curr, nums)
            curr.pop()
