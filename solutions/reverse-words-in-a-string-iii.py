class Solution:
    def reverseWords(self, s: str) -> str:
        s_list = s.split()
        result = []
        
        for word in s_list:
            result.append(word[::-1])
        
        return " ".join(result)
