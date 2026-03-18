class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        open = []
        parentheses = {
            "(" : ")",
            "{" : "}",
            "[" : "]",
        }
        
        for p in s:
            if p in parentheses.keys():
                open.append(p)
            elif p in parentheses.values():
                if not open or p != parentheses[open.pop()]:
                    return False
        return not open
s = Solution()

print(s.isValid("([]"))