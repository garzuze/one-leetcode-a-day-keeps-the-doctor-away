class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        """
        nums_dict = {}
        for i, n in enumerate(nums):
            if n in nums_dict:
                if abs(i - nums_dict[n]) <= k:
                    return True
            nums_dict[n] = i
        
        return False

nums = [1,2,3,1,2,3]
k = 2
s = Solution()
print(s.containsNearbyDuplicate(nums, k))