from typing import List


class Solution:
    def maximumNumberOfStringPairs(self, words: List[str]) -> int:
        w_map = {}

        for i in range(len(words)):
            w_map[words[i]] = i

        count = 0

        for j, word in enumerate(words):
            reversed_word = word[::-1]
            if reversed_word in w_map and w_map[reversed_word] != j:
                count += 1
                

        return count // 2
