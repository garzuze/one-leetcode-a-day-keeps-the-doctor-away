class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s) != len(t):
            return False
        
        counter = {}

        for ch in s:
            counter[ch] = counter.get(ch, 0)  + 1
        
        for ch in t:
            if ch not in counter.keys() or counter[ch] == 0:
                return False
            counter[ch] -= 1

        return True
        
