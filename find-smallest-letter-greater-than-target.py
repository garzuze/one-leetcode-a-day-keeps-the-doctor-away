from typing import List


class Solution:
    def nextGreatestLetter(self, letters: List[str], target: str) -> str:
        left = 0
        right = len(letters) - 1
        result = None

        while left <= right:
            mid = (left + right) // 2
            if letters[mid] <= target:
                left = mid + 1
            else:
                if result is None:
                    result = letters[mid]
                result = min(result, letters[mid])
                right = mid - 1

        return letters[0] if result is None else result
