class Solution:
    def longestPalindrome(self, s: str) -> int:
        seen = {}
        count = 0
        for ch in s:
            seen[ch] = seen.get(ch, 0) + 1
        for item in seen.values():
            if item % 2 == 0:
                count += item
            else:
                count += item - 1
            
        if count < len(s):
            # Tem um sobrando que pode ficar no centro
            return count + 1
        else:
            return count