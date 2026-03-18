from typing import List


class Solution:
    def __init__(self):
        self.result = []
        self.candidates = []
        self.target = 0

    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        self.result = []
        self.candidates = candidates
        self.target = target

        self.backtrack(0, [], 0)

        return self.result

    def backtrack(self, index: int, sub_set: List[int], total: int):
        if total == self.target:
            self.result.append(list(sub_set))
            return

        if total > self.target or index >= len(self.candidates):
            return

        sub_set.append(self.candidates[index])
        self.backtrack(index, sub_set, total + self.candidates[index])

        sub_set.pop()
        self.backtrack(index + 1, sub_set, total)
