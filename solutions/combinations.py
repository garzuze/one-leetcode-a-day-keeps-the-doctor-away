from typing import List


class Solution:
    def __init__(self):
        self.result = []
        self.n = None
        self.k = None

    def combine(self, n: int, k: int) -> List[List[int]]:
        self.n = n
        self.k = k

        self.backtrack(1, [])

        return self.result

    def backtrack(self, index: int, sub_set: List[int]):
        if len(sub_set) == self.k:
            self.result.append(list(sub_set))
            return

        for i in range(index, self.n + 1):
            sub_set.append(i)
            self.backtrack(i + 1, sub_set)
            sub_set.pop()
