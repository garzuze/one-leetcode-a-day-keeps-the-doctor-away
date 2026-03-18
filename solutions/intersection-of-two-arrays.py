from typing import List


class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        n1_set = set(nums1)
        n2_set = set(nums2)
        return list(n1_set.intersection(n2_set))
