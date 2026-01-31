from typing import List


class Solution:
    def nextGreatestLetter(self, letters: List[str], target: str) -> str:
        result = letters[0]

        for ch in letters:
            if ch > target and ch < result:
                result = ch
            if result <= target and ch > target:
                result = ch

        return result
