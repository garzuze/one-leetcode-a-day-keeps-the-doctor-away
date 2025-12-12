from typing import List


class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        nums_set = set(nums)
        if len(nums_set) < 3:
            return max(nums_set)

        nums_set.remove(max(nums_set))
        nums_set.remove(max(nums_set))
        return max(nums_set)


s = Solution()
print(s.thirdMax([3, 2, 1]))
print(s.thirdMax([1, 2]))
print(s.thirdMax([2, 2, 3, 1]))
print(s.thirdMax([5, 2, 2]))
print(s.thirdMax([1, 2, 2, 5, 3, 5]))
