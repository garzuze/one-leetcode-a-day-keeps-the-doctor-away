from typing import List

# First intuition, bad in performance but could reason about the question quickly
class Solution:
    def shortestToChar(self, s: str, c: str) -> List[int]:
        locations = set()
        result = []
        for index in range(len(s)):
            if s[index] == c:
                locations.add(index)

        for index in range(len(s)):
            if s[index] != c:
                result.append(min([abs(index - location) for location in locations]))
            else:
                result.append(0)

        return result


s = Solution()

print(s.shortestToChar("aaab", "b"))