class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        i = 0
        if s == "":
            return True
        elif t == "":
            return False
        for ch in t:
            if ch == s[i]:
                i += 1
            if i == len(s):
                return True
        return False