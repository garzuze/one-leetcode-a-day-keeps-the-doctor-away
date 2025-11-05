class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        nums.append(target)
        nums.sort()
        return nums.index(target)

s = Solution()
print(s.searchInsert([1,3,5,6], 7))