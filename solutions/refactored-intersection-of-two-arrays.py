from typing import List
# menos roubado kkkkkk
class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        n1_set = {}
        result = []

        for n in nums1:
            n1_set[n] = n1_set.get(n, 0) + 1

        prev = set()
        for n in nums2:
            if n in n1_set.keys() and n not in prev:
                result.append(n)
            prev.add(n)
        
        return result