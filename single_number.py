class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        past = set()
        for element in nums:
            if element not in past:
                past.add(element)
            else:
                past.remove(element)
        
        return past.pop()

s = Solution()
print(s.singleNumber([2,2,1]))