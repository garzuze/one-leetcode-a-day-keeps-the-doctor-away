from typing import List


# Beats 100.00% 👏
class Solution:
    def shortestToChar(self, s: str, c: str) -> List[int]:
        result = []
        last_seen = float("-inf")
        for index in range(len(s)):
            if s[index] == c:
                last_seen = index
            result.append(abs(last_seen - index))

        for index in range(len(s) - 1, -1, -1):
            if s[index] == c:
                last_seen = index
            if abs(index - last_seen) < result[index]:
                result[index] = abs(index - last_seen)

        return result
