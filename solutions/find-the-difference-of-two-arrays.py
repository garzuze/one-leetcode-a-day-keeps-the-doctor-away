from typing import List


class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        n1 = set(nums1)
        n2 = set(nums2)

        n1_result = []
        n2_result = []

        for n in n1:
            if n not in n2:
                n1_result.append(n)

        for n in n2:
            if n not in n1:
                n2_result.append(n)
        
        return [n1_result, n2_result]
