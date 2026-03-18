from typing import List

class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        i = len(s) - 1
        for j in range(len(s) // 2):
            temp = s[i]
            s[i] = s[j]
            s[j] = temp
            i -= 1

s = Solution()
s.reverseString(["h","e","l","l","o"])