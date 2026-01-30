from typing import List


class Solution:
    def countCharacters(self, words: List[str], chars: str) -> int:
        result = 0
        chars_map = [0] * 26
        BASE = ord('a')

        for ch in chars:
            chars_map[ord(ch) - BASE] += 1

        for word in words:
            word_map = [0] * 26
            is_good = True
            for ch in word:
                i = ord(ch) - BASE
                word_map[i] += 1
                if word_map[i] and word_map[i] > chars_map[i]:
                    is_good = False
                    break

            if is_good:
                result += len(word)

        return result
