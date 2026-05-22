from typing import List


class Solution:
    def twoOutOfThree(self, nums1: List[int], nums2: List[int], nums3: List[int]) -> List[int]:
        result = set()
        seen = set(nums1)

        for n in set(nums2):
            if n in seen:
                result.add(n)
            seen.add(n)

        for n in nums3:
            if n in seen:
                result.add(n)

        return list(result)
