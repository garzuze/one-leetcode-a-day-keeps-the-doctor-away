class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        end = len(s) - 1
        while s[end] == " ":
            end -= 1
        start = end - 1
        while start >= 0 and s[start] != " ":
            start -= 1
            
        return end - start

s = Solution()
print(s.lengthOfLastWord("   fly me   to   the moon  "))