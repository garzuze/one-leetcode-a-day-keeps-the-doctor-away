class Solution:
    def minDeletions(self, s: str) -> int:
        freq = {}

        for ch in s:
            freq[ch] = freq.get(ch, 0) + 1
        
        freqs = sorted(freq.values())

        deletions = 0

        while len(set(freqs)) < len(freqs):
            for i in range(len(freqs) - 1):
                while freqs[i] == freqs[i + 1]:
                    freqs[i] -= 1
                    if freqs[i] >= 0:
                        deletions += 1
        return deletions
