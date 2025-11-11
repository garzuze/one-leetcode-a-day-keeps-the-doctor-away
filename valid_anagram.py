class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        s_dict = {}
        t_dict = {}

        for ch in s:
            s_dict[ch] = s_dict.get(ch, 0)  + 1
        
        for ch in t:
            t_dict[ch] = t_dict.get(ch, 0)  + 1
        
        if len(t_dict.keys()) != len(s_dict.keys()):
            return False
        for ch in s:
            if ch not in t_dict.keys():
                return False
            if s_dict[ch] != t_dict[ch]:
                return False
        
        return True