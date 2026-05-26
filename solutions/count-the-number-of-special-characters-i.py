class Solution:
    def numberOfSpecialChars(self, word: str) -> int:
        seen = set(word)
        count = 0

        for w in seen:
            if w.lower() in seen and w.lower() != w:
                count += 1
        
        return count
