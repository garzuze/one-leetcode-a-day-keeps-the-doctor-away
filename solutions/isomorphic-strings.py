class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s_map = {}
        for index, char in enumerate(s):
            if char not in s_map:
                s_map[char] = t[index]
            if char in s_map:
                if s_map[char] != t[index]:
                    return False
        t_map = {}
        for index, char in enumerate(t):
            if char not in t_map:
                t_map[char] = s[index]
            if char in t_map:
                if t_map[char] != s[index]:
                    return False
                
        return True

s = Solution()
print(s.isIsomorphic("badc", "baba"))
print(s.isIsomorphic("egg", "add"))