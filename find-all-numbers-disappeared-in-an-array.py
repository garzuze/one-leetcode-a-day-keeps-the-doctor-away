from typing import List

# first try, decent performance
class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        arr_range = set([i + 1 for i in range(len(nums))])

        for num in nums:
            if num in arr_range:
                arr_range.remove(num)

        return list(arr_range)