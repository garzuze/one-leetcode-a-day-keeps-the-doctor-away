class Solution(object):
    def findTheDifference(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: str
        """
        if (len(s) == 0):
            return t

        s_count = {}
        for ch in s:
            s_count[ch] = s_count.get(ch, 0) + 1
        
        t_count = {}
        for ch in t:
            t_count[ch] = t_count.get(ch, 0) + 1

        for ch, count in t_count.items():
            if ch not in s_count:
                return ch
            if count != s_count[ch]:
                return ch

s = Solution()
print(s.findTheDifference("a", "aa"))
print(s.findTheDifference("abcd", "abcde"))

## Beats 100% !!!!