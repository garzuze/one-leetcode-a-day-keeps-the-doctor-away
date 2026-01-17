from typing import List


class Solution:
    def findMin(self, nums: List[int]) -> int:
        left = 0
        right = len(nums) - 1
        while left < right:
            middle = (left + right) // 2

            if nums[middle] < nums[right]:
                right = middle
            else:
                left = middle + 1

        return nums[left]


nums = [3, 4, 5, 6, 1, 2]
nums_2 = [4, 5, 0, 1, 2, 3]

s = Solution()
print(s.findMin(nums))
print(s.findMin(nums_2))
