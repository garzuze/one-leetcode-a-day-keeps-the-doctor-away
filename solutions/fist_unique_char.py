class Solution(object):
    def firstUniqChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        count = {}
        indexes = {}
        for index, ch in enumerate(s):
            count[ch] = count.get(ch, 0) + 1
            if ch not in indexes:
                indexes[ch] = index
        
        print(count)
        print(indexes)
        for ch, count in count.items():
            if count == 1:
                return indexes[ch]
        return -1
    
s = Solution()
print(s.firstUniqChar("leetcode"))