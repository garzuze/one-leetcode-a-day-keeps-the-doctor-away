class Solution:
    def __init__(self):
        self.result = []

    def getHappyString(self, n: int, k: int) -> str:
        self.backtrack("", n)

        if k - 1 >= len(self.result):
            return ""

        return self.result[k - 1]

    def backtrack(self, path: str, max_len: int):
        if len(path) == max_len:
            self.result.append(path)
            return

        for char in ["a", "b", "c"]:
            if path == "" or path[-1] != char:
                self.backtrack(path + char, max_len)
