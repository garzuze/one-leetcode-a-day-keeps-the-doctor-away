class Solution:
    def beautySum(self, s: str) -> int:
        total = 0

        for i in range(len(s)):
            count = [0] * 26
            for j in range(i, len(s)):
                count[ord(s[j]) - ord("a")] += 1
                min_freq = float("inf")
                max_freq = float("-inf")

                for freq in count:
                    if freq != 0:
                        min_freq = min(min_freq, freq)
                        max_freq = max(max_freq, freq)

                total += max_freq - min_freq
        
        return total
