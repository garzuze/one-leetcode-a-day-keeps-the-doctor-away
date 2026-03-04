from typing import List

class Solution:
    def __init__(self):
        self.result = []

    def validStrings(self, n: int) -> List[str]:
        self.result = []

        self.backtrack("0", n)
        self.backtrack("1", n)

        return self.result

    def backtrack(self, bin_str: str, length: int):
        if len(bin_str) == length:
            self.result.append(bin_str)
            return

        self.backtrack(bin_str + "1", length)

        if bin_str[-1] == "1":
            self.backtrack(bin_str + "0", length)
