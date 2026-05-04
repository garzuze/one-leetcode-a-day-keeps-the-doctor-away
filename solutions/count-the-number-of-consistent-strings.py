from typing import List


class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        inconsistent = 0
        allowed_set = set(allowed)
        
        for word in words:
            for ch in word:
                if ch not in allowed_set:
                    inconsistent += 1
                    break

        return len(words) - inconsistent
