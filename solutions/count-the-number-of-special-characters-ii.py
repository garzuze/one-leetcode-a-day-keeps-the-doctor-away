class Solution:
    def numberOfSpecialChars(self, word: str) -> int:
        w_map = {}
        lower = set()

        for i in range(len(word)):
            if word[i].islower():
                lower.add(word[i])
            elif word[i].isupper() and word[i] not in w_map:
                w_map[word[i]] = i

        for i in range(len(word)):
            if word[i].upper() in w_map:
                if i > w_map[word[i].upper()]:
                    lower.discard(word[i])
            else:
                lower.discard(word[i])
        
        return len(lower)
