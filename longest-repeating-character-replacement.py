class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        left = 0
        window = float("-inf")
        count = [0] * 26
        BASE = ord("A")

        for right in range(len(s)):
            count[ord(s[right]) - BASE] += 1

            if (right - left + 1) - max(count) > k:
                count[ord(s[left]) - BASE] -= 1
                left += 1

            if right - left + 1 > window:
                window = right - left + 1

        return window
