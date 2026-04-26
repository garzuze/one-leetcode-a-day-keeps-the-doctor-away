class Solution:
    def removeOuterParentheses(self, s: str) -> str:
        count_open = 0
        count_closed = 0
        last = 0
        result = ""

        for i in range(len(s)):
            if s[i] == "(":
                count_open += 1
            if s[i] == ")":
                count_closed += 1
            
            if count_open == count_closed:
                result += s[last + 1 :i]
                last = i + 1
        
        
        return result
