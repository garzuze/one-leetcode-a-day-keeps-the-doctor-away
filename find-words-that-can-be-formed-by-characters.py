from typing import List


class Solution:
    def countCharacters(self, words: List[str], chars: str) -> int:
        result = 0
        chars_map = {}

        for char in chars:
            chars_map[char] = chars_map.get(char, 0) + 1

        for word in words:
            word_map = {}
            is_good = True
            for ch in word:
                word_map[ch] = word_map.get(ch, 0) + 1

            for ch in word_map:
                if ch not in chars_map or word_map[ch] > chars_map[ch]:
                    is_good = False
                    break

            if is_good:
                result += len(word)

        return result
