from typing import List


class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        result = []
        subset = []
        self.backtrack(0, nums, result, subset)

        return result

    def backtrack(self, i, arr: List[int], result: List[List[int]], subset: List[int]):
        if i == len(arr):
            result.append(list(subset))
            return

        subset.append(arr[i])
        self.backtrack(i + 1, arr, result, subset)

        subset.pop()
        self.backtrack(i + 1, arr, result, subset)
