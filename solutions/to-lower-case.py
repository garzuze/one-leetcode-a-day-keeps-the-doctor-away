class Solution:
    def toLowerCase(self, s: str) -> str:
        result = ""
        
        for ch in s:
            bin_rep = ord(ch)
            if bin_rep > 64 and bin_rep < 91:
                result += chr(bin_rep + 32)
            else:
                result += ch

        return result
