from typing import List


class Solution:
    def findAndReplacePattern(self, words: List[str], pattern: str) -> List[str]:
        p_set = set(pattern)
        result = []
        for w in words:
            if len(set(w)) == len(p_set):
                p_map = {}
                approved = True
                for i in range(len(pattern)):
                    if pattern[i] in p_map:
                        if w[i] != p_map[pattern[i]]:
                            approved = False
                            break
                    else:
                        p_map[pattern[i]] = w[i]

                if approved:
                    result.append(w)

        return result