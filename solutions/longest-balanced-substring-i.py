# TODO: deixar mais eficiente
class Solution:
    def longestBalanced(self, s: str) -> int:
        longest = 0
        for i in range(len(s)):
            freqs = {}

            for j in range(i, len(s)):
                freqs[s[j]] = freqs.get(s[j], 0) + 1
                min_freq = min(freqs.values())
                max_freq = max(freqs.values())

                if max_freq == min_freq:
                    longest = max(longest, j + 1 - i)

        return longest
