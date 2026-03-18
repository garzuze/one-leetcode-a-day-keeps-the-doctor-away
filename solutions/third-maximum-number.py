from typing import List


class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        first = second = third = None

        for num in nums:
            if num == first or num == second or num == third:
                continue
            if first is None or num > first:
                third = second
                second = first
                first = num
            elif second is None or num > second:
                third = second
                second = num
            elif third is None or num > third:
                third = num

        if third is not None:
            return third
        
        return first

s = Solution()
print(s.thirdMax([3, 2, 1]))
print(s.thirdMax([1, 2]))
print(s.thirdMax([2, 2, 3, 1]))
print(s.thirdMax([5, 2, 2]))
print(s.thirdMax([1, 2, 2, 5, 3, 5]))
