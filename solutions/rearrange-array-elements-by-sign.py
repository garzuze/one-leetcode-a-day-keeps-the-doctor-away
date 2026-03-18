from typing import List


class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        positives = []
        negatives = []
        result = []

        for num in reversed(nums):
            if num >= 0:
                positives.append(num)
            else:
                negatives.append(num)

        for _ in range(len(nums) // 2):
            result.append(positives.pop())
            result.append(negatives.pop())

        return result
