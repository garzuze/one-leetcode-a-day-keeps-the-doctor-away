class Solution:
    def areOccurrencesEqual(self, s: str) -> bool:
        count = {}

        for ch in s:
            count[ch] = count.get(ch, 0) + 1
        
        return all(c == count.get(s[0]) for c in count.values())
