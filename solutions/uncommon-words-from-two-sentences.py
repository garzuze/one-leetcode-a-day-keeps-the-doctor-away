from typing import List

# Beats 100% 👏👏👏
class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> List[str]:
        result = []

        s1_list = s1.split()
        s1_map = {}

        s2_list = s2.split()
        s2_map = {}

        for i in range(len(s1_list)):
            s1_map[s1_list[i]] = s1_map.get(s1_list[i], 0) + 1

        for i in range(len(s2_list)):
            s2_map[s2_list[i]] = s2_map.get(s2_list[i], 0) + 1

        for word in s1_map.keys():
            if s1_map[word] > 1:
                continue
            if word not in s2_map:
                result.append(word)

        for word in s2_map.keys():
            if s2_map[word] > 1:
                continue
            if word not in s1_map:
                result.append(word)

        return result

s = Solution()
print(s.uncommonFromSentences('this apple is sweet', 'this apple is sour'))
print(s.uncommonFromSentences('apple apple', 'banana'))
