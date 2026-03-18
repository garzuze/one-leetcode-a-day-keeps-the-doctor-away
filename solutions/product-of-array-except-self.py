from typing import List

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # intuiton = first pass: product of all number left to right
        # second pass = product of all numbers right to left

        len_nums = len(nums)
        left = 1
        result = [1] * len_nums
        for i in range(len_nums):
            result[i] *= left
            left *= nums[i]

        right = 1
        for i in range(len_nums - 1, -1, -1):
            result[i] *= right
            right *= nums[i]

        return result
    

s = Solution()
print(s.productExceptSelf([2,3,4,0,1]))