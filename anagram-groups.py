from typing import List


class Solution:

    def isAnagram(self, str1: str, str2: str) -> bool:
        if len(str1) != len(str2):
            return False

        s1_map = {}
        s2_map = {}
        for i in range(len(str1)):
            s1_map[str1[i]] = s1_map.get(str1[i], 0) + 1
            s2_map[str2[i]] = s2_map.get(str2[i], 0) + 1
        return s1_map == s2_map

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams = []
        seen = set()
        for s_index, s in enumerate(strs):
            anagram = []
            i = s_index
            for s2 in strs[s_index:]:
                if self.isAnagram(s, s2) and i not in seen:
                    seen.add(i)
                    anagram.append(s2)
                i += 1
            if len(anagram) > 0:
                anagrams.append(anagram)

        return anagrams

s = Solution()
print(s.groupAnagrams(["", ""]))
print(s.groupAnagrams(["act","pots","tops","cat","stop","hat"]))
