from typing import List


class Solution:
    def __init__(self):
        self.result = []

    def generateParenthesis(self, n: int) -> List[str]:
        self.result = []
        self.backtrack("(", 1, 0, n)
        return self.result

    def backtrack(self, curr: str, count_open: int, count_closed: int, n: int):
        if count_open == n and count_closed == n:
            self.result.append(curr)
            return

        if count_open < n:
            self.backtrack(curr + "(", count_open + 1, count_closed, n)

        if count_closed < count_open:
            self.backtrack(curr + ")", count_open, count_closed + 1, n)
