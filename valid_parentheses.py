class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        open = []
        close = []
        parentheses = {
            "(" : ")",
            "{" : "}",
            "[" : "]",
        }
        
        if s[-1] in parentheses.keys():
            return False

        for p in s:
            if p in parentheses.keys():
                open.append(p)
            else:
                if len(open) > 0:
                    last_open = open.pop()
                    close.append(p)
                    if p != parentheses[last_open]:
                        return False
                else:
                    return False
        if len(close) == 0 or len(open) != 0:
            return False
        return True

s = Solution()

print(s.isValid("([]"))