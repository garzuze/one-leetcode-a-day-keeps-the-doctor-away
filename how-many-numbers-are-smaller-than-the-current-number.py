from typing import List
# did this on my phone
class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        sorted_nums = sorted(nums)
        seen = {}
        for i, num in enumerate(sorted_nums):
            if num not in seen:
                seen[num] = i
        result = []
        for num in nums:
            result.append(seen.get(num))

        return result
