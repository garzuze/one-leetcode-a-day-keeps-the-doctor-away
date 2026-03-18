from typing import List

# Beats 100.00% 👏

class Solution:
    def findWords(self, words: List[str]) -> List[str]:
        row1 = set([ch for ch in "qwertyuiop"])
        row2 = set([ch for ch in "asdfghjkl"])
        row3 = set([ch for ch in "zxcvbnm"])

        rows = [row1, row2, row3]
        result = []

        for word in words:
            word_set = self._str_to_set(word.lower())
            for row in rows:
                if word_set.issubset(row):
                    result.append(word)

        return result

    def _str_to_set(self, string: str) -> set[str]:
        return set([ch for ch in string])
