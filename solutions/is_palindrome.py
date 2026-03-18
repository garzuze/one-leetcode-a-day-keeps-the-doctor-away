class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        clean = "".join([char.lower() for char in s if char.isalnum()])
        j = -1
        for i in range(len(clean)):
            if clean[i] != clean[j]:
                return False
            j -= 1

        return True