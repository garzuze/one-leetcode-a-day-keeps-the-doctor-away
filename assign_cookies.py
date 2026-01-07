from typing import List


class Solution:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        g.sort()
        s.sort()

        g_pointer = 0
        s_pointer = 0
        count = 0

        while g_pointer < len(g) and s_pointer < len(s):
            if s[s_pointer] >= g[g_pointer]:
                count += 1
                s_pointer += 1
                g_pointer += 1
            else:
                s_pointer += 1

        return count
