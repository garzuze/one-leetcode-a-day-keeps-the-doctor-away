class Solution:
    def maxFreqSum(self, s: str) -> int:
        freq = {}
        max_v = 0
        max_c = 0

        for ch in s:
            freq[ch] = freq.get(ch, 0) + 1

            if ch in "aeiou":
                max_v = max(max_v, freq[ch])
            else:
                max_c = max(max_c, freq[ch])
        
        return max_c + max_v
