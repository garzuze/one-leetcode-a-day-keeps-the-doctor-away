class Solution:
    def __init__(self):
        self.result = set()
    
    def numTilePossibilities(self, tiles: str) -> int:
        self.backtrack("", tiles)

        return len(self.result) - 1
    
    def backtrack(self, prefix: str, curr: str):
        print(self.result)
        if prefix in self.result:
            return

        self.result.add(prefix)

        for i in range(len(curr)):
            self.backtrack(prefix + curr[i], curr[:i] + curr[i + 1:])

