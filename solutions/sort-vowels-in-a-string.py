class Solution:
    def sortVowels(self, s: str) -> str:
        vowels = {"a", "e", "i", "o", "u"}
        s_vowels = []

        for i in range(len(s)):
            if s[i].lower() in vowels:
                s_vowels.append(s[i])
        
        s_vowels.sort(reverse=True)
        result = ""
        
        for i in range(len(s)):
            if s[i].lower() in vowels:
                result += s_vowels.pop()
            else:
                result += s[i]
        
        return result
