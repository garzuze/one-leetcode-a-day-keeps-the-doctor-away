from typing import List


class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        result = []
        subset = []
        seen = set()
        self.backtrack(0, nums, result, subset, seen)

        return result

    def backtrack(self, i, arr: List[int], result: List[List[int]], subset: List[int], seen):
        if i == len(arr):
            new_sub = sorted(subset)
            tup_sub = tuple(new_sub)

            if tup_sub not in seen:
                result.append(list(new_sub))

            seen.add(tup_sub)
            return

        subset.append(arr[i])
        self.backtrack(i + 1, arr, result, subset, seen)

        subset.pop()
        self.backtrack(i + 1, arr, result, subset, seen)
