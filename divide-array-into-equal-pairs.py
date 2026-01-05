from typing import List


# O(n log n) but runs faster than the other solution due to python internals
class Solution:
    def divideArray(self, nums: List[int]) -> bool:
        nums.sort()

        for pair in zip(nums[::2], nums[1::2]):
            if pair[0] != pair[1]:
                return False

        return True


# O(n)
class Solution2:
    def divideArray(self, nums: List[int]) -> bool:
        count = {}
        for num in nums:
            count[num] = count.get(num, 0) + 1

        for value in count.values():
            if value % 2 != 0:
                return False

        return True
