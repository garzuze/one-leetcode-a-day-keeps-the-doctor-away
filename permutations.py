from typing import List


class Solution:
    def __init__(self):
        self.result = []
        self.nums = []

    def permute(self, nums: List[int]) -> List[List[int]]:
        self.result = []
        self.nums = nums

        self.backtrack(0)

        return self.result

    def backtrack(self, index: int):
        if index == len(self.nums):
            self.result.append(list(self.nums))
            return

        for i in range(index, len(self.nums)):
            self.nums[index], self.nums[i] = self.nums[i], self.nums[index]
            self.backtrack(index + 1)
            self.nums[index], self.nums[i] = self.nums[i], self.nums[index]
