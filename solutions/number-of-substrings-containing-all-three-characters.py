from typing import Dict



class Solution:
    def numberOfSubstrings(self, s: str) -> int:
        left = 0
        right = 0
        total = 0
        freq = {}

        while right < len(s):
            freq[s[right]] = freq.get(s[right], 0) + 1

            while self._has_all_chars(freq):
                total += len(s) - right
                freq[s[left]] -= 1
                left += 1

            right += 1

        return total

    def _has_all_chars(self, freq: Dict) -> bool:
        if len(freq.keys()) < 3:
            return False
        return all(v > 0 for v in freq.values())
