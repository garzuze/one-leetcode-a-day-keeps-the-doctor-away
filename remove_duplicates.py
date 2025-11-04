class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        unique = set()
        k = 0
        for i in range(len(nums)):
            if nums[i] not in unique:
                unique.add(nums[i])
                nums[k] = nums[i]
                k += 1
        return k
    
s = Solution()
print(s.removeDuplicates([1,1,2]))
