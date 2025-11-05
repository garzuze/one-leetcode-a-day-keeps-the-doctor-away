class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        len_nums = len(nums)
        if not nums or len_nums == 0:
            return 0
        left = 0
        right = len_nums - 1

        while right >= left:
            mid = (left + right) // 2
            if nums[mid] == target:
                return mid
            elif nums[mid] > target:
                right = mid - 1
            else:
                left = mid + 1
        return left

s = Solution()
print(s.searchInsert([1,3], 2))